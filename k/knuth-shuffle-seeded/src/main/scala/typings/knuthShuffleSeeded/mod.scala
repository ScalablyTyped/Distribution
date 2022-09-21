package typings.knuthShuffleSeeded

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Shuffle an array using the Fisher-Yates shuffle algorithm, aka Knuth
    * shuffle.
    *
    * Note that this function overwrites the initial array. As a result if you
    * would like to keep the original array intact, you have to copy the initial
    * array to a new array.
    *
    * Implementation derived from http://stackoverflow.com/questions/2450954/.
    *
    * @param inputArray - An array that is to be shuffled.
    * @param [seed=Math.random()] - Seed for the shuffling operation. If
    *                              unspecified then a random value is used.
    * @return The resulting array.
    */
  inline def apply[T](inputArray: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(inputArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T](inputArray: js.Array[T], seed: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(inputArray.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("knuth-shuffle-seeded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
