package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupObjectsRequest extends StObject {
  
  /**
    * The object IDs of the objects to group. Only page elements can be grouped. There should be at least two page elements on the same page that are not already in another group. Some page elements, such as videos, tables and placeholders cannot be grouped.
    */
  var childrenObjectIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A user-supplied object ID for the group to be created. If you specify an ID, it must be unique among all pages and page elements in the presentation. The ID must start with an alphanumeric character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
    */
  var groupObjectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGroupObjectsRequest {
  
  inline def apply(): SchemaGroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupObjectsRequest]
  }
  
  extension [Self <: SchemaGroupObjectsRequest](x: Self) {
    
    inline def setChildrenObjectIds(value: js.Array[String]): Self = StObject.set(x, "childrenObjectIds", value.asInstanceOf[js.Any])
    
    inline def setChildrenObjectIdsNull: Self = StObject.set(x, "childrenObjectIds", null)
    
    inline def setChildrenObjectIdsUndefined: Self = StObject.set(x, "childrenObjectIds", js.undefined)
    
    inline def setChildrenObjectIdsVarargs(value: String*): Self = StObject.set(x, "childrenObjectIds", js.Array(value*))
    
    inline def setGroupObjectId(value: String): Self = StObject.set(x, "groupObjectId", value.asInstanceOf[js.Any])
    
    inline def setGroupObjectIdNull: Self = StObject.set(x, "groupObjectId", null)
    
    inline def setGroupObjectIdUndefined: Self = StObject.set(x, "groupObjectId", js.undefined)
  }
}
