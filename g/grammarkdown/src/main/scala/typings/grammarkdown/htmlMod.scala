package typings.grammarkdown

import typings.grammarkdown.emitterEmitterMod.Emitter
import typings.grammarkdown.nodesMod.LexicalSymbol
import typings.grammarkdown.optionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("grammarkdown/dist/emitter/html", "HtmlEmitter")
  @js.native
  class HtmlEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    var emitLinkAnchor: js.Any = js.native
    
    var emitNodeWithLink: js.Any = js.native
    
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
}
