package typings.grammarkdown

import typings.grammarkdown.distEmitterEmitterMod.Emitter
import typings.grammarkdown.distOptionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterMarkdownMod {
  
  @JSImport("grammarkdown/dist/emitter/markdown", "MarkdownEmitter")
  @js.native
  open class MarkdownEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    /* private */ var emitLinkAnchor: Any = js.native
    
    /* private */ var emitNodeWithLink: Any = js.native
  }
}
