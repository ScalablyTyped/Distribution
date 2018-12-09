package typings
package kerberosLib.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", "KerberosServer")
@js.native
class KerberosServer () extends js.Object {
  /**
       * @description Indicates that authentication has successfully completed or not
       */
  var contextComplete: scala.Boolean = js.native
  /**
       * @description The last response received during authentication steps
       */
  var response: java.lang.String = js.native
  /**
       * @description The target used for authentication
       */
  var targetName: java.lang.String = js.native
  /**
       * @description  The username used for authentication
       */
  var username: java.lang.String = js.native
  /**
       * Processes a single kerberos server-side step using the supplied client data.
       *
       * @param challenge A string containing the base64-encoded client data
       * @param callback
       * @return returns Promise if no callback passed
       */
  def step(challenge: java.lang.String): js.Promise[java.lang.String] = js.native
  def step(
    challenge: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* serverResponse */ java.lang.String, _]
  ): scala.Unit = js.native
}

