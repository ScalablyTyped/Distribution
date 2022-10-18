package typings.jupyterlabCodemirror

import typings.jupyterlabCodemirror.anon.TypeofCodeMirror
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait ICodeMirror extends StObject {
    
    /**
      * A singleton CodeMirror module, rexported.
      */
    var CodeMirror: TypeofCodeMirror
    
    /**
      * A function to allow extensions to ensure that
      * the vim keymap has been imported
      */
    def ensureVimKeymap(): js.Promise[Unit]
  }
  object ICodeMirror {
    
    @JSImport("@jupyterlab/codemirror/lib/tokens", "ICodeMirror")
    @js.native
    val ^ : Token[ICodeMirror] = js.native
    
    extension [Self <: ICodeMirror](x: Self) {
      
      inline def setCodeMirror(value: TypeofCodeMirror): Self = StObject.set(x, "CodeMirror", value.asInstanceOf[js.Any])
      
      inline def setEnsureVimKeymap(value: () => js.Promise[Unit]): Self = StObject.set(x, "ensureVimKeymap", js.Any.fromFunction0(value))
    }
  }
}
