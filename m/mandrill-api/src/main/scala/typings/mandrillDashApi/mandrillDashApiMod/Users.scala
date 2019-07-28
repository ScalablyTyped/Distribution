package typings.mandrillDashApi.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Users")
@js.native
class Users protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Return the information about the API-connected user
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def info(params: js.Any): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Validate an API key and respond to a ping
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def ping(params: js.Any): Unit = js.native
  def ping(params: js.Any, onsuccess: ICallback): Unit = js.native
  def ping(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Validate an API key and respond to a ping (anal JSON parser version)
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def ping2(params: js.Any): Unit = js.native
  def ping2(params: js.Any, onsuccess: ICallback): Unit = js.native
  def ping2(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Return the senders that have tried to use this account, both verified and unverified
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def senders(params: js.Any): Unit = js.native
  def senders(params: js.Any, onsuccess: ICallback): Unit = js.native
  def senders(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
}

