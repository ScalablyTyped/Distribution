package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/siteVerification/v1", "siteVerification_v1.Resource$Webresource")
@js.native
class ResourceWebresource protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * siteVerification.webResource.delete
    * @desc Relinquish ownership of a website or domain.
    * @alias siteVerification.webResource.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceWebresourceDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebresourceDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceWebresourceDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceWebresourceDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceWebresourceDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * siteVerification.webResource.get
    * @desc Get the most current data for a website or domain.
    * @alias siteVerification.webResource.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def get(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
  def get(params: ParamsResourceWebresourceGet): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def get(
    params: ParamsResourceWebresourceGet,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def get(
    params: ParamsResourceWebresourceGet,
    options: BodyResponseCallback[SchemaSiteVerificationWebResourceResource],
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def get(params: ParamsResourceWebresourceGet, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def get(
    params: ParamsResourceWebresourceGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  /**
    * siteVerification.webResource.getToken
    * @desc Get a verification token for placing on a website or domain.
    * @alias siteVerification.webResource.getToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SiteVerificationWebResourceGettokenRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getToken(): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]): Unit = js.native
  def getToken(params: ParamsResourceWebresourceGettoken): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(
    params: ParamsResourceWebresourceGettoken,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]
  ): Unit = js.native
  def getToken(
    params: ParamsResourceWebresourceGettoken,
    options: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse],
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]
  ): Unit = js.native
  def getToken(params: ParamsResourceWebresourceGettoken, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceGettokenResponse] = js.native
  def getToken(
    params: ParamsResourceWebresourceGettoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceGettokenResponse]
  ): Unit = js.native
  /**
    * siteVerification.webResource.insert
    * @desc Attempt verification of a website or domain.
    * @alias siteVerification.webResource.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.verificationMethod The method to use for verifying a site or domain.
    * @param {().SiteVerificationWebResourceResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def insert(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
  def insert(params: ParamsResourceWebresourceInsert): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def insert(
    params: ParamsResourceWebresourceInsert,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def insert(
    params: ParamsResourceWebresourceInsert,
    options: BodyResponseCallback[SchemaSiteVerificationWebResourceResource],
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def insert(params: ParamsResourceWebresourceInsert, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def insert(
    params: ParamsResourceWebresourceInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  /**
    * siteVerification.webResource.list
    * @desc Get the list of your verified websites and domains.
    * @alias siteVerification.webResource.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]): Unit = js.native
  def list(params: ParamsResourceWebresourceList): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
  def list(
    params: ParamsResourceWebresourceList,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceWebresourceList,
    options: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse],
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceWebresourceList, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceListResponse] = js.native
  def list(
    params: ParamsResourceWebresourceList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceListResponse]
  ): Unit = js.native
  /**
    * siteVerification.webResource.patch
    * @desc Modify the list of owners for your website or domain. This method
    * supports patch semantics.
    * @alias siteVerification.webResource.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {().SiteVerificationWebResourceResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def patch(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
  def patch(params: ParamsResourceWebresourcePatch): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def patch(
    params: ParamsResourceWebresourcePatch,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def patch(
    params: ParamsResourceWebresourcePatch,
    options: BodyResponseCallback[SchemaSiteVerificationWebResourceResource],
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def patch(params: ParamsResourceWebresourcePatch, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def patch(
    params: ParamsResourceWebresourcePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  /**
    * siteVerification.webResource.update
    * @desc Modify the list of owners for your website or domain.
    * @alias siteVerification.webResource.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id of a verified site or domain.
    * @param {().SiteVerificationWebResourceResource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def update(callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]): Unit = js.native
  def update(params: ParamsResourceWebresourceUpdate): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def update(
    params: ParamsResourceWebresourceUpdate,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def update(
    params: ParamsResourceWebresourceUpdate,
    options: BodyResponseCallback[SchemaSiteVerificationWebResourceResource],
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
  def update(params: ParamsResourceWebresourceUpdate, options: MethodOptions): GaxiosPromise[SchemaSiteVerificationWebResourceResource] = js.native
  def update(
    params: ParamsResourceWebresourceUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSiteVerificationWebResourceResource]
  ): Unit = js.native
}

