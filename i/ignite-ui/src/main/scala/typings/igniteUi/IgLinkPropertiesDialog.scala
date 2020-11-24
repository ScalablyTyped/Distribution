package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLinkPropertiesDialog
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  @JSName("apply")
  var apply: js.UndefOr[ApplyEvent] = js.native
  
  var cancel: js.UndefOr[CancelEvent] = js.native
  
  var hide: js.UndefOr[HideEvent] = js.native
  
  var isHidden: js.UndefOr[Boolean] = js.native
  
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  var show: js.UndefOr[ShowEvent] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
}
object IgLinkPropertiesDialog {
  
  @scala.inline
  def apply(): IgLinkPropertiesDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLinkPropertiesDialog]
  }
  
  @scala.inline
  implicit class IgLinkPropertiesDialogOps[Self <: IgLinkPropertiesDialog] (val x: Self) extends AnyVal {
    
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
    def setApply(value: (/* event */ Event, /* ui */ ApplyEventUIParam) => Unit): Self = this.set("apply", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    
    @scala.inline
    def setCancel(value: (/* event */ Event, /* ui */ CancelEventUIParam) => Unit): Self = this.set("cancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setHide(value: (/* event */ Event, /* ui */ HideEventUIParam) => Unit): Self = this.set("hide", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setShow(value: (/* event */ Event, /* ui */ ShowEventUIParam) => Unit): Self = this.set("show", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
