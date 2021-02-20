package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteSheetExporter extends StObject {
  
  def addBitmap(item: FlashItem): js.Any = js.native
  
  def addSymbol(item: FlashItem): js.Any = js.native
  def addSymbol(
    item: FlashItem,
    name: js.UndefOr[scala.Nothing],
    beginFrame: js.UndefOr[scala.Nothing],
    endFrame: Double
  ): js.Any = js.native
  def addSymbol(item: FlashItem, name: js.UndefOr[scala.Nothing], beginFrame: Double): js.Any = js.native
  def addSymbol(item: FlashItem, name: js.UndefOr[scala.Nothing], beginFrame: Double, endFrame: Double): js.Any = js.native
  def addSymbol(item: FlashItem, name: String): js.Any = js.native
  def addSymbol(item: FlashItem, name: String, beginFrame: js.UndefOr[scala.Nothing], endFrame: Double): js.Any = js.native
  def addSymbol(item: FlashItem, name: String, beginFrame: Double): js.Any = js.native
  def addSymbol(item: FlashItem, name: String, beginFrame: Double, endFrame: Double): js.Any = js.native
  
  var algorithm: String = js.native
  
  var allowRotate: Boolean = js.native
  
  var allowTrimming: Boolean = js.native
  
  var app: String = js.native
  
  var autoSize: Boolean = js.native
  
  def beginExport(): js.Any = js.native
  
  var borderPadding: Double = js.native
  
  var canBorderPad: Boolean = js.native
  
  var canRotate: Boolean = js.native
  
  var canShapePad: Boolean = js.native
  
  var canStackDuplicateFrames: Boolean = js.native
  
  var canTrim: Boolean = js.native
  
  def changeSymbol(): js.Any = js.native
  
  def exportSpriteSheet(fileURL: String, option: js.Object): String = js.native
  def exportSpriteSheet(fileURL: String, option: js.Object, writeMetaData: Boolean): String = js.native
  
  var format: String = js.native
  
  var image: String = js.native
  
  var layoutFormat: String = js.native
  
  var maxSheetHeight: Double = js.native
  
  var maxSheetWidth: Double = js.native
  
  var overflowed: Boolean = js.native
  
  def removeBitmap(): js.Any = js.native
  
  def removeSymbol(): js.Any = js.native
  
  var shapePadding: Double = js.native
  
  var sheetHeight: Double = js.native
  
  var sheetWidth: Double = js.native
  
  var stackDuplicateFrames: Boolean = js.native
  
  var version: String = js.native
}
