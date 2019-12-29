package typings.atJimpPluginDashDisplace

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesJimpMod.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-displace", JSImport.Namespace)
@js.native
object atJimpPluginDashDisplaceMod extends js.Object {
  @js.native
  trait Displace extends js.Object {
    def displace(map: Jimp, offset: Double): this.type = js.native
    def displace(map: Jimp, offset: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Displace = js.native
}

