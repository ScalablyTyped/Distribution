package typings.googleapis.slidesV1Mod.slidesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Resource$Presentations$Pages")
@js.native
class ResourcePresentationsPages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * slides.presentations.pages.get
    * @desc Gets the latest version of the specified page in the presentation.
    * @alias slides.presentations.pages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.pageObjectId The object ID of the page to retrieve.
    * @param {string} params.presentationId The ID of the presentation to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPage] = js.native
  def get(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePresentationsPagesGet): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePresentationsPagesGet, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(
    params: ParamsResourcePresentationsPagesGet,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def get(params: ParamsResourcePresentationsPagesGet, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(
    params: ParamsResourcePresentationsPagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  
  /**
    * slides.presentations.pages.getThumbnail
    * @desc Generates a thumbnail of the latest version of the specified page
    * in the presentation and returns a URL to the thumbnail image.  This
    * request counts as an [expensive read request](/slides/limits) for quota
    * purposes.
    * @alias slides.presentations.pages.getThumbnail
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.pageObjectId The object ID of the page whose thumbnail to retrieve.
    * @param {string} params.presentationId The ID of the presentation to retrieve.
    * @param {string=} params.thumbnailProperties.mimeType The optional mime type of the thumbnail image.  If you don't specify the mime type, the default mime type will be PNG.
    * @param {string=} params.thumbnailProperties.thumbnailSize The optional thumbnail image size.  If you don't specify the size, the server chooses a default size of the image.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getThumbnail(): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(callback: BodyResponseCallback[SchemaThumbnail]): Unit = js.native
  def getThumbnail(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(params: ParamsResourcePresentationsPagesGetthumbnail): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    callback: BodyResponseCallback[SchemaThumbnail]
  ): Unit = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    options: BodyResponseCallback[SchemaThumbnail],
    callback: BodyResponseCallback[SchemaThumbnail]
  ): Unit = js.native
  def getThumbnail(params: ParamsResourcePresentationsPagesGetthumbnail, options: MethodOptions): GaxiosPromise[SchemaThumbnail] = js.native
  def getThumbnail(
    params: ParamsResourcePresentationsPagesGetthumbnail,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThumbnail]
  ): Unit = js.native
}
