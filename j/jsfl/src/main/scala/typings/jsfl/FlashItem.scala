package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.jsfl.FlashBitmapItem because var conflicts: compressionType, fileLastModifiedDate, originalCompressionType, sourceFileExists, sourceFileIsCurrent, sourceFilePath. Inlined allowSmoothing, useDeblocking, useImportedJPEGQuality
- typings.jsfl.FlashVideoItem because var conflicts: fileLastModifiedDate, sourceFileExists, sourceFilePath. Inlined exportToFLV, sourceFileIsCurrent, videoType */ trait FlashItem
  extends StObject
     with FlashSymbolItem
     with FlashFolderItem
     with FlashFontItem
     with FlashSoundItem {
  
  def addData(name: String, `type`: String, data: Any): Unit
  
  var allowSmoothing: Boolean
  
  def exportToFLV(fileURI: String): Boolean
  
  def getData(name: String): Any
  
  def hasData(name: String): Boolean
  
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
  
  def removeData(name: String): Unit
  
  var sourceFileIsCurrent: Boolean
  
  var useDeblocking: Boolean
  
  var useImportedJPEGQuality: Boolean
  
  var videoType: String
}
object FlashItem {
  
  inline def apply(
    addData: (String, String, Any) => Unit,
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
    getData: String => Any,
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
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction3(addData), allowSmoothing = allowSmoothing.asInstanceOf[js.Any], bitRate = bitRate.asInstanceOf[js.Any], bitmap = bitmap.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], convertStereoToMono = convertStereoToMono.asInstanceOf[js.Any], convertToCompiledClip = js.Any.fromFunction0(convertToCompiledClip), embedRanges = embedRanges.asInstanceOf[js.Any], embedVariantGlyphs = embedVariantGlyphs.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], exportSWC = js.Any.fromFunction1(exportSWC), exportSWF = js.Any.fromFunction1(exportSWF), exportToFLV = js.Any.fromFunction1(exportToFLV), exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), hasData = js.Any.fromFunction1(hasData), isDefineFont4Symbol = isDefineFont4Symbol.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], linkageBaseClass = linkageBaseClass.asInstanceOf[js.Any], linkageClassName = linkageClassName.asInstanceOf[js.Any], linkageExportForAS = linkageExportForAS.asInstanceOf[js.Any], linkageExportForRS = linkageExportForRS.asInstanceOf[js.Any], linkageExportInFirstFrame = linkageExportInFirstFrame.asInstanceOf[js.Any], linkageIdentifier = linkageIdentifier.asInstanceOf[js.Any], linkageImportForRS = linkageImportForRS.asInstanceOf[js.Any], linkageURL = linkageURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], removeData = js.Any.fromFunction1(removeData), sampleRate = sampleRate.asInstanceOf[js.Any], scalingGrid = scalingGrid.asInstanceOf[js.Any], scalingGridRect = scalingGridRect.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sourceAutoUpdate = sourceAutoUpdate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], useDeblocking = useDeblocking.asInstanceOf[js.Any], useImportedJPEGQuality = useImportedJPEGQuality.asInstanceOf[js.Any], videoType = videoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashItem] (val x: Self) extends AnyVal {
    
    inline def setAddData(value: (String, String, Any) => Unit): Self = StObject.set(x, "addData", js.Any.fromFunction3(value))
    
    inline def setAllowSmoothing(value: Boolean): Self = StObject.set(x, "allowSmoothing", value.asInstanceOf[js.Any])
    
    inline def setExportToFLV(value: String => Boolean): Self = StObject.set(x, "exportToFLV", js.Any.fromFunction1(value))
    
    inline def setGetData(value: String => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setHasData(value: String => Boolean): Self = StObject.set(x, "hasData", js.Any.fromFunction1(value))
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setLinkageBaseClass(value: String): Self = StObject.set(x, "linkageBaseClass", value.asInstanceOf[js.Any])
    
    inline def setLinkageClassName(value: String): Self = StObject.set(x, "linkageClassName", value.asInstanceOf[js.Any])
    
    inline def setLinkageExportForAS(value: Boolean): Self = StObject.set(x, "linkageExportForAS", value.asInstanceOf[js.Any])
    
    inline def setLinkageExportForRS(value: Boolean): Self = StObject.set(x, "linkageExportForRS", value.asInstanceOf[js.Any])
    
    inline def setLinkageExportInFirstFrame(value: Boolean): Self = StObject.set(x, "linkageExportInFirstFrame", value.asInstanceOf[js.Any])
    
    inline def setLinkageIdentifier(value: String): Self = StObject.set(x, "linkageIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLinkageImportForRS(value: Boolean): Self = StObject.set(x, "linkageImportForRS", value.asInstanceOf[js.Any])
    
    inline def setLinkageURL(value: String): Self = StObject.set(x, "linkageURL", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveData(value: String => Unit): Self = StObject.set(x, "removeData", js.Any.fromFunction1(value))
    
    inline def setSourceFileIsCurrent(value: Boolean): Self = StObject.set(x, "sourceFileIsCurrent", value.asInstanceOf[js.Any])
    
    inline def setUseDeblocking(value: Boolean): Self = StObject.set(x, "useDeblocking", value.asInstanceOf[js.Any])
    
    inline def setUseImportedJPEGQuality(value: Boolean): Self = StObject.set(x, "useImportedJPEGQuality", value.asInstanceOf[js.Any])
    
    inline def setVideoType(value: String): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
  }
}
