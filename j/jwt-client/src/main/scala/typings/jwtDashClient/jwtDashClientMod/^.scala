package typings.jwtDashClient.jwtDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forget(): Unit = js.native
  def get(): String = js.native
  def keep(value: JWTObject): Unit = js.native
  def keep(value: JWTObject, key: js.Any): Unit = js.native
  def keep(value: JWTObject, key: js.Any, storate: js.Any): Unit = js.native
  /**
    * Read a string value (normally an HTTP header)
    * from JSON Web Token to an Object
    */ 
  def read(header: String): JWTObject = js.native
  def remember(): Unit = js.native
  def validate(value: JWTObject): Boolean = js.native
  def validate(value: JWTObject, issuer: js.Any): Boolean = js.native
  def validate(value: JWTObject, issuer: js.Any, audience: js.Any): Boolean = js.native
  /**
    * Given a JWT object, stringify it back to
    * its JWT representation.
    */ 
  def write(value: JWTObject): String = js.native
}

