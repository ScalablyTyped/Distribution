package typings.lexicographicInteger

import typings.lexicographicInteger.lexicographicIntegerStrings.array
import typings.lexicographicInteger.lexicographicIntegerStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lexicographic-integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pack[T /* <: hex | array */](n: Double): js.Array[Double] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | String]
  inline def pack[T /* <: hex | array */](n: Double, enc: T): js.Array[Double] | String = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(n.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | String]
  
  inline def unpack(xs: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(xs.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unpack(xs: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(xs.asInstanceOf[js.Any]).asInstanceOf[Double]
}
