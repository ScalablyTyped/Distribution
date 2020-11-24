package typings.kerberos.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kerberos", "KerberosClient")
@js.native
class KerberosClient () extends js.Object {
  
  /**
    * @description Indicates that authentication has successfully completed or not
    */
  var contextComplete: Boolean = js.native
  
  /**
    * @description The last response received during authentication steps
    */
  var response: String = js.native
  
  /**
    * @description Indicates whether confidentiality was applied or not (GSSAPI only)
    */
  var responseConf: String = js.native
  
  /**
    * Processes a single kerberos client-side step using the supplied server challenge.
    *
    * @param challenge A string containing the base64-encoded server data (which may be empty for the first step)
    * @param callback
    * @return returns Promise if no callback passed
    */
  def step(challenge: String): js.Promise[String] = js.native
  def step(challenge: String, callback: js.Function2[/* err */ String, /* clientResponse */ String, _]): Unit = js.native
  
  /**
    * Perform the client side kerberos unwrap step
    *
    * @param challenge A string containing the base64-encoded server data
    * @param callback
    * @return returns Promise if no callback passed
    */
  def unwrap(challenge: String): js.Promise[String] = js.native
  def unwrap(challenge: String, callback: js.Function2[/* err */ String, /* challengeResponse */ String, _]): Unit = js.native
  
  /**
    * @description The username used for authentication
    */
  var username: String = js.native
  
  /**
    * Perform the client side kerberos wrap step.
    *
    * @param challenge The response returned after calling `unwrap`
    * @param options Optional settings
    * @param [callback]
    * @return returns Promise if no callback passed
    */
  def wrap(challenge: String): js.Promise[String] = js.native
  def wrap(challenge: String, callback: js.Function2[/* err */ String, /* challengeResponse */ String, _]): Unit = js.native
  def wrap(challenge: String, options: WrapOptions): js.Promise[String] = js.native
  def wrap(
    challenge: String,
    options: WrapOptions,
    callback: js.Function2[/* err */ String, /* challengeResponse */ String, _]
  ): Unit = js.native
}
