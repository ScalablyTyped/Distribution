package typings
package kerberosLib.kerberosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kerberos", "KerberosClient")
@js.native
class KerberosClient () extends js.Object {
  /**
    * @description Indicates that authentication has successfully completed or not
    */
  var contextComplete: scala.Boolean = js.native
  /**
    * @description The last response received during authentication steps
    */
  var response: java.lang.String = js.native
  /**
    * @description Indicates whether confidentiality was applied or not (GSSAPI only)
    */
  var responseConf: java.lang.String = js.native
  /**
    * @description The username used for authentication
    */
  var username: java.lang.String = js.native
  /**
    * Processes a single kerberos client-side step using the supplied server challenge.
    *
    * @param challenge A string containing the base64-encoded server data (which may be empty for the first step)
    * @param callback
    * @return returns Promise if no callback passed
    */
  def step(challenge: java.lang.String): js.Promise[java.lang.String] = js.native
  def step(
    challenge: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* clientResponse */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
    * Perform the client side kerberos unwrap step
    *
    * @param challenge A string containing the base64-encoded server data
    * @param callback
    * @return returns Promise if no callback passed
    */
  def unwrap(challenge: java.lang.String): js.Promise[java.lang.String] = js.native
  def unwrap(
    challenge: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* challengeResponse */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
    * Perform the client side kerberos wrap step.
    *
    * @param challenge The response returned after calling `unwrap`
    * @param options Optional settings
    * @param [callback]
    * @return returns Promise if no callback passed
    */
  def wrap(challenge: java.lang.String): js.Promise[java.lang.String] = js.native
  def wrap(
    challenge: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* challengeResponse */ java.lang.String, _]
  ): scala.Unit = js.native
  def wrap(challenge: java.lang.String, options: WrapOptions): js.Promise[java.lang.String] = js.native
  def wrap(
    challenge: java.lang.String,
    options: WrapOptions,
    callback: js.Function2[/* err */ java.lang.String, /* challengeResponse */ java.lang.String, _]
  ): scala.Unit = js.native
}

