package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var releases: ResourceProjectsReleases = js.native
  var rulesets: ResourceProjectsRulesets = js.native
  /**
    * firebaserules.projects.test
    * @desc Test `Source` for syntactic and semantic correctness. Issues
    * present, if any, will be returned to the caller with a description,
    * severity, and source location.  The test method may be executed with
    * `Source` or a `Ruleset` name. Passing `Source` is useful for unit testing
    * new rules. Passing a `Ruleset` name is useful for regression testing an
    * existing rule.  The following is an example of `Source` that permits
    * users to upload images to a bucket bearing their user id and matching the
    * correct metadata:  _*Example*_      // Users are allowed to subscribe and
    * unsubscribe to the blog.     service firebase.storage {       match
    * /users/{userId}/images/{imageName} {           allow write: if userId ==
    * request.auth.uid               && (imageName.matches('*.png$') ||
    * imageName.matches('*.jpg$'))               &&
    * resource.mimeType.matches('^image/')       }     }
    * @alias firebaserules.projects.test
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Tests may either provide `source` or a `Ruleset` resource name.  For tests against `source`, the resource name must refer to the project: Format: `projects/{project_id}`  For tests against a `Ruleset`, this must be the `Ruleset` resource name: Format: `projects/{project_id}/rulesets/{ruleset_id}`
    * @param {().TestRulesetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def test(): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(callback: BodyResponseCallback[SchemaTestRulesetResponse]): Unit = js.native
  def test(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(params: ParamsResourceProjectsTest): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(params: ParamsResourceProjectsTest, callback: BodyResponseCallback[SchemaTestRulesetResponse]): Unit = js.native
  def test(
    params: ParamsResourceProjectsTest,
    options: BodyResponseCallback[SchemaTestRulesetResponse],
    callback: BodyResponseCallback[SchemaTestRulesetResponse]
  ): Unit = js.native
  def test(params: ParamsResourceProjectsTest, options: MethodOptions): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(
    params: ParamsResourceProjectsTest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestRulesetResponse]
  ): Unit = js.native
}

