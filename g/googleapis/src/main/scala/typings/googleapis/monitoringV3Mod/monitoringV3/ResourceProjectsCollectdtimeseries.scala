package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Collectdtimeseries")
@js.native
class ResourceProjectsCollectdtimeseries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.projects.collectdTimeSeries.create
    * @desc Stackdriver Monitoring Agent only: Creates a new time series.<aside
    * class="caution">This method is only for use by the Stackdriver Monitoring
    * Agent. Use projects.timeSeries.create instead.</aside>
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
    * for the 'create' method:
    *
    *     // The project in which to create the time series. The format is
    * `"projects/PROJECT_ID_OR_NUMBER"`. name: "projects/{MY-PROJECT}",
    *     resource: {},
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.collectdTimeSeries.create(request, function(err,
    * result) { if (err) { console.log(err); } else { console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.collectdTimeSeries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project in which to create the time series. The format is "projects/PROJECT_ID_OR_NUMBER".
    * @param {().CreateCollectdTimeSeriesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCreateCollectdTimeSeriesResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateCollectdTimeSeriesResponse]): Unit = js.native
  def create(params: ParamsResourceProjectsCollectdtimeseriesCreate): GaxiosPromise[SchemaCreateCollectdTimeSeriesResponse] = js.native
  def create(
    params: ParamsResourceProjectsCollectdtimeseriesCreate,
    callback: BodyResponseCallback[SchemaCreateCollectdTimeSeriesResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsCollectdtimeseriesCreate,
    options: BodyResponseCallback[SchemaCreateCollectdTimeSeriesResponse],
    callback: BodyResponseCallback[SchemaCreateCollectdTimeSeriesResponse]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsCollectdtimeseriesCreate, options: MethodOptions): GaxiosPromise[SchemaCreateCollectdTimeSeriesResponse] = js.native
  def create(
    params: ParamsResourceProjectsCollectdtimeseriesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateCollectdTimeSeriesResponse]
  ): Unit = js.native
}

