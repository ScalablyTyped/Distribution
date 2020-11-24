package typings.jimpPluginPrint.mod

import typings.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintClass extends js.Object {
  
  // Text methods
  def print(font: Font, x: Double, y: Double, text: PrintableText): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, cb: ImageCallback[this.type]): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: js.UndefOr[scala.Nothing],
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: js.UndefOr[scala.Nothing],
    maxHeight: js.UndefOr[scala.Nothing],
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: js.UndefOr[scala.Nothing],
    maxHeight: Double
  ): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: js.UndefOr[scala.Nothing],
    maxHeight: Double,
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: Double,
    cb: ImageCallback[this.type]
  ): this.type = js.native
  def print(
    font: Font,
    x: Double,
    y: Double,
    text: PrintableText,
    maxWidth: Double,
    maxHeight: js.UndefOr[scala.Nothing],
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
