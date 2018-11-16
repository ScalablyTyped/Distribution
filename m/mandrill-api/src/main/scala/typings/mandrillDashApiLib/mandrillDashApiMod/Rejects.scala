package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Rejects")
@js.native
class Rejects protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
       * Adds an email to your email rejection blacklist. Addresses that you
       * add manually will never expire and there is no reputation penalty
       * for removing them from your blacklist. Attempting to blacklist an
       * address that has been whitelisted will have no effect.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an email address to block
       * @option params {String} comment an optional comment describing the rejection
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist entry
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any): scala.Unit = js.native
  /**
       * Adds an email to your email rejection blacklist. Addresses that you
       * add manually will never expire and there is no reputation penalty
       * for removing them from your blacklist. Attempting to blacklist an
       * address that has been whitelisted will have no effect.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an email address to block
       * @option params {String} comment an optional comment describing the rejection
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist entry
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Adds an email to your email rejection blacklist. Addresses that you
       * add manually will never expire and there is no reputation penalty
       * for removing them from your blacklist. Attempting to blacklist an
       * address that has been whitelisted will have no effect.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an email address to block
       * @option params {String} comment an optional comment describing the rejection
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist entry
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Deletes an email rejection. There is no limit to how many rejections
       * you can remove from your blacklist, but keep in mind that each deletion
       * has an affect on your reputation.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an email address
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist deletion
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any): scala.Unit = js.native
  /**
       * Deletes an email rejection. There is no limit to how many rejections
       * you can remove from your blacklist, but keep in mind that each deletion
       * has an affect on your reputation.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an email address
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist deletion
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Deletes an email rejection. There is no limit to how many rejections
       * you can remove from your blacklist, but keep in mind that each deletion
       * has an affect on your reputation.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an email address
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist deletion
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Retrieves your email rejection blacklist. You can provide an email
       * address to limit the results. Returns up to 1000 results. By default,
       * entries that have expired are excluded from the results; set
       * include_expired to true to include them.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an optional email address to search by
       * @option params {Boolean} include_expired whether to include rejections that have already expired.
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any): scala.Unit = js.native
  /**
       * Retrieves your email rejection blacklist. You can provide an email
       * address to limit the results. Returns up to 1000 results. By default,
       * entries that have expired are excluded from the results; set
       * include_expired to true to include them.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an optional email address to search by
       * @option params {Boolean} include_expired whether to include rejections that have already expired.
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Retrieves your email rejection blacklist. You can provide an email
       * address to limit the results. Returns up to 1000 results. By default,
       * entries that have expired are excluded from the results; set
       * include_expired to true to include them.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} email an optional email address to search by
       * @option params {Boolean} include_expired whether to include rejections that have already expired.
       * @option params {String} subaccount an optional unique identifier for the subaccount to limit the blacklist
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

