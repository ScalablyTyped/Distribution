package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- jsflLib.FlashBitmapItem because var conflicts: compressionType, fileLastModifiedDate, originalCompressionType, sourceFileExists, sourceFileIsCurrent, sourceFilePath. Inlined exportToFile, allowSmoothing, useDeblocking, useImportedJPEGQuality- jsflLib.FlashVideoItem because var conflicts: fileLastModifiedDate, sourceFileExists, sourceFilePath. Inlined exportToFLV, sourceFileIsCurrent, videoType */ trait FlashItem
  extends FlashSymbolItem
     with FlashFolderItem
     with FlashFontItem
     with FlashSoundItem {
  var allowSmoothing: scala.Boolean
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
  var sourceFileIsCurrent: scala.Boolean
  var useDeblocking: scala.Boolean
  var useImportedJPEGQuality: scala.Boolean
  var videoType: java.lang.String
  def addData(name: java.lang.String, `type`: java.lang.String, data: js.Any): scala.Unit
  def exportToFLV(fileURI: java.lang.String): scala.Boolean
  def getData(name: java.lang.String): js.Any
  def hasData(name: java.lang.String): scala.Boolean
  def removeData(name: java.lang.String): scala.Unit
}

object FlashItem {
  @scala.inline
  def apply(
    addData: js.Function3[java.lang.String, java.lang.String, js.Any, scala.Unit],
    allowSmoothing: scala.Boolean,
    bitRate: java.lang.String,
    bitmap: scala.Boolean,
    bits: java.lang.String,
    bold: scala.Boolean,
    compressionType: java.lang.String,
    convertStereoToMono: scala.Boolean,
    convertToCompiledClip: js.Function0[scala.Unit],
    embedRanges: java.lang.String,
    embedVariantGlyphs: scala.Boolean,
    embeddedCharacters: java.lang.String,
    exportSWC: js.Function1[java.lang.String, scala.Unit],
    exportSWF: js.Function1[java.lang.String, scala.Unit],
    exportToFLV: js.Function1[java.lang.String, scala.Boolean],
    exportToFile: js.Function1[java.lang.String, scala.Boolean],
    fileLastModifiedDate: java.lang.String,
    font: java.lang.String,
    getData: js.Function1[java.lang.String, js.Any],
    hasData: js.Function1[java.lang.String, scala.Boolean],
    isDefineFont4Symbol: scala.Boolean,
    italic: scala.Boolean,
    itemType: java.lang.String,
    linkageBaseClass: java.lang.String,
    linkageClassName: java.lang.String,
    linkageExportForAS: scala.Boolean,
    linkageExportForRS: scala.Boolean,
    linkageExportInFirstFrame: scala.Boolean,
    linkageIdentifier: java.lang.String,
    linkageImportForRS: scala.Boolean,
    linkageURL: java.lang.String,
    name: java.lang.String,
    originalCompressionType: java.lang.String,
    quality: java.lang.String,
    removeData: js.Function1[java.lang.String, scala.Unit],
    sampleRate: java.lang.String,
    scalingGrid: scala.Boolean,
    scalingGridRect: FlashRectangle,
    size: scala.Double,
    sourceAutoUpdate: scala.Boolean,
    sourceFileExists: scala.Boolean,
    sourceFileIsCurrent: scala.Boolean,
    sourceFilePath: java.lang.String,
    sourceLibraryName: java.lang.String,
    symbolType: java.lang.String,
    timeline: FlashTimeline,
    useDeblocking: scala.Boolean,
    useImportedJPEGQuality: scala.Boolean,
    videoType: java.lang.String
  ): FlashItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addData")(addData)
    __obj.updateDynamic("allowSmoothing")(allowSmoothing)
    __obj.updateDynamic("bitRate")(bitRate)
    __obj.updateDynamic("bitmap")(bitmap)
    __obj.updateDynamic("bits")(bits)
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("compressionType")(compressionType)
    __obj.updateDynamic("convertStereoToMono")(convertStereoToMono)
    __obj.updateDynamic("convertToCompiledClip")(convertToCompiledClip)
    __obj.updateDynamic("embedRanges")(embedRanges)
    __obj.updateDynamic("embedVariantGlyphs")(embedVariantGlyphs)
    __obj.updateDynamic("embeddedCharacters")(embeddedCharacters)
    __obj.updateDynamic("exportSWC")(exportSWC)
    __obj.updateDynamic("exportSWF")(exportSWF)
    __obj.updateDynamic("exportToFLV")(exportToFLV)
    __obj.updateDynamic("exportToFile")(exportToFile)
    __obj.updateDynamic("fileLastModifiedDate")(fileLastModifiedDate)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("hasData")(hasData)
    __obj.updateDynamic("isDefineFont4Symbol")(isDefineFont4Symbol)
    __obj.updateDynamic("italic")(italic)
    __obj.updateDynamic("itemType")(itemType)
    __obj.updateDynamic("linkageBaseClass")(linkageBaseClass)
    __obj.updateDynamic("linkageClassName")(linkageClassName)
    __obj.updateDynamic("linkageExportForAS")(linkageExportForAS)
    __obj.updateDynamic("linkageExportForRS")(linkageExportForRS)
    __obj.updateDynamic("linkageExportInFirstFrame")(linkageExportInFirstFrame)
    __obj.updateDynamic("linkageIdentifier")(linkageIdentifier)
    __obj.updateDynamic("linkageImportForRS")(linkageImportForRS)
    __obj.updateDynamic("linkageURL")(linkageURL)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("originalCompressionType")(originalCompressionType)
    __obj.updateDynamic("quality")(quality)
    __obj.updateDynamic("removeData")(removeData)
    __obj.updateDynamic("sampleRate")(sampleRate)
    __obj.updateDynamic("scalingGrid")(scalingGrid)
    __obj.updateDynamic("scalingGridRect")(scalingGridRect)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("sourceAutoUpdate")(sourceAutoUpdate)
    __obj.updateDynamic("sourceFileExists")(sourceFileExists)
    __obj.updateDynamic("sourceFileIsCurrent")(sourceFileIsCurrent)
    __obj.updateDynamic("sourceFilePath")(sourceFilePath)
    __obj.updateDynamic("sourceLibraryName")(sourceLibraryName)
    __obj.updateDynamic("symbolType")(symbolType)
    __obj.updateDynamic("timeline")(timeline)
    __obj.updateDynamic("useDeblocking")(useDeblocking)
    __obj.updateDynamic("useImportedJPEGQuality")(useImportedJPEGQuality)
    __obj.updateDynamic("videoType")(videoType)
    __obj.asInstanceOf[FlashItem]
  }
}

