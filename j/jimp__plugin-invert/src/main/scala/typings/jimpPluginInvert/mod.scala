package typings.jimpPluginInvert

import typings.jimpCore.etcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-invert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Invert = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Invert]
  
  @js.native
  trait Invert extends StObject {
    
    def invert(): this.type = js.native
    def invert(cb: ImageCallback[this.type]): this.type = js.native
  }
}
