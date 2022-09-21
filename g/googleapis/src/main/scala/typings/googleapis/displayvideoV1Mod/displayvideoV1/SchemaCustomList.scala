package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomList extends StObject {
  
  /**
    * Output only. The unique ID of the custom list. Assigned by the system.
    */
  var customListId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The display name of the custom list. .
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the custom list.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomList {
  
  inline def apply(): SchemaCustomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomList]
  }
  
  extension [Self <: SchemaCustomList](x: Self) {
    
    inline def setCustomListId(value: String): Self = StObject.set(x, "customListId", value.asInstanceOf[js.Any])
    
    inline def setCustomListIdNull: Self = StObject.set(x, "customListId", null)
    
    inline def setCustomListIdUndefined: Self = StObject.set(x, "customListId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
