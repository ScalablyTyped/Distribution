package typings.json8Patch

import typings.json8Patch.anon.Reversible
import typings.json8Patch.anon.`0`
import typings.json8Patch.json8PatchStrings.add
import typings.json8Patch.json8PatchStrings.copy
import typings.json8Patch.json8PatchStrings.move
import typings.json8Patch.json8PatchStrings.remove
import typings.json8Patch.json8PatchStrings.replace
import typings.json8Patch.json8PatchStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json8-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(doc: js.Any, patch: JsonPatch): ApplyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[ApplyResult]
  inline def apply(doc: js.Any, patch: JsonPatch, options: Reversible): ApplyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ApplyResult]
  inline def apply(doc: js.Any, patch: JsonPatch, options: `0`): ApplyResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ApplyResultWithRevert]
  
  inline def apply_ApplyResultWithRevert(doc: js.Any, patch: JsonPatch): ApplyResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[ApplyResultWithRevert]
  
  inline def diff(doc1: js.Any, doc2: js.Any): JsonPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(doc1.asInstanceOf[js.Any], doc2.asInstanceOf[js.Any])).asInstanceOf[JsonPatch]
  
  inline def patch(doc: js.Any, patch: JsonPatch): PatchResult = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[PatchResult]
  inline def patch(doc: js.Any, patch: JsonPatch, options: Reversible): PatchResult = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PatchResult]
  inline def patch(doc: js.Any, patch: JsonPatch, options: `0`): PatchResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PatchResultWithRevert]
  
  inline def patch_PatchResultWithRevert(doc: js.Any, patch: JsonPatch): PatchResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[PatchResultWithRevert]
  
  inline def revert(doc: js.Any, revertPatch: JsonPatch): ApplyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(doc.asInstanceOf[js.Any], revertPatch.asInstanceOf[js.Any])).asInstanceOf[ApplyResult]
  
  trait AddOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: add
    
    var value: js.Any
  }
  object AddOperation {
    
    inline def apply(path: String, value: js.Any): AddOperation = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation]
    }
    
    extension [Self <: AddOperation](x: Self) {
      
      inline def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyResult extends StObject {
    
    var doc: js.Any
  }
  object ApplyResult {
    
    inline def apply(doc: js.Any): ApplyResult = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyResult]
    }
    
    extension [Self <: ApplyResult](x: Self) {
      
      inline def setDoc(value: js.Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyResultWithRevert
    extends StObject
       with ApplyResult {
    
    var revert: JsonPatch
  }
  object ApplyResultWithRevert {
    
    inline def apply(doc: js.Any, revert: JsonPatch): ApplyResultWithRevert = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyResultWithRevert]
    }
    
    extension [Self <: ApplyResultWithRevert](x: Self) {
      
      inline def setRevert(value: JsonPatch): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setRevertVarargs(value: JsonPatchOperation*): Self = StObject.set(x, "revert", js.Array(value :_*))
    }
  }
  
  trait BaseOperation extends StObject {
    
    var path: String
  }
  object BaseOperation {
    
    inline def apply(path: String): BaseOperation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOperation]
    }
    
    extension [Self <: BaseOperation](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var from: js.Any
    
    var op: copy
  }
  object CopyOperation {
    
    inline def apply(from: js.Any, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    extension [Self <: CopyOperation](x: Self) {
      
      inline def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  type JsonPatch = js.Array[JsonPatchOperation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.json8Patch.mod.AddOperation
    - typings.json8Patch.mod.RemoveOperation
    - typings.json8Patch.mod.ReplaceOperation
    - typings.json8Patch.mod.MoveOperation
    - typings.json8Patch.mod.CopyOperation
    - typings.json8Patch.mod.TestOperation
  */
  trait JsonPatchOperation extends StObject
  object JsonPatchOperation {
    
    inline def AddOperation(path: String, value: js.Any): typings.json8Patch.mod.AddOperation = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.AddOperation]
    }
    
    inline def CopyOperation(from: js.Any, path: String): typings.json8Patch.mod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.CopyOperation]
    }
    
    inline def MoveOperation(from: js.Any, path: String): typings.json8Patch.mod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.MoveOperation]
    }
    
    inline def RemoveOperation(path: String): typings.json8Patch.mod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.RemoveOperation]
    }
    
    inline def ReplaceOperation(path: String, value: js.Any): typings.json8Patch.mod.ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.ReplaceOperation]
    }
    
    inline def TestOperation(path: String, value: js.Any): typings.json8Patch.mod.TestOperation = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.TestOperation]
    }
  }
  
  trait MoveOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var from: js.Any
    
    var op: move
  }
  object MoveOperation {
    
    inline def apply(from: js.Any, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    extension [Self <: MoveOperation](x: Self) {
      
      inline def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchResult = ApplyResult
  
  type PatchResultWithRevert = ApplyResultWithRevert
  
  trait RemoveOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: remove
  }
  object RemoveOperation {
    
    inline def apply(path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    extension [Self <: RemoveOperation](x: Self) {
      
      inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: replace
    
    var value: js.Any
  }
  object ReplaceOperation {
    
    inline def apply(path: String, value: js.Any): ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation]
    }
    
    extension [Self <: ReplaceOperation](x: Self) {
      
      inline def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: test
    
    var value: js.Any
  }
  object TestOperation {
    
    inline def apply(path: String, value: js.Any): TestOperation = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation]
    }
    
    extension [Self <: TestOperation](x: Self) {
      
      inline def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
