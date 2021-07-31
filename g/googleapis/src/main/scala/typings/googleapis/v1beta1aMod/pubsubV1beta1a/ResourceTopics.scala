package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1beta1a", "pubsub_v1beta1a.Resource$Topics")
@js.native
class ResourceTopics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * pubsub.topics.create
    * @desc Creates the given topic with the given name.
    * @alias pubsub.topics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Topic} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTopic] = js.native
  def create(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceTopicsCreate): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceTopicsCreate, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(
    params: ParamsResourceTopicsCreate,
    options: BodyResponseCallback[SchemaTopic],
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  def create(params: ParamsResourceTopicsCreate, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(
    params: ParamsResourceTopicsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  
  /**
    * pubsub.topics.delete
    * @desc Deletes the topic with the given name. Returns NOT_FOUND if the
    * topic does not exist. After a topic is deleted, a new topic may be
    * created with the same name.
    * @alias pubsub.topics.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic Name of the topic to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceTopicsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceTopicsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceTopicsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceTopicsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceTopicsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * pubsub.topics.get
    * @desc Gets the configuration of a topic. Since the topic only has the
    * name attribute, this method is only useful to check the existence of a
    * topic. If other attributes are added in the future, they will be returned
    * here.
    * @alias pubsub.topics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic The name of the topic to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTopic] = js.native
  def get(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceTopicsGet): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceTopicsGet, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(
    params: ParamsResourceTopicsGet,
    options: BodyResponseCallback[SchemaTopic],
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  def get(params: ParamsResourceTopicsGet, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(
    params: ParamsResourceTopicsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  
  /**
    * pubsub.topics.list
    * @desc Lists matching topics.
    * @alias pubsub.topics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of topics to return.
    * @param {string=} params.pageToken The value obtained in the last <code>ListTopicsResponse</code> for continuation.
    * @param {string=} params.query A valid label query expression.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(params: ParamsResourceTopicsList): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(params: ParamsResourceTopicsList, callback: BodyResponseCallback[SchemaListTopicsResponse]): Unit = js.native
  def list(
    params: ParamsResourceTopicsList,
    options: BodyResponseCallback[SchemaListTopicsResponse],
    callback: BodyResponseCallback[SchemaListTopicsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTopicsList, options: MethodOptions): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(
    params: ParamsResourceTopicsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicsResponse]
  ): Unit = js.native
  
  /**
    * pubsub.topics.publish
    * @desc Adds a message to the topic.  Returns NOT_FOUND if the topic does
    * not exist.
    * @alias pubsub.topics.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PublishRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[SchemaEmpty] = js.native
  def publish(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def publish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def publish(params: ParamsResourceTopicsPublish): GaxiosPromise[SchemaEmpty] = js.native
  def publish(params: ParamsResourceTopicsPublish, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def publish(
    params: ParamsResourceTopicsPublish,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def publish(params: ParamsResourceTopicsPublish, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def publish(
    params: ParamsResourceTopicsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * pubsub.topics.publishBatch
    * @desc Adds one or more messages to the topic. Returns NOT_FOUND if the
    * topic does not exist.
    * @alias pubsub.topics.publishBatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PublishBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publishBatch(): GaxiosPromise[SchemaPublishBatchResponse] = js.native
  def publishBatch(callback: BodyResponseCallback[SchemaPublishBatchResponse]): Unit = js.native
  def publishBatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublishBatchResponse] = js.native
  def publishBatch(params: ParamsResourceTopicsPublishbatch): GaxiosPromise[SchemaPublishBatchResponse] = js.native
  def publishBatch(
    params: ParamsResourceTopicsPublishbatch,
    callback: BodyResponseCallback[SchemaPublishBatchResponse]
  ): Unit = js.native
  def publishBatch(
    params: ParamsResourceTopicsPublishbatch,
    options: BodyResponseCallback[SchemaPublishBatchResponse],
    callback: BodyResponseCallback[SchemaPublishBatchResponse]
  ): Unit = js.native
  def publishBatch(params: ParamsResourceTopicsPublishbatch, options: MethodOptions): GaxiosPromise[SchemaPublishBatchResponse] = js.native
  def publishBatch(
    params: ParamsResourceTopicsPublishbatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublishBatchResponse]
  ): Unit = js.native
}
