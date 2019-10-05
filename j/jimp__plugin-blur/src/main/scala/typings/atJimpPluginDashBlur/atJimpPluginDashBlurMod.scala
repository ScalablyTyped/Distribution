package typings.atJimpPluginDashBlur

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpPluginDashBlur.atJimpPluginDashBlurMod.Blur
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-blur", JSImport.Namespace)
@js.native
object atJimpPluginDashBlurMod extends js.Object {
  @js.native
  trait Blur extends js.Object {
    def blur(r: Double): this.type = js.native
    def blur(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Blur = js.native
}

