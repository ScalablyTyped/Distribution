package typings.atGrpcGrpcDashJs.buildSrcResolverMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcServiceDashConfigMod.ServiceConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverListener extends js.Object {
  /**
    * Called whenever a name resolution attempt fails.
    * @param error Describes how resolution failed
    */
  def onError(error: StatusObject): Unit = js.native
  def onSuccessfulResolution(addressList: js.Array[String]): Unit = js.native
  def onSuccessfulResolution(addressList: js.Array[String], serviceConfig: Null, serviceConfigError: StatusObject): Unit = js.native
  def onSuccessfulResolution(addressList: js.Array[String], serviceConfig: ServiceConfig): Unit = js.native
  /**
    * Called whenever the resolver has new name resolution results to report
    * @param addressList The new list of backend addresses
    * @param serviceConfig The new service configuration corresponding to the
    *     `addressList`. Will be `null` if no service configuration was
    *     retrieved or if the service configuration was invalid
    * @param serviceConfigError If non-`null`, indicates that the retrieved
    *     service configuration was invalid
    */
  def onSuccessfulResolution(addressList: js.Array[String], serviceConfig: ServiceConfig, serviceConfigError: StatusObject): Unit = js.native
}

