package typings.httpsnippet.mod

import typings.httpsnippet.httpsnippetBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ Write your module's methods and properties in this class */
@js.native
trait HTTPSnippet extends js.Object {
  
  def convert(target: String): String | `false` = js.native
  def convert(target: String, client: js.UndefOr[scala.Nothing], options: Options): String | `false` = js.native
  def convert(target: String, client: String): String | `false` = js.native
  def convert(target: String, client: String, options: Options): String | `false` = js.native
  def convert(target: String, options: Options): String | `false` = js.native
}
