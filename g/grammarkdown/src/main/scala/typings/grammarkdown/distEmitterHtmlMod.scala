package typings.grammarkdown

import typings.grammarkdown.distEmitterEmitterMod.Emitter
import typings.grammarkdown.distNodesMod.LexicalSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/emitter/html", JSImport.Namespace)
@js.native
object distEmitterHtmlMod extends js.Object {
  @js.native
  class HtmlEmitter () extends Emitter {
    var emitLinkAnchor: js.Any = js.native
    var emitNodeWithLink: js.Any = js.native
    /* protected */ def emitPlaceholder(node: LexicalSymbol): Unit = js.native
  }
  
}

