package typings.atJimpPluginDashInvert

import typings.atJimpCore.typesEtcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-invert", JSImport.Namespace)
@js.native
object atJimpPluginDashInvertMod extends js.Object {
  @js.native
  trait Invert extends js.Object {
    def invert(): this.type = js.native
    def invert(cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Invert = js.native
}

