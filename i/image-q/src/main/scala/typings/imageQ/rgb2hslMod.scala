package typings.imageQ

import typings.imageQ.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgb2hslMod {
  
  @JSImport("image-q/dist/conversion/rgb2hsl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rgb2hsl(r: Double, g: Double, b: Double): H = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[H]
}
