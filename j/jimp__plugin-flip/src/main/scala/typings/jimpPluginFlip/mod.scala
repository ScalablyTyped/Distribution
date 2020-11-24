package typings.jimpPluginFlip

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-flip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Flip = js.native
  
  @js.native
  trait Flip extends js.Object {
    
    def flip(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def flip(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    
    def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  }
}
