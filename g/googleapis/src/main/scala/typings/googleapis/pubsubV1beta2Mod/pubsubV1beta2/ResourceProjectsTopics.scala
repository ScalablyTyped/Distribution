package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1beta2", "pubsub_v1beta2.Resource$Projects$Topics")
@js.native
class ResourceProjectsTopics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * pubsub.projects.topics.create
    * @desc Creates the given topic with the given name.
    * @alias pubsub.projects.topics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    * @param {().Topic} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTopic] = js.native
  def create(callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceProjectsTopicsCreate): GaxiosPromise[SchemaTopic] = js.native
  def create(params: ParamsResourceProjectsTopicsCreate, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTopicsCreate,
    options: BodyResponseCallback[SchemaTopic],
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTopicsCreate, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def create(
    params: ParamsResourceProjectsTopicsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  
  /**
    * pubsub.projects.topics.delete
    * @desc Deletes the topic with the given name. Returns `NOT_FOUND` if the
    * topic does not exist. After a topic is deleted, a new topic may be
    * created with the same name; this is an entirely new topic with none of
    * the old configuration or subscriptions. Existing subscriptions to this
    * topic are not deleted, but their `topic` field is set to
    * `_deleted-topic_`.
    * @alias pubsub.projects.topics.delete
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
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTopicsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTopicsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTopicsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTopicsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTopicsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * pubsub.projects.topics.get
    * @desc Gets the configuration of a topic.
    * @alias pubsub.projects.topics.get
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
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceProjectsTopicsGet): GaxiosPromise[SchemaTopic] = js.native
  def get(params: ParamsResourceProjectsTopicsGet, callback: BodyResponseCallback[SchemaTopic]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTopicsGet,
    options: BodyResponseCallback[SchemaTopic],
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTopicsGet, options: MethodOptions): GaxiosPromise[SchemaTopic] = js.native
  def get(
    params: ParamsResourceProjectsTopicsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTopic]
  ): Unit = js.native
  
  /**
    * pubsub.projects.topics.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias pubsub.projects.topics.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsTopicsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsTopicsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsTopicsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsTopicsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsTopicsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * pubsub.projects.topics.list
    * @desc Lists matching topics.
    * @alias pubsub.projects.topics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of topics to return.
    * @param {string=} params.pageToken The value returned by the last `ListTopicsResponse`; indicates that this is a continuation of a prior `ListTopics` call, and that the system should return the next page of data.
    * @param {string} params.project The name of the cloud project that topics belong to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(params: ParamsResourceProjectsTopicsList): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(params: ParamsResourceProjectsTopicsList, callback: BodyResponseCallback[SchemaListTopicsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsTopicsList,
    options: BodyResponseCallback[SchemaListTopicsResponse],
    callback: BodyResponseCallback[SchemaListTopicsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsList, options: MethodOptions): GaxiosPromise[SchemaListTopicsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicsResponse]
  ): Unit = js.native
  
  /**
    * pubsub.projects.topics.publish
    * @desc Adds one or more messages to the topic. Returns `NOT_FOUND` if the
    * topic does not exist. The message payload must not be empty; it must
    * contain  either a non-empty data field, or at least one attribute.
    * @alias pubsub.projects.topics.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic The messages in the request will be published on this topic.
    * @param {().PublishRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[SchemaPublishResponse] = js.native
  def publish(callback: BodyResponseCallback[SchemaPublishResponse]): Unit = js.native
  def publish(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPublishResponse] = js.native
  def publish(params: ParamsResourceProjectsTopicsPublish): GaxiosPromise[SchemaPublishResponse] = js.native
  def publish(params: ParamsResourceProjectsTopicsPublish, callback: BodyResponseCallback[SchemaPublishResponse]): Unit = js.native
  def publish(
    params: ParamsResourceProjectsTopicsPublish,
    options: BodyResponseCallback[SchemaPublishResponse],
    callback: BodyResponseCallback[SchemaPublishResponse]
  ): Unit = js.native
  def publish(params: ParamsResourceProjectsTopicsPublish, options: MethodOptions): GaxiosPromise[SchemaPublishResponse] = js.native
  def publish(
    params: ParamsResourceProjectsTopicsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublishResponse]
  ): Unit = js.native
  
  /**
    * pubsub.projects.topics.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias pubsub.projects.topics.setIamPolicy
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
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsTopicsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsTopicsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsTopicsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsTopicsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsTopicsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  var subscriptions: ResourceProjectsTopicsSubscriptions = js.native
  
  /**
    * pubsub.projects.topics.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias pubsub.projects.topics.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsTopicsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsTopicsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsTopicsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsTopicsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsTopicsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
