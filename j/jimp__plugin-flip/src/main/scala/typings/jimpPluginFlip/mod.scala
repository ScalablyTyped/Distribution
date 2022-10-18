package typings.jimpPluginFlip

import typings.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-flip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Flip = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Flip]
  
  @js.native
  trait Flip extends StObject {
    
    def flip(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def flip(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    
    def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  }
}
