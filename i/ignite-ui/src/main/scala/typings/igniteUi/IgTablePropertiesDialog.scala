package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTablePropertiesDialog
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
object IgTablePropertiesDialog {
  
  @scala.inline
  def apply(): IgTablePropertiesDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTablePropertiesDialog]
  }
  
  @scala.inline
  implicit class IgTablePropertiesDialogMutableBuilder[Self <: IgTablePropertiesDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: (/* event */ Event, /* ui */ ApplyEventUIParam) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setCancel(value: (/* event */ Event, /* ui */ CancelEventUIParam) => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setHide(value: (/* event */ Event, /* ui */ HideEventUIParam) => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setShow(value: (/* event */ Event, /* ui */ ShowEventUIParam) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
