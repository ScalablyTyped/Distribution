package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(jsflLib.FlashBitmapItem because Would inherit conflicting mutable fields List(compressionType, fileLastModifiedDate, originalCompressionType, sourceFileExists, sourceFilePath), jsflLib.FlashVideoItem because Would inherit conflicting mutable fields List(fileLastModifiedDate, sourceFileExists, sourceFilePath))*/
trait FlashItem
  extends FlashSymbolItem
     with FlashFolderItem
     with FlashFontItem
     with FlashSoundItem {
  /** Read-only; a string that specifies the type of element.  "undefined", "component", "movie clip", "graphic", "button", "folder", "font", "sound", "bitmap", "compiled clip", "screen", or "video" */
  var itemType: java.lang.String
  var linkageBaseClass: java.lang.String
  var linkageClassName: java.lang.String
  var linkageExportForAS: scala.Boolean
  var linkageExportForRS: scala.Boolean
  var linkageExportInFirstFrame: scala.Boolean
  var linkageIdentifier: java.lang.String
  var linkageImportForRS: scala.Boolean
  var linkageURL: java.lang.String
  /** A string that specifies the name of the library item, which includes the folder structure. */
  var name: java.lang.String
  def addData(name: java.lang.String, `type`: java.lang.String, data: js.Any): scala.Unit
  def getData(name: java.lang.String): js.Any
  def hasData(name: java.lang.String): scala.Boolean
  def removeData(name: java.lang.String): scala.Unit
}

