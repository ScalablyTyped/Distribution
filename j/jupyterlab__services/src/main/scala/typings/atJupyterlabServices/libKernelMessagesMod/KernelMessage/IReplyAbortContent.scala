package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reply content indicating an aborted request.
  *
  * This is [deprecated](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply)
  * in message spec 5.1. Kernels should send an 'error' reply instead.
  */
trait IReplyAbortContent
  extends _ReplyContent[js.Any] {
  var status: abort
}

object IReplyAbortContent {
  @scala.inline
  def apply(status: abort): IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReplyAbortContent]
  }
}

