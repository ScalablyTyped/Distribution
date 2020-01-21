package typings.knuddelsUserappsApi.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html
	 */
@JSGlobal("RandomOperations")
@js.native
class RandomOperations () extends js.Object

/* static members */
@JSGlobal("RandomOperations")
@js.native
object RandomOperations extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_flipTrue
  		 */
  def flipTrue(truePropability: Double): Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomObject
  		 */
  def getRandomObject[T](objects: js.Array[T]): T = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomString
  		 * @since AppServer 92699
  		 */
  def getRandomString(length: Double): java.lang.String = js.native
  def getRandomString(length: Double, allowedCharacters: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInt
  		 */
  def nextInt(minValue: Double, maxValue: Double): Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInts
  		 */
  def nextInts(minValue: Double, maxValue: Double, count: Double, onlyDifferentNumbers: Boolean): js.Array[Double] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_shuffleObjects
  		 */
  def shuffleObjects[T](objects: js.Array[T]): js.Array[T] = js.native
}

