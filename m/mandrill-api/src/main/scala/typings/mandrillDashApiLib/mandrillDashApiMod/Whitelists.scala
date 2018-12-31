package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Whitelists")
@js.native
class Whitelists protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Adds an email to your email rejection whitelist. If the address is
    * currently on your blacklist, that blacklist entry will be removed
    * automatically.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} email an email address to add to the whitelist
    * @option params {String} comment an optional description of why the email was whitelisted
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def add(params: js.Any): scala.Unit = js.native
  def add(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def add(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Removes an email address from the whitelist.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} email the email address to remove from the whitelist
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def delete(params: js.Any): scala.Unit = js.native
  def delete(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Retrieves your email rejection whitelist. You can provide an email
    * address or search prefix to limit the results. Returns up to 1000 results.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} email an optional email address or prefix to search by
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

