package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html
	 */
@JSGlobal("RandomOperations")
@js.native
class RandomOperations () extends js.Object

/**
	 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html
	 */
@JSGlobal("RandomOperations")
@js.native
object RandomOperations extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_flipTrue
  		 */
  def flipTrue(truePropability: scala.Double): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomObject
  		 */
  def getRandomObject[T](objects: js.Array[T]): T = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomString
  		 * @since AppServer 92699
  		 */
  def getRandomString(length: scala.Double): java.lang.String = js.native
  def getRandomString(length: scala.Double, allowedCharacters: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInt
  		 */
  def nextInt(minValue: scala.Double, maxValue: scala.Double): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInts
  		 */
  def nextInts(
    minValue: scala.Double,
    maxValue: scala.Double,
    count: scala.Double,
    onlyDifferentNumbers: scala.Boolean
  ): js.Array[scala.Double] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_shuffleObjects
  		 */
  def shuffleObjects[T](objects: js.Array[T]): js.Array[T] = js.native
}

