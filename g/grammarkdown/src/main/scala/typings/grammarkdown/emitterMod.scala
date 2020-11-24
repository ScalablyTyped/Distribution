package typings.grammarkdown

import typings.grammarkdown.optionsMod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/emitter", JSImport.Namespace)
@js.native
object emitterMod extends js.Object {
  
  @js.native
  class EcmarkupEmitter ()
    extends typings.grammarkdown.ecmarkupMod.EcmarkupEmitter
  
  @js.native
  class Emitter protected ()
    extends typings.grammarkdown.emitterEmitterMod.Emitter {
    def this(options: CompilerOptions) = this()
  }
  
  @js.native
  class HtmlEmitter ()
    extends typings.grammarkdown.htmlMod.HtmlEmitter
  
  @js.native
  class MarkdownEmitter ()
    extends typings.grammarkdown.markdownMod.MarkdownEmitter
}
