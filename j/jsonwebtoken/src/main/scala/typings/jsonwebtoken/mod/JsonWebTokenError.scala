package typings.jsonwebtoken.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonwebtoken", "JsonWebTokenError")
@js.native
class JsonWebTokenError protected ()
  extends Error
     with VerifyErrors {
  def this(message: String) = this()
  def this(message: String, error: Error) = this()
  
  var inner: Error = js.native
}
