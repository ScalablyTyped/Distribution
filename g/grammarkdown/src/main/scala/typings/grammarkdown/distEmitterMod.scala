package typings.grammarkdown

import typings.grammarkdown.distOptionsMod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter", JSImport.Namespace)
@js.native
object distEmitterMod extends js.Object {
  @js.native
  class EcmarkupEmitter ()
    extends typings.grammarkdown.distEmitterEcmarkupMod.EcmarkupEmitter
  
  @js.native
  class Emitter protected ()
    extends typings.grammarkdown.distEmitterEmitterMod.Emitter {
    def this(options: CompilerOptions) = this()
  }
  
  @js.native
  class HtmlEmitter ()
    extends typings.grammarkdown.distEmitterHtmlMod.HtmlEmitter
  
  @js.native
  class MarkdownEmitter ()
    extends typings.grammarkdown.distEmitterMarkdownMod.MarkdownEmitter
  
}

