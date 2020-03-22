package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

