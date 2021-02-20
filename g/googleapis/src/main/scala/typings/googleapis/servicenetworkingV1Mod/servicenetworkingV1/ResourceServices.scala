package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicenetworking/v1", "servicenetworking_v1.Resource$Services")
@js.native
class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * servicenetworking.services.addSubnetwork
    * @desc For service producers, provisions a new subnet in a peered
    * service's shared VPC network in the requested region and with the
    * requested size that's expressed as a CIDR range (number of leading bits
    * of ipV4 network mask). The method checks against the assigned allocated
    * ranges to find a non-conflicting IP address range. The method will reuse
    * a subnet if subsequent calls contain the same subnet name, region, and
    * prefix length. This method will make producer's tenant project to be a
    * shared VPC service project as needed. The response from the `get`
    * operation will be of type `Subnetwork` if the operation successfully
    * completes.
    * @alias servicenetworking.services.addSubnetwork
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. A tenant project in the service producer organization, in the following format: services/{service}/{collection-id}/{resource-id}. {collection-id} is the cloud resource collection type that represents the tenant project. Only `projects` are supported. {resource-id} is the tenant project numeric id, such as `123456`. {service} the name of the peering service, such as `service-peering.example.com`. This service must already be enabled in the service consumer's project.
    * @param {().AddSubnetworkRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addSubnetwork(): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSubnetwork(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSubnetwork(
    params: ParamsResourceServicesAddsubnetwork,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSubnetwork(params: ParamsResourceServicesAddsubnetwork, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSubnetwork(
    params: ParamsResourceServicesAddsubnetwork,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var connections: ResourceServicesConnections = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * servicenetworking.services.searchRange
    * @desc Service producers can use this method to find a currently unused
    * range within consumer allocated ranges.   This returned range is not
    * reserved, and not guaranteed to remain unused. It will validate
    * previously provided allocated ranges, find non-conflicting sub-range of
    * requested size (expressed in number of leading bits of ipv4 network mask,
    * as in CIDR range notation). Operation<response: Range>
    * @alias servicenetworking.services.searchRange
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. This is in a form services/{service}. {service} the name of the private access management service, for example 'service-peering.example.com'.
    * @param {().SearchRangeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchRange(): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def searchRange(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(params: ParamsResourceServicesSearchrange): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(params: ParamsResourceServicesSearchrange, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def searchRange(
    params: ParamsResourceServicesSearchrange,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def searchRange(params: ParamsResourceServicesSearchrange, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def searchRange(
    params: ParamsResourceServicesSearchrange,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
