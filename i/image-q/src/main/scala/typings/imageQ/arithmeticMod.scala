package typings.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arithmeticMod {
  
  @JSImport("image-q/dist/utils/arithmetic", "degrees2radians")
  @js.native
  def degrees2radians(n: Double): Double = js.native
  
  @JSImport("image-q/dist/utils/arithmetic", "inRange0to255")
  @js.native
  def inRange0to255(n: Double): Double = js.native
  
  @JSImport("image-q/dist/utils/arithmetic", "inRange0to255Rounded")
  @js.native
  def inRange0to255Rounded(n: Double): Double = js.native
  
  @JSImport("image-q/dist/utils/arithmetic", "intInRange")
  @js.native
  def intInRange(value: Double, low: Double, high: Double): Double = js.native
  
  @JSImport("image-q/dist/utils/arithmetic", "max3")
  @js.native
  def max3(a: Double, b: Double, c: Double): Double = js.native
  
  @JSImport("image-q/dist/utils/arithmetic", "min3")
  @js.native
  def min3(a: Double, b: Double, c: Double): Double = js.native
  
  @JSImport("image-q/dist/utils/arithmetic", "stableSort")
  @js.native
  def stableSort[T](arrayToSort: js.Array[T], callback: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
}
