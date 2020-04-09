package typings.jimpPluginCircle

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-circle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Circle extends js.Object {
    def circle(): this.type = js.native
    def circle(cb: ImageCallback[this.type]): this.type = js.native
    def circle(options: AnonRadius): this.type = js.native
    def circle(options: AnonRadius, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Circle = js.native
}

