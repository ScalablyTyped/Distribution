package typings.lexicographicInteger

import typings.lexicographicInteger.lexicographicIntegerStrings.array
import typings.lexicographicInteger.lexicographicIntegerStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lexicographic-integer", "pack")
  @js.native
  def pack[T /* <: hex | array */](n: Double): js.Array[Double] | String = js.native
  @JSImport("lexicographic-integer", "pack")
  @js.native
  def pack[T /* <: hex | array */](n: Double, enc: T): js.Array[Double] | String = js.native
  
  @JSImport("lexicographic-integer", "unpack")
  @js.native
  def unpack(xs: String): Double = js.native
  @JSImport("lexicographic-integer", "unpack")
  @js.native
  def unpack(xs: js.Array[Double]): Double = js.native
}
