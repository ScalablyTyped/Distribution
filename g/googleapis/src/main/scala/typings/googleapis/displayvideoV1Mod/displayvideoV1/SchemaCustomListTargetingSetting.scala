package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomListTargetingSetting extends StObject {
  
  /**
    * Required. Custom id of custom list targeting setting. This id is custom_list_id.
    */
  var customListId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomListTargetingSetting {
  
  inline def apply(): SchemaCustomListTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomListTargetingSetting]
  }
  
  extension [Self <: SchemaCustomListTargetingSetting](x: Self) {
    
    inline def setCustomListId(value: String): Self = StObject.set(x, "customListId", value.asInstanceOf[js.Any])
    
    inline def setCustomListIdNull: Self = StObject.set(x, "customListId", null)
    
    inline def setCustomListIdUndefined: Self = StObject.set(x, "customListId", js.undefined)
  }
}
