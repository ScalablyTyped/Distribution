package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotViewDataSelectorOptionsDragAndDropSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Which element the draggable helper should be appended to while dragging.
    */
  var appendTo: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the containment for the drag helper. The area inside of which thehelper is contained would be scrollable while dragging.
    *
    */
  var containment: js.UndefOr[Boolean | String | js.Array[_]] = js.native
  
  /**
    * Specifies z-index that would be set for the drag helper.
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object IgPivotViewDataSelectorOptionsDragAndDropSettings {
  
  @scala.inline
  def apply(): IgPivotViewDataSelectorOptionsDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSelectorOptionsDragAndDropSettings]
  }
  
  @scala.inline
  implicit class IgPivotViewDataSelectorOptionsDragAndDropSettingsMutableBuilder[Self <: IgPivotViewDataSelectorOptionsDragAndDropSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setContainment(value: Boolean | String | js.Array[_]): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    @scala.inline
    def setContainmentVarargs(value: js.Any*): Self = StObject.set(x, "containment", js.Array(value :_*))
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
