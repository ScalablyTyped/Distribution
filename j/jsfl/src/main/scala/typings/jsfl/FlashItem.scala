package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.jsfl.FlashBitmapItem because var conflicts: compressionType, fileLastModifiedDate, originalCompressionType, sourceFileExists, sourceFileIsCurrent, sourceFilePath. Inlined allowSmoothing, useDeblocking, useImportedJPEGQuality- typings.jsfl.FlashVideoItem because var conflicts: fileLastModifiedDate, sourceFileExists, sourceFilePath. Inlined exportToFLV, sourceFileIsCurrent, videoType */ trait FlashItem
  extends FlashSymbolItem
     with FlashFolderItem
     with FlashFontItem
     with FlashSoundItem {
  var allowSmoothing: Boolean
  /** Read-only; a string that specifies the type of element.  "undefined", "component", "movie clip", "graphic", "button", "folder", "font", "sound", "bitmap", "compiled clip", "screen", or "video" */
  var itemType: String
  var linkageBaseClass: String
  var linkageClassName: String
  var linkageExportForAS: Boolean
  var linkageExportForRS: Boolean
  var linkageExportInFirstFrame: Boolean
  var linkageIdentifier: String
  var linkageImportForRS: Boolean
  var linkageURL: String
  /** A string that specifies the name of the library item, which includes the folder structure. */
  var name: String
  var sourceFileIsCurrent: Boolean
  var useDeblocking: Boolean
  var useImportedJPEGQuality: Boolean
  var videoType: String
  def addData(name: String, `type`: String, data: js.Any): Unit
  def exportToFLV(fileURI: String): Boolean
  def getData(name: String): js.Any
  def hasData(name: String): Boolean
  def removeData(name: String): Unit
}

object FlashItem {
  @scala.inline
  def apply(
    addData: (String, String, js.Any) => Unit,
    allowSmoothing: Boolean,
    bitRate: String,
    bitmap: Boolean,
    bits: String,
    bold: Boolean,
    compressionType: String,
    convertStereoToMono: Boolean,
    convertToCompiledClip: () => Unit,
    embedRanges: String,
    embedVariantGlyphs: Boolean,
    embeddedCharacters: String,
    exportSWC: String => Unit,
    exportSWF: String => Unit,
    exportToFLV: String => Boolean,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    font: String,
    getData: String => js.Any,
    hasData: String => Boolean,
    isDefineFont4Symbol: Boolean,
    italic: Boolean,
    itemType: String,
    linkageBaseClass: String,
    linkageClassName: String,
    linkageExportForAS: Boolean,
    linkageExportForRS: Boolean,
    linkageExportInFirstFrame: Boolean,
    linkageIdentifier: String,
    linkageImportForRS: Boolean,
    linkageURL: String,
    name: String,
    originalCompressionType: String,
    quality: String,
    removeData: String => Unit,
    sampleRate: String,
    scalingGrid: Boolean,
    scalingGridRect: FlashRectangle,
    size: Double,
    sourceAutoUpdate: Boolean,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    sourceLibraryName: String,
    symbolType: String,
    timeline: FlashTimeline,
    useDeblocking: Boolean,
    useImportedJPEGQuality: Boolean,
    videoType: String
  ): FlashItem = {
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction3(addData), allowSmoothing = allowSmoothing, bitRate = bitRate, bitmap = bitmap, bits = bits, bold = bold, compressionType = compressionType, convertStereoToMono = convertStereoToMono, convertToCompiledClip = js.Any.fromFunction0(convertToCompiledClip), embedRanges = embedRanges, embedVariantGlyphs = embedVariantGlyphs, embeddedCharacters = embeddedCharacters, exportSWC = js.Any.fromFunction1(exportSWC), exportSWF = js.Any.fromFunction1(exportSWF), exportToFLV = js.Any.fromFunction1(exportToFLV), exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate, font = font, getData = js.Any.fromFunction1(getData), hasData = js.Any.fromFunction1(hasData), isDefineFont4Symbol = isDefineFont4Symbol, italic = italic, itemType = itemType, linkageBaseClass = linkageBaseClass, linkageClassName = linkageClassName, linkageExportForAS = linkageExportForAS, linkageExportForRS = linkageExportForRS, linkageExportInFirstFrame = linkageExportInFirstFrame, linkageIdentifier = linkageIdentifier, linkageImportForRS = linkageImportForRS, linkageURL = linkageURL, name = name, originalCompressionType = originalCompressionType, quality = quality, removeData = js.Any.fromFunction1(removeData), sampleRate = sampleRate, scalingGrid = scalingGrid, scalingGridRect = scalingGridRect, size = size, sourceAutoUpdate = sourceAutoUpdate, sourceFileExists = sourceFileExists, sourceFileIsCurrent = sourceFileIsCurrent, sourceFilePath = sourceFilePath, sourceLibraryName = sourceLibraryName, symbolType = symbolType, timeline = timeline, useDeblocking = useDeblocking, useImportedJPEGQuality = useImportedJPEGQuality, videoType = videoType)
  
    __obj.asInstanceOf[FlashItem]
  }
}

