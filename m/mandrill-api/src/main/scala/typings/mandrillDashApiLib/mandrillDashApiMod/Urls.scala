package typings
package mandrillDashApiLib.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Urls")
@js.native
class Urls protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Add a tracking domain to your account
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} domain a domain name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def addTrackingDomain(params: js.Any): scala.Unit = js.native
  def addTrackingDomain(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def addTrackingDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Checks the CNAME settings for a tracking domain. The domain must have been added already with the add-tracking-domain call
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} domain an existing tracking domain name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def checkTrackingDomain(params: js.Any): scala.Unit = js.native
  def checkTrackingDomain(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def checkTrackingDomain(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Get the 100 most clicked URLs
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Return the 100 most clicked URLs that match the search query given
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} q a search query
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def search(params: js.Any): scala.Unit = js.native
  def search(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def search(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Return the recent history (hourly stats for the last 30 days) for a url
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} url an existing URL
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def timeSeries(params: js.Any): scala.Unit = js.native
  def timeSeries(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def timeSeries(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
  /**
    * Get the list of tracking domains set up for this account
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def trackingDomains(params: js.Any): scala.Unit = js.native
  def trackingDomains(params: js.Any, onsuccess: ICallback): scala.Unit = js.native
  def trackingDomains(params: js.Any, onsuccess: ICallback, onerror: ICallback): scala.Unit = js.native
}

