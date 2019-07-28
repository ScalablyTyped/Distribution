package typings.mandrillDashApi.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Senders")
@js.native
class Senders protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Adds a sender domain to your account. Sender domains are added automatically as you
    * send, but you can use this call to add them ahead of time.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} domain a domain name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def addDomain(params: js.Any): Unit = js.native
  def addDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
  def addDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Checks the SPF and DKIM settings for a domain. If you haven't already added this domain to your
    * account, it will be added automatically.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} domain a domain name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def checkDomain(params: js.Any): Unit = js.native
  def checkDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
  def checkDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Returns the sender domains that have been added to this account.
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def domains(params: js.Any): Unit = js.native
  def domains(params: js.Any, onsuccess: ICallback): Unit = js.native
  def domains(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Return more detailed information about a single sender, including aggregates of recent stats
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} address the email address of the sender
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def info(params: js.Any): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Return the senders that have tried to use this account.
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Return the recent history (hourly stats for the last 30 days) for a sender
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} address the email address of the sender
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def timeSeries(params: js.Any): Unit = js.native
  def timeSeries(params: js.Any, onsuccess: ICallback): Unit = js.native
  def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Sends a verification email in order to verify ownership of a domain.
    * Domain verification is an optional step to confirm ownership of a domain. Once a
    * domain has been verified in a Mandrill account, other accounts may not have their
    * messages signed by that domain unless they also verify the domain. This prevents
    * other Mandrill accounts from sending mail signed by your domain.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} domain a domain name at which you can receive email
    * @option params {String} mailbox a mailbox at the domain where the verification email should be sent
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def verifyDomain(params: js.Any): Unit = js.native
  def verifyDomain(params: js.Any, onsuccess: ICallback): Unit = js.native
  def verifyDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
}

