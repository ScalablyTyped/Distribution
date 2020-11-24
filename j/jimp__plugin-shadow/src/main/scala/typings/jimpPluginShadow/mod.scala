package typings.jimpPluginShadow

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginShadow.anon.Blur
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-shadow", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Shadow = js.native
  
  @js.native
  trait Shadow extends js.Object {
    
    def shadow(): this.type = js.native
    def shadow(cb: ImageCallback[this.type]): this.type = js.native
    def shadow(options: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def shadow(options: Blur): this.type = js.native
    def shadow(options: Blur, cb: ImageCallback[this.type]): this.type = js.native
  }
}
