package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
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
  implicit class SelectionCollectionSettingsOps[Self <: SelectionCollectionSettings] (val x: Self) extends AnyVal {
    
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
    def setMultipleSelection(value: Boolean): Self = this.set("multipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleSelection: Self = this.set("multipleSelection", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setSubscribers(value: SelectionCollectionSettingsSubscribers): Self = this.set("subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribers: Self = this.set("subscribers", js.undefined)
  }
}
