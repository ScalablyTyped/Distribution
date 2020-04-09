package typings.jimpPluginFisheye

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-fisheye", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Fisheye extends js.Object {
    def fishEye(): this.type = js.native
    def fishEye(cb: ImageCallback[this.type]): this.type = js.native
    def fishEye(opts: AnonR): this.type = js.native
    def fishEye(opts: AnonR, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Fisheye = js.native
}

