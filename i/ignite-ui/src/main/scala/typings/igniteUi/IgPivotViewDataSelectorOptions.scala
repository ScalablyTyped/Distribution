package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewDataSelectorOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A function that will be called to determine if an item can be moved in or dropped on an area of the data selector.
    * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
    * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
    * paramType="string" The unique name of the item.
    * returnType="bool"  The function must return true if the item should be accepted.
    */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  
  /**
    * Settings for the drag and drop functionality of the igPivotDataSelector.
    */
  var dragAndDropSettings: js.UndefOr[IgPivotViewDataSelectorOptionsDragAndDropSettings] = js.native
  
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.native
}
object IgPivotViewDataSelectorOptions {
  
  @scala.inline
  def apply(): IgPivotViewDataSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSelectorOptions]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSelectorOptionsOps[Self <: IgPivotViewDataSelectorOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomMoveValidation(value: js.Function): Self = this.set("customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMoveValidation: Self = this.set("customMoveValidation", js.undefined)
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotViewDataSelectorOptionsDragAndDropSettings): Self = this.set("dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragAndDropSettings: Self = this.set("dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = this.set("dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownParent: Self = this.set("dropDownParent", js.undefined)
  }
}
