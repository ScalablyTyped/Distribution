package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Content")
@js.native
class ResourceProjectsContent protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.projects.content.deidentify
    * @desc De-identifies potentially sensitive info from a ContentItem. This
    * method has limits on input size and output size. See
    * https://cloud.google.com/dlp/docs/deidentify-sensitive-data to learn
    * more.  When no InfoTypes or CustomInfoTypes are specified in this
    * request, the system will automatically choose what detectors to run. By
    * default this may be all types, but may change over time as detectors are
    * updated.
    * @alias dlp.projects.content.deidentify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2DeidentifyContentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deidentify(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]): Unit = js.native
  def deidentify(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(params: ParamsResourceProjectsContentDeidentify): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(
    params: ParamsResourceProjectsContentDeidentify,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  def deidentify(
    params: ParamsResourceProjectsContentDeidentify,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  def deidentify(params: ParamsResourceProjectsContentDeidentify, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(
    params: ParamsResourceProjectsContentDeidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  /**
    * dlp.projects.content.inspect
    * @desc Finds potentially sensitive info in content. This method has limits
    * on input size, processing time, and output size.  When no InfoTypes or
    * CustomInfoTypes are specified in this request, the system will
    * automatically choose what detectors to run. By default this may be all
    * types, but may change over time as detectors are updated.  For how to
    * guides, see https://cloud.google.com/dlp/docs/inspecting-images and
    * https://cloud.google.com/dlp/docs/inspecting-text,
    * @alias dlp.projects.content.inspect
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2InspectContentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def inspect(): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]): Unit = js.native
  def inspect(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(params: ParamsResourceProjectsContentInspect): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(
    params: ParamsResourceProjectsContentInspect,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  def inspect(
    params: ParamsResourceProjectsContentInspect,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  def inspect(params: ParamsResourceProjectsContentInspect, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(
    params: ParamsResourceProjectsContentInspect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  /**
    * dlp.projects.content.reidentify
    * @desc Re-identifies content that has been de-identified. See
    * https://cloud.google.com/dlp/docs/pseudonymization#re-identification_in_free_text_code_example
    * to learn more.
    * @alias dlp.projects.content.reidentify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name.
    * @param {().GooglePrivacyDlpV2ReidentifyContentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reidentify(): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]): Unit = js.native
  def reidentify(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(params: ParamsResourceProjectsContentReidentify): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(
    params: ParamsResourceProjectsContentReidentify,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  def reidentify(
    params: ParamsResourceProjectsContentReidentify,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  def reidentify(params: ParamsResourceProjectsContentReidentify, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(
    params: ParamsResourceProjectsContentReidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
}

