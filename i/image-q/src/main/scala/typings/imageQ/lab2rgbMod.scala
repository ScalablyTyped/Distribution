package typings.imageQ

import typings.imageQ.anon.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lab2rgbMod {
  
  @JSImport("image-q/dist/conversion/lab2rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lab2rgb(L: Double, a: Double, b: Double): B = (^.asInstanceOf[js.Dynamic].applyDynamic("lab2rgb")(L.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[B]
}
