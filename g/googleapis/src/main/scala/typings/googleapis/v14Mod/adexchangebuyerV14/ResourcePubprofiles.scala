package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Pubprofiles")
@js.native
class ResourcePubprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.pubprofiles.list
    * @desc Gets the requested publisher profile(s) by publisher accountId.
    * @alias adexchangebuyer.pubprofiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The accountId of the publisher to get profiles for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(params: ParamsResourcePubprofilesList): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    options: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse],
    callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePubprofilesList, options: MethodOptions): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
}
