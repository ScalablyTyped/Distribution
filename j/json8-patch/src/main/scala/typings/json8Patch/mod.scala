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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json8-patch", "apply")
  @js.native
  def apply(doc: js.Any, patch: JsonPatch): ApplyResult = js.native
  @JSImport("json8-patch", "apply")
  @js.native
  def apply(doc: js.Any, patch: JsonPatch, options: Reversible): ApplyResult = js.native
  @JSImport("json8-patch", "apply")
  @js.native
  def apply(doc: js.Any, patch: JsonPatch, options: `0`): ApplyResultWithRevert = js.native
  @JSImport("json8-patch", "apply")
  @js.native
  def apply_ApplyResultWithRevert(doc: js.Any, patch: JsonPatch): ApplyResultWithRevert = js.native
  
  @JSImport("json8-patch", "diff")
  @js.native
  def diff(doc1: js.Any, doc2: js.Any): JsonPatch = js.native
  
  @JSImport("json8-patch", "patch")
  @js.native
  def patch(doc: js.Any, patch: JsonPatch): PatchResult = js.native
  @JSImport("json8-patch", "patch")
  @js.native
  def patch(doc: js.Any, patch: JsonPatch, options: Reversible): PatchResult = js.native
  @JSImport("json8-patch", "patch")
  @js.native
  def patch(doc: js.Any, patch: JsonPatch, options: `0`): PatchResultWithRevert = js.native
  @JSImport("json8-patch", "patch")
  @js.native
  def patch_PatchResultWithRevert(doc: js.Any, patch: JsonPatch): PatchResultWithRevert = js.native
  
  @JSImport("json8-patch", "revert")
  @js.native
  def revert(doc: js.Any, revertPatch: JsonPatch): ApplyResult = js.native
  
  @js.native
  trait AddOperation
    extends BaseOperation
       with JsonPatchOperation {
    
    var op: add = js.native
    
    var value: js.Any = js.native
  }
  object AddOperation {
    
    @scala.inline
    def apply(op: add, path: String, value: js.Any): AddOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation]
    }
    
    @scala.inline
    implicit class AddOperationMutableBuilder[Self <: AddOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApplyResult extends StObject {
    
    var doc: js.Any = js.native
  }
  object ApplyResult {
    
    @scala.inline
    def apply(doc: js.Any): ApplyResult = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyResult]
    }
    
    @scala.inline
    implicit class ApplyResultMutableBuilder[Self <: ApplyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoc(value: js.Any): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApplyResultWithRevert extends ApplyResult {
    
    var revert: JsonPatch = js.native
  }
  object ApplyResultWithRevert {
    
    @scala.inline
    def apply(doc: js.Any, revert: JsonPatch): ApplyResultWithRevert = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyResultWithRevert]
    }
    
    @scala.inline
    implicit class ApplyResultWithRevertMutableBuilder[Self <: ApplyResultWithRevert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRevert(value: JsonPatch): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertVarargs(value: JsonPatchOperation*): Self = StObject.set(x, "revert", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BaseOperation extends StObject {
    
    var path: String = js.native
  }
  object BaseOperation {
    
    @scala.inline
    def apply(path: String): BaseOperation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOperation]
    }
    
    @scala.inline
    implicit class BaseOperationMutableBuilder[Self <: BaseOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CopyOperation
    extends BaseOperation
       with JsonPatchOperation {
    
    var from: js.Any = js.native
    
    var op: copy = js.native
  }
  object CopyOperation {
    
    @scala.inline
    def apply(from: js.Any, op: copy, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    @scala.inline
    implicit class CopyOperationMutableBuilder[Self <: CopyOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def AddOperation(op: add, path: String, value: js.Any): typings.json8Patch.mod.AddOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.AddOperation]
    }
    
    @scala.inline
    def CopyOperation(from: js.Any, op: copy, path: String): typings.json8Patch.mod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.CopyOperation]
    }
    
    @scala.inline
    def MoveOperation(from: js.Any, op: move, path: String): typings.json8Patch.mod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.MoveOperation]
    }
    
    @scala.inline
    def RemoveOperation(op: remove, path: String): typings.json8Patch.mod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.RemoveOperation]
    }
    
    @scala.inline
    def ReplaceOperation(op: replace, path: String, value: js.Any): typings.json8Patch.mod.ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.ReplaceOperation]
    }
    
    @scala.inline
    def TestOperation(op: test, path: String, value: js.Any): typings.json8Patch.mod.TestOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.json8Patch.mod.TestOperation]
    }
  }
  
  @js.native
  trait MoveOperation
    extends BaseOperation
       with JsonPatchOperation {
    
    var from: js.Any = js.native
    
    var op: move = js.native
  }
  object MoveOperation {
    
    @scala.inline
    def apply(from: js.Any, op: move, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    @scala.inline
    implicit class MoveOperationMutableBuilder[Self <: MoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchResult = ApplyResult
  
  type PatchResultWithRevert = ApplyResultWithRevert
  
  @js.native
  trait RemoveOperation
    extends BaseOperation
       with JsonPatchOperation {
    
    var op: remove = js.native
  }
  object RemoveOperation {
    
    @scala.inline
    def apply(op: remove, path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    @scala.inline
    implicit class RemoveOperationMutableBuilder[Self <: RemoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplaceOperation
    extends BaseOperation
       with JsonPatchOperation {
    
    var op: replace = js.native
    
    var value: js.Any = js.native
  }
  object ReplaceOperation {
    
    @scala.inline
    def apply(op: replace, path: String, value: js.Any): ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation]
    }
    
    @scala.inline
    implicit class ReplaceOperationMutableBuilder[Self <: ReplaceOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestOperation
    extends BaseOperation
       with JsonPatchOperation {
    
    var op: test = js.native
    
    var value: js.Any = js.native
  }
  object TestOperation {
    
    @scala.inline
    def apply(op: test, path: String, value: js.Any): TestOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation]
    }
    
    @scala.inline
    implicit class TestOperationMutableBuilder[Self <: TestOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
