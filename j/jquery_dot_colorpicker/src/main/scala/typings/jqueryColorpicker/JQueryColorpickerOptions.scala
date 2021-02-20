package typings.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryColorpickerOptions extends StObject {
  
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
  implicit class JQueryColorpickerOptionsMutableBuilder[Self <: JQueryColorpickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setAltAlpha(value: Boolean): Self = StObject.set(x, "altAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltAlphaUndefined: Self = StObject.set(x, "altAlpha", js.undefined)
    
    @scala.inline
    def setAltField(value: String): Self = StObject.set(x, "altField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFieldUndefined: Self = StObject.set(x, "altField", js.undefined)
    
    @scala.inline
    def setAltOnChange(value: Boolean): Self = StObject.set(x, "altOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltOnChangeUndefined: Self = StObject.set(x, "altOnChange", js.undefined)
    
    @scala.inline
    def setAltProperties(value: String): Self = StObject.set(x, "altProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltPropertiesUndefined: Self = StObject.set(x, "altProperties", js.undefined)
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    @scala.inline
    def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
    
    @scala.inline
    def setButtonColorize(value: Boolean): Self = StObject.set(x, "buttonColorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonColorizeUndefined: Self = StObject.set(x, "buttonColorize", js.undefined)
    
    @scala.inline
    def setButtonImage(value: String): Self = StObject.set(x, "buttonImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonImageOnly(value: Boolean): Self = StObject.set(x, "buttonImageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonImageOnlyUndefined: Self = StObject.set(x, "buttonImageOnly", js.undefined)
    
    @scala.inline
    def setButtonImageUndefined: Self = StObject.set(x, "buttonImage", js.undefined)
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setCancel(value: js.Function): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
    
    @scala.inline
    def setCloseOnOutside(value: Boolean): Self = StObject.set(x, "closeOnOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnOutsideUndefined: Self = StObject.set(x, "closeOnOutside", js.undefined)
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFormat(value: String): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorFormatUndefined: Self = StObject.set(x, "colorFormat", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setHsv(value: Boolean): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsvUndefined: Self = StObject.set(x, "hsv", js.undefined)
    
    @scala.inline
    def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineFrame(value: Boolean): Self = StObject.set(x, "inlineFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineFrameUndefined: Self = StObject.set(x, "inlineFrame", js.undefined)
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setLayout(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOk(value: js.Function): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkOnEnter(value: Boolean): Self = StObject.set(x, "okOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkOnEnterUndefined: Self = StObject.set(x, "okOnEnter", js.undefined)
    
    @scala.inline
    def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    
    @scala.inline
    def setOpen(value: js.Function): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPart(value: js.Any): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setParts(value: js.Any): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    @scala.inline
    def setRegional(value: String): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRevert(value: Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
    
    @scala.inline
    def setRgb(value: Boolean): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbUndefined: Self = StObject.set(x, "rgb", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Function): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setShowAnim(value: String): Self = StObject.set(x, "showAnim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAnimUndefined: Self = StObject.set(x, "showAnim", js.undefined)
    
    @scala.inline
    def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    @scala.inline
    def setShowNoneButton(value: Boolean): Self = StObject.set(x, "showNoneButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNoneButtonUndefined: Self = StObject.set(x, "showNoneButton", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    @scala.inline
    def setShowOptions(value: js.Any): Self = StObject.set(x, "showOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOptionsUndefined: Self = StObject.set(x, "showOptions", js.undefined)
    
    @scala.inline
    def setSwatches(value: js.Any): Self = StObject.set(x, "swatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwatchesUndefined: Self = StObject.set(x, "swatches", js.undefined)
    
    @scala.inline
    def setSwatchesWidth(value: Double): Self = StObject.set(x, "swatchesWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwatchesWidthUndefined: Self = StObject.set(x, "swatchesWidth", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
