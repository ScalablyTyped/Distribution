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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings")
@js.native
open class ResourceUsersSettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var delegates: ResourceUsersSettingsDelegates = js.native
  
  var filters: ResourceUsersSettingsFilters = js.native
  
  var forwardingAddresses: ResourceUsersSettingsForwardingaddresses = js.native
  
  def getAutoForwarding(): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(callback: BodyResponseCallback[SchemaAutoForwarding]): Unit = js.native
  def getAutoForwarding(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(params: ParamsResourceUsersSettingsGetautoforwarding): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    options: BodyResponseCallback[Readable | SchemaAutoForwarding],
    callback: BodyResponseCallback[Readable | SchemaAutoForwarding]
  ): Unit = js.native
  def getAutoForwarding(params: ParamsResourceUsersSettingsGetautoforwarding, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  /**
    * Gets the auto-forwarding setting for the specified account.
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
    *   const res = await gmail.users.settings.getAutoForwarding({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disposition": "my_disposition",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "enabled": false
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
  def getAutoForwarding(params: ParamsResourceUsersSettingsGetautoforwarding, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAutoForwarding(
    params: ParamsResourceUsersSettingsGetautoforwarding,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getImap(): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def getImap(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(params: ParamsResourceUsersSettingsGetimap): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(params: ParamsResourceUsersSettingsGetimap, callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def getImap(
    params: ParamsResourceUsersSettingsGetimap,
    options: BodyResponseCallback[Readable | SchemaImapSettings],
    callback: BodyResponseCallback[Readable | SchemaImapSettings]
  ): Unit = js.native
  def getImap(params: ParamsResourceUsersSettingsGetimap, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def getImap(
    params: ParamsResourceUsersSettingsGetimap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImapSettings]
  ): Unit = js.native
  /**
    * Gets IMAP settings.
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
    *   const res = await gmail.users.settings.getImap({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpunge": false,
    *   //   "enabled": false,
    *   //   "expungeBehavior": "my_expungeBehavior",
    *   //   "maxFolderSize": 0
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
  def getImap(params: ParamsResourceUsersSettingsGetimap, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getImap(
    params: ParamsResourceUsersSettingsGetimap,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getLanguage(): GaxiosPromise[SchemaLanguageSettings] = js.native
  def getLanguage(callback: BodyResponseCallback[SchemaLanguageSettings]): Unit = js.native
  def getLanguage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLanguageSettings] = js.native
  def getLanguage(params: ParamsResourceUsersSettingsGetlanguage): GaxiosPromise[SchemaLanguageSettings] = js.native
  def getLanguage(
    params: ParamsResourceUsersSettingsGetlanguage,
    callback: BodyResponseCallback[SchemaLanguageSettings]
  ): Unit = js.native
  def getLanguage(
    params: ParamsResourceUsersSettingsGetlanguage,
    options: BodyResponseCallback[Readable | SchemaLanguageSettings],
    callback: BodyResponseCallback[Readable | SchemaLanguageSettings]
  ): Unit = js.native
  def getLanguage(params: ParamsResourceUsersSettingsGetlanguage, options: MethodOptions): GaxiosPromise[SchemaLanguageSettings] = js.native
  def getLanguage(
    params: ParamsResourceUsersSettingsGetlanguage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLanguageSettings]
  ): Unit = js.native
  /**
    * Gets language settings.
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
    *   const res = await gmail.users.settings.getLanguage({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayLanguage": "my_displayLanguage"
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
  def getLanguage(params: ParamsResourceUsersSettingsGetlanguage, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getLanguage(
    params: ParamsResourceUsersSettingsGetlanguage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getPop(): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def getPop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(params: ParamsResourceUsersSettingsGetpop): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(params: ParamsResourceUsersSettingsGetpop, callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def getPop(
    params: ParamsResourceUsersSettingsGetpop,
    options: BodyResponseCallback[Readable | SchemaPopSettings],
    callback: BodyResponseCallback[Readable | SchemaPopSettings]
  ): Unit = js.native
  def getPop(params: ParamsResourceUsersSettingsGetpop, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def getPop(
    params: ParamsResourceUsersSettingsGetpop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPopSettings]
  ): Unit = js.native
  /**
    * Gets POP settings.
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
    *   const res = await gmail.users.settings.getPop({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessWindow": "my_accessWindow",
    *   //   "disposition": "my_disposition"
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
  def getPop(params: ParamsResourceUsersSettingsGetpop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getPop(
    params: ParamsResourceUsersSettingsGetpop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVacation(): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(callback: BodyResponseCallback[SchemaVacationSettings]): Unit = js.native
  def getVacation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(params: ParamsResourceUsersSettingsGetvacation): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    options: BodyResponseCallback[Readable | SchemaVacationSettings],
    callback: BodyResponseCallback[Readable | SchemaVacationSettings]
  ): Unit = js.native
  def getVacation(params: ParamsResourceUsersSettingsGetvacation, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  /**
    * Gets vacation responder settings.
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
    *   const res = await gmail.users.settings.getVacation({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enableAutoReply": false,
    *   //   "endTime": "my_endTime",
    *   //   "responseBodyHtml": "my_responseBodyHtml",
    *   //   "responseBodyPlainText": "my_responseBodyPlainText",
    *   //   "responseSubject": "my_responseSubject",
    *   //   "restrictToContacts": false,
    *   //   "restrictToDomain": false,
    *   //   "startTime": "my_startTime"
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
  def getVacation(params: ParamsResourceUsersSettingsGetvacation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getVacation(
    params: ParamsResourceUsersSettingsGetvacation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sendAs: ResourceUsersSettingsSendas = js.native
  
  def updateAutoForwarding(): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(callback: BodyResponseCallback[SchemaAutoForwarding]): Unit = js.native
  def updateAutoForwarding(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(params: ParamsResourceUsersSettingsUpdateautoforwarding): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    options: BodyResponseCallback[Readable | SchemaAutoForwarding],
    callback: BodyResponseCallback[Readable | SchemaAutoForwarding]
  ): Unit = js.native
  def updateAutoForwarding(params: ParamsResourceUsersSettingsUpdateautoforwarding, options: MethodOptions): GaxiosPromise[SchemaAutoForwarding] = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoForwarding]
  ): Unit = js.native
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled. This method is only available to service account clients that have been delegated domain-wide authority.
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
    *   const res = await gmail.users.settings.updateAutoForwarding({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disposition": "my_disposition",
    *       //   "emailAddress": "my_emailAddress",
    *       //   "enabled": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "disposition": "my_disposition",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "enabled": false
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
  def updateAutoForwarding(params: ParamsResourceUsersSettingsUpdateautoforwarding, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateAutoForwarding(
    params: ParamsResourceUsersSettingsUpdateautoforwarding,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateImap(): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def updateImap(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap, callback: BodyResponseCallback[SchemaImapSettings]): Unit = js.native
  def updateImap(
    params: ParamsResourceUsersSettingsUpdateimap,
    options: BodyResponseCallback[Readable | SchemaImapSettings],
    callback: BodyResponseCallback[Readable | SchemaImapSettings]
  ): Unit = js.native
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap, options: MethodOptions): GaxiosPromise[SchemaImapSettings] = js.native
  def updateImap(
    params: ParamsResourceUsersSettingsUpdateimap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImapSettings]
  ): Unit = js.native
  /**
    * Updates IMAP settings.
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
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.basic'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.updateImap({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "autoExpunge": false,
    *       //   "enabled": false,
    *       //   "expungeBehavior": "my_expungeBehavior",
    *       //   "maxFolderSize": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "autoExpunge": false,
    *   //   "enabled": false,
    *   //   "expungeBehavior": "my_expungeBehavior",
    *   //   "maxFolderSize": 0
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
  def updateImap(params: ParamsResourceUsersSettingsUpdateimap, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateImap(
    params: ParamsResourceUsersSettingsUpdateimap,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateLanguage(): GaxiosPromise[SchemaLanguageSettings] = js.native
  def updateLanguage(callback: BodyResponseCallback[SchemaLanguageSettings]): Unit = js.native
  def updateLanguage(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLanguageSettings] = js.native
  def updateLanguage(params: ParamsResourceUsersSettingsUpdatelanguage): GaxiosPromise[SchemaLanguageSettings] = js.native
  def updateLanguage(
    params: ParamsResourceUsersSettingsUpdatelanguage,
    callback: BodyResponseCallback[SchemaLanguageSettings]
  ): Unit = js.native
  def updateLanguage(
    params: ParamsResourceUsersSettingsUpdatelanguage,
    options: BodyResponseCallback[Readable | SchemaLanguageSettings],
    callback: BodyResponseCallback[Readable | SchemaLanguageSettings]
  ): Unit = js.native
  def updateLanguage(params: ParamsResourceUsersSettingsUpdatelanguage, options: MethodOptions): GaxiosPromise[SchemaLanguageSettings] = js.native
  def updateLanguage(
    params: ParamsResourceUsersSettingsUpdatelanguage,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLanguageSettings]
  ): Unit = js.native
  /**
    * Updates language settings. If successful, the return object contains the `displayLanguage` that was saved for the user, which may differ from the value passed into the request. This is because the requested `displayLanguage` may not be directly supported by Gmail but have a close variant that is, and so the variant may be chosen and saved instead.
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
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.basic'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.updateLanguage({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayLanguage": "my_displayLanguage"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayLanguage": "my_displayLanguage"
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
  def updateLanguage(params: ParamsResourceUsersSettingsUpdatelanguage, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateLanguage(
    params: ParamsResourceUsersSettingsUpdatelanguage,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updatePop(): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def updatePop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop, callback: BodyResponseCallback[SchemaPopSettings]): Unit = js.native
  def updatePop(
    params: ParamsResourceUsersSettingsUpdatepop,
    options: BodyResponseCallback[Readable | SchemaPopSettings],
    callback: BodyResponseCallback[Readable | SchemaPopSettings]
  ): Unit = js.native
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop, options: MethodOptions): GaxiosPromise[SchemaPopSettings] = js.native
  def updatePop(
    params: ParamsResourceUsersSettingsUpdatepop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPopSettings]
  ): Unit = js.native
  /**
    * Updates POP settings.
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
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.basic'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.updatePop({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessWindow": "my_accessWindow",
    *       //   "disposition": "my_disposition"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessWindow": "my_accessWindow",
    *   //   "disposition": "my_disposition"
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
  def updatePop(params: ParamsResourceUsersSettingsUpdatepop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updatePop(
    params: ParamsResourceUsersSettingsUpdatepop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateVacation(): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(callback: BodyResponseCallback[SchemaVacationSettings]): Unit = js.native
  def updateVacation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(params: ParamsResourceUsersSettingsUpdatevacation): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    options: BodyResponseCallback[Readable | SchemaVacationSettings],
    callback: BodyResponseCallback[Readable | SchemaVacationSettings]
  ): Unit = js.native
  def updateVacation(params: ParamsResourceUsersSettingsUpdatevacation, options: MethodOptions): GaxiosPromise[SchemaVacationSettings] = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVacationSettings]
  ): Unit = js.native
  /**
    * Updates vacation responder settings.
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
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.basic'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.updateVacation({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "enableAutoReply": false,
    *       //   "endTime": "my_endTime",
    *       //   "responseBodyHtml": "my_responseBodyHtml",
    *       //   "responseBodyPlainText": "my_responseBodyPlainText",
    *       //   "responseSubject": "my_responseSubject",
    *       //   "restrictToContacts": false,
    *       //   "restrictToDomain": false,
    *       //   "startTime": "my_startTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enableAutoReply": false,
    *   //   "endTime": "my_endTime",
    *   //   "responseBodyHtml": "my_responseBodyHtml",
    *   //   "responseBodyPlainText": "my_responseBodyPlainText",
    *   //   "responseSubject": "my_responseSubject",
    *   //   "restrictToContacts": false,
    *   //   "restrictToDomain": false,
    *   //   "startTime": "my_startTime"
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
  def updateVacation(params: ParamsResourceUsersSettingsUpdatevacation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateVacation(
    params: ParamsResourceUsersSettingsUpdatevacation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
