package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Sortable //////////////////////////////////////////////////
@js.native
trait SortableOptions extends SortableEvents {
  var appendTo: js.UndefOr[js.Any] = js.native
   // jQuery, Element, Selector or string
  var attribute: js.UndefOr[String] = js.native
  var axis: js.UndefOr[String] = js.native
  var cancel: js.UndefOr[js.Any] = js.native
   // Selector
  var connectWith: js.UndefOr[js.Any] = js.native
   // Selector
  var containment: js.UndefOr[js.Any] = js.native
   // Element, Selector or string
  var cursor: js.UndefOr[String] = js.native
  var cursorAt: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var distance: js.UndefOr[Double] = js.native
  var dropOnEmpty: js.UndefOr[Boolean] = js.native
  var forceHelperSize: js.UndefOr[Boolean] = js.native
  var forcePlaceholderSize: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[js.Array[Double]] = js.native
  var handle: js.UndefOr[js.Any] = js.native
  var helper: js.UndefOr[
    String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])
  ] = js.native
   // Selector or Element
  var items: js.UndefOr[js.Any] = js.native
   // Selector
  var opacity: js.UndefOr[Double] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var revert: js.UndefOr[js.Any] = js.native
   // boolean or number
  var scroll: js.UndefOr[Boolean] = js.native
  var scrollSensitivity: js.UndefOr[Double] = js.native
  var scrollSpeed: js.UndefOr[Double] = js.native
  var tolerance: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object SortableOptions {
  @scala.inline
  def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  @scala.inline
  implicit class SortableOptionsOps[Self <: SortableOptions] (val x: Self) extends AnyVal {
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
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCancel(value: js.Any): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setConnectWith(value: js.Any): Self = this.set("connectWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectWith: Self = this.set("connectWith", js.undefined)
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
    def setDropOnEmpty(value: Boolean): Self = this.set("dropOnEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropOnEmpty: Self = this.set("dropOnEmpty", js.undefined)
    @scala.inline
    def setForceHelperSize(value: Boolean): Self = this.set("forceHelperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHelperSize: Self = this.set("forceHelperSize", js.undefined)
    @scala.inline
    def setForcePlaceholderSize(value: Boolean): Self = this.set("forcePlaceholderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePlaceholderSize: Self = this.set("forcePlaceholderSize", js.undefined)
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
    def setHelperFunction2(value: (/* event */ JQueryEventObject, /* element */ Sortable) => Element): Self = this.set("helper", js.Any.fromFunction2(value))
    @scala.inline
    def setHelper(value: String | (js.Function2[/* event */ JQueryEventObject, /* element */ Sortable, Element])): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRevert(value: js.Any): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
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
    def setTolerance(value: String): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

