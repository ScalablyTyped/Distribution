package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotGridDragAndDropSettings
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
object IgPivotGridDragAndDropSettings {
  
  @scala.inline
  def apply(): IgPivotGridDragAndDropSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGridDragAndDropSettings]
  }
  
  @scala.inline
  implicit class IgPivotGridDragAndDropSettingsOps[Self <: IgPivotGridDragAndDropSettings] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setContainmentVarargs(value: js.Any*): Self = this.set("containment", js.Array(value :_*))
    
    @scala.inline
    def setContainment(value: Boolean | String | js.Array[_]): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
