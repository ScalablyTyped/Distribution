package typings.jasmine.jasmine.errors

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpectationFailed extends Error
object ExpectationFailed {
  
  @scala.inline
  def apply(message: String, name: String): ExpectationFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationFailed]
  }
}
