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
/* optionName */ StringDictionary[Any] {
  
  var multipleSelection: js.UndefOr[Boolean] = js.undefined
  
  var owner: js.UndefOr[Any] = js.undefined
  
  var subscribers: js.UndefOr[SelectionCollectionSettingsSubscribers] = js.undefined
}
object SelectionCollectionSettings {
  
  inline def apply(): SelectionCollectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionCollectionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionCollectionSettings] (val x: Self) extends AnyVal {
    
    inline def setMultipleSelection(value: Boolean): Self = StObject.set(x, "multipleSelection", value.asInstanceOf[js.Any])
    
    inline def setMultipleSelectionUndefined: Self = StObject.set(x, "multipleSelection", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSubscribers(value: SelectionCollectionSettingsSubscribers): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersUndefined: Self = StObject.set(x, "subscribers", js.undefined)
  }
}
