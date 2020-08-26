package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Image")
@js.native
class ResourceProjectsImage protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dlp.projects.image.redact
    * @desc Redacts potentially sensitive info from an image. This method has
    * limits on input size, processing time, and output size. See
    * https://cloud.google.com/dlp/docs/redacting-sensitive-data-images to
    * learn more.  When no InfoTypes or CustomInfoTypes are specified in this
    * request, the system will automatically choose what detectors to run. By
    * default this may be all types, but may change over time as detectors are
    * updated.
    * @alias dlp.projects.image.redact
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent resource name, for example projects/my-project-id.
    * @param {().GooglePrivacyDlpV2RedactImageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def redact(): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]): Unit = js.native
  def redact(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(params: ParamsResourceProjectsImageRedact): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(
    params: ParamsResourceProjectsImageRedact,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]
  ): Unit = js.native
  def redact(
    params: ParamsResourceProjectsImageRedact,
    options: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse],
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]
  ): Unit = js.native
  def redact(params: ParamsResourceProjectsImageRedact, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(
    params: ParamsResourceProjectsImageRedact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]
  ): Unit = js.native
}

