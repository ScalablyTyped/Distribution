package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFeedResponseVariantValuesItem extends StObject {
  
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
  implicit class SavedFeedResponseVariantValuesItemMutableBuilder[Self <: SavedFeedResponseVariantValuesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_preselected(value: Boolean): Self = StObject.set(x, "is_preselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisual_style(value: String): Self = StObject.set(x, "visual_style", value.asInstanceOf[js.Any])
  }
}
