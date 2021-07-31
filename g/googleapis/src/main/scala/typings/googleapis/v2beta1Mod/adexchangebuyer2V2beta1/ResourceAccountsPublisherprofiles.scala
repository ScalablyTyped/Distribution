package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Publisherprofiles")
@js.native
class ResourceAccountsPublisherprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer2.accounts.publisherProfiles.get
    * @desc Gets the requested publisher profile by id.
    * @alias adexchangebuyer2.accounts.publisherProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.publisherProfileId The id for the publisher profile to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaPublisherProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(params: ParamsResourceAccountsPublisherprofilesGet): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    options: BodyResponseCallback[SchemaPublisherProfile],
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsPublisherprofilesGet, options: MethodOptions): GaxiosPromise[SchemaPublisherProfile] = js.native
  def get(
    params: ParamsResourceAccountsPublisherprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublisherProfile]
  ): Unit = js.native
  
  /**
    * adexchangebuyer2.accounts.publisherProfiles.list
    * @desc List all publisher profiles visible to the buyer
    * @alias adexchangebuyer2.accounts.publisherProfiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {integer=} params.pageSize Specify the number of results to include per page.
    * @param {string=} params.pageToken The page token as return from ListPublisherProfilesResponse.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(params: ParamsResourceAccountsPublisherprofilesList): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    options: BodyResponseCallback[SchemaListPublisherProfilesResponse],
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsPublisherprofilesList, options: MethodOptions): GaxiosPromise[SchemaListPublisherProfilesResponse] = js.native
  def list(
    params: ParamsResourceAccountsPublisherprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPublisherProfilesResponse]
  ): Unit = js.native
}
