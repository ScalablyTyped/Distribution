package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableOptions extends DraggableEvents {
  var addClasses: js.UndefOr[Boolean] = js.native
  var appendTo: js.UndefOr[js.Any] = js.native
  var axis: js.UndefOr[String] = js.native
  var cancel: js.UndefOr[String] = js.native
  var classes: js.UndefOr[DraggableClasses] = js.native
  var connectToSortable: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  var containment: js.UndefOr[js.Any] = js.native
  var cursor: js.UndefOr[String] = js.native
  var cursorAt: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var distance: js.UndefOr[Double] = js.native
  var grid: js.UndefOr[js.Array[Double]] = js.native
  var handle: js.UndefOr[js.Any] = js.native
  var helper: js.UndefOr[js.Any] = js.native
  var iframeFix: js.UndefOr[js.Any] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var refreshPositions: js.UndefOr[Boolean] = js.native
  var revert: js.UndefOr[js.Any] = js.native
  var revertDuration: js.UndefOr[Double] = js.native
  var scope: js.UndefOr[String] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
  var scrollSensitivity: js.UndefOr[Double] = js.native
  var scrollSpeed: js.UndefOr[Double] = js.native
  var snap: js.UndefOr[js.Any] = js.native
  var snapMode: js.UndefOr[String] = js.native
  var snapTolerance: js.UndefOr[Double] = js.native
  var stack: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object DraggableOptions {
  @scala.inline
  def apply(): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOptions]
  }
  @scala.inline
  implicit class DraggableOptionsOps[Self <: DraggableOptions] (val x: Self) extends AnyVal {
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
    def setAddClasses(value: Boolean): Self = this.set("addClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddClasses: Self = this.set("addClasses", js.undefined)
    @scala.inline
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setClasses(value: DraggableClasses): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setConnectToSortableVarargs(value: Element*): Self = this.set("connectToSortable", js.Array(value :_*))
    @scala.inline
    def setConnectToSortable(value: Element | js.Array[Element] | JQuery | String): Self = this.set("connectToSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectToSortable: Self = this.set("connectToSortable", js.undefined)
    @scala.inline
    def setContainment(value: js.Any): Self = this.set("containment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCursorAt(value: js.Any): Self = this.set("cursorAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorAt: Self = this.set("cursorAt", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setGridVarargs(value: Double*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: js.Array[Double]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandle(value: js.Any): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setHelper(value: js.Any): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setIframeFix(value: js.Any): Self = this.set("iframeFix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeFix: Self = this.set("iframeFix", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRefreshPositions(value: Boolean): Self = this.set("refreshPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshPositions: Self = this.set("refreshPositions", js.undefined)
    @scala.inline
    def setRevert(value: js.Any): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
    @scala.inline
    def setRevertDuration(value: Double): Self = this.set("revertDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevertDuration: Self = this.set("revertDuration", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    @scala.inline
    def setSnap(value: js.Any): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapMode(value: String): Self = this.set("snapMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapMode: Self = this.set("snapMode", js.undefined)
    @scala.inline
    def setSnapTolerance(value: Double): Self = this.set("snapTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapTolerance: Self = this.set("snapTolerance", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

