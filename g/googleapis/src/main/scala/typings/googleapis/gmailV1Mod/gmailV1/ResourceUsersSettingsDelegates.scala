package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Delegates")
@js.native
open class ResourceUsersSettingsDelegates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDelegate] = js.native
  def create(callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDelegate] = js.native
  def create(params: ParamsResourceUsersSettingsDelegatesCreate): GaxiosPromise[SchemaDelegate] = js.native
  def create(params: ParamsResourceUsersSettingsDelegatesCreate, callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsDelegatesCreate,
    options: BodyResponseCallback[Readable | SchemaDelegate],
    callback: BodyResponseCallback[Readable | SchemaDelegate]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsDelegatesCreate, options: MethodOptions): GaxiosPromise[SchemaDelegate] = js.native
  def create(
    params: ParamsResourceUsersSettingsDelegatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDelegate]
  ): Unit = js.native
  /**
    * Adds a delegate with its verification status set directly to `accepted`, without sending any verification email. The delegate user must be a member of the same G Suite organization as the delegator user. Gmail imposes limitations on the number of delegates and delegators each user in a G Suite organization can have. These limits depend on your organization, but in general each user can have up to 25 delegates and up to 10 delegators. Note that a delegate user must be referred to by their primary email address, and not an email alias. Also note that when a new delegate is created, there may be up to a one minute delay before the new delegate is available for use. This method is only available to service account clients that have been delegated domain-wide authority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.sharing'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.delegates.create({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "delegateEmail": "my_delegateEmail",
    *       //   "verificationStatus": "my_verificationStatus"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delegateEmail": "my_delegateEmail",
    *   //   "verificationStatus": "my_verificationStatus"
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
  def create(params: ParamsResourceUsersSettingsDelegatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersSettingsDelegatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsDelegatesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsDelegatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes the specified delegate (which can be of any verification status), and revokes any verification that may have been required for using it. Note that a delegate user must be referred to by their primary email address, and not an email alias. This method is only available to service account clients that have been delegated domain-wide authority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.sharing'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.delegates.delete({
    *     // The email address of the user to be removed as a delegate.
    *     delegateEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceUsersSettingsDelegatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSettingsDelegatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDelegate] = js.native
  def get(callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDelegate] = js.native
  def get(params: ParamsResourceUsersSettingsDelegatesGet): GaxiosPromise[SchemaDelegate] = js.native
  def get(params: ParamsResourceUsersSettingsDelegatesGet, callback: BodyResponseCallback[SchemaDelegate]): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsDelegatesGet,
    options: BodyResponseCallback[Readable | SchemaDelegate],
    callback: BodyResponseCallback[Readable | SchemaDelegate]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsDelegatesGet, options: MethodOptions): GaxiosPromise[SchemaDelegate] = js.native
  def get(
    params: ParamsResourceUsersSettingsDelegatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDelegate]
  ): Unit = js.native
  /**
    * Gets the specified delegate. Note that a delegate user must be referred to by their primary email address, and not an email alias. This method is only available to service account clients that have been delegated domain-wide authority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.delegates.get({
    *     // The email address of the user whose delegate relationship is to be retrieved.
    *     delegateEmail: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delegateEmail": "my_delegateEmail",
    *   //   "verificationStatus": "my_verificationStatus"
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
  def get(params: ParamsResourceUsersSettingsDelegatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersSettingsDelegatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDelegatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(params: ParamsResourceUsersSettingsDelegatesList): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    callback: BodyResponseCallback[SchemaListDelegatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    options: BodyResponseCallback[Readable | SchemaListDelegatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDelegatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsDelegatesList, options: MethodOptions): GaxiosPromise[SchemaListDelegatesResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDelegatesResponse]
  ): Unit = js.native
  /**
    * Lists the delegates for the specified account. This method is only available to service account clients that have been delegated domain-wide authority.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.delegates.list({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "delegates": []
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
  def list(params: ParamsResourceUsersSettingsDelegatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersSettingsDelegatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
