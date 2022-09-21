package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeneratedIds extends StObject {
  
  /**
    * The IDs generated for the requesting user in the specified space.
    */
  var ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This is always drive#generatedIds
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of file that can be created with these IDs.
    */
  var space: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeneratedIds {
  
  inline def apply(): SchemaGeneratedIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedIds]
  }
  
  extension [Self <: SchemaGeneratedIds](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsNull: Self = StObject.set(x, "ids", null)
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceNull: Self = StObject.set(x, "space", null)
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
