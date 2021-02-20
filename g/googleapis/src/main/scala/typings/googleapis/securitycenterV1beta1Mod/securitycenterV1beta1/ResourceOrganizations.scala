package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1beta1", "securitycenter_v1beta1.Resource$Organizations")
@js.native
class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var assets: ResourceOrganizationsAssets = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * securitycenter.organizations.getOrganizationSettings
    * @desc Gets the settings for an organization.
    * @alias securitycenter.organizations.getOrganizationSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the organization to get organization settings for. Its format is "organizations/[organization_id]/organizationSettings".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getOrganizationSettings(): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(callback: BodyResponseCallback[SchemaOrganizationSettings]): Unit = js.native
  def getOrganizationSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(params: ParamsResourceOrganizationsGetorganizationsettings): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    options: BodyResponseCallback[SchemaOrganizationSettings],
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  def getOrganizationSettings(params: ParamsResourceOrganizationsGetorganizationsettings, options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def getOrganizationSettings(
    params: ParamsResourceOrganizationsGetorganizationsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  
  var operations: ResourceOrganizationsOperations = js.native
  
  var sources: ResourceOrganizationsSources = js.native
  
  /**
    * securitycenter.organizations.updateOrganizationSettings
    * @desc Updates an organization's settings.
    * @alias securitycenter.organizations.updateOrganizationSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The relative resource name of the settings. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/123/organizationSettings".
    * @param {string=} params.updateMask The FieldMask to use when updating the settings resource.
    * @param {().OrganizationSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateOrganizationSettings(): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(callback: BodyResponseCallback[SchemaOrganizationSettings]): Unit = js.native
  def updateOrganizationSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(params: ParamsResourceOrganizationsUpdateorganizationsettings): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    options: BodyResponseCallback[SchemaOrganizationSettings],
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
  def updateOrganizationSettings(params: ParamsResourceOrganizationsUpdateorganizationsettings, options: MethodOptions): GaxiosPromise[SchemaOrganizationSettings] = js.native
  def updateOrganizationSettings(
    params: ParamsResourceOrganizationsUpdateorganizationsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrganizationSettings]
  ): Unit = js.native
}
