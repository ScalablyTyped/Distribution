package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "parseInline")
@js.native
object parseInline extends js.Object {
  
  /**
    * Compiles markdown to HTML without enclosing `p` tag.
    *
    * @param src String of markdown source to be compiled
    * @param options Hash of options
    * @return String of compiled HTML
    */
  def apply(src: String): String = js.native
  def apply(src: String, options: MarkedOptions): String = js.native
}
