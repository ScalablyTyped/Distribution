package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAppengine.anon.AccesstokenAlt
import typings.maximMazurokGapiClientAppengine.anon.AltAppsId
import typings.maximMazurokGapiClientAppengine.anon.AppsIdCallback
import typings.maximMazurokGapiClientAppengine.anon.CallbackFields
import typings.maximMazurokGapiClientAppengine.anon.PageToken
import typings.maximMazurokGapiClientAppengine.anon.VersionsId
import typings.maximMazurokGapiClientAppengine.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  /** Deploys code and resource files to a new version. */
  def create(request: AccesstokenAlt): Request[Operation] = js.native
  def create(request: AltAppsId, body: Version): Request[Operation] = js.native
  
  /** Deletes an existing Version resource. */
  def delete(): Request[Operation] = js.native
  def delete(request: VersionsId): Request[Operation] = js.native
  
  /** Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource. */
  def get(): Request[Version] = js.native
  def get(request: View): Request[Version] = js.native
  
  var instances: InstancesResource = js.native
  
  /** Lists the versions of a service. */
  def list(): Request[ListVersionsResponse] = js.native
  def list(request: PageToken): Request[ListVersionsResponse] = js.native
  
  /**
    * Updates the specified Version resource. You can specify the following fields depending on the App Engine environment and type of scaling that the version resource uses:Standard
    * environment instance_class (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class)automatic scaling in the
    * standard environment: automatic_scaling.min_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling) automatic_scaling.max_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automaticScaling.standard_scheduler_settings.max_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings)
    * automaticScaling.standard_scheduler_settings.min_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings)
    * automaticScaling.standard_scheduler_settings.target_cpu_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings)
    * automaticScaling.standard_scheduler_settings.target_throughput_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings)basic scaling or manual scaling in the standard environment:
    * serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status) manual_scaling.instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#manualscaling)Flexible environment serving_status
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status)automatic scaling in the flexible environment:
    * automatic_scaling.min_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.max_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.cool_down_period_sec (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.cpu_utilization.target_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling)manual scaling in the flexible environment:
    * manual_scaling.instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#manualscaling)
    */
  def patch(request: AppsIdCallback): Request[Operation] = js.native
  def patch(request: CallbackFields, body: Version): Request[Operation] = js.native
}
