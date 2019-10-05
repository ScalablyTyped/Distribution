package typings.atJimpPluginDashFlip

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpPluginDashFlip.atJimpPluginDashFlipMod.Flip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-flip", JSImport.Namespace)
@js.native
object atJimpPluginDashFlipMod extends js.Object {
  @js.native
  trait Flip extends js.Object {
    def flip(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def flip(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
    def mirror(horizontal: Boolean, vertical: Boolean): this.type = js.native
    def mirror(horizontal: Boolean, vertical: Boolean, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Flip = js.native
}

