package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasedynamiclinks/v1", "firebasedynamiclinks_v1.Resource$Managedshortlinks")
@js.native
class ResourceManagedshortlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * firebasedynamiclinks.managedShortLinks.create
    * @desc Creates a managed short Dynamic Link given either a valid long
    * Dynamic Link or details such as Dynamic Link domain, Android and iOS app
    * information. The created short Dynamic Link will not expire.  This
    * differs from CreateShortDynamicLink in the following ways:   - The
    * request will also contain a name for the link (non unique name     for
    * the front end).   - The response must be authenticated with an auth token
    * (generated with     the admin service account).   - The link will appear
    * in the FDL list of links in the console front end.  The Dynamic Link
    * domain in the request must be owned by requester's Firebase project.
    * @alias firebasedynamiclinks.managedShortLinks.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateManagedShortLinkRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaCreateManagedShortLinkResponse] = js.native
  def create(callback: BodyResponseCallback[SchemaCreateManagedShortLinkResponse]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateManagedShortLinkResponse] = js.native
  def create(params: ParamsResourceManagedshortlinksCreate): GaxiosPromise[SchemaCreateManagedShortLinkResponse] = js.native
  def create(
    params: ParamsResourceManagedshortlinksCreate,
    callback: BodyResponseCallback[SchemaCreateManagedShortLinkResponse]
  ): Unit = js.native
  def create(
    params: ParamsResourceManagedshortlinksCreate,
    options: BodyResponseCallback[SchemaCreateManagedShortLinkResponse],
    callback: BodyResponseCallback[SchemaCreateManagedShortLinkResponse]
  ): Unit = js.native
  def create(params: ParamsResourceManagedshortlinksCreate, options: MethodOptions): GaxiosPromise[SchemaCreateManagedShortLinkResponse] = js.native
  def create(
    params: ParamsResourceManagedshortlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateManagedShortLinkResponse]
  ): Unit = js.native
}
