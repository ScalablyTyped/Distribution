package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubaccountsApi extends StObject {
  
  /**
    * Add subaccount
    *
    * Add a new subaccount.
    */
  def add(body: SubaccountsAddRequest): js.Promise[SubaccountResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete subaccount
    *
    * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats
    * will be removed and any future sending calls to this subaccount will fail.
    */
  def delete(body: SubaccountsDeleteRequest): js.Promise[SubaccountResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get subaccount info
    *
    * Given the ID of an existing subaccount, return the data about it.
    */
  def info(body: SubaccountsInfoRequest): js.Promise[SubaccountsInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List subaccounts
    *
    * Get the list of subaccounts defined for the account, optionally filtered by a prefix.
    */
  def list(): js.Promise[js.Array[SubaccountResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: SubaccountsListRequest): js.Promise[js.Array[SubaccountResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Pause subaccount
    *
    * Pause a subaccount's sending. Any future emails delivered to this subaccount will be queued
    * for a maximum of 3 days until the subaccount is resumed.
    */
  def pause(body: SubaccountsPauseRequest): js.Promise[SubaccountResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Resume subaccount
    *
    * Resume a paused subaccount's sending.
    */
  def resume(body: SubaccountsResumeRequest): js.Promise[SubaccountResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Update subaccount
    *
    * Update an existing subaccount.
    */
  def update(body: SubaccountsUpdateRequest): js.Promise[SubaccountResponse | (AxiosError[Any, Any])] = js.native
}
