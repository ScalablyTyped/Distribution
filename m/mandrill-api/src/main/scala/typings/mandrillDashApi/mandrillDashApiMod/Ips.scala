package typings.mandrillDashApi.mandrillDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mandrill-api", "Ips")
@js.native
class Ips protected () extends js.Object {
  def this(master: Mandrill) = this()
  /**
    * Cancels the warmup process for a dedicated IP.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip a dedicated ip address
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def cancelWarmup(params: js.Any): Unit = js.native
  def cancelWarmup(params: js.Any, onsuccess: ICallback): Unit = js.native
  def cancelWarmup(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Tests whether a domain name is valid for use as the custom reverse
    * DNS for a dedicated IP.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip a dedicated ip address
    * @option params {String} domain the domain name to test
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def checkCustomDns(params: js.Any): Unit = js.native
  def checkCustomDns(params: js.Any, onsuccess: ICallback): Unit = js.native
  def checkCustomDns(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Creates a pool and returns it. If a pool already exists with this
    * name, no action will be performed.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} pool the name of a pool to create
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def createPool(params: js.Any): Unit = js.native
  def createPool(params: js.Any, onsuccess: ICallback): Unit = js.native
  def createPool(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Deletes a dedicated IP. This is permanent and cannot be undone.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip the dedicated ip to remove from your account
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def delete(params: js.Any): Unit = js.native
  def delete(params: js.Any, onsuccess: ICallback): Unit = js.native
  def delete(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Deletes a pool. A pool must be empty before you can delete it, and you cannot delete your default pool.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} pool the name of the pool to delete
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def deletePool(params: js.Any): Unit = js.native
  def deletePool(params: js.Any, onsuccess: ICallback): Unit = js.native
  def deletePool(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Retrieves information about a single dedicated ip.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip a dedicated IP address
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def info(params: js.Any): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback): Unit = js.native
  def info(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Lists your dedicated IPs.
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def list(params: js.Any): Unit = js.native
  def list(params: js.Any, onsuccess: ICallback): Unit = js.native
  def list(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Lists your dedicated IP pools.
    * @param {Object} params the hash of the parameters to pass to the request
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def listPools(params: js.Any): Unit = js.native
  def listPools(params: js.Any, onsuccess: ICallback): Unit = js.native
  def listPools(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Describes a single dedicated IP pool.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} pool a pool name
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def poolInfo(params: js.Any): Unit = js.native
  def poolInfo(params: js.Any, onsuccess: ICallback): Unit = js.native
  def poolInfo(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Requests an additional dedicated IP for your account. Accounts may
    * have one outstanding request at any time, and provisioning requests
    * are processed within 24 hours.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {Boolean} warmup whether to enable warmup mode for the ip
    * @option params {String} pool the id of the pool to add the dedicated ip to, or null to use your account's default pool
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def provision(params: js.Any): Unit = js.native
  def provision(params: js.Any, onsuccess: ICallback): Unit = js.native
  def provision(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Configures the custom DNS name for a dedicated IP.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip a dedicated ip address
    * @option params {String} domain a domain name to set as the dedicated IP's custom dns name.
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def setCustomDns(params: js.Any): Unit = js.native
  def setCustomDns(params: js.Any, onsuccess: ICallback): Unit = js.native
  def setCustomDns(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Moves a dedicated IP to a different pool.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip a dedicated ip address
    * @option params {String} pool the name of the new pool to add the dedicated ip to
    * @option params {Boolean} create_pool whether to create the pool if it does not exist; if false and the pool does not exist, an Unknown_Pool will be thrown.
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def setPool(params: js.Any): Unit = js.native
  def setPool(params: js.Any, onsuccess: ICallback): Unit = js.native
  def setPool(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
  /**
    * Begins the warmup process for a dedicated IP. During the warmup process,
    * Mandrill will gradually increase the percentage of your mail that is sent over
    * the warming-up IP, over a period of roughly 30 days. The rest of your mail
    * will be sent over shared IPs or other dedicated IPs in the same pool.
    * @param {Object} params the hash of the parameters to pass to the request
    * @option params {String} ip a dedicated ip address
    * @param {Function} onsuccess an optional callback to execute when the API call is successfully made
    * @param {Function} onerror an optional callback to execute when the API call errors out - defaults to throwing the error as an exception
    */
  def startWarmup(params: js.Any): Unit = js.native
  def startWarmup(params: js.Any, onsuccess: ICallback): Unit = js.native
  def startWarmup(params: js.Any, onsuccess: ICallback, onerror: ICallback): Unit = js.native
}

