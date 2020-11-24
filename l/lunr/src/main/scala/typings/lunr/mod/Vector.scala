package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vector is used to construct the vector space of documents and queries. These
  * vectors support operations to determine the similarity between two documents or
  * a document and a query.
  *
  * Normally no parameters are required for initializing a vector, but in the case of
  * loading a previously dumped vector the raw elements can be provided to the constructor.
  *
  * For performance reasons vectors are implemented with a flat array, where an elements
  * index is immediately followed by its value. E.g. [index, value, index, value]. This
  * allows the underlying array to be as sparse as possible and still offer decent
  * performance when being used for vector calculations.
  */
@JSImport("lunr", "Vector")
@js.native
class Vector protected () extends js.Object {
  /**
    * @param [elements] - The flat list of element index and element value pairs.
    */
  def this(elements: js.Array[Double]) = this()
  
  /**
    * Calculates the dot product of this vector and another vector.
    *
    * @param otherVector - The vector to compute the dot product with.
    */
  def dot(otherVector: Vector): Double = js.native
  
  /**
    * Inserts an element at an index within the vector.
    *
    * Does not allow duplicates, will throw an error if there is already an entry
    * for this index.
    *
    * @param insertIdx - The index at which the element should be inserted.
    * @param val - The value to be inserted into the vector.
    */
  def insert(insertIdx: Double, `val`: Double): Unit = js.native
  
  /**
    * Calculates the magnitude of this vector.
    *
    */
  def magnitude(): Double = js.native
  
  /**
    * Calculates the position within the vector to insert a given index.
    *
    * This is used internally by insert and upsert. If there are duplicate indexes then
    * the position is returned as if the value for that index were to be updated, but it
    * is the callers responsibility to check whether there is a duplicate at that index
    *
    * @param insertIdx - The index at which the element should be inserted.
    */
  def positionForIndex(index: Double): Double = js.native
  
  /**
    * Calculates the cosine similarity between this vector and another
    * vector.
    *
    * @param otherVector - The other vector to calculate the
    * similarity with.
    */
  def similarity(otherVector: Vector): Double = js.native
  
  /**
    * Converts the vector to an array of the elements within the vector.
    *
    */
  def toArray(): js.Array[Double] = js.native
  
  /**
    * A JSON serializable representation of the vector.
    *
    */
  def toJSON(): js.Array[Double] = js.native
  
  /**
    * Inserts or updates an existing index within the vector.
    *
    * @param insertIdx - The index at which the element should be inserted.
    * @param val - The value to be inserted into the vector.
    * @param fn - A function that is called for updates, the existing value and the
    * requested value are passed as arguments
    */
  def upsert(
    insertIdx: Double,
    `val`: Double,
    fn: js.Function2[/* existingVal */ Double, /* val */ Double, Double]
  ): Unit = js.native
}
