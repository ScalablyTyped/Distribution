package typings.atJimpPluginDashDither

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpPluginDashDither.atJimpPluginDashDitherMod.Dither
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-dither", JSImport.Namespace)
@js.native
object atJimpPluginDashDitherMod extends js.Object {
  @js.native
  trait Dither extends js.Object {
    def dither16(): this.type = js.native
    def dither16(cb: ImageCallback[this.type]): this.type = js.native
    def dither565(): this.type = js.native
    def dither565(cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Dither = js.native
}

