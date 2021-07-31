package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Alertpolicies")
@js.native
class ResourceProjectsAlertpolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.projects.alertPolicies.create
    * @desc Creates a new alerting policy.
    * @alias monitoring.projects.alertPolicies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project in which to create the alerting policy. The format is projects/[PROJECT_ID].Note that this field names the parent container in which the alerting policy will be written, not the name of the created policy. The alerting policy that is returned will have a name that contains a normalized representation of this name as a prefix but adds a suffix of the form /alertPolicies/[POLICY_ID], identifying the policy in the container.
    * @param {().AlertPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(params: ParamsResourceProjectsAlertpoliciesCreate): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    options: BodyResponseCallback[SchemaAlertPolicy],
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAlertpoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def create(
    params: ParamsResourceProjectsAlertpoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  
  /**
    * monitoring.projects.alertPolicies.delete
    * @desc Deletes an alerting policy.
    * @alias monitoring.projects.alertPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The alerting policy to delete. The format is: projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID] For more information, see AlertPolicy.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsAlertpoliciesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsAlertpoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsAlertpoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * monitoring.projects.alertPolicies.get
    * @desc Gets a single alerting policy.
    * @alias monitoring.projects.alertPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The alerting policy to retrieve. The format is projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID]
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(params: ParamsResourceProjectsAlertpoliciesGet): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(params: ParamsResourceProjectsAlertpoliciesGet, callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def get(
    params: ParamsResourceProjectsAlertpoliciesGet,
    options: BodyResponseCallback[SchemaAlertPolicy],
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsAlertpoliciesGet, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def get(
    params: ParamsResourceProjectsAlertpoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  
  /**
    * monitoring.projects.alertPolicies.list
    * @desc Lists the existing alerting policies for the project.
    * @alias monitoring.projects.alertPolicies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter If provided, this field specifies the criteria that must be met by alert policies to be included in the response.For more details, see sorting and filtering.
    * @param {string} params.name The project whose alert policies are to be listed. The format is projects/[PROJECT_ID] Note that this field names the parent container in which the alerting policies to be listed are stored. To retrieve a single alerting policy by name, use the GetAlertPolicy operation, instead.
    * @param {string=} params.orderBy A comma-separated list of fields by which to sort the result. Supports the same set of field references as the filter field. Entries can be prefixed with a minus sign to sort by the field in descending order.For more details, see sorting and filtering.
    * @param {integer=} params.pageSize The maximum number of results to return in a single response.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(params: ParamsResourceProjectsAlertpoliciesList): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    options: BodyResponseCallback[SchemaListAlertPoliciesResponse],
    callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAlertpoliciesList, options: MethodOptions): GaxiosPromise[SchemaListAlertPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsAlertpoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAlertPoliciesResponse]
  ): Unit = js.native
  
  /**
    * monitoring.projects.alertPolicies.patch
    * @desc Updates an alerting policy. You can either replace the entire
    * policy with a new one or replace only certain fields in the current
    * alerting policy by specifying the fields to be updated via updateMask.
    * Returns the updated alerting policy.
    * @alias monitoring.projects.alertPolicies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required if the policy exists. The resource name for this policy. The syntax is: projects/[PROJECT_ID]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
    * @param {string=} params.updateMask Optional. A list of alerting policy field names. If this field is not empty, each listed field in the existing alerting policy is set to the value of the corresponding field in the supplied policy (alert_policy), or to the field's default value if the field is not in the supplied alerting policy. Fields not listed retain their previous value.Examples of valid field masks include display_name, documentation, documentation.content, documentation.mime_type, user_labels, user_label.nameofkey, enabled, conditions, combiner, etc.If this field is empty, then the supplied alerting policy replaces the existing policy. It is the same as deleting the existing policy and adding the supplied policy, except for the following: The new policy will have the same [ALERT_POLICY_ID] as the former policy. This gives you continuity with the former policy in your notifications and incidents. Conditions in the new policy will keep their former [CONDITION_ID] if the supplied condition includes the name field with that [CONDITION_ID]. If the supplied condition omits the name field, then a new [CONDITION_ID] is created.
    * @param {().AlertPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(callback: BodyResponseCallback[SchemaAlertPolicy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(params: ParamsResourceProjectsAlertpoliciesPatch): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    options: BodyResponseCallback[SchemaAlertPolicy],
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsAlertpoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaAlertPolicy] = js.native
  def patch(
    params: ParamsResourceProjectsAlertpoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAlertPolicy]
  ): Unit = js.native
}
