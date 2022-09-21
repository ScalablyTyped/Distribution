package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.AgreementAccepted
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.EnterpriseToken
import typings.maximMazurokGapiClientAndroidmanagement.anon.PageSize
import typings.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import typings.maximMazurokGapiClientAndroidmanagement.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterprisesResource extends StObject {
  
  var applications: ApplicationsResource = js.native
  
  /** Creates an enterprise. This is the last step in the enterprise signup flow. */
  def create(request: AgreementAccepted): Request[Enterprise] = js.native
  def create(request: EnterpriseToken, body: Enterprise): Request[Enterprise] = js.native
  
  /** Deletes an enterprise. Only available for EMM-managed enterprises. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  var devices: DevicesResource = js.native
  
  var enrollmentTokens: EnrollmentTokensResource = js.native
  
  /** Gets an enterprise. */
  def get(): Request[Enterprise] = js.native
  def get(request: Alt): Request[Enterprise] = js.native
  
  /** Lists EMM-managed enterprises. Only BASIC fields are returned. */
  def list(): Request[ListEnterprisesResponse] = js.native
  def list(request: PageSize): Request[ListEnterprisesResponse] = js.native
  
  def patch(request: PrettyPrint, body: Enterprise): Request[Enterprise] = js.native
  /** Updates an enterprise. */
  def patch(request: Xgafv): Request[Enterprise] = js.native
  
  var policies: PoliciesResource = js.native
  
  var webApps: WebAppsResource = js.native
  
  var webTokens: WebTokensResource = js.native
}
