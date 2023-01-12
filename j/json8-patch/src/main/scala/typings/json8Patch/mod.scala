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
  
  inline def add(doc: Any, path: String, value: Any): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  inline def add(doc: Any, path: js.Array[String], value: Any): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  
  inline def apply(doc: Any, patch: JsonPatch): ApplyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[ApplyResult]
  inline def apply(doc: Any, patch: JsonPatch, options: Reversible): ApplyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ApplyResult]
  inline def apply(doc: Any, patch: JsonPatch, options: `0`): ApplyResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ApplyResultWithRevert]
  
  inline def apply_ApplyResultWithRevert(doc: Any, patch: JsonPatch): ApplyResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[ApplyResultWithRevert]
  
  inline def buildRevertPatch(revert: JsonPatch): JsonPatch = ^.asInstanceOf[js.Dynamic].applyDynamic("buildRevertPatch")(revert.asInstanceOf[js.Any]).asInstanceOf[JsonPatch]
  
  inline def concat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patches because its type JsonPatch is not an array type */ patches: JsonPatch
  ): JsonPatch = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(patches.asInstanceOf[js.Any]).asInstanceOf[JsonPatch]
  
  inline def copy(doc: Any, path: String, dest: String): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  inline def copy(doc: Any, path: js.Array[String], dest: String): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  
  inline def diff(doc1: Any, doc2: Any): JsonPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(doc1.asInstanceOf[js.Any], doc2.asInstanceOf[js.Any])).asInstanceOf[JsonPatch]
  
  inline def get(doc: Any, path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(doc: Any, path: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def has(doc: Any, path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has(doc: Any, path: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def move(doc: Any, path: String, dest: String): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  inline def move(doc: Any, path: js.Array[String], dest: String): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  
  inline def pack(patch: JsonPatch): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(patch.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def patch(doc: Any, patch: JsonPatch): PatchResult = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[PatchResult]
  inline def patch(doc: Any, patch: JsonPatch, options: Reversible): PatchResult = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PatchResult]
  inline def patch(doc: Any, patch: JsonPatch, options: `0`): PatchResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PatchResultWithRevert]
  
  inline def patch_PatchResultWithRevert(doc: Any, patch: JsonPatch): PatchResultWithRevert = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(doc.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[PatchResultWithRevert]
  
  inline def remove(doc: Any, path: String): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  inline def remove(doc: Any, path: js.Array[String]): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  
  inline def replace(doc: Any, path: String, value: Any): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  inline def replace(doc: Any, path: js.Array[String], value: Any): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  
  inline def revert(doc: Any, revertPatch: JsonPatch): ApplyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(doc.asInstanceOf[js.Any], revertPatch.asInstanceOf[js.Any])).asInstanceOf[ApplyResult]
  
  inline def test(doc: Any, path: String, value: Any): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  inline def test(doc: Any, path: js.Array[String], value: Any): OperationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(doc.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[OperationResult]
  
  inline def unpack(packed: js.Array[Any]): JsonPatch = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(packed.asInstanceOf[js.Any]).asInstanceOf[JsonPatch]
  
  inline def valid(patch: JsonPatch): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(patch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AddOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: add
    
    var value: Any
  }
  object AddOperation {
    
    inline def apply(path: String, value: Any): AddOperation = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddOperation] (val x: Self) extends AnyVal {
      
      inline def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyResult extends StObject {
    
    var doc: Any
  }
  object ApplyResult {
    
    inline def apply(doc: Any): ApplyResult = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyResult] (val x: Self) extends AnyVal {
      
      inline def setDoc(value: Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyResultWithRevert
    extends StObject
       with ApplyResult {
    
    var revert: JsonPatch
  }
  object ApplyResultWithRevert {
    
    inline def apply(doc: Any, revert: JsonPatch): ApplyResultWithRevert = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyResultWithRevert]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyResultWithRevert] (val x: Self) extends AnyVal {
      
      inline def setRevert(value: JsonPatch): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      inline def setRevertVarargs(value: JsonPatchOperation*): Self = StObject.set(x, "revert", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOperation] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var from: Any
    
    var op: copy
  }
  object CopyOperation {
    
    inline def apply(from: Any, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyOperation] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
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
    
    inline def AddOperation(path: String, value: Any): typings.json8Patch.mod.AddOperation = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.AddOperation]
    }
    
    inline def CopyOperation(from: Any, path: String): typings.json8Patch.mod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.CopyOperation]
    }
    
    inline def MoveOperation(from: Any, path: String): typings.json8Patch.mod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.MoveOperation]
    }
    
    inline def RemoveOperation(path: String): typings.json8Patch.mod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.RemoveOperation]
    }
    
    inline def ReplaceOperation(path: String, value: Any): typings.json8Patch.mod.ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.ReplaceOperation]
    }
    
    inline def TestOperation(path: String, value: Any): typings.json8Patch.mod.TestOperation = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.TestOperation]
    }
  }
  
  trait MoveOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var from: Any
    
    var op: move
  }
  object MoveOperation {
    
    inline def apply(from: Any, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveOperation] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait OperationResult extends StObject {
    
    /**
      * The patched document
      */
    var doc: Any
    
    var idx: js.UndefOr[Double] = js.undefined
    
    /**
      * The previous/replaced value if any
      */
    var previous: js.UndefOr[Any] = js.undefined
  }
  object OperationResult {
    
    inline def apply(doc: Any): OperationResult = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationResult] (val x: Self) extends AnyVal {
      
      inline def setDoc(value: Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setPrevious(value: Any): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveOperation] (val x: Self) extends AnyVal {
      
      inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: replace
    
    var value: Any
  }
  object ReplaceOperation {
    
    inline def apply(path: String, value: Any): ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceOperation] (val x: Self) extends AnyVal {
      
      inline def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestOperation
    extends StObject
       with BaseOperation
       with JsonPatchOperation {
    
    var op: test
    
    var value: Any
  }
  object TestOperation {
    
    inline def apply(path: String, value: Any): TestOperation = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestOperation] (val x: Self) extends AnyVal {
      
      inline def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
