package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Message */] extends js.Object {
  var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
  var channel: /* import warning: ImportType.apply Failed type conversion: T['channel'] */ js.Any
  var content: /* import warning: ImportType.apply Failed type conversion: T['content'] */ js.Any
  var metadata: js.UndefOr[JSONObject] = js.undefined
  var msgId: js.UndefOr[String] = js.undefined
  var msgType: /* import warning: ImportType.apply Failed type conversion: T['header']['msg_type'] */ js.Any
  var parentHeader: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['parent_header'] */ js.Any
  ] = js.undefined
  var session: String
  var username: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T /* <: Message */](
    channel: /* import warning: ImportType.apply Failed type conversion: T['channel'] */ js.Any,
    content: /* import warning: ImportType.apply Failed type conversion: T['content'] */ js.Any,
    msgType: /* import warning: ImportType.apply Failed type conversion: T['header']['msg_type'] */ js.Any,
    session: String,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null,
    metadata: JSONObject = null,
    msgId: String = null,
    parentHeader: /* import warning: ImportType.apply Failed type conversion: T['parent_header'] */ js.Any = null,
    username: String = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, msgType = msgType, session = session)
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (msgId != null) __obj.updateDynamic("msgId")(msgId)
    if (parentHeader != null) __obj.updateDynamic("parentHeader")(parentHeader)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[IOptions[T]]
  }
}

