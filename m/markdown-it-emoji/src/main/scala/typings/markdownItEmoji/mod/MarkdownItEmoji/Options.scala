package typings.markdownItEmoji.mod.MarkdownItEmoji

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var defs: js.UndefOr[Record[String, String]] = js.native
  var enabled: js.UndefOr[js.Array[String]] = js.native
  var shortcuts: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefs(value: Record[String, String]): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    @scala.inline
    def setEnabledVarargs(value: String*): Self = this.set("enabled", js.Array(value :_*))
    @scala.inline
    def setEnabled(value: js.Array[String]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setShortcuts(value: Record[String, String | js.Array[String]]): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcuts: Self = this.set("shortcuts", js.undefined)
  }
  
}

