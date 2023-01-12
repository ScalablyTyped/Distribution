package typings.materializeCss.anon

import typings.materializeCss.M.Modal
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TimepickerOptions> */
trait PartialTimepickerOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var defaultTime: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var fromNow: js.UndefOr[Double] = js.undefined
  
  var i18n: js.UndefOr[PartialInternationalizati] = js.undefined
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]] = js.undefined
  
  var showClearBtn: js.UndefOr[Boolean] = js.undefined
  
  var twelveHour: js.UndefOr[Boolean] = js.undefined
  
  var vibrate: js.UndefOr[Boolean] = js.undefined
}
object PartialTimepickerOptions {
  
  inline def apply(): PartialTimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTimepickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTimepickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDefaultTime(value: String): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFromNow(value: Double): Self = StObject.set(x, "fromNow", value.asInstanceOf[js.Any])
    
    inline def setFromNowUndefined: Self = StObject.set(x, "fromNow", js.undefined)
    
    inline def setI18n(value: PartialInternationalizati): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setOnCloseEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    inline def setOnCloseStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    inline def setOnOpenEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    inline def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    inline def setOnOpenStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    inline def setOnSelect(value: js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    inline def setShowClearBtnUndefined: Self = StObject.set(x, "showClearBtn", js.undefined)
    
    inline def setTwelveHour(value: Boolean): Self = StObject.set(x, "twelveHour", value.asInstanceOf[js.Any])
    
    inline def setTwelveHourUndefined: Self = StObject.set(x, "twelveHour", js.undefined)
    
    inline def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
  }
}
