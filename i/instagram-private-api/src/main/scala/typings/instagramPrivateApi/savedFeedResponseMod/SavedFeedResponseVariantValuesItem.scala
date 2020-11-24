package typings.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFeedResponseVariantValuesItem extends js.Object {
  
  var id: String = js.native
  
  var is_preselected: Boolean = js.native
  
  var name: String = js.native
  
  var value: String = js.native
  
  var visual_style: String = js.native
}
object SavedFeedResponseVariantValuesItem {
  
  @scala.inline
  def apply(id: String, is_preselected: Boolean, name: String, value: String, visual_style: String): SavedFeedResponseVariantValuesItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_preselected = is_preselected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visual_style = visual_style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseVariantValuesItem]
  }
  
  @scala.inline
  implicit class SavedFeedResponseVariantValuesItemOps[Self <: SavedFeedResponseVariantValuesItem] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_preselected(value: Boolean): Self = this.set("is_preselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisual_style(value: String): Self = this.set("visual_style", value.asInstanceOf[js.Any])
  }
}
