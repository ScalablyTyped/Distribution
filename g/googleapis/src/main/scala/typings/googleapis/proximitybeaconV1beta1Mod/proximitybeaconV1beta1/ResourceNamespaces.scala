package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/proximitybeacon/v1beta1", "proximitybeacon_v1beta1.Resource$Namespaces")
@js.native
class ResourceNamespaces protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * proximitybeacon.namespaces.list
    * @desc Lists all attachment namespaces owned by your Google Developers
    * Console project. Attachment data associated with a beacon must include a
    * namespaced type, and the namespace must be owned by your project.
    * Authenticate using an [OAuth access
    * token](https://developers.google.com/identity/protocols/OAuth2) from a
    * signed-in user with **viewer**, **Is owner** or **Can edit** permissions
    * in the Google Developers Console project.
    * @alias proximitybeacon.namespaces.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.projectId The project id to list namespaces under. Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNamespacesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNamespacesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNamespacesResponse] = js.native
  def list(params: ParamsResourceNamespacesList): GaxiosPromise[SchemaListNamespacesResponse] = js.native
  def list(params: ParamsResourceNamespacesList, callback: BodyResponseCallback[SchemaListNamespacesResponse]): Unit = js.native
  def list(
    params: ParamsResourceNamespacesList,
    options: BodyResponseCallback[SchemaListNamespacesResponse],
    callback: BodyResponseCallback[SchemaListNamespacesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNamespacesList, options: MethodOptions): GaxiosPromise[SchemaListNamespacesResponse] = js.native
  def list(
    params: ParamsResourceNamespacesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNamespacesResponse]
  ): Unit = js.native
  /**
    * proximitybeacon.namespaces.update
    * @desc Updates the information about the specified namespace. Only the
    * namespace visibility can be updated.
    * @alias proximitybeacon.namespaces.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.namespaceName Resource name of this namespace. Namespaces names have the format: <code>namespaces/<var>namespace</var></code>.
    * @param {string=} params.projectId The project id of the namespace to update. If the project id is not specified then the project making the request is used. The project id must match the project that owns the beacon. Optional.
    * @param {().Namespace} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaNamespace] = js.native
  def update(callback: BodyResponseCallback[SchemaNamespace]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNamespace] = js.native
  def update(params: ParamsResourceNamespacesUpdate): GaxiosPromise[SchemaNamespace] = js.native
  def update(params: ParamsResourceNamespacesUpdate, callback: BodyResponseCallback[SchemaNamespace]): Unit = js.native
  def update(
    params: ParamsResourceNamespacesUpdate,
    options: BodyResponseCallback[SchemaNamespace],
    callback: BodyResponseCallback[SchemaNamespace]
  ): Unit = js.native
  def update(params: ParamsResourceNamespacesUpdate, options: MethodOptions): GaxiosPromise[SchemaNamespace] = js.native
  def update(
    params: ParamsResourceNamespacesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNamespace]
  ): Unit = js.native
}

