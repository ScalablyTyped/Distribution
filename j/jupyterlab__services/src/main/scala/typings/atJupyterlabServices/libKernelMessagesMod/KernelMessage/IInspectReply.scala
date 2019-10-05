package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.ok
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'inspect_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
  *
  * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
  */
trait IInspectReply extends IReplyOkContent {
  var data: JSONObject
  var found: Boolean
  var metadata: JSONObject
}

object IInspectReply {
  @scala.inline
  def apply(data: JSONObject, found: Boolean, metadata: JSONObject, status: ok): IInspectReply = {
    val __obj = js.Dynamic.literal(data = data, found = found, metadata = metadata, status = status)
  
    __obj.asInstanceOf[IInspectReply]
  }
}

