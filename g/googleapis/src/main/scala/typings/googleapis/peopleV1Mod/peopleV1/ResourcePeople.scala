package typings.googleapis.peopleV1Mod.peopleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.Resource$People")
@js.native
open class ResourcePeople protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreateContacts(): GaxiosPromise[SchemaBatchCreateContactsResponse] = js.native
  def batchCreateContacts(callback: BodyResponseCallback[SchemaBatchCreateContactsResponse]): Unit = js.native
  def batchCreateContacts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchCreateContactsResponse] = js.native
  def batchCreateContacts(params: ParamsResourcePeopleBatchcreatecontacts): GaxiosPromise[SchemaBatchCreateContactsResponse] = js.native
  def batchCreateContacts(
    params: ParamsResourcePeopleBatchcreatecontacts,
    callback: BodyResponseCallback[SchemaBatchCreateContactsResponse]
  ): Unit = js.native
  def batchCreateContacts(
    params: ParamsResourcePeopleBatchcreatecontacts,
    options: BodyResponseCallback[Readable | SchemaBatchCreateContactsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchCreateContactsResponse]
  ): Unit = js.native
  def batchCreateContacts(params: ParamsResourcePeopleBatchcreatecontacts, options: MethodOptions): GaxiosPromise[SchemaBatchCreateContactsResponse] = js.native
  def batchCreateContacts(
    params: ParamsResourcePeopleBatchcreatecontacts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchCreateContactsResponse]
  ): Unit = js.native
  /**
    * Create a batch of new contacts and return the PersonResponses for the newly Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.batchCreateContacts({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contacts": [],
    *       //   "readMask": "my_readMask",
    *       //   "sources": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createdPeople": []
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
  def batchCreateContacts(params: ParamsResourcePeopleBatchcreatecontacts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchCreateContacts(
    params: ParamsResourcePeopleBatchcreatecontacts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchDeleteContacts(): GaxiosPromise[SchemaEmpty] = js.native
  def batchDeleteContacts(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDeleteContacts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDeleteContacts(params: ParamsResourcePeopleBatchdeletecontacts): GaxiosPromise[SchemaEmpty] = js.native
  def batchDeleteContacts(params: ParamsResourcePeopleBatchdeletecontacts, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def batchDeleteContacts(
    params: ParamsResourcePeopleBatchdeletecontacts,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def batchDeleteContacts(params: ParamsResourcePeopleBatchdeletecontacts, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def batchDeleteContacts(
    params: ParamsResourcePeopleBatchdeletecontacts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a batch of contacts. Any non-contact data will not be deleted. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.batchDeleteContacts({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "resourceNames": []
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
  def batchDeleteContacts(params: ParamsResourcePeopleBatchdeletecontacts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDeleteContacts(
    params: ParamsResourcePeopleBatchdeletecontacts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchUpdateContacts(): GaxiosPromise[SchemaBatchUpdateContactsResponse] = js.native
  def batchUpdateContacts(callback: BodyResponseCallback[SchemaBatchUpdateContactsResponse]): Unit = js.native
  def batchUpdateContacts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateContactsResponse] = js.native
  def batchUpdateContacts(params: ParamsResourcePeopleBatchupdatecontacts): GaxiosPromise[SchemaBatchUpdateContactsResponse] = js.native
  def batchUpdateContacts(
    params: ParamsResourcePeopleBatchupdatecontacts,
    callback: BodyResponseCallback[SchemaBatchUpdateContactsResponse]
  ): Unit = js.native
  def batchUpdateContacts(
    params: ParamsResourcePeopleBatchupdatecontacts,
    options: BodyResponseCallback[Readable | SchemaBatchUpdateContactsResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchUpdateContactsResponse]
  ): Unit = js.native
  def batchUpdateContacts(params: ParamsResourcePeopleBatchupdatecontacts, options: MethodOptions): GaxiosPromise[SchemaBatchUpdateContactsResponse] = js.native
  def batchUpdateContacts(
    params: ParamsResourcePeopleBatchupdatecontacts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchUpdateContactsResponse]
  ): Unit = js.native
  /**
    * Update a batch of contacts and return a map of resource names to PersonResponses for the updated contacts. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.batchUpdateContacts({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contacts": {},
    *       //   "readMask": "my_readMask",
    *       //   "sources": [],
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "updateResult": {}
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
  def batchUpdateContacts(params: ParamsResourcePeopleBatchupdatecontacts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdateContacts(
    params: ParamsResourcePeopleBatchupdatecontacts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var connections: ResourcePeopleConnections = js.native
  
  var context: APIRequestContext = js.native
  
  def createContact(): GaxiosPromise[SchemaPerson] = js.native
  def createContact(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def createContact(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def createContact(params: ParamsResourcePeopleCreatecontact): GaxiosPromise[SchemaPerson] = js.native
  def createContact(params: ParamsResourcePeopleCreatecontact, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def createContact(
    params: ParamsResourcePeopleCreatecontact,
    options: BodyResponseCallback[Readable | SchemaPerson],
    callback: BodyResponseCallback[Readable | SchemaPerson]
  ): Unit = js.native
  def createContact(params: ParamsResourcePeopleCreatecontact, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def createContact(
    params: ParamsResourcePeopleCreatecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  /**
    * Create a new contact and return the person resource for that contact. The request returns a 400 error if more than one field is specified on a field that is a singleton for contact sources: * biographies * birthdays * genders * names Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.createContact({
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Defaults to all fields if not set. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     personFields: 'placeholder-value',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    *     sources: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": [],
    *       //   "ageRange": "my_ageRange",
    *       //   "ageRanges": [],
    *       //   "biographies": [],
    *       //   "birthdays": [],
    *       //   "braggingRights": [],
    *       //   "calendarUrls": [],
    *       //   "clientData": [],
    *       //   "coverPhotos": [],
    *       //   "emailAddresses": [],
    *       //   "etag": "my_etag",
    *       //   "events": [],
    *       //   "externalIds": [],
    *       //   "fileAses": [],
    *       //   "genders": [],
    *       //   "imClients": [],
    *       //   "interests": [],
    *       //   "locales": [],
    *       //   "locations": [],
    *       //   "memberships": [],
    *       //   "metadata": {},
    *       //   "miscKeywords": [],
    *       //   "names": [],
    *       //   "nicknames": [],
    *       //   "occupations": [],
    *       //   "organizations": [],
    *       //   "phoneNumbers": [],
    *       //   "photos": [],
    *       //   "relations": [],
    *       //   "relationshipInterests": [],
    *       //   "relationshipStatuses": [],
    *       //   "residences": [],
    *       //   "resourceName": "my_resourceName",
    *       //   "sipAddresses": [],
    *       //   "skills": [],
    *       //   "taglines": [],
    *       //   "urls": [],
    *       //   "userDefined": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "ageRange": "my_ageRange",
    *   //   "ageRanges": [],
    *   //   "biographies": [],
    *   //   "birthdays": [],
    *   //   "braggingRights": [],
    *   //   "calendarUrls": [],
    *   //   "clientData": [],
    *   //   "coverPhotos": [],
    *   //   "emailAddresses": [],
    *   //   "etag": "my_etag",
    *   //   "events": [],
    *   //   "externalIds": [],
    *   //   "fileAses": [],
    *   //   "genders": [],
    *   //   "imClients": [],
    *   //   "interests": [],
    *   //   "locales": [],
    *   //   "locations": [],
    *   //   "memberships": [],
    *   //   "metadata": {},
    *   //   "miscKeywords": [],
    *   //   "names": [],
    *   //   "nicknames": [],
    *   //   "occupations": [],
    *   //   "organizations": [],
    *   //   "phoneNumbers": [],
    *   //   "photos": [],
    *   //   "relations": [],
    *   //   "relationshipInterests": [],
    *   //   "relationshipStatuses": [],
    *   //   "residences": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "sipAddresses": [],
    *   //   "skills": [],
    *   //   "taglines": [],
    *   //   "urls": [],
    *   //   "userDefined": []
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
  def createContact(params: ParamsResourcePeopleCreatecontact, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createContact(
    params: ParamsResourcePeopleCreatecontact,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteContact(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteContact(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(params: ParamsResourcePeopleDeletecontact): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(params: ParamsResourcePeopleDeletecontact, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteContact(
    params: ParamsResourcePeopleDeletecontact,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteContact(params: ParamsResourcePeopleDeletecontact, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteContact(
    params: ParamsResourcePeopleDeletecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a contact person. Any non-contact data will not be deleted. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.deleteContact({
    *     // Required. The resource name of the contact to delete.
    *     resourceName: 'people/[^/]+',
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
  def deleteContact(params: ParamsResourcePeopleDeletecontact, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteContact(
    params: ParamsResourcePeopleDeletecontact,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteContactPhoto(): GaxiosPromise[SchemaDeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(callback: BodyResponseCallback[SchemaDeleteContactPhotoResponse]): Unit = js.native
  def deleteContactPhoto(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(params: ParamsResourcePeopleDeletecontactphoto): GaxiosPromise[SchemaDeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(
    params: ParamsResourcePeopleDeletecontactphoto,
    callback: BodyResponseCallback[SchemaDeleteContactPhotoResponse]
  ): Unit = js.native
  def deleteContactPhoto(
    params: ParamsResourcePeopleDeletecontactphoto,
    options: BodyResponseCallback[Readable | SchemaDeleteContactPhotoResponse],
    callback: BodyResponseCallback[Readable | SchemaDeleteContactPhotoResponse]
  ): Unit = js.native
  def deleteContactPhoto(params: ParamsResourcePeopleDeletecontactphoto, options: MethodOptions): GaxiosPromise[SchemaDeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(
    params: ParamsResourcePeopleDeletecontactphoto,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeleteContactPhotoResponse]
  ): Unit = js.native
  /**
    * Delete a contact's photo. Mutate requests for the same user should be done sequentially to avoid // lock contention.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.deleteContactPhoto({
    *     // Optional. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Defaults to empty if not set, which will skip the post mutate get. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     personFields: 'placeholder-value',
    *     // Required. The resource name of the contact whose photo will be deleted.
    *     resourceName: 'people/[^/]+',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    *     sources: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "person": {}
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
  def deleteContactPhoto(params: ParamsResourcePeopleDeletecontactphoto, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteContactPhoto(
    params: ParamsResourcePeopleDeletecontactphoto,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPerson] = js.native
  def get(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet): GaxiosPromise[SchemaPerson] = js.native
  def get(params: ParamsResourcePeopleGet, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: BodyResponseCallback[Readable | SchemaPerson],
    callback: BodyResponseCallback[Readable | SchemaPerson]
  ): Unit = js.native
  def get(params: ParamsResourcePeopleGet, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  /**
    * Provides information about a person by specifying a resource name. Use `people/me` to indicate the authenticated user. The request returns a 400 error if 'personFields' is not specified.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/contacts',
    *       'https://www.googleapis.com/auth/contacts.readonly',
    *       'https://www.googleapis.com/auth/directory.readonly',
    *       'https://www.googleapis.com/auth/user.addresses.read',
    *       'https://www.googleapis.com/auth/user.birthday.read',
    *       'https://www.googleapis.com/auth/user.emails.read',
    *       'https://www.googleapis.com/auth/user.gender.read',
    *       'https://www.googleapis.com/auth/user.organization.read',
    *       'https://www.googleapis.com/auth/user.phonenumbers.read',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *       'https://www.googleapis.com/auth/userinfo.profile',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.get({
    *     // Required. A field mask to restrict which fields on the person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     personFields: 'placeholder-value',
    *     // Required. Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    *     'requestMask.includeField': 'placeholder-value',
    *     // Required. The resource name of the person to provide information about. - To get information about the authenticated user, specify `people/me`. - To get information about a google account, specify `people/{account_id\}`. - To get information about a contact, specify the resource name that identifies the contact as returned by `people.connections.list`.
    *     resourceName: 'people/[^/]+',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_PROFILE and READ_SOURCE_TYPE_CONTACT if not set.
    *     sources: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "ageRange": "my_ageRange",
    *   //   "ageRanges": [],
    *   //   "biographies": [],
    *   //   "birthdays": [],
    *   //   "braggingRights": [],
    *   //   "calendarUrls": [],
    *   //   "clientData": [],
    *   //   "coverPhotos": [],
    *   //   "emailAddresses": [],
    *   //   "etag": "my_etag",
    *   //   "events": [],
    *   //   "externalIds": [],
    *   //   "fileAses": [],
    *   //   "genders": [],
    *   //   "imClients": [],
    *   //   "interests": [],
    *   //   "locales": [],
    *   //   "locations": [],
    *   //   "memberships": [],
    *   //   "metadata": {},
    *   //   "miscKeywords": [],
    *   //   "names": [],
    *   //   "nicknames": [],
    *   //   "occupations": [],
    *   //   "organizations": [],
    *   //   "phoneNumbers": [],
    *   //   "photos": [],
    *   //   "relations": [],
    *   //   "relationshipInterests": [],
    *   //   "relationshipStatuses": [],
    *   //   "residences": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "sipAddresses": [],
    *   //   "skills": [],
    *   //   "taglines": [],
    *   //   "urls": [],
    *   //   "userDefined": []
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
  def get(params: ParamsResourcePeopleGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePeopleGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getBatchGet(): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(callback: BodyResponseCallback[SchemaGetPeopleResponse]): Unit = js.native
  def getBatchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(params: ParamsResourcePeopleGetbatchget): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(params: ParamsResourcePeopleGetbatchget, callback: BodyResponseCallback[SchemaGetPeopleResponse]): Unit = js.native
  def getBatchGet(
    params: ParamsResourcePeopleGetbatchget,
    options: BodyResponseCallback[Readable | SchemaGetPeopleResponse],
    callback: BodyResponseCallback[Readable | SchemaGetPeopleResponse]
  ): Unit = js.native
  def getBatchGet(params: ParamsResourcePeopleGetbatchget, options: MethodOptions): GaxiosPromise[SchemaGetPeopleResponse] = js.native
  def getBatchGet(
    params: ParamsResourcePeopleGetbatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetPeopleResponse]
  ): Unit = js.native
  /**
    * Provides information about a list of specific people by specifying a list of requested resource names. Use `people/me` to indicate the authenticated user. The request returns a 400 error if 'personFields' is not specified.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/contacts',
    *       'https://www.googleapis.com/auth/contacts.readonly',
    *       'https://www.googleapis.com/auth/directory.readonly',
    *       'https://www.googleapis.com/auth/user.addresses.read',
    *       'https://www.googleapis.com/auth/user.birthday.read',
    *       'https://www.googleapis.com/auth/user.emails.read',
    *       'https://www.googleapis.com/auth/user.gender.read',
    *       'https://www.googleapis.com/auth/user.organization.read',
    *       'https://www.googleapis.com/auth/user.phonenumbers.read',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *       'https://www.googleapis.com/auth/userinfo.profile',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.getBatchGet({
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     personFields: 'placeholder-value',
    *     // Required. Comma-separated list of person fields to be included in the response. Each path should start with `person.`: for example, `person.names` or `person.photos`.
    *     'requestMask.includeField': 'placeholder-value',
    *     // Required. The resource names of the people to provide information about. It's repeatable. The URL query parameter should be resourceNames=<name1\>&resourceNames=<name2\>&... - To get information about the authenticated user, specify `people/me`. - To get information about a google account, specify `people/{account_id\}`. - To get information about a contact, specify the resource name that identifies the contact as returned by `people.connections.list`. There is a maximum of 200 resource names.
    *     resourceNames: 'placeholder-value',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    *     sources: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": []
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
  def getBatchGet(params: ParamsResourcePeopleGetbatchget, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getBatchGet(
    params: ParamsResourcePeopleGetbatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listDirectoryPeople(): GaxiosPromise[SchemaListDirectoryPeopleResponse] = js.native
  def listDirectoryPeople(callback: BodyResponseCallback[SchemaListDirectoryPeopleResponse]): Unit = js.native
  def listDirectoryPeople(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDirectoryPeopleResponse] = js.native
  def listDirectoryPeople(params: ParamsResourcePeopleListdirectorypeople): GaxiosPromise[SchemaListDirectoryPeopleResponse] = js.native
  def listDirectoryPeople(
    params: ParamsResourcePeopleListdirectorypeople,
    callback: BodyResponseCallback[SchemaListDirectoryPeopleResponse]
  ): Unit = js.native
  def listDirectoryPeople(
    params: ParamsResourcePeopleListdirectorypeople,
    options: BodyResponseCallback[Readable | SchemaListDirectoryPeopleResponse],
    callback: BodyResponseCallback[Readable | SchemaListDirectoryPeopleResponse]
  ): Unit = js.native
  def listDirectoryPeople(params: ParamsResourcePeopleListdirectorypeople, options: MethodOptions): GaxiosPromise[SchemaListDirectoryPeopleResponse] = js.native
  def listDirectoryPeople(
    params: ParamsResourcePeopleListdirectorypeople,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDirectoryPeopleResponse]
  ): Unit = js.native
  /**
    * Provides a list of domain profiles and domain contacts in the authenticated user's domain directory. When the `sync_token` is specified, resources deleted since the last sync will be returned as a person with `PersonMetadata.deleted` set to true. When the `page_token` or `sync_token` is specified, all other request parameters must match the first call. Writes may have a propagation delay of several minutes for sync requests. Incremental syncs are not intended for read-after-write use cases. See example usage at [List the directory people that have changed](/people/v1/directory#list_the_directory_people_that_have_changed).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/directory.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.listDirectoryPeople({
    *     // Optional. Additional data to merge into the directory sources if they are connected through verified join keys such as email addresses or phone numbers.
    *     mergeSources: 'placeholder-value',
    *     // Optional. The number of people to include in the response. Valid values are between 1 and 1000, inclusive. Defaults to 100 if not set or set to 0.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous response `next_page_token`. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `people.listDirectoryPeople` must match the first call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     readMask: 'placeholder-value',
    *     // Optional. Whether the response should return `next_sync_token`. It can be used to get incremental changes since the last request by setting it on the request `sync_token`. More details about sync behavior at `people.listDirectoryPeople`.
    *     requestSyncToken: 'placeholder-value',
    *     // Required. Directory sources to return.
    *     sources: 'placeholder-value',
    *     // Optional. A sync token, received from a previous response `next_sync_token` Provide this to retrieve only the resources changed since the last request. When syncing, all other parameters provided to `people.listDirectoryPeople` must match the first call that provided the sync token. More details about sync behavior at `people.listDirectoryPeople`.
    *     syncToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken",
    *   //   "people": []
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
  def listDirectoryPeople(params: ParamsResourcePeopleListdirectorypeople, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listDirectoryPeople(
    params: ParamsResourcePeopleListdirectorypeople,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchContacts(): GaxiosPromise[SchemaSearchResponse] = js.native
  def searchContacts(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def searchContacts(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def searchContacts(params: ParamsResourcePeopleSearchcontacts): GaxiosPromise[SchemaSearchResponse] = js.native
  def searchContacts(params: ParamsResourcePeopleSearchcontacts, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def searchContacts(
    params: ParamsResourcePeopleSearchcontacts,
    options: BodyResponseCallback[Readable | SchemaSearchResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchResponse]
  ): Unit = js.native
  def searchContacts(params: ParamsResourcePeopleSearchcontacts, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def searchContacts(
    params: ParamsResourcePeopleSearchcontacts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  /**
    * Provides a list of contacts in the authenticated user's grouped contacts that matches the search query. The query matches on a contact's `names`, `nickNames`, `emailAddresses`, `phoneNumbers`, and `organizations` fields that are from the CONTACT source. **IMPORTANT**: Before searching, clients should send a warmup request with an empty query to update the cache. See https://developers.google.com/people/v1/contacts#search_the_users_contacts
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/contacts',
    *       'https://www.googleapis.com/auth/contacts.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.searchContacts({
    *     // Optional. The number of results to return. Defaults to 10 if field is not set, or set to 0. Values greater than 30 will be capped to 30.
    *     pageSize: 'placeholder-value',
    *     // Required. The plain-text query for the request. The query is used to match prefix phrases of the fields on a person. For example, a person with name "foo name" matches queries such as "f", "fo", "foo", "foo n", "nam", etc., but not "oo n".
    *     query: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     readMask: 'placeholder-value',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT if not set.
    *     sources: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "results": []
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
  def searchContacts(params: ParamsResourcePeopleSearchcontacts, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchContacts(
    params: ParamsResourcePeopleSearchcontacts,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchDirectoryPeople(): GaxiosPromise[SchemaSearchDirectoryPeopleResponse] = js.native
  def searchDirectoryPeople(callback: BodyResponseCallback[SchemaSearchDirectoryPeopleResponse]): Unit = js.native
  def searchDirectoryPeople(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchDirectoryPeopleResponse] = js.native
  def searchDirectoryPeople(params: ParamsResourcePeopleSearchdirectorypeople): GaxiosPromise[SchemaSearchDirectoryPeopleResponse] = js.native
  def searchDirectoryPeople(
    params: ParamsResourcePeopleSearchdirectorypeople,
    callback: BodyResponseCallback[SchemaSearchDirectoryPeopleResponse]
  ): Unit = js.native
  def searchDirectoryPeople(
    params: ParamsResourcePeopleSearchdirectorypeople,
    options: BodyResponseCallback[Readable | SchemaSearchDirectoryPeopleResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchDirectoryPeopleResponse]
  ): Unit = js.native
  def searchDirectoryPeople(params: ParamsResourcePeopleSearchdirectorypeople, options: MethodOptions): GaxiosPromise[SchemaSearchDirectoryPeopleResponse] = js.native
  def searchDirectoryPeople(
    params: ParamsResourcePeopleSearchdirectorypeople,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchDirectoryPeopleResponse]
  ): Unit = js.native
  /**
    * Provides a list of domain profiles and domain contacts in the authenticated user's domain directory that match the search query.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/directory.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.searchDirectoryPeople({
    *     // Optional. Additional data to merge into the directory sources if they are connected through verified join keys such as email addresses or phone numbers.
    *     mergeSources: 'placeholder-value',
    *     // Optional. The number of people to include in the response. Valid values are between 1 and 500, inclusive. Defaults to 100 if not set or set to 0.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous response `next_page_token`. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `SearchDirectoryPeople` must match the first call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Prefix query that matches fields in the person. Does NOT use the read_mask for determining what fields to match.
    *     query: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     readMask: 'placeholder-value',
    *     // Required. Directory sources to return.
    *     sources: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "people": [],
    *   //   "totalSize": 0
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
  def searchDirectoryPeople(params: ParamsResourcePeopleSearchdirectorypeople, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchDirectoryPeople(
    params: ParamsResourcePeopleSearchdirectorypeople,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateContact(): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def updateContact(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(params: ParamsResourcePeopleUpdatecontact): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(params: ParamsResourcePeopleUpdatecontact, callback: BodyResponseCallback[SchemaPerson]): Unit = js.native
  def updateContact(
    params: ParamsResourcePeopleUpdatecontact,
    options: BodyResponseCallback[Readable | SchemaPerson],
    callback: BodyResponseCallback[Readable | SchemaPerson]
  ): Unit = js.native
  def updateContact(params: ParamsResourcePeopleUpdatecontact, options: MethodOptions): GaxiosPromise[SchemaPerson] = js.native
  def updateContact(
    params: ParamsResourcePeopleUpdatecontact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPerson]
  ): Unit = js.native
  /**
    * Update contact data for an existing contact person. Any non-contact data will not be modified. Any non-contact data in the person to update will be ignored. All fields specified in the `update_mask` will be replaced. The server returns a 400 error if `person.metadata.sources` is not specified for the contact to be updated or if there is no contact source. The server returns a 400 error with reason `"failedPrecondition"` if `person.metadata.sources.etag` is different than the contact's etag, which indicates the contact has changed since its data was read. Clients should get the latest person and merge their updates into the latest person. The server returns a 400 error if `memberships` are being updated and there are no contact group memberships specified on the person. The server returns a 400 error if more than one field is specified on a field that is a singleton for contact sources: * biographies * birthdays * genders * names Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.updateContact({
    *     // Optional. A field mask to restrict which fields on each person are returned. Multiple fields can be specified by separating them with commas. Defaults to all fields if not set. Valid values are: * addresses * ageRanges * biographies * birthdays * calendarUrls * clientData * coverPhotos * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * metadata * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * photos * relations * sipAddresses * skills * urls * userDefined
    *     personFields: 'placeholder-value',
    *     // The resource name for the person, assigned by the server. An ASCII string with a max length of 27 characters, in the form of `people/{person_id\}`.
    *     resourceName: 'people/[^/]+',
    *     // Optional. A mask of what source types to return. Defaults to READ_SOURCE_TYPE_CONTACT and READ_SOURCE_TYPE_PROFILE if not set.
    *     sources: 'placeholder-value',
    *     // Required. A field mask to restrict which fields on the person are updated. Multiple fields can be specified by separating them with commas. All updated fields will be replaced. Valid values are: * addresses * biographies * birthdays * calendarUrls * clientData * emailAddresses * events * externalIds * genders * imClients * interests * locales * locations * memberships * miscKeywords * names * nicknames * occupations * organizations * phoneNumbers * relations * sipAddresses * urls * userDefined
    *     updatePersonFields: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addresses": [],
    *       //   "ageRange": "my_ageRange",
    *       //   "ageRanges": [],
    *       //   "biographies": [],
    *       //   "birthdays": [],
    *       //   "braggingRights": [],
    *       //   "calendarUrls": [],
    *       //   "clientData": [],
    *       //   "coverPhotos": [],
    *       //   "emailAddresses": [],
    *       //   "etag": "my_etag",
    *       //   "events": [],
    *       //   "externalIds": [],
    *       //   "fileAses": [],
    *       //   "genders": [],
    *       //   "imClients": [],
    *       //   "interests": [],
    *       //   "locales": [],
    *       //   "locations": [],
    *       //   "memberships": [],
    *       //   "metadata": {},
    *       //   "miscKeywords": [],
    *       //   "names": [],
    *       //   "nicknames": [],
    *       //   "occupations": [],
    *       //   "organizations": [],
    *       //   "phoneNumbers": [],
    *       //   "photos": [],
    *       //   "relations": [],
    *       //   "relationshipInterests": [],
    *       //   "relationshipStatuses": [],
    *       //   "residences": [],
    *       //   "resourceName": "my_resourceName",
    *       //   "sipAddresses": [],
    *       //   "skills": [],
    *       //   "taglines": [],
    *       //   "urls": [],
    *       //   "userDefined": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "addresses": [],
    *   //   "ageRange": "my_ageRange",
    *   //   "ageRanges": [],
    *   //   "biographies": [],
    *   //   "birthdays": [],
    *   //   "braggingRights": [],
    *   //   "calendarUrls": [],
    *   //   "clientData": [],
    *   //   "coverPhotos": [],
    *   //   "emailAddresses": [],
    *   //   "etag": "my_etag",
    *   //   "events": [],
    *   //   "externalIds": [],
    *   //   "fileAses": [],
    *   //   "genders": [],
    *   //   "imClients": [],
    *   //   "interests": [],
    *   //   "locales": [],
    *   //   "locations": [],
    *   //   "memberships": [],
    *   //   "metadata": {},
    *   //   "miscKeywords": [],
    *   //   "names": [],
    *   //   "nicknames": [],
    *   //   "occupations": [],
    *   //   "organizations": [],
    *   //   "phoneNumbers": [],
    *   //   "photos": [],
    *   //   "relations": [],
    *   //   "relationshipInterests": [],
    *   //   "relationshipStatuses": [],
    *   //   "residences": [],
    *   //   "resourceName": "my_resourceName",
    *   //   "sipAddresses": [],
    *   //   "skills": [],
    *   //   "taglines": [],
    *   //   "urls": [],
    *   //   "userDefined": []
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
  def updateContact(params: ParamsResourcePeopleUpdatecontact, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateContact(
    params: ParamsResourcePeopleUpdatecontact,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateContactPhoto(): GaxiosPromise[SchemaUpdateContactPhotoResponse] = js.native
  def updateContactPhoto(callback: BodyResponseCallback[SchemaUpdateContactPhotoResponse]): Unit = js.native
  def updateContactPhoto(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpdateContactPhotoResponse] = js.native
  def updateContactPhoto(params: ParamsResourcePeopleUpdatecontactphoto): GaxiosPromise[SchemaUpdateContactPhotoResponse] = js.native
  def updateContactPhoto(
    params: ParamsResourcePeopleUpdatecontactphoto,
    callback: BodyResponseCallback[SchemaUpdateContactPhotoResponse]
  ): Unit = js.native
  def updateContactPhoto(
    params: ParamsResourcePeopleUpdatecontactphoto,
    options: BodyResponseCallback[Readable | SchemaUpdateContactPhotoResponse],
    callback: BodyResponseCallback[Readable | SchemaUpdateContactPhotoResponse]
  ): Unit = js.native
  def updateContactPhoto(params: ParamsResourcePeopleUpdatecontactphoto, options: MethodOptions): GaxiosPromise[SchemaUpdateContactPhotoResponse] = js.native
  def updateContactPhoto(
    params: ParamsResourcePeopleUpdatecontactphoto,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateContactPhotoResponse]
  ): Unit = js.native
  /**
    * Update a contact's photo. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/people.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const people = google.people('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/contacts'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await people.people.updateContactPhoto({
    *     // Required. Person resource name
    *     resourceName: 'people/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "personFields": "my_personFields",
    *       //   "photoBytes": "my_photoBytes",
    *       //   "sources": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "person": {}
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
  def updateContactPhoto(params: ParamsResourcePeopleUpdatecontactphoto, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateContactPhoto(
    params: ParamsResourcePeopleUpdatecontactphoto,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
