package typings.jimpPluginNormalize

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-normalize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Normalize extends js.Object {
    def normalize(): this.type = js.native
    def normalize(cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Normalize = js.native
}

