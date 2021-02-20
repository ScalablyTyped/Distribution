package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Services")
@js.native
class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var configs: ResourceServicesConfigs = js.native
  
  var consumers: ResourceServicesConsumers = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * servicemanagement.services.create
    * @desc Creates a new managed service. Please note one producer project can
    * own no more than 20 services.  Operation<response: ManagedService>
    * @alias servicemanagement.services.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ManagedService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceServicesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceServicesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.delete
    * @desc Deletes a managed service. This method will change the service to
    * the `Soft-Delete` state for 30 days. Within this period, service
    * producers may call UndeleteService to restore the service. After 30 days,
    * the service will be permanently deleted.  Operation<response:
    * google.protobuf.Empty>
    * @alias servicemanagement.services.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceServicesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceServicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.disable
    * @desc Disables a service for a project, so it can no longer be be used
    * for the project. It prevents accidental usage that may cause unexpected
    * billing charges or security leaks.  Operation<response:
    * DisableServiceResponse>
    * @alias servicemanagement.services.disable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName Name of the service to disable. Specifying an unknown service name will cause the request to fail.
    * @param {().DisableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disable(): GaxiosPromise[SchemaOperation] = js.native
  def disable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disable(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(params: ParamsResourceServicesDisable): GaxiosPromise[SchemaOperation] = js.native
  def disable(params: ParamsResourceServicesDisable, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disable(
    params: ParamsResourceServicesDisable,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disable(params: ParamsResourceServicesDisable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(
    params: ParamsResourceServicesDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.enable
    * @desc Enables a service for a project, so it can be used for the project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.  Operation<response: EnableServiceResponse>
    * @alias servicemanagement.services.enable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName Name of the service to enable. Specifying an unknown service name will cause the request to fail.
    * @param {().EnableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enable(): GaxiosPromise[SchemaOperation] = js.native
  def enable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enable(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(params: ParamsResourceServicesEnable): GaxiosPromise[SchemaOperation] = js.native
  def enable(params: ParamsResourceServicesEnable, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enable(
    params: ParamsResourceServicesEnable,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enable(params: ParamsResourceServicesEnable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(
    params: ParamsResourceServicesEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.generateConfigReport
    * @desc Generates and returns a report (errors, warnings and changes from
    * existing configurations) associated with
    * GenerateConfigReportRequest.new_value  If
    * GenerateConfigReportRequest.old_value is specified,
    * GenerateConfigReportRequest will contain a single ChangeReport based on
    * the comparison between GenerateConfigReportRequest.new_value and
    * GenerateConfigReportRequest.old_value. If
    * GenerateConfigReportRequest.old_value is not specified, this method will
    * compare GenerateConfigReportRequest.new_value with the last pushed
    * service configuration.
    * @alias servicemanagement.services.generateConfigReport
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GenerateConfigReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateConfigReport(): GaxiosPromise[SchemaGenerateConfigReportResponse] = js.native
  def generateConfigReport(callback: BodyResponseCallback[SchemaGenerateConfigReportResponse]): Unit = js.native
  def generateConfigReport(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGenerateConfigReportResponse] = js.native
  def generateConfigReport(params: ParamsResourceServicesGenerateconfigreport): GaxiosPromise[SchemaGenerateConfigReportResponse] = js.native
  def generateConfigReport(
    params: ParamsResourceServicesGenerateconfigreport,
    callback: BodyResponseCallback[SchemaGenerateConfigReportResponse]
  ): Unit = js.native
  def generateConfigReport(
    params: ParamsResourceServicesGenerateconfigreport,
    options: BodyResponseCallback[SchemaGenerateConfigReportResponse],
    callback: BodyResponseCallback[SchemaGenerateConfigReportResponse]
  ): Unit = js.native
  def generateConfigReport(params: ParamsResourceServicesGenerateconfigreport, options: MethodOptions): GaxiosPromise[SchemaGenerateConfigReportResponse] = js.native
  def generateConfigReport(
    params: ParamsResourceServicesGenerateconfigreport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateConfigReportResponse]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.get
    * @desc Gets a managed service. Authentication is required unless the
    * service is public.
    * @alias servicemanagement.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service.  See the `ServiceManager` overview for naming requirements.  For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaManagedService] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedService]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaManagedService] = js.native
  def get(params: ParamsResourceServicesGet): GaxiosPromise[SchemaManagedService] = js.native
  def get(params: ParamsResourceServicesGet, callback: BodyResponseCallback[SchemaManagedService]): Unit = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: BodyResponseCallback[SchemaManagedService],
    callback: BodyResponseCallback[SchemaManagedService]
  ): Unit = js.native
  def get(params: ParamsResourceServicesGet, options: MethodOptions): GaxiosPromise[SchemaManagedService] = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedService]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.getConfig
    * @desc Gets a service configuration (version) for a managed service.
    * @alias servicemanagement.services.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.configId The id of the service configuration resource.  This field must be specified for the server to return all fields, including `SourceInfo`.
    * @param {string} params.serviceName The name of the service.  See the [overview](/service-management/overview) for naming requirements.  For example: `example.googleapis.com`.
    * @param {string=} params.view Specifies which parts of the Service Config should be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[SchemaService] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def getConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def getConfig(params: ParamsResourceServicesGetconfig): GaxiosPromise[SchemaService] = js.native
  def getConfig(params: ParamsResourceServicesGetconfig, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def getConfig(
    params: ParamsResourceServicesGetconfig,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def getConfig(params: ParamsResourceServicesGetconfig, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def getConfig(
    params: ParamsResourceServicesGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias servicemanagement.services.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceServicesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceServicesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceServicesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceServicesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceServicesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.list
    * @desc Lists managed services.  Returns all public services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.get" permission for.  **BETA:** If the caller
    * specifies the `consumer_id`, it returns only the services enabled on the
    * consumer. The `consumer_id` must have the format of
    * "project:{PROJECT-ID}".
    * @alias servicemanagement.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.consumerId Include services consumed by the specified consumer.  The Google Service Management implementation accepts the following forms: - project:<project_id>
    * @param {integer=} params.pageSize The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 100.
    * @param {string=} params.pageToken Token identifying which result to start with; returned by a previous list call.
    * @param {string=} params.producerProjectId Include services produced by the specified project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceServicesList): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceServicesList, callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceServicesList,
    options: BodyResponseCallback[SchemaListServicesResponse],
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesList, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  
  var rollouts: ResourceServicesRollouts = js.native
  
  /**
    * servicemanagement.services.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias servicemanagement.services.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceServicesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceServicesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceServicesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceServicesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceServicesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias servicemanagement.services.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceServicesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceServicesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceServicesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceServicesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceServicesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  
  /**
    * servicemanagement.services.undelete
    * @desc Revives a previously deleted managed service. The method restores
    * the service using the configuration at the time the service was deleted.
    * The target service must exist and must have been deleted within the last
    * 30 days.  Operation<response: UndeleteServiceResponse>
    * @alias servicemanagement.services.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.serviceName The name of the service. See the [overview](/service-management/overview) for naming requirements. For example: `example.googleapis.com`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[SchemaOperation] = js.native
  def undelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(params: ParamsResourceServicesUndelete): GaxiosPromise[SchemaOperation] = js.native
  def undelete(params: ParamsResourceServicesUndelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undelete(
    params: ParamsResourceServicesUndelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def undelete(params: ParamsResourceServicesUndelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undelete(
    params: ParamsResourceServicesUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
