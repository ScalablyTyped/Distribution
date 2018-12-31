package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Exports")
@js.native
class Exports protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Begins an export of your activity history. The activity will be exported to a zip archive
    * containing a single file named activity.csv in the same format as you would be able to export
    * from your account's activity view. It includes the following fields: Date, Email Address,
    * Sender, Subject, Status, Tags, Opens, Clicks, Bounce Detail. If you have configured any custom
    * metadata fields, they will be included in the exported data.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} notify_email an optional email address to notify when the export job has finished
    * @option params {String} date_from start date as a UTC string in YYYY-MM-DD HH:MM:SS format
    * @option params {String} date_to end date as a UTC string in YYYY-MM-DD HH:MM:SS format
    * @option params {Array} tags an array of tag names to narrow the export to; will match messages that contain ANY of the tags
    *      - tags[] {String} a tag name
    * @option params {Array} senders an array of senders to narrow the export to
    *      - senders[] {String} a sender address
    * @option params {Array} states an array of states to narrow the export to; messages with ANY of the states will be included
    *      - states[] {String} a message state
    * @option params {Array} api_keys an array of api keys to narrow the export to; messsagse sent with ANY of the keys will be included
    *      - api_keys[] {String} an API key associated with your account
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def activity(params: js.Any): scala.Unit = js.native
  def activity(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def activity(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Returns information about an export job. If the export job's state is 'complete',
    * the returned data will include a URL you can use to fetch the results. Every export
    * job produces a zip archive, but the format of the archive is distinct for each job
    * type. The api calls that initiate exports include more details about the output format
    * for that job type.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} id an export job identifier
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def info(params: js.Any): scala.Unit = js.native
  def info(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Returns a list of your exports.
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Begins an export of your rejection blacklist. The blacklist will be exported to a zip archive
    * containing a single file named rejects.csv that includes the following fields: email,
    * reason, detail, created_at, expires_at, last_event_at, expires_at.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} notify_email an optional email address to notify when the export job has finished.
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def rejects(params: js.Any): scala.Unit = js.native
  def rejects(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def rejects(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Begins an export of your rejection whitelist. The whitelist will be exported to a zip archive
    * containing a single file named whitelist.csv that includes the following fields:
    * email, detail, created_at.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} notify_email an optional email address to notify when the export job has finished.
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def whitelist(params: js.Any): scala.Unit = js.native
  def whitelist(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def whitelist(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

