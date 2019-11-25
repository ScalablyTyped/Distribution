package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Message */] extends js.Object {
  var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
  var channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any
  var content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any
  var metadata: js.UndefOr[JSONObject] = js.undefined
  var msgId: js.UndefOr[String] = js.undefined
  var msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any
  var parentHeader: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
  ] = js.undefined
  var session: String
  var username: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T /* <: Message */](
    channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any,
    content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any,
    msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any,
    session: String,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null,
    metadata: JSONObject = null,
    msgId: String = null,
    parentHeader: /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any = null,
    username: String = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], msgType = msgType.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (msgId != null) __obj.updateDynamic("msgId")(msgId.asInstanceOf[js.Any])
    if (parentHeader != null) __obj.updateDynamic("parentHeader")(parentHeader.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

