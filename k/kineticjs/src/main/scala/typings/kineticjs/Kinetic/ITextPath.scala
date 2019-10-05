package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextPath extends IShape {
  def getFontFamily(): String = js.native
  def getFontSize(): Double = js.native
  def getFontStyle(): String = js.native
  def getText(): String = js.native
  def getTextFill(): js.Any = js.native
  def getTextHeight(): Double = js.native
  def getTextStroke(): js.Any = js.native
  def getTextStrokeWidth(): Double = js.native
  def getTextWidth(): Double = js.native
  def setFontFamily(fontFamily: String): js.Any = js.native
  def setFontSize(fontSize: Double): js.Any = js.native
  def setFontStroke(textStroke: js.Any): js.Any = js.native
  def setFontStyle(fontStyle: String): js.Any = js.native
  def setText(text: String): js.Any = js.native
  def setTextFill(textFill: js.Any): js.Any = js.native
  def setTextStrokeWidth(textStrokeWidth: Double): js.Any = js.native
}

