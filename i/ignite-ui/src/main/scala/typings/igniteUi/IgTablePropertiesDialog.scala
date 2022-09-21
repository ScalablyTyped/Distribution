package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTablePropertiesDialog
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  @JSName("apply")
  var apply: js.UndefOr[ApplyEvent] = js.undefined
  
  var cancel: js.UndefOr[CancelEvent] = js.undefined
  
  var hide: js.UndefOr[HideEvent] = js.undefined
  
  var isHidden: js.UndefOr[Boolean] = js.undefined
  
  var item: js.UndefOr[Any] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  var show: js.UndefOr[ShowEvent] = js.undefined
  
  var target: js.UndefOr[Any] = js.undefined
}
object IgTablePropertiesDialog {
  
  inline def apply(): IgTablePropertiesDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTablePropertiesDialog]
  }
  
  extension [Self <: IgTablePropertiesDialog](x: Self) {
    
    inline def setApply(value: (/* event */ Event, /* ui */ ApplyEventUIParam) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setCancel(value: (/* event */ Event, /* ui */ CancelEventUIParam) => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setHide(value: (/* event */ Event, /* ui */ HideEventUIParam) => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction2(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setShow(value: (/* event */ Event, /* ui */ ShowEventUIParam) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction2(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
