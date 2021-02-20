package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgButtonIcons
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var primary: js.UndefOr[js.Any] = js.native
  
  var secondary: js.UndefOr[js.Any] = js.native
}
object IgButtonIcons {
  
  @scala.inline
  def apply(): IgButtonIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButtonIcons]
  }
  
  @scala.inline
  implicit class IgButtonIconsMutableBuilder[Self <: IgButtonIcons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: js.Any): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: js.Any): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
