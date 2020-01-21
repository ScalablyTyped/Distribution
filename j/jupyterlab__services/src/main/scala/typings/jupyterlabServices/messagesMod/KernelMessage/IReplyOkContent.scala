package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
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
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReplyOkContent]
  }
}

