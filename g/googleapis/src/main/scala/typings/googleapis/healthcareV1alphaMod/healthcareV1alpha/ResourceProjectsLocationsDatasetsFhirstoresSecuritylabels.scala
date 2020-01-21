package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Securitylabels")
@js.native
class ResourceProjectsLocationsDatasetsFhirstoresSecuritylabels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.securityLabels.getIamPolicy
    * @desc Gets the access control policy for a FHIR store or security label
    * within a FHIR store. Returns NOT_FOUND error if the resource does not
    * exist. Returns an empty policy if the resource exists but does not have a
    * policy set.  Authorization requires the Google IAM permission
    * 'healthcare.fhirStores.getIamPolicy' for a FHIR store or
    * 'healthcare.securityLabels.getIamPolicy' for a security label
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.securityLabels.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.securityLabels.setIamPolicy
    * @desc Sets the access control policy for a FHIR store or security label
    * within a FHIR store. Replaces any existing policy.  Authorization
    * requires the Google IAM permission 'healthcare.fhirStores.setIamPolicy'
    * for a FHIR store or 'healthcare.securityLabels.setIamPolicy' for a
    * security label
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.securityLabels.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresSecuritylabelsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
}

