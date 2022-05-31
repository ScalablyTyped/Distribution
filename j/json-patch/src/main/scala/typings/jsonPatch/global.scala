package typings.jsonPatch

import typings.jsonPatch.mod.OpPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsonpatch {
    
    @JSGlobal("jsonpatch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsonpatch.InvalidPatchError")
    @js.native
    class InvalidPatchError ()
      extends typings.jsonPatch.mod.InvalidPatchError
    
    @JSGlobal("jsonpatch.InvalidPointerError")
    @js.native
    class InvalidPointerError ()
      extends typings.jsonPatch.mod.InvalidPointerError
    
    @JSGlobal("jsonpatch.JSONPatchError")
    @js.native
    class JSONPatchError ()
      extends typings.jsonPatch.mod.JSONPatchError
    
    @JSGlobal("jsonpatch.PatchConflictError")
    @js.native
    class PatchConflictError ()
      extends typings.jsonPatch.mod.PatchConflictError
    
    @JSGlobal("jsonpatch.PatchTestFailed")
    @js.native
    class PatchTestFailed ()
      extends typings.jsonPatch.mod.PatchTestFailed
    
    inline def apply(document: js.Any, patches: js.Array[OpPatch]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(document.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def compile(patches: js.Array[OpPatch]): js.Function1[/* document */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(patches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* document */ js.Any, js.Any]]
  }
}
