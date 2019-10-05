package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reply content indicating a sucessful request.
  */
trait IReplyOkContent extends js.Object {
  var status: ok
}

object IReplyOkContent {
  @scala.inline
  def apply(status: ok): IReplyOkContent = {
    val __obj = js.Dynamic.literal(status = status)
  
    __obj.asInstanceOf[IReplyOkContent]
  }
}

