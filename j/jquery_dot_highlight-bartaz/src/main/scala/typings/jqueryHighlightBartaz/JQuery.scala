package typings.jqueryHighlightBartaz

import typings.jqueryHighlightBartaz.anon.CaseSensitive
import typings.jqueryHighlightBartaz.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def highlight(words: String): JQuery = js.native
  def highlight(words: String, options: CaseSensitive): JQuery = js.native
  def highlight(words: js.Array[String]): JQuery = js.native
  def highlight(words: js.Array[String], options: CaseSensitive): JQuery = js.native
  
  def unhighlight(): JQuery = js.native
  def unhighlight(options: ClassName): JQuery = js.native
}
