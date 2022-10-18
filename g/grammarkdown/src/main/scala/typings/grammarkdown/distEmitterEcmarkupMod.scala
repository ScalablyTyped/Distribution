package typings.grammarkdown

import typings.grammarkdown.distEmitterEmitterMod.Emitter
import typings.grammarkdown.distNodesMod.LexicalSymbol
import typings.grammarkdown.distOptionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitterEcmarkupMod {
  
  @JSImport("grammarkdown/dist/emitter/ecmarkup", "EcmarkupEmitter")
  @js.native
  open class EcmarkupEmitter protected () extends Emitter {
    def this(options: CompilerOptions) = this()
    
    /* private */ var emitLinkAnchor: Any = js.native
    
    /* private */ var emitNodeWithLink: Any = js.native
    
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
    
    /* private */ var emitRightHandSideWorker: Any = js.native
  }
}
