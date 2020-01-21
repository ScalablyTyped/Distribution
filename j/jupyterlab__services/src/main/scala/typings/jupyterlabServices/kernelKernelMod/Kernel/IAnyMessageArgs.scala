package typings.jupyterlabServices.kernelKernelMod.Kernel

import typings.jupyterlabServices.jupyterlabServicesStrings.recv
import typings.jupyterlabServices.jupyterlabServicesStrings.send
import typings.jupyterlabServices.messagesMod.KernelMessage.IMessage
import typings.jupyterlabServices.messagesMod.KernelMessage.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments interface for the anyMessage signal.
  */
trait IAnyMessageArgs extends js.Object {
  /**
    * The direction of the message.
    */
  var direction: send | recv
  /**
    * The message that is being signaled.
    */
  var msg: IMessage[MessageType]
}

object IAnyMessageArgs {
  @scala.inline
  def apply(direction: send | recv, msg: IMessage[MessageType]): IAnyMessageArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnyMessageArgs]
  }
}

