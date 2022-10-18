package typings.jimpPluginGaussian

import typings.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-gaussian", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Gaussian = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Gaussian]
  
  @js.native
  trait Gaussian extends StObject {
    
    def gaussian(r: Double): this.type = js.native
    def gaussian(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
