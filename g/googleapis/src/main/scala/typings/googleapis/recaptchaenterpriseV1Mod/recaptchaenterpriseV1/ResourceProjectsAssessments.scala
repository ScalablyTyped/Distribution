package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/recaptchaenterprise/v1", "recaptchaenterprise_v1.Resource$Projects$Assessments")
@js.native
open class ResourceProjectsAssessments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def annotate(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse]): Unit = js.native
  def annotate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse] = js.native
  def annotate(params: ParamsResourceProjectsAssessmentsAnnotate): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse] = js.native
  def annotate(
    params: ParamsResourceProjectsAssessmentsAnnotate,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceProjectsAssessmentsAnnotate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse]
  ): Unit = js.native
  def annotate(params: ParamsResourceProjectsAssessmentsAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse] = js.native
  def annotate(
    params: ParamsResourceProjectsAssessmentsAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentResponse]
  ): Unit = js.native
  /**
    * Annotates a previously created Assessment to provide additional information on whether the event turned out to be authentic or fraudulent.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await recaptchaenterprise.projects.assessments.annotate({
    *     // Required. The resource name of the Assessment, in the format "projects/{project\}/assessments/{assessment\}".
    *     name: 'projects/my-project/assessments/my-assessment',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "annotation": "my_annotation",
    *       //   "hashedAccountId": "my_hashedAccountId",
    *       //   "reasons": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def annotate(params: ParamsResourceProjectsAssessmentsAnnotate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def annotate(
    params: ParamsResourceProjectsAssessmentsAnnotate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Assessment] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Assessment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Assessment] = js.native
  def create(params: ParamsResourceProjectsAssessmentsCreate): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Assessment] = js.native
  def create(
    params: ParamsResourceProjectsAssessmentsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Assessment]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsAssessmentsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Assessment],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRecaptchaenterpriseV1Assessment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsAssessmentsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRecaptchaenterpriseV1Assessment] = js.native
  def create(
    params: ParamsResourceProjectsAssessmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRecaptchaenterpriseV1Assessment]
  ): Unit = js.native
  /**
    * Creates an Assessment of the likelihood an event is legitimate.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/recaptchaenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const recaptchaenterprise = google.recaptchaenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await recaptchaenterprise.projects.assessments.create({
    *     // Required. The name of the project in which the assessment will be created, in the format "projects/{project\}".
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountDefenderAssessment": {},
    *       //   "event": {},
    *       //   "name": "my_name",
    *       //   "privatePasswordLeakVerification": {},
    *       //   "riskAnalysis": {},
    *       //   "tokenProperties": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountDefenderAssessment": {},
    *   //   "event": {},
    *   //   "name": "my_name",
    *   //   "privatePasswordLeakVerification": {},
    *   //   "riskAnalysis": {},
    *   //   "tokenProperties": {}
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
  def create(params: ParamsResourceProjectsAssessmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsAssessmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
