package typings.jimpPluginThreshold

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginThreshold.anon.AutoGreyscale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-threshold", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Threshold extends js.Object {
    def threshold(opts: AutoGreyscale): this.type = js.native
    def threshold(opts: AutoGreyscale, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Threshold = js.native
}

