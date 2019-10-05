package typings.atJimpPluginDashBlit

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesJimpMod.Jimp
import typings.atJimpPluginDashBlit.atJimpPluginDashBlitMod.Blit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-blit", JSImport.Namespace)
@js.native
object atJimpPluginDashBlitMod extends js.Object {
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
  
  def default(): Blit = js.native
}

