package typings.materializeCss.anon

import typings.materializeCss.M.Modal
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TimepickerOptions> */
@js.native
trait PartialTimepickerOptions extends js.Object {
  
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
  implicit class PartialTimepickerOptionsOps[Self <: PartialTimepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: String): Self = this.set("defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTime: Self = this.set("defaultTime", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFromNow(value: Double): Self = this.set("fromNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromNow: Self = this.set("fromNow", js.undefined)
    
    @scala.inline
    def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
        ]
    ): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = this.set("onCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCloseEnd: Self = this.set("onCloseEnd", js.undefined)
    
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = this.set("onCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCloseStart: Self = this.set("onCloseStart", js.undefined)
    
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = this.set("onOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpenEnd: Self = this.set("onOpenEnd", js.undefined)
    
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = this.set("onOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOpenStart: Self = this.set("onOpenStart", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setShowClearBtn(value: Boolean): Self = this.set("showClearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClearBtn: Self = this.set("showClearBtn", js.undefined)
    
    @scala.inline
    def setTwelveHour(value: Boolean): Self = this.set("twelveHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwelveHour: Self = this.set("twelveHour", js.undefined)
    
    @scala.inline
    def setVibrate(value: Boolean): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
}
