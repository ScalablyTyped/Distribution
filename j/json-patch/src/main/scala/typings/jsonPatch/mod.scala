package typings.jsonPatch

import typings.jsonPatch.jsonPatchStrings.add
import typings.jsonPatch.jsonPatchStrings.copy
import typings.jsonPatch.jsonPatchStrings.move
import typings.jsonPatch.jsonPatchStrings.remove
import typings.jsonPatch.jsonPatchStrings.replace
import typings.jsonPatch.jsonPatchStrings.test
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json-patch", "InvalidPatchError")
  @js.native
  open class InvalidPatchError () extends JSONPatchError
  
  @JSImport("json-patch", "InvalidPointerError")
  @js.native
  open class InvalidPointerError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("json-patch", "JSONPatchError")
  @js.native
  open class JSONPatchError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("json-patch", "PatchConflictError")
  @js.native
  open class PatchConflictError () extends JSONPatchError
  
  @JSImport("json-patch", "PatchTestFailed")
  @js.native
  open class PatchTestFailed ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def apply(document: Any, patches: js.Array[OpPatch]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(document.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def compile(patches: js.Array[OpPatch]): js.Function1[/* document */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(patches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* document */ Any, Any]]
  
  trait AddPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: add
    
    var value: Any
  }
  object AddPatch {
    
    inline def apply(path: String, value: Any): AddPatch = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPatch]
    }
    
    extension [Self <: AddPatch](x: Self) {
      
      inline def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var from: String
    
    var op: copy
  }
  object CopyPatch {
    
    inline def apply(from: String, path: String): CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyPatch]
    }
    
    extension [Self <: CopyPatch](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait MovePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var from: String
    
    var op: move
  }
  object MovePatch {
    
    inline def apply(from: String, path: String): MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MovePatch]
    }
    
    extension [Self <: MovePatch](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonPatch.mod.AddPatch
    - typings.jsonPatch.mod.RemovePatch
    - typings.jsonPatch.mod.ReplacePatch
    - typings.jsonPatch.mod.MovePatch
    - typings.jsonPatch.mod.CopyPatch
    - typings.jsonPatch.mod.TestPatch
  */
  trait OpPatch extends StObject
  object OpPatch {
    
    inline def AddPatch(path: String, value: Any): typings.jsonPatch.mod.AddPatch = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.AddPatch]
    }
    
    inline def CopyPatch(from: String, path: String): typings.jsonPatch.mod.CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.CopyPatch]
    }
    
    inline def MovePatch(from: String, path: String): typings.jsonPatch.mod.MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.MovePatch]
    }
    
    inline def RemovePatch(path: String): typings.jsonPatch.mod.RemovePatch = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.RemovePatch]
    }
    
    inline def ReplacePatch(path: String, value: Any): typings.jsonPatch.mod.ReplacePatch = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.ReplacePatch]
    }
    
    inline def TestPatch(path: String, value: Any): typings.jsonPatch.mod.TestPatch = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.TestPatch]
    }
  }
  
  trait Patch extends StObject {
    
    var path: String
  }
  object Patch {
    
    inline def apply(path: String): Patch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Patch]
    }
    
    extension [Self <: Patch](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemovePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: remove
  }
  object RemovePatch {
    
    inline def apply(path: String): RemovePatch = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePatch]
    }
    
    extension [Self <: RemovePatch](x: Self) {
      
      inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplacePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: replace
    
    var value: Any
  }
  object ReplacePatch {
    
    inline def apply(path: String, value: Any): ReplacePatch = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacePatch]
    }
    
    extension [Self <: ReplacePatch](x: Self) {
      
      inline def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: test
    
    var value: Any
  }
  object TestPatch {
    
    inline def apply(path: String, value: Any): TestPatch = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestPatch]
    }
    
    extension [Self <: TestPatch](x: Self) {
      
      inline def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
