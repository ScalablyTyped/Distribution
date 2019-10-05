package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import typings.atJupyterlabServices.atJupyterlabServicesStrings.recv
import typings.atJupyterlabServices.atJupyterlabServicesStrings.send
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IMessage
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.MessageType
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
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], msg = msg)
  
    __obj.asInstanceOf[IAnyMessageArgs]
  }
}

