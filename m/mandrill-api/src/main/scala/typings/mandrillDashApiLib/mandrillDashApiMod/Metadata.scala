package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Metadata")
@js.native
class Metadata protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
       * Add a new custom metadata field to be indexed for the account.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name a unique identifier for the metadata field
       * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any): scala.Unit = js.native
  /**
       * Add a new custom metadata field to be indexed for the account.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name a unique identifier for the metadata field
       * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Add a new custom metadata field to be indexed for the account.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name a unique identifier for the metadata field
       * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Delete an existing custom metadata field. Deletion isn't instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the unique identifier of the metadata field to update
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any): scala.Unit = js.native
  /**
       * Delete an existing custom metadata field. Deletion isn't instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the unique identifier of the metadata field to update
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Delete an existing custom metadata field. Deletion isn't instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the unique identifier of the metadata field to update
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Get the list of custom metadata fields indexed for the account.
       * @param {Object} params the hash of the parameters to pass to the request
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any): scala.Unit = js.native
  /**
       * Get the list of custom metadata fields indexed for the account.
       * @param {Object} params the hash of the parameters to pass to the request
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Get the list of custom metadata fields indexed for the account.
       * @param {Object} params the hash of the parameters to pass to the request
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
       * Update an existing custom metadata field.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the unique identifier of the metadata field to update
       * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any): scala.Unit = js.native
  /**
       * Update an existing custom metadata field.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the unique identifier of the metadata field to update
       * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  /**
       * Update an existing custom metadata field.
       * @param {Object} params the hash of the parameters to pass to the request
       * @option params {String} name the unique identifier of the metadata field to update
       * @option params {String} view_template optional Mustache template to control how the metadata is rendered in your activity log
       * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
       * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
       */
  def update(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

