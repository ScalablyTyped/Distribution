package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashSymbolItem extends js.Object {
  var scalingGrid: Boolean = js.native
  var scalingGridRect: FlashRectangle = js.native
  var sourceAutoUpdate: Boolean = js.native
  var sourceFilePath: String = js.native
  var sourceLibraryName: String = js.native
  var symbolType: String = js.native
  var timeline: FlashTimeline = js.native
  def convertToCompiledClip(): Unit = js.native
  def exportSWC(outputURI: String): Unit = js.native
  def exportSWF(outputURI: String): Unit = js.native
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
  @scala.inline
  implicit class FlashSymbolItemOps[Self <: FlashSymbolItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvertToCompiledClip(value: () => Unit): Self = this.set("convertToCompiledClip", js.Any.fromFunction0(value))
    @scala.inline
    def setExportSWC(value: String => Unit): Self = this.set("exportSWC", js.Any.fromFunction1(value))
    @scala.inline
    def setExportSWF(value: String => Unit): Self = this.set("exportSWF", js.Any.fromFunction1(value))
    @scala.inline
    def setScalingGrid(value: Boolean): Self = this.set("scalingGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalingGridRect(value: FlashRectangle): Self = this.set("scalingGridRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceAutoUpdate(value: Boolean): Self = this.set("sourceAutoUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFilePath(value: String): Self = this.set("sourceFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLibraryName(value: String): Self = this.set("sourceLibraryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolType(value: String): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeline(value: FlashTimeline): Self = this.set("timeline", value.asInstanceOf[js.Any])
  }
  
}

