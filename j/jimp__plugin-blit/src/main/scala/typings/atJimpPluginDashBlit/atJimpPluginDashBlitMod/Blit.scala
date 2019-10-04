package typings.atJimpPluginDashBlit.atJimpPluginDashBlitMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesJimpMod.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blit extends js.Object {
  def blit(src: Jimp, x: Double, y: Double): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double, cb: ImageCallback[this.type]): this.type = js.native
  def blit(src: Jimp, x: Double, y: Double, srcx: Double, srcy: Double, srcw: Double, srch: Double): this.type = js.native
  def blit(
    src: Jimp,
    x: Double,
    y: Double,
    srcx: Double,
    srcy: Double,
    srcw: Double,
    srch: Double,
    cb: ImageCallback[this.type]
  ): this.type = js.native
}

