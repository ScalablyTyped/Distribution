package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reply content indicating an error.
  *
  * See the [Message spec](https://jupyter-client.readthedocs.io/en/latest/messaging.html#request-reply) for details.
  */
trait IReplyErrorContent
  extends _ReplyContent[js.Any] {
  /**
    * Exception name
    */
  var ename: String
  /**
    * Exception value
    */
  var evalue: String
  var status: error
  /**
    * Traceback
    */
  var traceback: js.Array[String]
}

object IReplyErrorContent {
  @scala.inline
  def apply(ename: String, evalue: String, status: error, traceback: js.Array[String]): IReplyErrorContent = {
    val __obj = js.Dynamic.literal(ename = ename, evalue = evalue, status = status, traceback = traceback)
  
    __obj.asInstanceOf[IReplyErrorContent]
  }
}

