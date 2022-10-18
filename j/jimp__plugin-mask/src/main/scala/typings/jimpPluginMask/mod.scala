package typings.jimpPluginMask

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpCore.typesJimpMod.Jimp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Mask = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Mask]
  
  @js.native
  trait Mask extends StObject {
    
    def mask(src: Jimp, x: Double, y: Double): this.type = js.native
    def mask(src: Jimp, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
