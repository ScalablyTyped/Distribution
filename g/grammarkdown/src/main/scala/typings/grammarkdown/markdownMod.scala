package typings.grammarkdown

import typings.grammarkdown.emitterEmitterMod.Emitter
import typings.grammarkdown.optionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownMod {
  
  @JSImport("grammarkdown/dist/emitter/markdown", "MarkdownEmitter")
  @js.native
  class MarkdownEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    var emitLinkAnchor: js.Any = js.native
    
    var emitNodeWithLink: js.Any = js.native
  }
}
