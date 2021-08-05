package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionCollectionSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var multipleSelection: js.UndefOr[Boolean] = js.undefined
  
  var owner: js.UndefOr[js.Any] = js.undefined
  
  var subscribers: js.UndefOr[SelectionCollectionSettingsSubscribers] = js.undefined
}
object SelectionCollectionSettings {
  
  inline def apply(): SelectionCollectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionCollectionSettings]
  }
  
  extension [Self <: SelectionCollectionSettings](x: Self) {
    
    inline def setMultipleSelection(value: Boolean): Self = StObject.set(x, "multipleSelection", value.asInstanceOf[js.Any])
    
    inline def setMultipleSelectionUndefined: Self = StObject.set(x, "multipleSelection", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSubscribers(value: SelectionCollectionSettingsSubscribers): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersUndefined: Self = StObject.set(x, "subscribers", js.undefined)
  }
}
