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
  class InvalidPatchError () extends JSONPatchError
  
  @JSImport("json-patch", "InvalidPointerError")
  @js.native
  class InvalidPointerError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("json-patch", "JSONPatchError")
  @js.native
  class JSONPatchError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("json-patch", "PatchConflictError")
  @js.native
  class PatchConflictError () extends JSONPatchError
  
  @JSImport("json-patch", "PatchTestFailed")
  @js.native
  class PatchTestFailed ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def apply(document: js.Any, patches: js.Array[OpPatch]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(document.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def compile(patches: js.Array[OpPatch]): js.Function1[/* document */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(patches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* document */ js.Any, js.Any]]
  
  trait AddPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: add
    
    var value: js.Any
  }
  object AddPatch {
    
    @scala.inline
    def apply(path: String, value: js.Any): AddPatch = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
  
  trait CopyPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var from: String
    
    var op: copy
  }
  object CopyPatch {
    
    @scala.inline
    def apply(from: String, path: String): CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
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
  
  trait MovePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var from: String
    
    var op: move
  }
  object MovePatch {
    
    @scala.inline
    def apply(from: String, path: String): MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
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
    def AddPatch(path: String, value: js.Any): typings.jsonPatch.mod.AddPatch = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.AddPatch]
    }
    
    @scala.inline
    def CopyPatch(from: String, path: String): typings.jsonPatch.mod.CopyPatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.CopyPatch]
    }
    
    @scala.inline
    def MovePatch(from: String, path: String): typings.jsonPatch.mod.MovePatch = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.MovePatch]
    }
    
    @scala.inline
    def RemovePatch(path: String): typings.jsonPatch.mod.RemovePatch = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.RemovePatch]
    }
    
    @scala.inline
    def ReplacePatch(path: String, value: js.Any): typings.jsonPatch.mod.ReplacePatch = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.ReplacePatch]
    }
    
    @scala.inline
    def TestPatch(path: String, value: js.Any): typings.jsonPatch.mod.TestPatch = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonPatch.mod.TestPatch]
    }
  }
  
  trait Patch extends StObject {
    
    var path: String
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
  
  trait RemovePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: remove
  }
  object RemovePatch {
    
    @scala.inline
    def apply(path: String): RemovePatch = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemovePatch]
    }
    
    @scala.inline
    implicit class RemovePatchMutableBuilder[Self <: RemovePatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplacePatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: replace
    
    var value: js.Any
  }
  object ReplacePatch {
    
    @scala.inline
    def apply(path: String, value: js.Any): ReplacePatch = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
  
  trait TestPatch
    extends StObject
       with Patch
       with OpPatch {
    
    var op: test
    
    var value: js.Any
  }
  object TestPatch {
    
    @scala.inline
    def apply(path: String, value: js.Any): TestPatch = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
