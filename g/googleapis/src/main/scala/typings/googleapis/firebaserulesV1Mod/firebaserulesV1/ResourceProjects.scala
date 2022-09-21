package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var releases: ResourceProjectsReleases = js.native
  
  var rulesets: ResourceProjectsRulesets = js.native
  
  def test(): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(callback: BodyResponseCallback[SchemaTestRulesetResponse]): Unit = js.native
  def test(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(params: ParamsResourceProjectsTest): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(params: ParamsResourceProjectsTest, callback: BodyResponseCallback[SchemaTestRulesetResponse]): Unit = js.native
  def test(
    params: ParamsResourceProjectsTest,
    options: BodyResponseCallback[Readable | SchemaTestRulesetResponse],
    callback: BodyResponseCallback[Readable | SchemaTestRulesetResponse]
  ): Unit = js.native
  def test(params: ParamsResourceProjectsTest, options: MethodOptions): GaxiosPromise[SchemaTestRulesetResponse] = js.native
  def test(
    params: ParamsResourceProjectsTest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestRulesetResponse]
  ): Unit = js.native
  /**
    * Test `Source` for syntactic and semantic correctness. Issues present, if any, will be returned to the caller with a description, severity, and source location. The test method may be executed with `Source` or a `Ruleset` name. Passing `Source` is useful for unit testing new rules. Passing a `Ruleset` name is useful for regression testing an existing rule. The following is an example of `Source` that permits users to upload images to a bucket bearing their user id and matching the correct metadata: _*Example*_ // Users are allowed to subscribe and unsubscribe to the blog. service firebase.storage { match /users/{userId\}/images/{imageName\} { allow write: if userId == request.auth.uid && (imageName.matches('*.png$') || imageName.matches('*.jpg$')) && resource.mimeType.matches('^image/') \} \}
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaserules.projects.test({
    *     // Required. Tests may either provide `source` or a `Ruleset` resource name. For tests against `source`, the resource name must refer to the project: Format: `projects/{project_id\}` For tests against a `Ruleset`, this must be the `Ruleset` resource name: Format: `projects/{project_id\}/rulesets/{ruleset_id\}`
    *     name: 'projects/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "source": {},
    *       //   "testSuite": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "issues": [],
    *   //   "testResults": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def test(params: ParamsResourceProjectsTest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def test(
    params: ParamsResourceProjectsTest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
