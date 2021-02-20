package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations$Sources")
@js.native
class ResourceOrganizationsSources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * securitycenter.organizations.sources.create
    * @desc Creates a source.
    * @alias securitycenter.organizations.sources.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the new source's parent. Its format should be "organizations/[organization_id]".
    * @param {().Source} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaSource] = js.native
  def create(callback: BodyResponseCallback[SchemaSource]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSource] = js.native
  def create(params: ParamsResourceOrganizationsSourcesCreate): GaxiosPromise[SchemaSource] = js.native
  def create(params: ParamsResourceOrganizationsSourcesCreate, callback: BodyResponseCallback[SchemaSource]): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesCreate,
    options: BodyResponseCallback[SchemaSource],
    callback: BodyResponseCallback[SchemaSource]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsSourcesCreate, options: MethodOptions): GaxiosPromise[SchemaSource] = js.native
  def create(
    params: ParamsResourceOrganizationsSourcesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSource]
  ): Unit = js.native
  
  var findings: ResourceOrganizationsSourcesFindings = js.native
  
  /**
    * securitycenter.organizations.sources.get
    * @desc Gets a source.
    * @alias securitycenter.organizations.sources.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Relative resource name of the source. Its format is "organizations/[organization_id]/source/[source_id]".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSource] = js.native
  def get(callback: BodyResponseCallback[SchemaSource]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSource] = js.native
  def get(params: ParamsResourceOrganizationsSourcesGet): GaxiosPromise[SchemaSource] = js.native
  def get(params: ParamsResourceOrganizationsSourcesGet, callback: BodyResponseCallback[SchemaSource]): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsSourcesGet,
    options: BodyResponseCallback[SchemaSource],
    callback: BodyResponseCallback[SchemaSource]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsSourcesGet, options: MethodOptions): GaxiosPromise[SchemaSource] = js.native
  def get(
    params: ParamsResourceOrganizationsSourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSource]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.sources.getIamPolicy
    * @desc Gets the access control policy on the specified Source.
    * @alias securitycenter.organizations.sources.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceOrganizationsSourcesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceOrganizationsSourcesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceOrganizationsSourcesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceOrganizationsSourcesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceOrganizationsSourcesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.sources.list
    * @desc Lists all sources belonging to an organization.
    * @alias securitycenter.organizations.sources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. Default is 10, minimum is 1, maximum is 1000.
    * @param {string=} params.pageToken The value returned by the last `ListSourcesResponse`; indicates that this is a continuation of a prior `ListSources` call, and that the system should return the next page of data.
    * @param {string} params.parent Resource name of the parent of sources to list. Its format should be "organizations/[organization_id]".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSourcesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(params: ParamsResourceOrganizationsSourcesList): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesList,
    callback: BodyResponseCallback[SchemaListSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesList,
    options: BodyResponseCallback[SchemaListSourcesResponse],
    callback: BodyResponseCallback[SchemaListSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsSourcesList, options: MethodOptions): GaxiosPromise[SchemaListSourcesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsSourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSourcesResponse]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.sources.patch
    * @desc Updates a source.
    * @alias securitycenter.organizations.sources.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of this source. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/sources/456"
    * @param {string=} params.updateMask The FieldMask to use when updating the source resource.
    * @param {().Source} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSource] = js.native
  def patch(callback: BodyResponseCallback[SchemaSource]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSource] = js.native
  def patch(params: ParamsResourceOrganizationsSourcesPatch): GaxiosPromise[SchemaSource] = js.native
  def patch(params: ParamsResourceOrganizationsSourcesPatch, callback: BodyResponseCallback[SchemaSource]): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesPatch,
    options: BodyResponseCallback[SchemaSource],
    callback: BodyResponseCallback[SchemaSource]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsSourcesPatch, options: MethodOptions): GaxiosPromise[SchemaSource] = js.native
  def patch(
    params: ParamsResourceOrganizationsSourcesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSource]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.sources.setIamPolicy
    * @desc Sets the access control policy on the specified Source.
    * @alias securitycenter.organizations.sources.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceOrganizationsSourcesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceOrganizationsSourcesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceOrganizationsSourcesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceOrganizationsSourcesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceOrganizationsSourcesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * securitycenter.organizations.sources.testIamPermissions
    * @desc Returns the permissions that a caller has on the specified source.
    * @alias securitycenter.organizations.sources.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceOrganizationsSourcesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceOrganizationsSourcesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceOrganizationsSourcesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceOrganizationsSourcesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceOrganizationsSourcesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
