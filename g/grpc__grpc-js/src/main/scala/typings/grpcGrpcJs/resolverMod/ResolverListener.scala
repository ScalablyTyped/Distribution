package typings.grpcGrpcJs.resolverMod

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.serviceConfigMod.ServiceConfig
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverListener extends js.Object {
  
  /**
    * Called whenever a name resolution attempt fails.
    * @param error Describes how resolution failed
    */
  def onError(error: StatusObject): Unit = js.native
  
  def onSuccessfulResolution(
    addressList: js.Array[SubchannelAddress],
    serviceConfig: Null,
    serviceConfigError: Null,
    attributes: StringDictionary[js.Any]
  ): Unit = js.native
  def onSuccessfulResolution(
    addressList: js.Array[SubchannelAddress],
    serviceConfig: Null,
    serviceConfigError: StatusObject,
    attributes: StringDictionary[js.Any]
  ): Unit = js.native
  def onSuccessfulResolution(
    addressList: js.Array[SubchannelAddress],
    serviceConfig: ServiceConfig,
    serviceConfigError: Null,
    attributes: StringDictionary[js.Any]
  ): Unit = js.native
  /**
    * Called whenever the resolver has new name resolution results to report
    * @param addressList The new list of backend addresses
    * @param serviceConfig The new service configuration corresponding to the
    *     `addressList`. Will be `null` if no service configuration was
    *     retrieved or if the service configuration was invalid
    * @param serviceConfigError If non-`null`, indicates that the retrieved
    *     service configuration was invalid
    */
  def onSuccessfulResolution(
    addressList: js.Array[SubchannelAddress],
    serviceConfig: ServiceConfig,
    serviceConfigError: StatusObject,
    attributes: StringDictionary[js.Any]
  ): Unit = js.native
}
