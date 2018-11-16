package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Subaccounts")
@js.native
class Subaccounts protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
       * Add a new subaccount
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id a unique identifier for the subaccount to be used in sending calls
       * @option params {String} name an optional display name to further identify the subaccount
       * @option params {String} notes optional extra text to associate with the subaccount
       * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any): scala.Unit = js.native
  /**
       * Add a new subaccount
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id a unique identifier for the subaccount to be used in sending calls
       * @option params {String} name an optional display name to further identify the subaccount
       * @option params {String} notes optional extra text to associate with the subaccount
       * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Add a new subaccount
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id a unique identifier for the subaccount to be used in sending calls
       * @option params {String} name an optional display name to further identify the subaccount
       * @option params {String} notes optional extra text to associate with the subaccount
       * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to delete
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any): scala.Unit = js.native
  /**
       * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to delete
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to delete
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Given the ID of an existing subaccount, return the data about it
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to query
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def info(params: js.Any): scala.Unit = js.native
  /**
       * Given the ID of an existing subaccount, return the data about it
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to query
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def info(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Given the ID of an existing subaccount, return the data about it
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to query
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Get the list of subaccounts defined for the account, optionally filtered by a prefix
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} q an optional prefix to filter the subaccounts' ids and names
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any): scala.Unit = js.native
  /**
       * Get the list of subaccounts defined for the account, optionally filtered by a prefix
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} q an optional prefix to filter the subaccounts' ids and names
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Get the list of subaccounts defined for the account, optionally filtered by a prefix
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} q an optional prefix to filter the subaccounts' ids and names
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Pause a subaccount's sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to pause
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def pause(params: js.Any): scala.Unit = js.native
  /**
       * Pause a subaccount's sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to pause
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def pause(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Pause a subaccount's sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to pause
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def pause(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Resume a paused subaccount's sending
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to resume
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def resume(params: js.Any): scala.Unit = js.native
  /**
       * Resume a paused subaccount's sending
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to resume
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def resume(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Resume a paused subaccount's sending
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to resume
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def resume(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Update an existing subaccount
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to update
       * @option params {String} name an optional display name to further identify the subaccount
       * @option params {String} notes optional extra text to associate with the subaccount
       * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any): scala.Unit = js.native
  /**
       * Update an existing subaccount
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to update
       * @option params {String} name an optional display name to further identify the subaccount
       * @option params {String} notes optional extra text to associate with the subaccount
       * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Update an existing subaccount
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} id the unique identifier of the subaccount to update
       * @option params {String} name an optional display name to further identify the subaccount
       * @option params {String} notes optional extra text to associate with the subaccount
       * @option params {Integer} custom_quota an optional manual hourly quota for the subaccount. If not specified, Mandrill will manage this based on reputation
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

