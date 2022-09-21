package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudbuild.anon.AccesstokenAlt
import typings.maximMazurokGapiClientCloudbuild.anon.AltCallback
import typings.maximMazurokGapiClientCloudbuild.anon.ConfigId
import typings.maximMazurokGapiClientCloudbuild.anon.GheConfigId
import typings.maximMazurokGapiClientCloudbuild.anon.UpdateMask
import typings.maximMazurokGapiClientCloudbuild.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GithubEnterpriseConfigsResource extends StObject {
  
  def create(request: AccesstokenAlt, body: GitHubEnterpriseConfig): Request[Operation] = js.native
  /** Create an association between a GCP project and a GitHub Enterprise server. */
  def create(request: GheConfigId): Request[Operation] = js.native
  
  /** Delete an association between a GCP project and a GitHub Enterprise server. */
  def delete(): Request[Operation] = js.native
  def delete(request: ConfigId): Request[Operation] = js.native
  
  /** Retrieve a GitHubEnterpriseConfig. */
  def get(): Request[GitHubEnterpriseConfig] = js.native
  def get(request: ConfigId): Request[GitHubEnterpriseConfig] = js.native
  
  /** List all GitHubEnterpriseConfigs for a given project. */
  def list(): Request[ListGithubEnterpriseConfigsResponse] = js.native
  def list(request: UploadType): Request[ListGithubEnterpriseConfigsResponse] = js.native
  
  def patch(request: AltCallback, body: GitHubEnterpriseConfig): Request[Operation] = js.native
  /** Update an association between a GCP project and a GitHub Enterprise server. */
  def patch(request: UpdateMask): Request[Operation] = js.native
}
