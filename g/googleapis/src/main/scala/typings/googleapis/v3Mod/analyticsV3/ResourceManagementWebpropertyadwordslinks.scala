package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webpropertyadwordslinks")
@js.native
class ResourceManagementWebpropertyadwordslinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.webPropertyAdWordsLinks.delete
    * @desc Deletes a web property-Google Ads link.
    * @alias analytics.management.webPropertyAdWordsLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to delete the Google Ads link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementWebpropertyadwordslinksDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementWebpropertyadwordslinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.webPropertyAdWordsLinks.get
    * @desc Returns a web property-Google Ads link to which the user has
    * access.
    * @alias analytics.management.webPropertyAdWordsLinks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property-Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(params: ParamsResourceManagementWebpropertyadwordslinksGet): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    options: BodyResponseCallback[SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def get(params: ParamsResourceManagementWebpropertyadwordslinksGet, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  
  /**
    * analytics.management.webPropertyAdWordsLinks.insert
    * @desc Creates a webProperty-Google Ads link.
    * @alias analytics.management.webPropertyAdWordsLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the Google Analytics account to create the link for.
    * @param {string} params.webPropertyId Web property ID to create the link for.
    * @param {().EntityAdWordsLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(params: ParamsResourceManagementWebpropertyadwordslinksInsert): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    options: BodyResponseCallback[SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementWebpropertyadwordslinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  
  /**
    * analytics.management.webPropertyAdWordsLinks.list
    * @desc Lists webProperty-Google Ads links for a given web property.
    * @alias analytics.management.webPropertyAdWordsLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {integer=} params.max-results The maximum number of webProperty-Google Ads links to include in this response.
    * @param {integer=} params.start-index An index of the first webProperty-Google Ads link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads links for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityAdWordsLinks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(params: ParamsResourceManagementWebpropertyadwordslinksList): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    callback: BodyResponseCallback[SchemaEntityAdWordsLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    options: BodyResponseCallback[SchemaEntityAdWordsLinks],
    callback: BodyResponseCallback[SchemaEntityAdWordsLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementWebpropertyadwordslinksList, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLinks]
  ): Unit = js.native
  
  /**
    * analytics.management.webPropertyAdWordsLinks.patch
    * @desc Updates an existing webProperty-Google Ads link. This method
    * supports patch semantics.
    * @alias analytics.management.webPropertyAdWordsLinks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property-Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads link for.
    * @param {().EntityAdWordsLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(params: ParamsResourceManagementWebpropertyadwordslinksPatch): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    options: BodyResponseCallback[SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementWebpropertyadwordslinksPatch, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  
  /**
    * analytics.management.webPropertyAdWordsLinks.update
    * @desc Updates an existing webProperty-Google Ads link.
    * @alias analytics.management.webPropertyAdWordsLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property-Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads link for.
    * @param {().EntityAdWordsLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(params: ParamsResourceManagementWebpropertyadwordslinksUpdate): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    options: BodyResponseCallback[SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementWebpropertyadwordslinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
}
