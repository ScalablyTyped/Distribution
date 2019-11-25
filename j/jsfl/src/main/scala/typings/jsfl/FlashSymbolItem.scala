package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSymbolItem extends js.Object {
  var scalingGrid: Boolean
  var scalingGridRect: FlashRectangle
  var sourceAutoUpdate: Boolean
  var sourceFilePath: String
  var sourceLibraryName: String
  var symbolType: String
  var timeline: FlashTimeline
  def convertToCompiledClip(): Unit
  def exportSWC(outputURI: String): Unit
  def exportSWF(outputURI: String): Unit
}

object FlashSymbolItem {
  @scala.inline
  def apply(
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
}

