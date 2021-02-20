package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionCollectionSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var multipleSelection: js.UndefOr[Boolean] = js.native
  
  var owner: js.UndefOr[js.Any] = js.native
  
  var subscribers: js.UndefOr[SelectionCollectionSettingsSubscribers] = js.native
}
object SelectionCollectionSettings {
  
  @scala.inline
  def apply(): SelectionCollectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionCollectionSettings]
  }
  
  @scala.inline
  implicit class SelectionCollectionSettingsMutableBuilder[Self <: SelectionCollectionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultipleSelection(value: Boolean): Self = StObject.set(x, "multipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleSelectionUndefined: Self = StObject.set(x, "multipleSelection", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSubscribers(value: SelectionCollectionSettingsSubscribers): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersUndefined: Self = StObject.set(x, "subscribers", js.undefined)
  }
}
