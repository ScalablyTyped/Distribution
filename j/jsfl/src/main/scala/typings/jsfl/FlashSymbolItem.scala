package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSymbolItem extends StObject {
  
  def convertToCompiledClip(): Unit
  
  def exportSWC(outputURI: String): Unit
  
  def exportSWF(outputURI: String): Unit
  
  var scalingGrid: Boolean
  
  var scalingGridRect: FlashRectangle
  
  var sourceAutoUpdate: Boolean
  
  var sourceFilePath: String
  
  var sourceLibraryName: String
  
  var symbolType: String
  
  var timeline: FlashTimeline
}
object FlashSymbolItem {
  
  inline def apply(
    convertToCompiledClip: () => Unit,
    exportSWC: String => Unit,
    exportSWF: String => Unit,
    scalingGrid: Boolean,
    scalingGridRect: FlashRectangle,
    sourceAutoUpdate: Boolean,
    sourceFilePath: String,
    sourceLibraryName: String,
    symbolType: String,
    timeline: FlashTimeline
  ): FlashSymbolItem = {
    val __obj = js.Dynamic.literal(convertToCompiledClip = js.Any.fromFunction0(convertToCompiledClip), exportSWC = js.Any.fromFunction1(exportSWC), exportSWF = js.Any.fromFunction1(exportSWF), scalingGrid = scalingGrid.asInstanceOf[js.Any], scalingGridRect = scalingGridRect.asInstanceOf[js.Any], sourceAutoUpdate = sourceAutoUpdate.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSymbolItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashSymbolItem] (val x: Self) extends AnyVal {
    
    inline def setConvertToCompiledClip(value: () => Unit): Self = StObject.set(x, "convertToCompiledClip", js.Any.fromFunction0(value))
    
    inline def setExportSWC(value: String => Unit): Self = StObject.set(x, "exportSWC", js.Any.fromFunction1(value))
    
    inline def setExportSWF(value: String => Unit): Self = StObject.set(x, "exportSWF", js.Any.fromFunction1(value))
    
    inline def setScalingGrid(value: Boolean): Self = StObject.set(x, "scalingGrid", value.asInstanceOf[js.Any])
    
    inline def setScalingGridRect(value: FlashRectangle): Self = StObject.set(x, "scalingGridRect", value.asInstanceOf[js.Any])
    
    inline def setSourceAutoUpdate(value: Boolean): Self = StObject.set(x, "sourceAutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    inline def setSourceLibraryName(value: String): Self = StObject.set(x, "sourceLibraryName", value.asInstanceOf[js.Any])
    
    inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: FlashTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
  }
}
