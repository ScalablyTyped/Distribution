package typings.googleapis.surveysV2Mod.surveysV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/surveys/v2", "surveys_v2.Resource$Surveys")
@js.native
class ResourceSurveys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * surveys.surveys.delete
    * @desc Removes a survey from view in all user GET requests.
    * @alias surveys.surveys.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaSurveysDeleteResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaSurveysDeleteResponse]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurveysDeleteResponse] = js.native
  def delete(params: ParamsResourceSurveysDelete): GaxiosPromise[SchemaSurveysDeleteResponse] = js.native
  def delete(params: ParamsResourceSurveysDelete, callback: BodyResponseCallback[SchemaSurveysDeleteResponse]): Unit = js.native
  def delete(
    params: ParamsResourceSurveysDelete,
    options: BodyResponseCallback[SchemaSurveysDeleteResponse],
    callback: BodyResponseCallback[SchemaSurveysDeleteResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceSurveysDelete, options: MethodOptions): GaxiosPromise[SchemaSurveysDeleteResponse] = js.native
  def delete(
    params: ParamsResourceSurveysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurveysDeleteResponse]
  ): Unit = js.native
  
  /**
    * surveys.surveys.get
    * @desc Retrieves information about the specified survey.
    * @alias surveys.surveys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSurvey] = js.native
  def get(callback: BodyResponseCallback[SchemaSurvey]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurvey] = js.native
  def get(params: ParamsResourceSurveysGet): GaxiosPromise[SchemaSurvey] = js.native
  def get(params: ParamsResourceSurveysGet, callback: BodyResponseCallback[SchemaSurvey]): Unit = js.native
  def get(
    params: ParamsResourceSurveysGet,
    options: BodyResponseCallback[SchemaSurvey],
    callback: BodyResponseCallback[SchemaSurvey]
  ): Unit = js.native
  def get(params: ParamsResourceSurveysGet, options: MethodOptions): GaxiosPromise[SchemaSurvey] = js.native
  def get(
    params: ParamsResourceSurveysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurvey]
  ): Unit = js.native
  
  /**
    * surveys.surveys.insert
    * @desc Creates a survey.
    * @alias surveys.surveys.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Survey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSurvey] = js.native
  def insert(callback: BodyResponseCallback[SchemaSurvey]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurvey] = js.native
  def insert(params: ParamsResourceSurveysInsert): GaxiosPromise[SchemaSurvey] = js.native
  def insert(params: ParamsResourceSurveysInsert, callback: BodyResponseCallback[SchemaSurvey]): Unit = js.native
  def insert(
    params: ParamsResourceSurveysInsert,
    options: BodyResponseCallback[SchemaSurvey],
    callback: BodyResponseCallback[SchemaSurvey]
  ): Unit = js.native
  def insert(params: ParamsResourceSurveysInsert, options: MethodOptions): GaxiosPromise[SchemaSurvey] = js.native
  def insert(
    params: ParamsResourceSurveysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurvey]
  ): Unit = js.native
  
  /**
    * surveys.surveys.list
    * @desc Lists the surveys owned by the authenticated user.
    * @alias surveys.surveys.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {integer=} params.startIndex
    * @param {string=} params.token
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSurveysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSurveysListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurveysListResponse] = js.native
  def list(params: ParamsResourceSurveysList): GaxiosPromise[SchemaSurveysListResponse] = js.native
  def list(params: ParamsResourceSurveysList, callback: BodyResponseCallback[SchemaSurveysListResponse]): Unit = js.native
  def list(
    params: ParamsResourceSurveysList,
    options: BodyResponseCallback[SchemaSurveysListResponse],
    callback: BodyResponseCallback[SchemaSurveysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSurveysList, options: MethodOptions): GaxiosPromise[SchemaSurveysListResponse] = js.native
  def list(
    params: ParamsResourceSurveysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurveysListResponse]
  ): Unit = js.native
  
  /**
    * surveys.surveys.start
    * @desc Begins running a survey.
    * @alias surveys.surveys.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceId
    * @param {().SurveysStartRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[SchemaSurveysStartResponse] = js.native
  def start(callback: BodyResponseCallback[SchemaSurveysStartResponse]): Unit = js.native
  def start(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurveysStartResponse] = js.native
  def start(params: ParamsResourceSurveysStart): GaxiosPromise[SchemaSurveysStartResponse] = js.native
  def start(params: ParamsResourceSurveysStart, callback: BodyResponseCallback[SchemaSurveysStartResponse]): Unit = js.native
  def start(
    params: ParamsResourceSurveysStart,
    options: BodyResponseCallback[SchemaSurveysStartResponse],
    callback: BodyResponseCallback[SchemaSurveysStartResponse]
  ): Unit = js.native
  def start(params: ParamsResourceSurveysStart, options: MethodOptions): GaxiosPromise[SchemaSurveysStartResponse] = js.native
  def start(
    params: ParamsResourceSurveysStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurveysStartResponse]
  ): Unit = js.native
  
  /**
    * surveys.surveys.stop
    * @desc Stops a running survey.
    * @alias surveys.surveys.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceId
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[SchemaSurveysStopResponse] = js.native
  def stop(callback: BodyResponseCallback[SchemaSurveysStopResponse]): Unit = js.native
  def stop(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurveysStopResponse] = js.native
  def stop(params: ParamsResourceSurveysStop): GaxiosPromise[SchemaSurveysStopResponse] = js.native
  def stop(params: ParamsResourceSurveysStop, callback: BodyResponseCallback[SchemaSurveysStopResponse]): Unit = js.native
  def stop(
    params: ParamsResourceSurveysStop,
    options: BodyResponseCallback[SchemaSurveysStopResponse],
    callback: BodyResponseCallback[SchemaSurveysStopResponse]
  ): Unit = js.native
  def stop(params: ParamsResourceSurveysStop, options: MethodOptions): GaxiosPromise[SchemaSurveysStopResponse] = js.native
  def stop(
    params: ParamsResourceSurveysStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurveysStopResponse]
  ): Unit = js.native
  
  /**
    * surveys.surveys.update
    * @desc Updates a survey. Currently the only property that can be updated
    * is the owners property.
    * @alias surveys.surveys.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.surveyUrlId External URL ID for the survey.
    * @param {().Survey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSurvey] = js.native
  def update(callback: BodyResponseCallback[SchemaSurvey]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSurvey] = js.native
  def update(params: ParamsResourceSurveysUpdate): GaxiosPromise[SchemaSurvey] = js.native
  def update(params: ParamsResourceSurveysUpdate, callback: BodyResponseCallback[SchemaSurvey]): Unit = js.native
  def update(
    params: ParamsResourceSurveysUpdate,
    options: BodyResponseCallback[SchemaSurvey],
    callback: BodyResponseCallback[SchemaSurvey]
  ): Unit = js.native
  def update(params: ParamsResourceSurveysUpdate, options: MethodOptions): GaxiosPromise[SchemaSurvey] = js.native
  def update(
    params: ParamsResourceSurveysUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSurvey]
  ): Unit = js.native
}
