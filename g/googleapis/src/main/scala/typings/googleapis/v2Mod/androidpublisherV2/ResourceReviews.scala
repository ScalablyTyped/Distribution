package typings.googleapis.v2Mod.androidpublisherV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Reviews")
@js.native
class ResourceReviews protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androidpublisher.reviews.get
    * @desc Returns a single review.
    * @alias androidpublisher.reviews.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName Unique identifier for the Android app for which we want reviews; for example, "com.spiffygame".
    * @param {string} params.reviewId
    * @param {string=} params.translationLanguage
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaReview] = js.native
  def get(callback: BodyResponseCallback[SchemaReview]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReview] = js.native
  def get(params: ParamsResourceReviewsGet): GaxiosPromise[SchemaReview] = js.native
  def get(params: ParamsResourceReviewsGet, callback: BodyResponseCallback[SchemaReview]): Unit = js.native
  def get(
    params: ParamsResourceReviewsGet,
    options: BodyResponseCallback[SchemaReview],
    callback: BodyResponseCallback[SchemaReview]
  ): Unit = js.native
  def get(params: ParamsResourceReviewsGet, options: MethodOptions): GaxiosPromise[SchemaReview] = js.native
  def get(
    params: ParamsResourceReviewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReview]
  ): Unit = js.native
  
  /**
    * androidpublisher.reviews.list
    * @desc Returns a list of reviews. Only reviews from last week will be
    * returned.
    * @alias androidpublisher.reviews.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {string} params.packageName Unique identifier for the Android app for which we want reviews; for example, "com.spiffygame".
    * @param {integer=} params.startIndex
    * @param {string=} params.token
    * @param {string=} params.translationLanguage
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaReviewsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(params: ParamsResourceReviewsList): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(params: ParamsResourceReviewsList, callback: BodyResponseCallback[SchemaReviewsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceReviewsList,
    options: BodyResponseCallback[SchemaReviewsListResponse],
    callback: BodyResponseCallback[SchemaReviewsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReviewsList, options: MethodOptions): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(
    params: ParamsResourceReviewsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReviewsListResponse]
  ): Unit = js.native
  
  /**
    * androidpublisher.reviews.reply
    * @desc Reply to a single review, or update an existing reply.
    * @alias androidpublisher.reviews.reply
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName Unique identifier for the Android app for which we want reviews; for example, "com.spiffygame".
    * @param {string} params.reviewId
    * @param {().ReviewsReplyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reply(): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(callback: BodyResponseCallback[SchemaReviewsReplyResponse]): Unit = js.native
  def reply(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(params: ParamsResourceReviewsReply): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(params: ParamsResourceReviewsReply, callback: BodyResponseCallback[SchemaReviewsReplyResponse]): Unit = js.native
  def reply(
    params: ParamsResourceReviewsReply,
    options: BodyResponseCallback[SchemaReviewsReplyResponse],
    callback: BodyResponseCallback[SchemaReviewsReplyResponse]
  ): Unit = js.native
  def reply(params: ParamsResourceReviewsReply, options: MethodOptions): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(
    params: ParamsResourceReviewsReply,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReviewsReplyResponse]
  ): Unit = js.native
}
