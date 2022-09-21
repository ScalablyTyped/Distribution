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
    open class InvalidPatchError ()
      extends typings.jsonPatch.mod.InvalidPatchError
    
    @JSGlobal("jsonpatch.InvalidPointerError")
    @js.native
    open class InvalidPointerError ()
      extends typings.jsonPatch.mod.InvalidPointerError
    
    @JSGlobal("jsonpatch.JSONPatchError")
    @js.native
    open class JSONPatchError ()
      extends typings.jsonPatch.mod.JSONPatchError
    
    @JSGlobal("jsonpatch.PatchConflictError")
    @js.native
    open class PatchConflictError ()
      extends typings.jsonPatch.mod.PatchConflictError
    
    @JSGlobal("jsonpatch.PatchTestFailed")
    @js.native
    open class PatchTestFailed ()
      extends typings.jsonPatch.mod.PatchTestFailed
    
    inline def apply(document: Any, patches: js.Array[OpPatch]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(document.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def compile(patches: js.Array[OpPatch]): js.Function1[/* document */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(patches.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* document */ Any, Any]]
  }
}
