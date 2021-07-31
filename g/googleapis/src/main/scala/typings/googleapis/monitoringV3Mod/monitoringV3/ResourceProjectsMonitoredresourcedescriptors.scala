package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Monitoredresourcedescriptors")
@js.native
class ResourceProjectsMonitoredresourcedescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.projects.monitoredResourceDescriptors.get
    * @desc Gets a single monitored resource descriptor. This method does not
    * require a Stackdriver account.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'get' method:
    *
    *     // The monitored resource descriptor to get. The format is
    *     //
    * `"projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}"`.
    * The
    *     // `{resource_type}` is a predefined type, such as
    * `cloudsql_database`. name:
    * "projects/{MY-PROJECT}/monitoredResourceDescriptors/{MY-MONITOREDRESOURCEDESCRIPTOR}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.monitoredResourceDescriptors.get(request,
    * function(err, result) { if (err) { console.log(err); } else {
    *       console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.monitoredResourceDescriptors.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The monitored resource descriptor to get. The format is "projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}". The {resource_type} is a predefined type, such as cloudsql_database.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(params: ParamsResourceProjectsMonitoredresourcedescriptorsGet): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    options: BodyResponseCallback[SchemaMonitoredResourceDescriptor],
    callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsMonitoredresourcedescriptorsGet, options: MethodOptions): GaxiosPromise[SchemaMonitoredResourceDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMonitoredResourceDescriptor]
  ): Unit = js.native
  
  /**
    * monitoring.projects.monitoredResourceDescriptors.list
    * @desc Lists monitored resource descriptors that match a filter. This
    * method does not require a Stackdriver account.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'list' method:
    *
    *     // The project on which to execute the request. The format is
    * `"projects/{project_id_or_number}"`. name: "projects/{MY-PROJECT}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *
    *   var recur = function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *       if (result.nextPageToken) {
    *         request.pageToken = result.nextPageToken;
    *         monitoring.projects.monitoredResourceDescriptors.list(request,
    * recur);
    *       }
    *     }
    *   };
    *
    *   monitoring.projects.monitoredResourceDescriptors.list(request, recur);
    * });
    * @alias monitoring.projects.monitoredResourceDescriptors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An optional filter describing the descriptors to be returned. The filter can reference the descriptor's type and labels. For example, the following filter returns only Google Compute Engine descriptors that have an id label: resource.type = starts_with("gce_") AND resource.label:id
    * @param {string} params.name The project on which to execute the request. The format is "projects/{project_id_or_number}".
    * @param {integer=} params.pageSize A positive number that is the maximum number of results to return.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(params: ParamsResourceProjectsMonitoredresourcedescriptorsList): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    options: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse],
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsMonitoredresourcedescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListMonitoredResourceDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsMonitoredresourcedescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMonitoredResourceDescriptorsResponse]
  ): Unit = js.native
}
