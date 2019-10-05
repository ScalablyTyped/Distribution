package typings.atJimpPluginDashMask

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesJimpMod.Jimp
import typings.atJimpPluginDashMask.atJimpPluginDashMaskMod.Mask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-mask", JSImport.Namespace)
@js.native
object atJimpPluginDashMaskMod extends js.Object {
  @js.native
  trait Mask extends js.Object {
    def mask(src: Jimp, x: Double, y: Double): this.type = js.native
    def mask(src: Jimp, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Mask = js.native
}

