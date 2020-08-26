package typings.googleapis.languageV1beta2Mod.languageV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/language/v1beta2", "language_v1beta2.Resource$Documents")
@js.native
class ResourceDocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * language.documents.analyzeEntities
    * @desc Finds named entities (currently proper names and common nouns) in
    * the text along with entity types, salience, mentions for each entity, and
    * other properties.
    * @alias language.documents.analyzeEntities
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeEntities(): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]): Unit = js.native
  def analyzeEntities(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(params: ParamsResourceDocumentsAnalyzeentities): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    options: BodyResponseCallback[SchemaAnalyzeEntitiesResponse],
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(params: ParamsResourceDocumentsAnalyzeentities, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsResourceDocumentsAnalyzeentities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  /**
    * language.documents.analyzeEntitySentiment
    * @desc Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    * @alias language.documents.analyzeEntitySentiment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeEntitySentimentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeEntitySentiment(): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]): Unit = js.native
  def analyzeEntitySentiment(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(params: ParamsResourceDocumentsAnalyzeentitysentiment): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]
  ): Unit = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    options: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse],
    callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]
  ): Unit = js.native
  def analyzeEntitySentiment(params: ParamsResourceDocumentsAnalyzeentitysentiment, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitySentimentResponse] = js.native
  def analyzeEntitySentiment(
    params: ParamsResourceDocumentsAnalyzeentitysentiment,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeEntitySentimentResponse]
  ): Unit = js.native
  /**
    * language.documents.analyzeSentiment
    * @desc Analyzes the sentiment of the provided text.
    * @alias language.documents.analyzeSentiment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeSentimentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeSentiment(): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]): Unit = js.native
  def analyzeSentiment(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(params: ParamsResourceDocumentsAnalyzesentiment): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]
  ): Unit = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    options: BodyResponseCallback[SchemaAnalyzeSentimentResponse],
    callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]
  ): Unit = js.native
  def analyzeSentiment(params: ParamsResourceDocumentsAnalyzesentiment, options: MethodOptions): GaxiosPromise[SchemaAnalyzeSentimentResponse] = js.native
  def analyzeSentiment(
    params: ParamsResourceDocumentsAnalyzesentiment,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeSentimentResponse]
  ): Unit = js.native
  /**
    * language.documents.analyzeSyntax
    * @desc Analyzes the syntax of the text and provides sentence boundaries
    * and tokenization along with part of speech tags, dependency trees, and
    * other properties.
    * @alias language.documents.analyzeSyntax
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeSyntaxRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeSyntax(): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]): Unit = js.native
  def analyzeSyntax(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(params: ParamsResourceDocumentsAnalyzesyntax): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]
  ): Unit = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    options: BodyResponseCallback[SchemaAnalyzeSyntaxResponse],
    callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]
  ): Unit = js.native
  def analyzeSyntax(params: ParamsResourceDocumentsAnalyzesyntax, options: MethodOptions): GaxiosPromise[SchemaAnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(
    params: ParamsResourceDocumentsAnalyzesyntax,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeSyntaxResponse]
  ): Unit = js.native
  /**
    * language.documents.annotateText
    * @desc A convenience method that provides all syntax, sentiment, entity,
    * and classification features in one call.
    * @alias language.documents.annotateText
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnnotateTextRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotateText(): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(callback: BodyResponseCallback[SchemaAnnotateTextResponse]): Unit = js.native
  def annotateText(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(params: ParamsResourceDocumentsAnnotatetext): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    callback: BodyResponseCallback[SchemaAnnotateTextResponse]
  ): Unit = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    options: BodyResponseCallback[SchemaAnnotateTextResponse],
    callback: BodyResponseCallback[SchemaAnnotateTextResponse]
  ): Unit = js.native
  def annotateText(params: ParamsResourceDocumentsAnnotatetext, options: MethodOptions): GaxiosPromise[SchemaAnnotateTextResponse] = js.native
  def annotateText(
    params: ParamsResourceDocumentsAnnotatetext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotateTextResponse]
  ): Unit = js.native
  /**
    * language.documents.classifyText
    * @desc Classifies a document into categories.
    * @alias language.documents.classifyText
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ClassifyTextRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def classifyText(): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(callback: BodyResponseCallback[SchemaClassifyTextResponse]): Unit = js.native
  def classifyText(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(params: ParamsResourceDocumentsClassifytext): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    callback: BodyResponseCallback[SchemaClassifyTextResponse]
  ): Unit = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    options: BodyResponseCallback[SchemaClassifyTextResponse],
    callback: BodyResponseCallback[SchemaClassifyTextResponse]
  ): Unit = js.native
  def classifyText(params: ParamsResourceDocumentsClassifytext, options: MethodOptions): GaxiosPromise[SchemaClassifyTextResponse] = js.native
  def classifyText(
    params: ParamsResourceDocumentsClassifytext,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClassifyTextResponse]
  ): Unit = js.native
}

