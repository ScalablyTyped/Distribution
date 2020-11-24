package typings.jwtClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jwt-client", "read")
@js.native
object read extends js.Object {
  
  /**
    * Read a string value (normally an HTTP header)
    * from JSON Web Token to an Object
    */ 
  def apply(header: String): JWTObject = js.native
}
