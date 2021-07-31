package typings.jimpPluginShadow

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginShadow.anon.Blur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-shadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Shadow = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Shadow]
  
  @js.native
  trait Shadow extends StObject {
    
    def shadow(): this.type = js.native
    def shadow(cb: ImageCallback[this.type]): this.type = js.native
    def shadow(options: Unit, cb: ImageCallback[this.type]): this.type = js.native
    def shadow(options: Blur): this.type = js.native
    def shadow(options: Blur, cb: ImageCallback[this.type]): this.type = js.native
  }
}
