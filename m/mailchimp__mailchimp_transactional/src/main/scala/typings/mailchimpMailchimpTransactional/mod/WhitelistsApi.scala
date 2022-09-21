package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhitelistsApi extends StObject {
  
  /**
    * Add email to allowlist
    *
    * Adds an email to your email rejection allowlist. If the address is currently on your denylist,
    * that denylist entry will be removed automatically.
    */
  def add(body: WhitelistsAddRequest): js.Promise[WhitelistsAddResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Remove email from allowlist
    *
    * Removes an email address from the allowlist.
    */
  def delete(body: WhitelistsDeleteRequest): js.Promise[WhitelistsDeleteResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List allowlisted emails
    *
    * Retrieves your email rejection allowlist. You can provide an email address or search prefix to
    * limit the results. Returns up to 1000 results.
    */
  def list(): js.Promise[js.Array[WhitelistsListResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: WhitelistsListRequest): js.Promise[js.Array[WhitelistsListResponse] | (AxiosError[Any, Any])] = js.native
}
