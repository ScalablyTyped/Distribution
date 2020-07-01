package typings.markdownItEmoji.mod.MarkdownItEmoji

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defs: js.UndefOr[Record[String, String]] = js.undefined
  var enabled: js.UndefOr[js.Array[String]] = js.undefined
  var shortcuts: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defs: Record[String, String] = null,
    enabled: js.Array[String] = null,
    shortcuts: Record[String, String | js.Array[String]] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (shortcuts != null) __obj.updateDynamic("shortcuts")(shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

