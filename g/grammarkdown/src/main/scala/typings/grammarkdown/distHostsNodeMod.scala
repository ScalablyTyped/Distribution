package typings.grammarkdown

import typings.grammarkdown.distHostMod.CoreAsyncHost
import typings.grammarkdown.distHostMod.ReadFileCallback
import typings.grammarkdown.distHostMod.WriteFileCallback
import typings.grammarkdown.grammarkdownBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHostsNodeMod {
  
  @JSImport("grammarkdown/dist/hosts/node", "NodeAsyncHost")
  @js.native
  open class NodeAsyncHost () extends CoreAsyncHost {
    def this(options: NodeAsyncHostOptions) = this()
  }
  
  trait NodeAsyncHostOptions extends StObject {
    
    var allowUris: js.UndefOr[`false`] = js.undefined
    
    /**
      * Indicates whether the host is case-insensitive (`true`) or case-sensitive (`false`).
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of known grammars in the form `{ "name": "path" }`
      */
    var knownGrammars: js.UndefOr[Record[String, String]] = js.undefined
    
    var readFile: js.UndefOr[ReadFileCallback | `false`] = js.undefined
    
    /**
      * Indicates whether to include builtin grammars in the set of known grammars.
      */
    var useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined
    
    var writeFile: js.UndefOr[WriteFileCallback | `false`] = js.undefined
  }
  object NodeAsyncHostOptions {
    
    inline def apply(): NodeAsyncHostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeAsyncHostOptions]
    }
    
    extension [Self <: NodeAsyncHostOptions](x: Self) {
      
      inline def setAllowUris(value: `false`): Self = StObject.set(x, "allowUris", value.asInstanceOf[js.Any])
      
      inline def setAllowUrisUndefined: Self = StObject.set(x, "allowUris", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setKnownGrammars(value: Record[String, String]): Self = StObject.set(x, "knownGrammars", value.asInstanceOf[js.Any])
      
      inline def setKnownGrammarsUndefined: Self = StObject.set(x, "knownGrammars", js.undefined)
      
      inline def setReadFile(value: ReadFileCallback | `false`): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      inline def setUseBuiltinGrammars(value: Boolean): Self = StObject.set(x, "useBuiltinGrammars", value.asInstanceOf[js.Any])
      
      inline def setUseBuiltinGrammarsUndefined: Self = StObject.set(x, "useBuiltinGrammars", js.undefined)
      
      inline def setWriteFile(value: WriteFileCallback | `false`): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      inline def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
    }
  }
}
