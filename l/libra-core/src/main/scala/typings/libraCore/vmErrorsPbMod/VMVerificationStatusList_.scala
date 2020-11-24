package typings.libraCore.vmErrorsPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMVerificationStatusList")
@js.native
class VMVerificationStatusList_ () extends Message {
  
  def addStatusList(): VMVerificationStatus = js.native
  def addStatusList(value: js.UndefOr[scala.Nothing], index: Double): VMVerificationStatus = js.native
  def addStatusList(value: VMVerificationStatus): VMVerificationStatus = js.native
  def addStatusList(value: VMVerificationStatus, index: Double): VMVerificationStatus = js.native
  
  def clearStatusListList(): Unit = js.native
  
  def getStatusListList(): js.Array[VMVerificationStatus] = js.native
  
  def setStatusListList(value: js.Array[VMVerificationStatus]): Unit = js.native
}
