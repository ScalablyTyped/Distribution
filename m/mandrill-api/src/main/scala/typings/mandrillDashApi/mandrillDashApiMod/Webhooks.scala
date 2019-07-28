package typings.mandrillDashApi.mandrillDashApiMod

import typings.mandrillDashApi.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Webhooks")
@js.native
class Webhooks protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Add a new webhook
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} url the URL to POST batches of events
    * @option params {String} description an optional description of the webhook
    * @option params {Array} events an optional list of events that will be posted to the webhook
    *    - events[] {String} the individual event to listen for
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def add(params: js.Any): Unit = js.native
  def add(params: js.Any, onsuccess: ICallback): Unit = js.native
  def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Delete an existing webhook
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {Integer} id the unique identifier of a webhook belonging to this account
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def delete(params: Anon_Id): Unit = js.native
  def delete(params: Anon_Id, onsuccess: ICallback): Unit = js.native
  def delete(params: Anon_Id, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Given the ID of an existing webhook, return the data about it
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {Integer} id the unique identifier of a webhook belonging to this account
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def info(params: js.Any): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Get the list of all webhooks defined on the account
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Update an existing webhook
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {Integer} id the unique identifier of a webhook belonging to this account
    * @option params {String} url the URL to POST batches of events
    * @option params {String} description an optional description of the webhook
    * @option params {Array} events an optional list of events that will be posted to the webhook
    *    - events[] {String} the individual event to listen for
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def update(params: js.Any): Unit = js.native
  def update(params: js.Any, onsuccess: ICallback): Unit = js.native
  def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
}

