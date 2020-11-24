package typings.googleapis.slidesV1Mod.slidesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/slides/v1", "slides_v1.Resource$Presentations")
@js.native
class ResourcePresentations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * slides.presentations.batchUpdate
    * @desc Applies one or more updates to the presentation.  Each request is
    * validated before being applied. If any request is not valid, then the
    * entire request will fail and nothing will be applied.  Some requests have
    * replies to give you some information about how they are applied. Other
    * requests do not need to return information; these each return an empty
    * reply. The order of replies matches that of the requests.  For example,
    * suppose you call batchUpdate with four updates, and only the third one
    * returns information. The response would have two empty replies: the reply
    * to the third request, and another empty reply, in that order.  Because
    * other users may be editing the presentation, the presentation might not
    * exactly reflect your changes: your changes may be altered with respect to
    * collaborator changes. If there are no collaborators, the presentation
    * should reflect your changes. In any case, the updates in your request are
    * guaranteed to be applied together atomically.
    * @alias slides.presentations.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.presentationId The presentation to apply the updates to.
    * @param {().BatchUpdatePresentationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]): Unit = js.native
  def batchUpdate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(params: ParamsResourcePresentationsBatchupdate): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    options: BodyResponseCallback[SchemaBatchUpdatePresentationResponse],
    callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourcePresentationsBatchupdate, options: MethodOptions): GaxiosPromise[SchemaBatchUpdatePresentationResponse] = js.native
  def batchUpdate(
    params: ParamsResourcePresentationsBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdatePresentationResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * slides.presentations.create
    * @desc Creates a blank presentation using the title given in the request.
    * If a `presentationId` is provided, it is used as the ID of the new
    * presentation. Otherwise, a new ID is generated. Other fields in the
    * request, including any provided content, are ignored. Returns the created
    * presentation.
    * @alias slides.presentations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Presentation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaPresentation] = js.native
  def create(callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def create(params: ParamsResourcePresentationsCreate): GaxiosPromise[SchemaPresentation] = js.native
  def create(params: ParamsResourcePresentationsCreate, callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def create(
    params: ParamsResourcePresentationsCreate,
    options: BodyResponseCallback[SchemaPresentation],
    callback: BodyResponseCallback[SchemaPresentation]
  ): Unit = js.native
  def create(params: ParamsResourcePresentationsCreate, options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def create(
    params: ParamsResourcePresentationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPresentation]
  ): Unit = js.native
  
  /**
    * slides.presentations.get
    * @desc Gets the latest version of the specified presentation.
    * @alias slides.presentations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.presentationId The ID of the presentation to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPresentation] = js.native
  def get(callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def get(params: ParamsResourcePresentationsGet): GaxiosPromise[SchemaPresentation] = js.native
  def get(params: ParamsResourcePresentationsGet, callback: BodyResponseCallback[SchemaPresentation]): Unit = js.native
  def get(
    params: ParamsResourcePresentationsGet,
    options: BodyResponseCallback[SchemaPresentation],
    callback: BodyResponseCallback[SchemaPresentation]
  ): Unit = js.native
  def get(params: ParamsResourcePresentationsGet, options: MethodOptions): GaxiosPromise[SchemaPresentation] = js.native
  def get(
    params: ParamsResourcePresentationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPresentation]
  ): Unit = js.native
  
  var pages: ResourcePresentationsPages = js.native
}
