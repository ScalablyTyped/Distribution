package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/RandomOperations.html
  */
@JSGlobal("RandomOperations")
@js.native
open class RandomOperations () extends StObject
object RandomOperations {
  
  @JSGlobal("RandomOperations")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_flipTrue
    */
  /* static member */
  inline def flipTrue(truePropability: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flipTrue")(truePropability.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomObject
    */
  /* static member */
  inline def getRandomObject[T](objects: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomObject")(objects.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_getRandomString
    * @since AppServer 92699
    */
  /* static member */
  inline def getRandomString(length: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomString")(length.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def getRandomString(length: Double, allowedCharacters: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRandomString")(length.asInstanceOf[js.Any], allowedCharacters.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInt
    */
  /* static member */
  inline def nextInt(minValue: Double, maxValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nextInt")(minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_nextInts
    */
  /* static member */
  inline def nextInts(minValue: Double, maxValue: Double, count: Double, onlyDifferentNumbers: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("nextInts")(minValue.asInstanceOf[js.Any], maxValue.asInstanceOf[js.Any], count.asInstanceOf[js.Any], onlyDifferentNumbers.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RandomOperations.html#method_shuffleObjects
    */
  /* static member */
  inline def shuffleObjects[T](objects: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffleObjects")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
