package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCompute.anon.Filter
import typings.maximMazurokGapiClientCompute.anon.KeyNotificationEndpoint
import typings.maximMazurokGapiClientCompute.anon.ProjectQuotaUserRegionRequestIdResourceUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionNotificationEndpointsResource extends js.Object {
  
  /** Deletes the specified NotificationEndpoint in the given region */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientCompute.anon.NotificationEndpoint): Request[Operation] = js.native
  
  /** Returns the specified NotificationEndpoint resource in the given region. */
  def get(): Request[NotificationEndpoint] = js.native
  def get(request: KeyNotificationEndpoint): Request[NotificationEndpoint] = js.native
  
  /** Create a NotificationEndpoint in the specified project in the given region using the parameters that are included in the request. */
  def insert(request: ProjectQuotaUserRegionRequestIdResourceUserIp): Request[Operation] = js.native
  def insert(request: typings.maximMazurokGapiClientCompute.anon.Project, body: NotificationEndpoint): Request[Operation] = js.native
  
  /** Lists the NotificationEndpoints for a project in the given region. */
  def list(): Request[NotificationEndpointList] = js.native
  def list(request: Filter): Request[NotificationEndpointList] = js.native
}
