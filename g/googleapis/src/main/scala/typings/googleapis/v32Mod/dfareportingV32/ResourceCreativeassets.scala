package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Creativeassets")
@js.native
class ResourceCreativeassets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creativeAssets.insert
    * @desc Inserts a new creative asset.
    * @alias dfareporting.creativeAssets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.advertiserId Advertiser ID of this creative. This is a required field.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeAssetMetadata]): Unit = js.native
  def insert(params: ParamsResourceCreativeassetsInsert): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    callback: BodyResponseCallback[SchemaCreativeAssetMetadata]
  ): Unit = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    options: BodyResponseCallback[SchemaCreativeAssetMetadata],
    callback: BodyResponseCallback[SchemaCreativeAssetMetadata]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativeassetsInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeAssetMetadata] = js.native
  def insert(
    params: ParamsResourceCreativeassetsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeAssetMetadata]
  ): Unit = js.native
}

