package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessbusinessinformation/v1", "mybusinessbusinessinformation_v1.Resource$Locations")
@js.native
open class ResourceLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def associate(): GaxiosPromise[SchemaEmpty] = js.native
  def associate(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def associate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def associate(params: ParamsResourceLocationsAssociate): GaxiosPromise[SchemaEmpty] = js.native
  def associate(params: ParamsResourceLocationsAssociate, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def associate(
    params: ParamsResourceLocationsAssociate,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def associate(params: ParamsResourceLocationsAssociate, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def associate(
    params: ParamsResourceLocationsAssociate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Associates a location to a place ID. Any previous association is overwritten. This operation is only valid if the location is unverified. The association must be valid, that is, it appears in the list of `SearchGoogleLocations`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.associate({
    *     // Required. The resource name of the location to associate.
    *     name: 'locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "placeId": "my_placeId"
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
  def associate(params: ParamsResourceLocationsAssociate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def associate(
    params: ParamsResourceLocationsAssociate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var attributes: ResourceLocationsAttributes = js.native
  
  def clearLocationAssociation(): GaxiosPromise[SchemaEmpty] = js.native
  def clearLocationAssociation(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def clearLocationAssociation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearLocationAssociation(params: ParamsResourceLocationsClearlocationassociation): GaxiosPromise[SchemaEmpty] = js.native
  def clearLocationAssociation(
    params: ParamsResourceLocationsClearlocationassociation,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def clearLocationAssociation(
    params: ParamsResourceLocationsClearlocationassociation,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def clearLocationAssociation(params: ParamsResourceLocationsClearlocationassociation, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearLocationAssociation(
    params: ParamsResourceLocationsClearlocationassociation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Clears an association between a location and its place ID. This operation is only valid if the location is unverified.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await mybusinessbusinessinformation.locations.clearLocationAssociation({
    *       // Required. The resource name of the location to disassociate.
    *       name: 'locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
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
  def clearLocationAssociation(params: ParamsResourceLocationsClearlocationassociation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clearLocationAssociation(
    params: ParamsResourceLocationsClearlocationassociation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLocationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLocationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceLocationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a location. If this location cannot be deleted using the API and it is marked so in the `google.mybusiness.businessinformation.v1.LocationState`, use the [Google Business Profile](https://business.google.com/manage/) website.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.delete({
    *     // Required. The name of the location to delete.
    *     name: 'locations/my-location',
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
  def delete(params: ParamsResourceLocationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLocationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceLocationsGet,
    options: BodyResponseCallback[Readable | SchemaLocation],
    callback: BodyResponseCallback[Readable | SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  /**
    * Returns the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.get({
    *     // Required. The name of the location to fetch.
    *     name: 'locations/my-location',
    *     // Required. Read mask to specify what fields will be returned in the response.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsLocationExtensions": {},
    *   //   "categories": {},
    *   //   "labels": [],
    *   //   "languageCode": "my_languageCode",
    *   //   "latlng": {},
    *   //   "metadata": {},
    *   //   "moreHours": [],
    *   //   "name": "my_name",
    *   //   "openInfo": {},
    *   //   "phoneNumbers": {},
    *   //   "profile": {},
    *   //   "regularHours": {},
    *   //   "relationshipData": {},
    *   //   "serviceArea": {},
    *   //   "serviceItems": [],
    *   //   "specialHours": {},
    *   //   "storeCode": "my_storeCode",
    *   //   "storefrontAddress": {},
    *   //   "title": "my_title",
    *   //   "websiteUri": "my_websiteUri"
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
  def get(params: ParamsResourceLocationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLocationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAttributes(): GaxiosPromise[SchemaAttributes] = js.native
  def getAttributes(callback: BodyResponseCallback[SchemaAttributes]): Unit = js.native
  def getAttributes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttributes] = js.native
  def getAttributes(params: ParamsResourceLocationsGetattributes): GaxiosPromise[SchemaAttributes] = js.native
  def getAttributes(params: ParamsResourceLocationsGetattributes, callback: BodyResponseCallback[SchemaAttributes]): Unit = js.native
  def getAttributes(
    params: ParamsResourceLocationsGetattributes,
    options: BodyResponseCallback[Readable | SchemaAttributes],
    callback: BodyResponseCallback[Readable | SchemaAttributes]
  ): Unit = js.native
  def getAttributes(params: ParamsResourceLocationsGetattributes, options: MethodOptions): GaxiosPromise[SchemaAttributes] = js.native
  def getAttributes(
    params: ParamsResourceLocationsGetattributes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttributes]
  ): Unit = js.native
  /**
    * Looks up all the attributes set for a given location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.getAttributes({
    *     // Required. Google identifier for this location in the form of `locations/{location_id\}/attributes`.
    *     name: 'locations/my-location/attributes',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": [],
    *   //   "name": "my_name"
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
  def getAttributes(params: ParamsResourceLocationsGetattributes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAttributes(
    params: ParamsResourceLocationsGetattributes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getGoogleUpdated(): GaxiosPromise[SchemaGoogleUpdatedLocation] = js.native
  def getGoogleUpdated(callback: BodyResponseCallback[SchemaGoogleUpdatedLocation]): Unit = js.native
  def getGoogleUpdated(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleUpdatedLocation] = js.native
  def getGoogleUpdated(params: ParamsResourceLocationsGetgoogleupdated): GaxiosPromise[SchemaGoogleUpdatedLocation] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsGetgoogleupdated,
    callback: BodyResponseCallback[SchemaGoogleUpdatedLocation]
  ): Unit = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsGetgoogleupdated,
    options: BodyResponseCallback[Readable | SchemaGoogleUpdatedLocation],
    callback: BodyResponseCallback[Readable | SchemaGoogleUpdatedLocation]
  ): Unit = js.native
  def getGoogleUpdated(params: ParamsResourceLocationsGetgoogleupdated, options: MethodOptions): GaxiosPromise[SchemaGoogleUpdatedLocation] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsGetgoogleupdated,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleUpdatedLocation]
  ): Unit = js.native
  /**
    * Gets the Google-updated version of the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.getGoogleUpdated({
    *     // Required. The name of the location to fetch.
    *     name: 'locations/my-location',
    *     // Required. Read mask to specify what fields will be returned in the response.
    *     readMask: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "diffMask": "my_diffMask",
    *   //   "location": {},
    *   //   "pendingMask": "my_pendingMask"
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
  def getGoogleUpdated(params: ParamsResourceLocationsGetgoogleupdated, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsGetgoogleupdated,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaLocation] = js.native
  def patch(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def patch(params: ParamsResourceLocationsPatch): GaxiosPromise[SchemaLocation] = js.native
  def patch(params: ParamsResourceLocationsPatch, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def patch(
    params: ParamsResourceLocationsPatch,
    options: BodyResponseCallback[Readable | SchemaLocation],
    callback: BodyResponseCallback[Readable | SchemaLocation]
  ): Unit = js.native
  def patch(params: ParamsResourceLocationsPatch, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def patch(
    params: ParamsResourceLocationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  /**
    * Updates the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.patch({
    *     // Google identifier for this location in the form: `locations/{location_id\}`.
    *     name: 'locations/my-location',
    *     // Required. The specific fields to update.
    *     updateMask: 'placeholder-value',
    *     // Optional. If true, the request is validated without actually updating the location. When this field is set, we will only return validation errors if there were any. The response will be empty if no errors were found.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adWordsLocationExtensions": {},
    *       //   "categories": {},
    *       //   "labels": [],
    *       //   "languageCode": "my_languageCode",
    *       //   "latlng": {},
    *       //   "metadata": {},
    *       //   "moreHours": [],
    *       //   "name": "my_name",
    *       //   "openInfo": {},
    *       //   "phoneNumbers": {},
    *       //   "profile": {},
    *       //   "regularHours": {},
    *       //   "relationshipData": {},
    *       //   "serviceArea": {},
    *       //   "serviceItems": [],
    *       //   "specialHours": {},
    *       //   "storeCode": "my_storeCode",
    *       //   "storefrontAddress": {},
    *       //   "title": "my_title",
    *       //   "websiteUri": "my_websiteUri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsLocationExtensions": {},
    *   //   "categories": {},
    *   //   "labels": [],
    *   //   "languageCode": "my_languageCode",
    *   //   "latlng": {},
    *   //   "metadata": {},
    *   //   "moreHours": [],
    *   //   "name": "my_name",
    *   //   "openInfo": {},
    *   //   "phoneNumbers": {},
    *   //   "profile": {},
    *   //   "regularHours": {},
    *   //   "relationshipData": {},
    *   //   "serviceArea": {},
    *   //   "serviceItems": [],
    *   //   "specialHours": {},
    *   //   "storeCode": "my_storeCode",
    *   //   "storefrontAddress": {},
    *   //   "title": "my_title",
    *   //   "websiteUri": "my_websiteUri"
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
  def patch(params: ParamsResourceLocationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceLocationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateAttributes(): GaxiosPromise[SchemaAttributes] = js.native
  def updateAttributes(callback: BodyResponseCallback[SchemaAttributes]): Unit = js.native
  def updateAttributes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttributes] = js.native
  def updateAttributes(params: ParamsResourceLocationsUpdateattributes): GaxiosPromise[SchemaAttributes] = js.native
  def updateAttributes(params: ParamsResourceLocationsUpdateattributes, callback: BodyResponseCallback[SchemaAttributes]): Unit = js.native
  def updateAttributes(
    params: ParamsResourceLocationsUpdateattributes,
    options: BodyResponseCallback[Readable | SchemaAttributes],
    callback: BodyResponseCallback[Readable | SchemaAttributes]
  ): Unit = js.native
  def updateAttributes(params: ParamsResourceLocationsUpdateattributes, options: MethodOptions): GaxiosPromise[SchemaAttributes] = js.native
  def updateAttributes(
    params: ParamsResourceLocationsUpdateattributes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttributes]
  ): Unit = js.native
  /**
    * Update attributes for a given location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.locations.updateAttributes({
    *     // Required. Attribute name of attributes that you'd like to update. Represented by `attributes/{attribute\}`. Updates: All attributes provided in the attributes field that you would like to update must be set in the `attribute_mask`. Attributes set in the above list but not in the `attribute_mask` will be ignored. Deletes: If you'd like to delete certain attributes, they must be specified in the `attribute_mask` with no matching entry in the attributes list. If you'd like to delete all attributes set on a location, you should look up all the applicable attributes for the location and then add them to the `attribute_mask` with an empty attributes field.
    *     attributeMask: 'placeholder-value',
    *     // Required. Google identifier for this location in the form of `locations/{location_id\}/attributes`.
    *     name: 'locations/my-location/attributes',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attributes": [],
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": [],
    *   //   "name": "my_name"
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
  def updateAttributes(params: ParamsResourceLocationsUpdateattributes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateAttributes(
    params: ParamsResourceLocationsUpdateattributes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
