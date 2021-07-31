package typings.massive.mod

import typings.massive.anon.PickSearchDefinitionfield
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Readable")
@js.native
class Readable protected () extends Entity {
  def this(spec: ReadableSpecification) = this()
  
  def count(conditions: String, params: js.Array[js.Any]): js.Promise[Double] = js.native
  /** Count rows matching criteria. */
  def count(conditions: AnyObject[js.Any]): js.Promise[Double] = js.native
  
  /** Count documents matching criteria. Unlike count, this function only supports criteria objects. */
  def countDoc(criteria: js.Object): js.Promise[Double] = js.native
  
  /** Find rows matching criteria. */
  def find(): js.Promise[js.Any] = js.native
  def find(criteria: Double): js.Promise[js.Any] = js.native
  def find(criteria: Double, options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  def find(criteria: Unit, options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  def find(criteria: AnyObject[js.Any]): js.Promise[js.Any] = js.native
  def find(criteria: AnyObject[js.Any], options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  def find(criteria: UUID): js.Promise[js.Any] = js.native
  def find(criteria: UUID, options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  
  /** Find a document by searching in the body. */
  def findDoc(): js.Promise[js.Any] = js.native
  def findDoc(criteria: Double): js.Promise[js.Any] = js.native
  def findDoc(criteria: Double, options: RetrievalOptions): js.Promise[js.Any] = js.native
  def findDoc(criteria: Unit, options: RetrievalOptions): js.Promise[js.Any] = js.native
  def findDoc(criteria: AnyObject[js.Any]): js.Promise[js.Any] = js.native
  def findDoc(criteria: AnyObject[js.Any], options: RetrievalOptions): js.Promise[js.Any] = js.native
  def findDoc(criteria: UUID): js.Promise[js.Any] = js.native
  def findDoc(criteria: UUID, options: RetrievalOptions): js.Promise[js.Any] = js.native
  
  def findOne(criteria: Double): js.Promise[js.Any] = js.native
  def findOne(criteria: Double, options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  /** Return a single record. */
  def findOne(criteria: AnyObject[js.Any]): js.Promise[js.Any] = js.native
  def findOne(criteria: AnyObject[js.Any], options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  def findOne(criteria: UUID): js.Promise[js.Any] = js.native
  def findOne(criteria: UUID, options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Any] = js.native
  
  def isPkSearch(criteria: Double): Boolean = js.native
  /**
    * Determine whether criteria represent a search by primary key.
    * If a number or uuid are passed, it is assumed to be a primary key value; if an object, it must have only one key, which must specify the primary key column.
    */
  def isPkSearch(criteria: AnyObject[js.Any]): Boolean = js.native
  def isPkSearch(criteria: UUID): Boolean = js.native
  
  /** Refresh a materialized view. */
  def refresh(): js.Promise[Unit] = js.native
  def refresh(concurrently: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Perform a full-text search on queryable fields. If options.document is true, looks in the document body fields instead of the table columns.
    */
  def search(plan: SearchDefinition): js.Promise[js.Array[js.Any]] = js.native
  def search(plan: SearchDefinition, options: RetrievalOptions): js.Promise[js.Array[js.Any]] = js.native
  
  /** Shortcut to perform a full text search on a document table. */
  def searchDoc(plan: PickSearchDefinitionfield): js.Promise[js.Array[js.Any]] = js.native
  def searchDoc(plan: PickSearchDefinitionfield, options: RetrievalOptions): js.Promise[js.Array[js.Any]] = js.native
  
  /** Run a query with a raw SQL predicate, eg: db.mytable.where('id=$1', [123]).then(...); */
  def where(conditions: String): js.Promise[js.Array[js.Any]] = js.native
  def where(conditions: String, params: js.Array[js.Any]): js.Promise[js.Array[js.Any]] = js.native
  def where(conditions: String, params: js.Array[js.Any], options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Array[js.Any]] = js.native
  def where(conditions: String, params: Unit, options: RetrievalOptions & ResultProcessingOptions): js.Promise[js.Array[js.Any]] = js.native
}
