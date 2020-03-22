package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/messages", "createMessage")
@js.native
object createMessage extends js.Object {
  def apply[T /* <: ICommCloseMsg[shell] */](options: IOptions[T]): T = js.native
}

