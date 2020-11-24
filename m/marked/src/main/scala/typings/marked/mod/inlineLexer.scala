package typings.marked.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "inlineLexer")
@js.native
object inlineLexer extends js.Object {
  
  /**
    * @param src String of markdown source to be compiled
    * @param links Array of links
    * @param options Hash of options
    * @return String of compiled HTML
    */
  def apply(src: String, links: js.Array[String]): String = js.native
  def apply(src: String, links: js.Array[String], options: MarkedOptions): String = js.native
}
