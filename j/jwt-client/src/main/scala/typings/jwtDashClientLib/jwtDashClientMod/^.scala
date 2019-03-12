package typings
package jwtDashClientLib.jwtDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def forget(): scala.Unit = js.native
  def get(): java.lang.String = js.native
  def keep(value: JWTObject): scala.Unit = js.native
  def keep(value: JWTObject, key: js.Any): scala.Unit = js.native
  def keep(value: JWTObject, key: js.Any, storate: js.Any): scala.Unit = js.native
  /**
    * Read a string value (normally an HTTP header)
    * from JSON Web Token to an Object
    */ 
  def read(header: java.lang.String): JWTObject = js.native
  def remember(): scala.Unit = js.native
  def validate(value: JWTObject): scala.Boolean = js.native
  def validate(value: JWTObject, issuer: js.Any): scala.Boolean = js.native
  def validate(value: JWTObject, issuer: js.Any, audience: js.Any): scala.Boolean = js.native
  /**
    * Given a JWT object, stringify it back to
    * its JWT representation.
    */ 
  def write(value: JWTObject): java.lang.String = js.native
}

