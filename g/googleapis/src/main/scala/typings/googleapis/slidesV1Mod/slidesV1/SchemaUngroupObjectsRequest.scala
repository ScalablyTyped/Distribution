package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUngroupObjectsRequest extends StObject {
  
  /**
    * The object IDs of the objects to ungroup. Only groups that are not inside other groups can be ungrouped. All the groups should be on the same page. The group itself is deleted. The visual sizes and positions of all the children are preserved.
    */
  var objectIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaUngroupObjectsRequest {
  
  inline def apply(): SchemaUngroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUngroupObjectsRequest]
  }
  
  extension [Self <: SchemaUngroupObjectsRequest](x: Self) {
    
    inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsNull: Self = StObject.set(x, "objectIds", null)
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value*))
  }
}
