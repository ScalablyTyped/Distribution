package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.incomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An 'incomplete' completion reply
  */
trait IIsCompleteReplyIncomplete extends js.Object {
  var indent: String
  var status: incomplete
}

object IIsCompleteReplyIncomplete {
  @scala.inline
  def apply(indent: String, status: incomplete): IIsCompleteReplyIncomplete = {
    val __obj = js.Dynamic.literal(indent = indent, status = status)
  
    __obj.asInstanceOf[IIsCompleteReplyIncomplete]
  }
}

