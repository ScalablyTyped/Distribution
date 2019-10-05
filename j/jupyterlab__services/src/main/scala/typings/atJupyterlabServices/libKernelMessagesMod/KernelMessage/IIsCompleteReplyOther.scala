package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete
import typings.atJupyterlabServices.atJupyterlabServicesStrings.invalid
import typings.atJupyterlabServices.atJupyterlabServicesStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A completion reply for completion or invalid states.
  */
trait IIsCompleteReplyOther extends js.Object {
  var status: complete | invalid | unknown
}

object IIsCompleteReplyOther {
  @scala.inline
  def apply(status: complete | invalid | unknown): IIsCompleteReplyOther = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIsCompleteReplyOther]
  }
}

