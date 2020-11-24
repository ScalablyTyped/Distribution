package typings.makeError.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("make-error", "BaseError")
@js.native
class BaseError () extends Error {
  def this(message: String) = this()
  
  @JSName("stack")
  var stack_BaseError: String = js.native
}
