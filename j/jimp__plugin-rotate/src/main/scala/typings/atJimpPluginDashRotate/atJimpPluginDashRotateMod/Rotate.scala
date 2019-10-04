package typings.atJimpPluginDashRotate.atJimpPluginDashRotateMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rotate extends js.Object {
  def rotate(deg: Double): this.type = js.native
  def rotate(deg: Double, cb: ImageCallback[this.type]): this.type = js.native
  def rotate(deg: Double, mode: String): this.type = js.native
  def rotate(deg: Double, mode: String, cb: ImageCallback[this.type]): this.type = js.native
  def rotate(deg: Double, mode: Boolean): this.type = js.native
  def rotate(deg: Double, mode: Boolean, cb: ImageCallback[this.type]): this.type = js.native
}

