package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageToken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.QuotaUser
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Resource
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
  /**
    * Marks target Account as soft-deleted (ie: "trashed") and returns it. This API does not have a method to restore soft-deleted accounts. However, they can be restored using the Trash
    * Can UI. If the accounts are not restored before the expiration time, the account and all child resources (eg: Properties, GoogleAdsLinks, Streams, UserLinks) will be permanently
    * purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Lookup for a single Account. Throws "Target not found" if no such account found, or if caller does not have permissions to access it. */
  def get(): Request[GoogleAnalyticsAdminV1alphaAccount] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaAccount] = js.native
  
  /** Get data sharing settings on an account. Data sharing settings are singletons. */
  def getDataSharingSettings(): Request[GoogleAnalyticsAdminV1alphaDataSharingSettings] = js.native
  def getDataSharingSettings(request: Name): Request[GoogleAnalyticsAdminV1alphaDataSharingSettings] = js.native
  
  /**
    * Returns all accounts accessible by the caller. Note that these accounts might not currently have GA4 properties. Soft-deleted (ie: "trashed") accounts are excluded by default.
    * Returns an empty list if no relevant accounts are found.
    */
  def list(): Request[GoogleAnalyticsAdminV1alphaListAccountsResponse] = js.native
  def list(request: PageToken): Request[GoogleAnalyticsAdminV1alphaListAccountsResponse] = js.native
  
  /** Updates an account. */
  def patch(request: QuotaUser): Request[GoogleAnalyticsAdminV1alphaAccount] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaAccount): Request[GoogleAnalyticsAdminV1alphaAccount] = js.native
  
  /** Requests a ticket for creating an account. */
  def provisionAccountTicket(request: Resource): Request[GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] = js.native
  def provisionAccountTicket(request: UploadType, body: GoogleAnalyticsAdminV1alphaProvisionAccountTicketRequest): Request[GoogleAnalyticsAdminV1alphaProvisionAccountTicketResponse] = js.native
  
  var userLinks: UserLinksResource = js.native
}
