package typings.materializeCss.anon

import typings.materializeCss.M.Modal
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TimepickerOptions> */
@js.native
trait PartialTimepickerOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var defaultTime: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var fromNow: js.UndefOr[Double] = js.native
  
  var i18n: js.UndefOr[
    Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ]
  ] = js.native
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]] = js.native
  
  var showClearBtn: js.UndefOr[Boolean] = js.native
  
  var twelveHour: js.UndefOr[Boolean] = js.native
  
  var vibrate: js.UndefOr[Boolean] = js.native
}
object PartialTimepickerOptions {
  
  @scala.inline
  def apply(): PartialTimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTimepickerOptions]
  }
  
  @scala.inline
  implicit class PartialTimepickerOptionsMutableBuilder[Self <: PartialTimepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: String): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFromNow(value: Double): Self = StObject.set(x, "fromNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromNowUndefined: Self = StObject.set(x, "fromNow", js.undefined)
    
    @scala.inline
    def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
        ]
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearBtnUndefined: Self = StObject.set(x, "showClearBtn", js.undefined)
    
    @scala.inline
    def setTwelveHour(value: Boolean): Self = StObject.set(x, "twelveHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwelveHourUndefined: Self = StObject.set(x, "twelveHour", js.undefined)
    
    @scala.inline
    def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
  }
}
