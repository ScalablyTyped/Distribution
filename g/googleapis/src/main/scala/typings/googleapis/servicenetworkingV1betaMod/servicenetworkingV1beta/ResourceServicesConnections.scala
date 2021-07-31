package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicenetworking/v1beta", "servicenetworking_v1beta.Resource$Services$Connections")
@js.native
class ResourceServicesConnections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicenetworking.services.connections.create
    * @desc Creates a private connection that establishes a VPC Network Peering
    * connection to a VPC network in the service producer's organization. The
    * administrator of the service consumer's VPC network invokes this method.
    * The administrator must assign one or more allocated IP ranges for
    * provisioning subnetworks in the service producer's VPC network. This
    * connection is used for all supported services in the service producer's
    * organization, so it only needs to be invoked once. The response from the
    * `get` operation will be of type `Connection` if the operation
    * successfully completes.
    * @alias servicenetworking.services.connections.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`.
    * @param {().Connection} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesConnectionsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceServicesConnectionsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceServicesConnectionsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceServicesConnectionsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceServicesConnectionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * servicenetworking.services.connections.list
    * @desc List the private connections that are configured in a service
    * consumer's VPC network.
    * @alias servicenetworking.services.connections.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.network The name of service consumer's VPC network that's connected with service producer network through a private connection. The network name must be in the following format: `projects/{project}/global/networks/{network}`. {project} is a project number, such as in `12345` that includes the VPC service consumer's VPC network. {network} is the name of the service consumer's VPC network.
    * @param {string} params.parent The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`. If you specify `-` as the parameter value, all configured public peering services are listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConnectionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(params: ParamsResourceServicesConnectionsList): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(
    params: ParamsResourceServicesConnectionsList,
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesConnectionsList,
    options: BodyResponseCallback[SchemaListConnectionsResponse],
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesConnectionsList, options: MethodOptions): GaxiosPromise[SchemaListConnectionsResponse] = js.native
  def list(
    params: ParamsResourceServicesConnectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConnectionsResponse]
  ): Unit = js.native
}
