package typings.imageQ

import typings.imageQ.anon.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xyz2rgbMod {
  
  @JSImport("image-q/dist/conversion/xyz2rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xyz2rgb(x: Double, y: Double, z: Double): B = (^.asInstanceOf[js.Dynamic].applyDynamic("xyz2rgb")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[B]
}
