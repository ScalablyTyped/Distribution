package typings.imageQ

import typings.imageQ.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgb2xyzMod {
  
  @JSImport("image-q/dist/conversion/rgb2xyz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rgb2xyz(r: Double, g: Double, b: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2xyz")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[X]
}
