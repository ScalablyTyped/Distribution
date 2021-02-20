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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-patch", "InvalidPatchError")
  @js.native
  class InvalidPatchError () extends JSONPatchError
  
  @JSImport("json-patch", "InvalidPointerError")
  @js.native
  class InvalidPointerError () extends Error
  
  @JSImport("json-patch", "JSONPatchError")
  @js.native
  class JSONPatchError () extends Error
  
  @JSImport("json-patch", "PatchConflictError")
  @js.native
  class PatchConflictError () extends JSONPatchError
  
  @JSImport("json-patch", "PatchTestFailed")
  @js.native
  class PatchTestFailed () extends Error
  
  @JSImport("json-patch", "apply")
  @js.native
  def apply(document: js.Any, patches: js.Array[OpPatch]): js.Any = js.native
  
  @JSImport("json-patch", "compile")
  @js.native
  def compile(patches: js.Array[OpPatch]): js.Function1[/* document */ js.Any, _] = js.native
  
  @js.native
  trait AddPatch
    extends Patch
       with OpPatch {
    
    var op: add = js.native
    
    var value: js.Any = js.native
  }
  object AddPatch {
    
    @scala.inline
    def apply(op: add, path: String, value: js.Any): AddPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddPatch]
    }
    
    @scala.inline
    implicit class AddPatchMutableBuilder[Self <: AddPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CopyPatch
    extends Patch
       with OpPatch {
    
    var from: String = js.native
    
    var op: copy = js.native
  }
  object CopyPatch {
    
    @scala.inline
    def apply(from: String, op: copy, path: String): CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyPatch]
    }
    
    @scala.inline
    implicit class CopyPatchMutableBuilder[Self <: CopyPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MovePatch
    extends Patch
       with OpPatch {
    
    var from: String = js.native
    
    var op: move = js.native
  }
  object MovePatch {
    
    @scala.inline
    def apply(from: String, op: move, path: String): MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MovePatch]
    }
    
    @scala.inline
    implicit class MovePatchMutableBuilder[Self <: MovePatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def AddPatch(op: add, path: String, value: js.Any): typings.jsonPatch.mod.AddPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.AddPatch]
    }
    
    @scala.inline
    def CopyPatch(from: String, op: copy, path: String): typings.jsonPatch.mod.CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.CopyPatch]
    }
    
    @scala.inline
    def MovePatch(from: String, op: move, path: String): typings.jsonPatch.mod.MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.MovePatch]
    }
    
    @scala.inline
    def RemovePatch(op: remove, path: String): typings.jsonPatch.mod.RemovePatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.RemovePatch]
    }
    
    @scala.inline
    def ReplacePatch(op: replace, path: String, value: js.Any): typings.jsonPatch.mod.ReplacePatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.ReplacePatch]
    }
    
    @scala.inline
    def TestPatch(op: test, path: String, value: js.Any): typings.jsonPatch.mod.TestPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.TestPatch]
    }
  }
  
  @js.native
  trait Patch extends StObject {
    
    var path: String = js.native
  }
  object Patch {
    
    @scala.inline
    def apply(path: String): Patch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Patch]
    }
    
    @scala.inline
    implicit class PatchMutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemovePatch
    extends Patch
       with OpPatch {
    
    var op: remove = js.native
  }
  object RemovePatch {
    
    @scala.inline
    def apply(op: remove, path: String): RemovePatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePatch]
    }
    
    @scala.inline
    implicit class RemovePatchMutableBuilder[Self <: RemovePatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplacePatch
    extends Patch
       with OpPatch {
    
    var op: replace = js.native
    
    var value: js.Any = js.native
  }
  object ReplacePatch {
    
    @scala.inline
    def apply(op: replace, path: String, value: js.Any): ReplacePatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacePatch]
    }
    
    @scala.inline
    implicit class ReplacePatchMutableBuilder[Self <: ReplacePatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestPatch
    extends Patch
       with OpPatch {
    
    var op: test = js.native
    
    var value: js.Any = js.native
  }
  object TestPatch {
    
    @scala.inline
    def apply(op: test, path: String, value: js.Any): TestPatch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestPatch]
    }
    
    @scala.inline
    implicit class TestPatchMutableBuilder[Self <: TestPatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
