package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$Shortlinks")
@js.native
class ResourceShortlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * firebasedynamiclinks.shortLinks.create
    * @desc Creates a short Dynamic Link given either a valid long Dynamic Link
    * or details such as Dynamic Link domain, Android and iOS app information.
    * The created short Dynamic Link will not expire.  Repeated calls with the
    * same long Dynamic Link or Dynamic Link information will produce the same
    * short Dynamic Link.  The Dynamic Link domain in the request must be owned
    * by requester's Firebase project.
    * @alias firebasedynamiclinks.shortLinks.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateShortDynamicLinkRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(params: ParamsResourceShortlinksCreate): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    options: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse],
    callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]
  ): Unit = js.native
  def create(params: ParamsResourceShortlinksCreate, options: MethodOptions): GaxiosPromise[SchemaCreateShortDynamicLinkResponse] = js.native
  def create(
    params: ParamsResourceShortlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateShortDynamicLinkResponse]
  ): Unit = js.native
}
