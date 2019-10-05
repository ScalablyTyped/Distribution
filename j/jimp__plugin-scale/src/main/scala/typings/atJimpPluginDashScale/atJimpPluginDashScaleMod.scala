package typings.atJimpPluginDashScale

import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpPluginDashScale.atJimpPluginDashScaleMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-scale", JSImport.Namespace)
@js.native
object atJimpPluginDashScaleMod extends js.Object {
  @js.native
  trait Scale extends js.Object {
    def scale(f: Double): this.type = js.native
    def scale(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    def scale(f: Double, mode: String): this.type = js.native
    def scale(f: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
    def scaleToFit(w: Double, h: Double): this.type = js.native
    def scaleToFit(w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String): this.type = js.native
    def scaleToFit(w: Double, h: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Scale = js.native
}

