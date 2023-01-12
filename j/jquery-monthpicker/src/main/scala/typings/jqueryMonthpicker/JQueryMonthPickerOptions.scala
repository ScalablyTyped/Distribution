package typings.jqueryMonthpicker

import typings.jqueryMonthpicker.anon.BackTo
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.fadeOut
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.none
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.slideUp
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryMonthPickerOptions extends StObject {
  
  var AltField: js.UndefOr[String | JQuery | Element] = js.undefined
  
  var AltFormat: js.UndefOr[String] = js.undefined
  
  var Animation: js.UndefOr[String] = js.undefined
  
  var Button: js.UndefOr[String | JQuery | Element] = js.undefined
  
  var ButtonIcon: js.UndefOr[String] = js.undefined
  
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  var Duration: js.UndefOr[Double | String] = js.undefined
  
  var HideAnim: js.UndefOr[fadeOut | slideUp | none] = js.undefined
  
  var IsRTL: js.UndefOr[Boolean] = js.undefined
  
  var MaxMonth: js.UndefOr[js.Date | Double | String] = js.undefined
  
  var MinMonth: js.UndefOr[js.Date | Double | String] = js.undefined
  
  var MonthFormat: js.UndefOr[String] = js.undefined
  
  var OnAfterMenuClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnAfterMenuOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnBeforeMenuClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnBeforeMenuOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var Position: js.UndefOr[Any] = js.undefined
  
  var SelectedMonth: js.UndefOr[js.Date | Double | String] = js.undefined
  
  var ShowAnim: js.UndefOr[String] = js.undefined
  
  var ShowIcon: js.UndefOr[Boolean] = js.undefined
  
  var ShowOn: js.UndefOr[String] = js.undefined
  
  var StartYear: js.UndefOr[Double | Null] = js.undefined
  
  var UseInputMask: js.UndefOr[Boolean] = js.undefined
  
  var ValidationErrorMessage: js.UndefOr[String | Null] = js.undefined
  
  var i18n: js.UndefOr[BackTo] = js.undefined
}
object JQueryMonthPickerOptions {
  
  inline def apply(): JQueryMonthPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMonthPickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryMonthPickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAltField(value: String | JQuery | Element): Self = StObject.set(x, "AltField", value.asInstanceOf[js.Any])
    
    inline def setAltFieldUndefined: Self = StObject.set(x, "AltField", js.undefined)
    
    inline def setAltFormat(value: String): Self = StObject.set(x, "AltFormat", value.asInstanceOf[js.Any])
    
    inline def setAltFormatUndefined: Self = StObject.set(x, "AltFormat", js.undefined)
    
    inline def setAnimation(value: String): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "Animation", js.undefined)
    
    inline def setButton(value: String | JQuery | Element): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setButtonIcon(value: String): Self = StObject.set(x, "ButtonIcon", value.asInstanceOf[js.Any])
    
    inline def setButtonIconUndefined: Self = StObject.set(x, "ButtonIcon", js.undefined)
    
    inline def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setDuration(value: Double | String): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setHideAnim(value: fadeOut | slideUp | none): Self = StObject.set(x, "HideAnim", value.asInstanceOf[js.Any])
    
    inline def setHideAnimUndefined: Self = StObject.set(x, "HideAnim", js.undefined)
    
    inline def setI18n(value: BackTo): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "IsRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "IsRTL", js.undefined)
    
    inline def setMaxMonth(value: js.Date | Double | String): Self = StObject.set(x, "MaxMonth", value.asInstanceOf[js.Any])
    
    inline def setMaxMonthUndefined: Self = StObject.set(x, "MaxMonth", js.undefined)
    
    inline def setMinMonth(value: js.Date | Double | String): Self = StObject.set(x, "MinMonth", value.asInstanceOf[js.Any])
    
    inline def setMinMonthUndefined: Self = StObject.set(x, "MinMonth", js.undefined)
    
    inline def setMonthFormat(value: String): Self = StObject.set(x, "MonthFormat", value.asInstanceOf[js.Any])
    
    inline def setMonthFormatUndefined: Self = StObject.set(x, "MonthFormat", js.undefined)
    
    inline def setOnAfterMenuClose(value: () => Unit): Self = StObject.set(x, "OnAfterMenuClose", js.Any.fromFunction0(value))
    
    inline def setOnAfterMenuCloseUndefined: Self = StObject.set(x, "OnAfterMenuClose", js.undefined)
    
    inline def setOnAfterMenuOpen(value: () => Unit): Self = StObject.set(x, "OnAfterMenuOpen", js.Any.fromFunction0(value))
    
    inline def setOnAfterMenuOpenUndefined: Self = StObject.set(x, "OnAfterMenuOpen", js.undefined)
    
    inline def setOnBeforeMenuClose(value: () => Unit): Self = StObject.set(x, "OnBeforeMenuClose", js.Any.fromFunction0(value))
    
    inline def setOnBeforeMenuCloseUndefined: Self = StObject.set(x, "OnBeforeMenuClose", js.undefined)
    
    inline def setOnBeforeMenuOpen(value: () => Unit): Self = StObject.set(x, "OnBeforeMenuOpen", js.Any.fromFunction0(value))
    
    inline def setOnBeforeMenuOpenUndefined: Self = StObject.set(x, "OnBeforeMenuOpen", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
    
    inline def setSelectedMonth(value: js.Date | Double | String): Self = StObject.set(x, "SelectedMonth", value.asInstanceOf[js.Any])
    
    inline def setSelectedMonthUndefined: Self = StObject.set(x, "SelectedMonth", js.undefined)
    
    inline def setShowAnim(value: String): Self = StObject.set(x, "ShowAnim", value.asInstanceOf[js.Any])
    
    inline def setShowAnimUndefined: Self = StObject.set(x, "ShowAnim", js.undefined)
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "ShowIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "ShowIcon", js.undefined)
    
    inline def setShowOn(value: String): Self = StObject.set(x, "ShowOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnUndefined: Self = StObject.set(x, "ShowOn", js.undefined)
    
    inline def setStartYear(value: Double): Self = StObject.set(x, "StartYear", value.asInstanceOf[js.Any])
    
    inline def setStartYearNull: Self = StObject.set(x, "StartYear", null)
    
    inline def setStartYearUndefined: Self = StObject.set(x, "StartYear", js.undefined)
    
    inline def setUseInputMask(value: Boolean): Self = StObject.set(x, "UseInputMask", value.asInstanceOf[js.Any])
    
    inline def setUseInputMaskUndefined: Self = StObject.set(x, "UseInputMask", js.undefined)
    
    inline def setValidationErrorMessage(value: String): Self = StObject.set(x, "ValidationErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorMessageNull: Self = StObject.set(x, "ValidationErrorMessage", null)
    
    inline def setValidationErrorMessageUndefined: Self = StObject.set(x, "ValidationErrorMessage", js.undefined)
  }
}
