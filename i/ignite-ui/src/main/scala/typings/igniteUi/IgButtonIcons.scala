package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgButtonIcons
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var primary: js.UndefOr[Any] = js.undefined
  
  var secondary: js.UndefOr[Any] = js.undefined
}
object IgButtonIcons {
  
  inline def apply(): IgButtonIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButtonIcons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgButtonIcons] (val x: Self) extends AnyVal {
    
    inline def setPrimary(value: Any): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: Any): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
