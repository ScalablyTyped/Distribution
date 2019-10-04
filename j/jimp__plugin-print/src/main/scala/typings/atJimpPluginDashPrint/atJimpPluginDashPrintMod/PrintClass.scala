package typings.atJimpPluginDashPrint.atJimpPluginDashPrintMod

import typings.atJimpCore.typesEtcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintClass extends js.Object {
  // Text methods
  def print(font: Font, x: Double, y: Double, text: PrintableText): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, cb: ImageCallback[this.type]): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: Double,
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double, maxHeight: Double): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: Double,
    maxHeight: Double,
    cb: ImageCallback[this.type]
  ): this.type = js.native
}

