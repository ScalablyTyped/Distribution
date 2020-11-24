package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotGridLevelSortDirection
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the unique name of the level, which will be sorted.
    */
  var levelUniqueName: js.UndefOr[String] = js.native
  
  /**
    * optional="true" Specifies what type of sorting will be applied to the header cells. If no behavior is specified, the level is going to be sorted with the behavior specified in the defaultLevelSortBehavior option.
    *
    * Valid values:
    * "system" Sorts the headers by a specified sort key.
    * "alphabetical" Sorts alphabetically the header captions.
    */
  var sortBehavior: js.UndefOr[String] = js.native
  
  /**
    * optional="true" Specifies the sort direction. If no direction is specified, the level is going to be sorted in the direction specified by the firstLevelSortDirection option.
    */
  var sortDirection: js.UndefOr[js.Any] = js.native
}
object IgPivotGridLevelSortDirection {
  
  @scala.inline
  def apply(): IgPivotGridLevelSortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridLevelSortDirection]
  }
  
  @scala.inline
  implicit class IgPivotGridLevelSortDirectionOps[Self <: IgPivotGridLevelSortDirection] (val x: Self) extends AnyVal {
    
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
    def setLevelUniqueName(value: String): Self = this.set("levelUniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelUniqueName: Self = this.set("levelUniqueName", js.undefined)
    
    @scala.inline
    def setSortBehavior(value: String): Self = this.set("sortBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBehavior: Self = this.set("sortBehavior", js.undefined)
    
    @scala.inline
    def setSortDirection(value: js.Any): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
  }
}
