package typings.kerberos.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", "KerberosServer")
@js.native
class KerberosServer () extends js.Object {
  /**
    * @description Indicates that authentication has successfully completed or not
    */
  var contextComplete: Boolean = js.native
  /**
    * @description The last response received during authentication steps
    */
  var response: String = js.native
  /**
    * @description The target used for authentication
    */
  var targetName: String = js.native
  /**
    * @description  The username used for authentication
    */
  var username: String = js.native
  /**
    * Processes a single kerberos server-side step using the supplied client data.
    *
    * @param challenge A string containing the base64-encoded client data
    * @param callback
    * @return returns Promise if no callback passed
    */
  def step(challenge: String): js.Promise[String] = js.native
  def step(challenge: String, callback: js.Function2[/* err */ String, /* serverResponse */ String, _]): Unit = js.native
}

