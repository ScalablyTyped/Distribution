package typings.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryColorpickerOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.native
  var altAlpha: js.UndefOr[Boolean] = js.native
  var altField: js.UndefOr[String] = js.native
  var altOnChange: js.UndefOr[Boolean] = js.native
  var altProperties: js.UndefOr[String] = js.native
  var autoOpen: js.UndefOr[Boolean] = js.native
  var buttonClass: js.UndefOr[String] = js.native
  var buttonColorize: js.UndefOr[Boolean] = js.native
  var buttonImage: js.UndefOr[String] = js.native
  var buttonImageOnly: js.UndefOr[Boolean] = js.native
  var buttonText: js.UndefOr[String] = js.native
  // Events
  // TODO: Figure out actual types.
  var cancel: js.UndefOr[js.Function] = js.native
  var close: js.UndefOr[js.Function] = js.native
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  var closeOnOutside: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var colorFormat: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var hsv: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.Function] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inlineFrame: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[StringDictionary[js.Array[Double]]] = js.native
  var limit: js.UndefOr[String] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var ok: js.UndefOr[js.Function] = js.native
  var okOnEnter: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[js.Function] = js.native
  var part: js.UndefOr[js.Any] = js.native
  var parts: js.UndefOr[js.Any] = js.native
  var regional: js.UndefOr[String] = js.native
  var revert: js.UndefOr[Boolean] = js.native
  var rgb: js.UndefOr[Boolean] = js.native
  var select: js.UndefOr[js.Function] = js.native
  var showAnim: js.UndefOr[String] = js.native
  var showCancelButton: js.UndefOr[Boolean] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var showNoneButton: js.UndefOr[Boolean] = js.native
  var showOn: js.UndefOr[String] = js.native
  var showOptions: js.UndefOr[js.Any] = js.native
  var swatches: js.UndefOr[js.Any] = js.native
  var swatchesWidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
}

object JQueryColorpickerOptions {
  @scala.inline
  def apply(): JQueryColorpickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryColorpickerOptions]
  }
  @scala.inline
  implicit class JQueryColorpickerOptionsOps[Self <: JQueryColorpickerOptions] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAltAlpha(value: Boolean): Self = this.set("altAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltAlpha: Self = this.set("altAlpha", js.undefined)
    @scala.inline
    def setAltField(value: String): Self = this.set("altField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltField: Self = this.set("altField", js.undefined)
    @scala.inline
    def setAltOnChange(value: Boolean): Self = this.set("altOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltOnChange: Self = this.set("altOnChange", js.undefined)
    @scala.inline
    def setAltProperties(value: String): Self = this.set("altProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltProperties: Self = this.set("altProperties", js.undefined)
    @scala.inline
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setButtonClass(value: String): Self = this.set("buttonClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonClass: Self = this.set("buttonClass", js.undefined)
    @scala.inline
    def setButtonColorize(value: Boolean): Self = this.set("buttonColorize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonColorize: Self = this.set("buttonColorize", js.undefined)
    @scala.inline
    def setButtonImage(value: String): Self = this.set("buttonImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonImage: Self = this.set("buttonImage", js.undefined)
    @scala.inline
    def setButtonImageOnly(value: Boolean): Self = this.set("buttonImageOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonImageOnly: Self = this.set("buttonImageOnly", js.undefined)
    @scala.inline
    def setButtonText(value: String): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    @scala.inline
    def setCancel(value: js.Function): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setClose(value: js.Function): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    @scala.inline
    def setCloseOnOutside(value: Boolean): Self = this.set("closeOnOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnOutside: Self = this.set("closeOnOutside", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorFormat(value: String): Self = this.set("colorFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorFormat: Self = this.set("colorFormat", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setHsv(value: Boolean): Self = this.set("hsv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsv: Self = this.set("hsv", js.undefined)
    @scala.inline
    def setInit(value: js.Function): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInlineFrame(value: Boolean): Self = this.set("inlineFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineFrame: Self = this.set("inlineFrame", js.undefined)
    @scala.inline
    def setLayout(value: StringDictionary[js.Array[Double]]): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOk(value: js.Function): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    @scala.inline
    def setOkOnEnter(value: Boolean): Self = this.set("okOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkOnEnter: Self = this.set("okOnEnter", js.undefined)
    @scala.inline
    def setOpen(value: js.Function): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPart(value: js.Any): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    @scala.inline
    def setParts(value: js.Any): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    @scala.inline
    def setRegional(value: String): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setRevert(value: Boolean): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
    @scala.inline
    def setRgb(value: Boolean): Self = this.set("rgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRgb: Self = this.set("rgb", js.undefined)
    @scala.inline
    def setSelect(value: js.Function): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setShowAnim(value: String): Self = this.set("showAnim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAnim: Self = this.set("showAnim", js.undefined)
    @scala.inline
    def setShowCancelButton(value: Boolean): Self = this.set("showCancelButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCancelButton: Self = this.set("showCancelButton", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setShowNoneButton(value: Boolean): Self = this.set("showNoneButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNoneButton: Self = this.set("showNoneButton", js.undefined)
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    @scala.inline
    def setShowOptions(value: js.Any): Self = this.set("showOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOptions: Self = this.set("showOptions", js.undefined)
    @scala.inline
    def setSwatches(value: js.Any): Self = this.set("swatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwatches: Self = this.set("swatches", js.undefined)
    @scala.inline
    def setSwatchesWidth(value: Double): Self = this.set("swatchesWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwatchesWidth: Self = this.set("swatchesWidth", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

