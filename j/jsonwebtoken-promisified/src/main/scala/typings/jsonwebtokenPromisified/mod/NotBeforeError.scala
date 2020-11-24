package typings.jsonwebtokenPromisified.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonwebtoken-promisified", "NotBeforeError")
@js.native
class NotBeforeError protected () extends JsonWebTokenError {
  def this(message: String, date: Date) = this()
  
  var date: Date = js.native
}
