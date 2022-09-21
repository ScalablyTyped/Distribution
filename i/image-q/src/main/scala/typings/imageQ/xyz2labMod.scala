package typings.imageQ

import typings.imageQ.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xyz2labMod {
  
  @JSImport("image-q/dist/types/src/conversion/xyz2lab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xyz2lab(x: Double, y: Double, z: Double): A = (^.asInstanceOf[js.Dynamic].applyDynamic("xyz2lab")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[A]
}
