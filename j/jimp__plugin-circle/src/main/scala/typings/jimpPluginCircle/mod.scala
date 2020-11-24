package typings.jimpPluginCircle

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginCircle.anon.Radius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/plugin-circle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Circle = js.native
  
  @js.native
  trait Circle extends js.Object {
    
    def circle(): this.type = js.native
    def circle(cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: js.UndefOr[scala.Nothing], cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: Radius): this.type = js.native
    def circle(options: Radius, cb: ImageCallback[this.type]): this.type = js.native
  }
}
