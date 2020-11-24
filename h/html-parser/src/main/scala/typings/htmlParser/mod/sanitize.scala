package typings.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html-parser", "sanitize")
@js.native
object sanitize extends js.Object {
  
  def apply(htmlString: String): String = js.native
  def apply(htmlString: String, removalCallbacks: RemovalCallback): String = js.native
}
