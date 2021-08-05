package typings.jsonPatchGen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Array[JsonPatch] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[JsonPatch]]
  inline def apply(obj1: js.Object): js.Array[JsonPatch] = ^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any]).asInstanceOf[js.Array[JsonPatch]]
  inline def apply(obj1: js.Object, obj2: js.Object): js.Array[JsonPatch] = (^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Array[JsonPatch]]
  inline def apply(obj1: Null, obj2: js.Object): js.Array[JsonPatch] = (^.asInstanceOf[js.Dynamic].apply(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Array[JsonPatch]]
  
  @JSImport("json-patch-gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JsonPatch extends StObject {
    
    var op: PatchOperation
    
    var path: String
    
    var value: js.Any
  }
  object JsonPatch {
    
    inline def apply(op: PatchOperation, path: String, value: js.Any): JsonPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonPatch]
    }
    
    extension [Self <: JsonPatch](x: Self) {
      
      inline def setOp(value: PatchOperation): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonPatchGen.jsonPatchGenStrings.replace
    - typings.jsonPatchGen.jsonPatchGenStrings.add
    - typings.jsonPatchGen.jsonPatchGenStrings.remove
  */
  trait PatchOperation extends StObject
  object PatchOperation {
    
    inline def add: typings.jsonPatchGen.jsonPatchGenStrings.add = "add".asInstanceOf[typings.jsonPatchGen.jsonPatchGenStrings.add]
    
    inline def remove: typings.jsonPatchGen.jsonPatchGenStrings.remove = "remove".asInstanceOf[typings.jsonPatchGen.jsonPatchGenStrings.remove]
    
    inline def replace: typings.jsonPatchGen.jsonPatchGenStrings.replace = "replace".asInstanceOf[typings.jsonPatchGen.jsonPatchGenStrings.replace]
  }
}
