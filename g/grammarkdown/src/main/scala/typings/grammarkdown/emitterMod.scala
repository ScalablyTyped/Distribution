package typings.grammarkdown

import typings.grammarkdown.optionsMod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterMod {
  
  @JSImport("grammarkdown/dist/emitter", "EcmarkupEmitter")
  @js.native
  class EcmarkupEmitter protected ()
    extends typings.grammarkdown.ecmarkupMod.EcmarkupEmitter {
    def this(options: CompilerOptions) = this()
  }
  
  @JSImport("grammarkdown/dist/emitter", "Emitter")
  @js.native
  class Emitter protected ()
    extends typings.grammarkdown.emitterEmitterMod.Emitter {
    def this(options: CompilerOptions) = this()
  }
  
  @JSImport("grammarkdown/dist/emitter", "HtmlEmitter")
  @js.native
  class HtmlEmitter protected ()
    extends typings.grammarkdown.htmlMod.HtmlEmitter {
    def this(options: CompilerOptions) = this()
  }
  
  @JSImport("grammarkdown/dist/emitter", "MarkdownEmitter")
  @js.native
  class MarkdownEmitter protected ()
    extends typings.grammarkdown.markdownMod.MarkdownEmitter {
    def this(options: CompilerOptions) = this()
  }
}
