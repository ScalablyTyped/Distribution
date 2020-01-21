package typings.iotaLibJs.mod

import typings.iotaLibJs.AnonHost
import typings.iotaLibJs.AnonProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iota.lib.js", JSImport.Namespace)
@js.native
class ^ protected () extends IotaClass {
  def this(settings: AnonHost) = this()
  def this(settings: AnonProvider) = this()
  /* CompleteClass */
  override var api: IotaApi = js.native
  /* CompleteClass */
  override var multisig: IotaMultisig = js.native
  /* CompleteClass */
  override var utils: IotaUtils = js.native
  /* CompleteClass */
  override var valid: IotaValid = js.native
  /* CompleteClass */
  override var version: String = js.native
}

