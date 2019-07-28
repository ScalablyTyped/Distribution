package typings.inquirer.inquirerMod.objectsNs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Choices collection
  * Collection of multiple `choice` object
  * @constructor
  * @param choices  All `choice` to keep in the collection
  */
@js.native
trait Choices[A]
  extends Instantiable1[/* choices */ js.Array[String | Separator | ChoiceOption[A]], Choices[A]]
     with Instantiable2[
      /* choices */ js.Array[String | Separator | ChoiceOption[A]], 
      /* answers */ A, 
      Choices[A]
    ] {
  var choices: js.Array[Choice[A]] = js.native
  var length: Double = js.native
  var realChoices: js.Array[Choice[A]] = js.native
  var realLength: Double = js.native
  def forEach[T](application: js.Function1[/* choice */ Choice[A], T]): js.Array[T] = js.native
  /**
    * Get a raw element from the collection
    * @param selector The selected index value
    * @return Return the matched choice or undefined
    */
  def get(selector: Double): Choice[A] = js.native
  /**
    * Get a valid choice from the collection
    * @param selector The selected choice index
    * @return Return the matched choice or undefined
    */
  def getChoice(selector: Double): Choice[A] = js.native
  /**
    * Pluck a particular key from the choices
    * @param propertyName Property name to select
    * @return Selected properties
    */
  def pluck(propertyName: String): js.Array[_] = js.native
  /**
    * Match the valid choices against a where clause
    * @param whereClause Lodash `where` clause
    * @return Matching choices or empty array
    */
  def where[U /* <: js.Object */](whereClause: U): js.Array[Choice[A]] = js.native
}

