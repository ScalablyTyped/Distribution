package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidmanagement.anon.Alt
import typings.maximMazurokGapiClientAndroidmanagement.anon.EnterpriseToken
import typings.maximMazurokGapiClientAndroidmanagement.anon.PrettyPrint
import typings.maximMazurokGapiClientAndroidmanagement.anon.ProjectId
import typings.maximMazurokGapiClientAndroidmanagement.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterprisesResource extends js.Object {
  
  var applications: ApplicationsResource = js.native
  
  /** Creates an enterprise. This is the last step in the enterprise signup flow. */
  def create(request: EnterpriseToken): Request[Enterprise] = js.native
  def create(request: ProjectId, body: Enterprise): Request[Enterprise] = js.native
  
  var devices: DevicesResource = js.native
  
  var enrollmentTokens: EnrollmentTokensResource = js.native
  
  /** Gets an enterprise. */
  def get(): Request[Enterprise] = js.native
  def get(request: Alt): Request[Enterprise] = js.native
  
  def patch(request: PrettyPrint, body: Enterprise): Request[Enterprise] = js.native
  /** Updates an enterprise. */
  def patch(request: Xgafv): Request[Enterprise] = js.native
  
  var policies: PoliciesResource = js.native
  
  var webApps: WebAppsResource = js.native
  
  var webTokens: WebTokensResource = js.native
}
