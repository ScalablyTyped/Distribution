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
    addData: (java.lang.String, java.lang.String, js.Any) => scala.Unit,
    allowSmoothing: scala.Boolean,
    bitRate: java.lang.String,
    bitmap: scala.Boolean,
    bits: java.lang.String,
    bold: scala.Boolean,
    compressionType: java.lang.String,
    convertStereoToMono: scala.Boolean,
    convertToCompiledClip: () => scala.Unit,
    embedRanges: java.lang.String,
    embedVariantGlyphs: scala.Boolean,
    embeddedCharacters: java.lang.String,
    exportSWC: java.lang.String => scala.Unit,
    exportSWF: java.lang.String => scala.Unit,
    exportToFLV: java.lang.String => scala.Boolean,
    exportToFile: java.lang.String => scala.Boolean,
    fileLastModifiedDate: java.lang.String,
    font: java.lang.String,
    getData: java.lang.String => js.Any,
    hasData: java.lang.String => scala.Boolean,
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
    removeData: java.lang.String => scala.Unit,
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
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction3(addData), allowSmoothing = allowSmoothing, bitRate = bitRate, bitmap = bitmap, bits = bits, bold = bold, compressionType = compressionType, convertStereoToMono = convertStereoToMono, convertToCompiledClip = js.Any.fromFunction0(convertToCompiledClip), embedRanges = embedRanges, embedVariantGlyphs = embedVariantGlyphs, embeddedCharacters = embeddedCharacters, exportSWC = js.Any.fromFunction1(exportSWC), exportSWF = js.Any.fromFunction1(exportSWF), exportToFLV = js.Any.fromFunction1(exportToFLV), exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate, font = font, getData = js.Any.fromFunction1(getData), hasData = js.Any.fromFunction1(hasData), isDefineFont4Symbol = isDefineFont4Symbol, italic = italic, itemType = itemType, linkageBaseClass = linkageBaseClass, linkageClassName = linkageClassName, linkageExportForAS = linkageExportForAS, linkageExportForRS = linkageExportForRS, linkageExportInFirstFrame = linkageExportInFirstFrame, linkageIdentifier = linkageIdentifier, linkageImportForRS = linkageImportForRS, linkageURL = linkageURL, name = name, originalCompressionType = originalCompressionType, quality = quality, removeData = js.Any.fromFunction1(removeData), sampleRate = sampleRate, scalingGrid = scalingGrid, scalingGridRect = scalingGridRect, size = size, sourceAutoUpdate = sourceAutoUpdate, sourceFileExists = sourceFileExists, sourceFileIsCurrent = sourceFileIsCurrent, sourceFilePath = sourceFilePath, sourceLibraryName = sourceLibraryName, symbolType = symbolType, timeline = timeline, useDeblocking = useDeblocking, useImportedJPEGQuality = useImportedJPEGQuality, videoType = videoType)
  
    __obj.asInstanceOf[FlashItem]
  }
}

