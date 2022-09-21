package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpsApi extends StObject {
  
  /**
    * Cancel ip warmup
    *
    * Cancels the warmup process for a dedicated IP.
    */
  def cancelWarmup(body: IpsCancelWarmupRequest): js.Promise[IpsInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Test custom dns
    *
    * Tests whether a domain name is valid for use as the custom reverse DNS for a dedicated IP.
    */
  def checkCustomDns(body: IpsCheckCustomDnsRequest): js.Promise[IpsCheckCustomDnsResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Add ip pool
    *
    * Creates a pool and returns it. If a pool already exists with this name, no action will be performed.
    */
  def createPool(body: IpsCreatePoolRequest): js.Promise[IpsPoolInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete ip address
    *
    * Deletes a dedicated IP. This is permanent and cannot be undone.
    */
  def delete(body: IpsDeleteRequest): js.Promise[IpsDeleteResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete ip pool
    *
    * Deletes a pool. A pool must be empty before you can delete it, and you cannot delete your default pool.
    */
  def deletePool(body: IpsDeletePoolRequest): js.Promise[IpsDeletePoolResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get ip info
    *
    * Retrieves information about a single dedicated IP.
    */
  def info(): js.Promise[IpsInfoResponse | (AxiosError[Any, Any])] = js.native
  def info(body: IpsInfoRequest): js.Promise[IpsInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List ip addresses
    *
    * Lists your dedicated IPs.
    */
  def list(): js.Promise[js.Array[IpsInfoResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: IpsListRequest): js.Promise[js.Array[IpsInfoResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * List ip pools
    *
    * Lists your dedicated IP pools.
    */
  def listPools(): js.Promise[js.Array[IpsPoolInfoResponse] | (AxiosError[Any, Any])] = js.native
  def listPools(body: IpsListPoolsRequest): js.Promise[js.Array[IpsPoolInfoResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get ip pool info
    *
    * Describes a single dedicated IP pool.
    */
  def poolInfo(body: IpsPoolInfoRequest): js.Promise[IpsPoolInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Request additional ip
    *
    * Requests an additional dedicated IP for your account. Accounts may have one outstanding
    * request at any time, and provisioning requests are processed within 24 hours.
    */
  def provision(): js.Promise[IpsProvisionResponse | (AxiosError[Any, Any])] = js.native
  def provision(body: IpsProvisionRequest): js.Promise[IpsProvisionResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Set custom dns
    *
    * Configures the custom DNS name for a dedicated IP.
    */
  def setCustomDns(body: IpsSetCustomDnsRequest): js.Promise[IpsInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Move ip to different pool
    *
    * Moves a dedicated IP to a different pool.
    */
  def setPool(body: IpsSetPoolRequest): js.Promise[IpsInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Start ip warmup
    *
    * Begins the warmup process for a dedicated IP. During the warmup process, the
    * Transactional API will gradually increase the percentage of your mail that is sent over
    * the warming-up IP, over a period of roughly 30 days. The rest of your mail will be sent
    * over shared IPs or other dedicated IPs in the same pool.
    */
  def startWarmup(body: IpsStartWarmupRequest): js.Promise[IpsInfoResponse | (AxiosError[Any, Any])] = js.native
}
