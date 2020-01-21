package typings.jimpPluginRotate

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-rotate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Rotate extends js.Object {
    def rotate(deg: Double): this.type = js.native
    def rotate(deg: Double, cb: ImageCallback[this.type]): this.type = js.native
    def rotate(deg: Double, mode: String): this.type = js.native
    def rotate(deg: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def rotate(deg: Double, mode: Boolean): this.type = js.native
    def rotate(deg: Double, mode: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Rotate = js.native
}

