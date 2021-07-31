package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAppengine.anon.Alt
import typings.maximMazurokGapiClientAppengine.anon.AltCallback
import typings.maximMazurokGapiClientAppengine.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAppengine.anon.OauthtokenPrettyPrint
import typings.maximMazurokGapiClientAppengine.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientAppengine.anon.QuotaUserResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsResource extends StObject {
  
  var authorizedCertificates: AuthorizedCertificatesResource = js.native
  
  var authorizedDomains: AuthorizedDomainsResource = js.native
  
  /**
    * Creates an App Engine application for a Google Cloud Platform project. Required fields: id - The ID of the target Cloud Platform project. location - The region
    * (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about App Engine applications, see Managing Projects,
    * Applications, and Billing (https://cloud.google.com/appengine/docs/standard/python/console/).
    */
  def create(request: AltCallback): Request[Operation] = js.native
  def create(request: KeyOauthtoken, body: Application): Request[Operation] = js.native
  
  var domainMappings: DomainMappingsResource = js.native
  
  var firewall: FirewallResource = js.native
  
  /** Gets information about an application. */
  def get(): Request[Application] = js.native
  def get(request: Alt): Request[Application] = js.native
  
  var locations: LocationsResource = js.native
  
  var operations: OperationsResource = js.native
  
  /**
    * Updates the specified Application resource. You can update the following fields: auth_domain - Google authentication domain for controlling user access to the application.
    * default_cookie_expiration - Cookie expiration policy for the application.
    */
  def patch(request: OauthtokenPrettyPrint): Request[Operation] = js.native
  def patch(request: PrettyPrintQuotaUser, body: Application): Request[Operation] = js.native
  
  def repair(request: Alt, body: RepairApplicationRequest): Request[Operation] = js.native
  /**
    * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account. Use this method if you receive
    * an error message about a missing feature, for example, Error retrieving the App Engine service account. If you have deleted your App Engine service account, this will not be able to
    * recreate it. Instead, you should attempt to use the IAM undelete API if possible at
    * https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts/undelete?apix_params=%7B"name"%3A"projects%2F-%2FserviceAccounts%2Funique_id"%2C"resource"%3A%7B%7D%7D . If
    * the deletion was recent, the numeric ID can be found in the Cloud Console Activity Log.
    */
  def repair(request: QuotaUserResource): Request[Operation] = js.native
  
  var services: ServicesResource = js.native
}
