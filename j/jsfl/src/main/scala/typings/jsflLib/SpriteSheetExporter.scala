package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SpriteSheetExporter")
@js.native
class SpriteSheetExporter () extends js.Object {
  var algorithm: java.lang.String = js.native
  var allowRotate: scala.Boolean = js.native
  var allowTrimming: scala.Boolean = js.native
  var app: java.lang.String = js.native
  var autoSize: scala.Boolean = js.native
  var borderPadding: scala.Double = js.native
  var canBorderPad: scala.Boolean = js.native
  var canRotate: scala.Boolean = js.native
  var canShapePad: scala.Boolean = js.native
  var canStackDuplicateFrames: scala.Boolean = js.native
  var canTrim: scala.Boolean = js.native
  var format: java.lang.String = js.native
  var image: java.lang.String = js.native
  var layoutFormat: java.lang.String = js.native
  var maxSheetHeight: scala.Double = js.native
  var maxSheetWidth: scala.Double = js.native
  var overflowed: scala.Boolean = js.native
  var shapePadding: scala.Double = js.native
  var sheetHeight: scala.Double = js.native
  var sheetWidth: scala.Double = js.native
  var stackDuplicateFrames: scala.Boolean = js.native
  var version: java.lang.String = js.native
  def addBitmap(item: FlashItem): js.Any = js.native
  def addSymbol(item: FlashItem): js.Any = js.native
  def addSymbol(item: FlashItem, name: java.lang.String): js.Any = js.native
  def addSymbol(item: FlashItem, name: java.lang.String, beginFrame: scala.Double): js.Any = js.native
  def addSymbol(item: FlashItem, name: java.lang.String, beginFrame: scala.Double, endFrame: scala.Double): js.Any = js.native
  def beginExport(): js.Any = js.native
  def changeSymbol(): js.Any = js.native
  def exportSpriteSheet(fileURL: java.lang.String, option: js.Object): java.lang.String = js.native
  def exportSpriteSheet(fileURL: java.lang.String, option: js.Object, writeMetaData: scala.Boolean): java.lang.String = js.native
  def removeBitmap(): js.Any = js.native
  def removeSymbol(): js.Any = js.native
}

