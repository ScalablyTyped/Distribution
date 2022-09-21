package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.MaxResults
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRequestIdResourceUploadTypeUploadprotocol
import typings.maximMazurokGapiClientCompute.anon.QuotaUserSslPolicy
import typings.maximMazurokGapiClientCompute.anon.ResourceSslPolicy
import typings.maximMazurokGapiClientCompute.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslPoliciesResource extends StObject {
  
  /** Deletes the specified SSL policy. The SSL policy resource can be deleted only if it is not in use by any TargetHttpsProxy or TargetSslProxy resources. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.SslPolicy): Request[Operation] = js.native
  
  /** Lists all of the ordered rules present in a single specified policy. */
  def get(): Request[SslPolicy] = js.native
  def get(request: QuotaUserSslPolicy): Request[SslPolicy] = js.native
  
  /** Returns the specified SSL policy resource. Gets a list of available SSL policies by making a list() request. */
  def insert(request: ProjectQuotaUserRequestIdResourceUploadTypeUploadprotocol): Request[Operation] = js.native
  def insert(request: Xgafv, body: SslPolicy): Request[Operation] = js.native
  
  /** Lists all the SSL policies that have been configured for the specified project. */
  def list(): Request[SslPoliciesList] = js.native
  def list(request: MaxResults): Request[SslPoliciesList] = js.native
  
  /** Lists all features that can be specified in the SSL policy when using custom profile. */
  def listAvailableFeatures(): Request[SslPoliciesListAvailableFeaturesResponse] = js.native
  def listAvailableFeatures(request: MaxResults): Request[SslPoliciesListAvailableFeaturesResponse] = js.native
  
  /** Patches the specified SSL policy with the data included in the request. */
  def patch(request: ResourceSslPolicy): Request[Operation] = js.native
  def patch(request: typings.maximMazurokGapiClientCompute.anon.SslPolicy, body: SslPolicy): Request[Operation] = js.native
}
