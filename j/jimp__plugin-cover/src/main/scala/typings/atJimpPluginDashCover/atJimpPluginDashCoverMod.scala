package typings.atJimpPluginDashCover

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpPluginDashCover.atJimpPluginDashCoverMod.Cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-cover", JSImport.Namespace)
@js.native
object atJimpPluginDashCoverMod extends js.Object {
  @js.native
  trait Cover extends js.Object {
    def cover(w: Double, h: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String): this.type = js.native
    def cover(w: Double, h: Double, alignBits: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def cover(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Cover = js.native
}

