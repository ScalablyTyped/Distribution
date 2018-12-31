package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Tags")
@js.native
class Tags protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Return the recent history (hourly stats for the last 30 days) for all tags
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def allTimeSeries(params: js.Any): scala.Unit = js.native
  def allTimeSeries(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def allTimeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Deletes a tag permanently. Deleting a tag removes the tag from any messages
    * that have been sent, and also deletes the tag's stats. There is no way to
    * undo this operation, so use it carefully.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} tag a tag name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def delete(params: js.Any): scala.Unit = js.native
  def delete(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Return more detailed information about a single tag, including aggregates of recent stats
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} tag an existing tag name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def info(params: js.Any): scala.Unit = js.native
  def info(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Return all of the user-defined tag information
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Return the recent history (hourly stats for the last 30 days) for a tag
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} tag an existing tag name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def timeSeries(params: js.Any): scala.Unit = js.native
  def timeSeries(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

