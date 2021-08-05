package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseVariantValuesItem extends StObject {
  
  var id: String
  
  var is_preselected: Boolean
  
  var name: String
  
  var value: String
  
  var visual_style: String
}
object SavedFeedResponseVariantValuesItem {
  
  inline def apply(id: String, is_preselected: Boolean, name: String, value: String, visual_style: String): SavedFeedResponseVariantValuesItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_preselected = is_preselected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visual_style = visual_style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseVariantValuesItem]
  }
  
  extension [Self <: SavedFeedResponseVariantValuesItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_preselected(value: Boolean): Self = StObject.set(x, "is_preselected", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisual_style(value: String): Self = StObject.set(x, "visual_style", value.asInstanceOf[js.Any])
  }
}
