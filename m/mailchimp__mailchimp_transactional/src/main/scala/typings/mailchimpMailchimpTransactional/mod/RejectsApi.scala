package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectsApi extends StObject {
  
  /**
    * Add email to denylist
    *
    * Adds an email to your email rejection denylist. Addresses that you add manually will never
    * expire and there is no reputation penalty for removing them from your denylist. Attempting
    * to denylist an address that has been added to the allowlist will have no effect.
    */
  def add(body: RejectsAddRequest): js.Promise[RejectsAddResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete email from denylist
    *
    * Deletes an email rejection. There is no limit to how many rejections you can remove from your
    * denylist, but keep in mind that each deletion has an affect on your reputation.
    */
  def delete(body: RejectsDeleteRequest): js.Promise[RejectsDeleteResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List denylisted emails
    *
    * Retrieves your email rejection denylist. You can provide an email address to limit the results.
    * Returns up to 1000 results. By default, entries that have expired are excluded from the results;
    * set include_expired to true to include them.
    */
  def list(): js.Promise[js.Array[RejectsListResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: RejectsListRequest): js.Promise[js.Array[RejectsListResponse] | (AxiosError[Any, Any])] = js.native
}
