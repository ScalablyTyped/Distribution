package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Resource$Media")
@js.native
class ResourceMedia protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plusDomains.media.insert
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.media.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection
    * @param {string} params.userId The ID of the user to create the activity on behalf of.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaMedia] = js.native
  def insert(callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def insert(params: ParamsResourceMediaInsert): GaxiosPromise[SchemaMedia] = js.native
  def insert(params: ParamsResourceMediaInsert, callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def insert(
    params: ParamsResourceMediaInsert,
    options: BodyResponseCallback[SchemaMedia],
    callback: BodyResponseCallback[SchemaMedia]
  ): Unit = js.native
  def insert(params: ParamsResourceMediaInsert, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def insert(
    params: ParamsResourceMediaInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMedia]
  ): Unit = js.native
}

