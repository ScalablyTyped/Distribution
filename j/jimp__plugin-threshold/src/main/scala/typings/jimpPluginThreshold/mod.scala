package typings.jimpPluginThreshold

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-threshold", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Threshold extends js.Object {
    def threshold(opts: AnonAutoGreyscale): this.type = js.native
    def threshold(opts: AnonAutoGreyscale, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Threshold = js.native
}

