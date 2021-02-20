package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html
	 */
@JSGlobal("RandomOperations")
@js.native
class RandomOperations () extends StObject
object RandomOperations {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_flipTrue
  		 */
  /* static member */
  @JSGlobal("RandomOperations.flipTrue")
  @js.native
  def flipTrue(truePropability: Double): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomObject
  		 */
  /* static member */
  @JSGlobal("RandomOperations.getRandomObject")
  @js.native
  def getRandomObject[T](objects: js.Array[T]): T = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomString
  		 * @since AppServer 92699
  		 */
  /* static member */
  @JSGlobal("RandomOperations.getRandomString")
  @js.native
  def getRandomString(length: Double): java.lang.String = js.native
  @JSGlobal("RandomOperations.getRandomString")
  @js.native
  def getRandomString(length: Double, allowedCharacters: java.lang.String): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInt
  		 */
  /* static member */
  @JSGlobal("RandomOperations.nextInt")
  @js.native
  def nextInt(minValue: Double, maxValue: Double): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInts
  		 */
  /* static member */
  @JSGlobal("RandomOperations.nextInts")
  @js.native
  def nextInts(minValue: Double, maxValue: Double, count: Double, onlyDifferentNumbers: Boolean): js.Array[Double] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_shuffleObjects
  		 */
  /* static member */
  @JSGlobal("RandomOperations.shuffleObjects")
  @js.native
  def shuffleObjects[T](objects: js.Array[T]): js.Array[T] = js.native
}
