package typings.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatFromOptionsBuilder extends js.Object {
  /** Create and concatenate readable streams from paths and pipe to markdown-pdf. */
  def paths(paths: js.Array[String], opts: js.Any): ToOptionsBuilder = js.native
  /** Create and concatenate readable streams from strings and pipe to markdown-pdf. */
  def strings(markdownTexts: js.Array[String], opts: js.Any): ToOptionsBuilder = js.native
}

object ConcatFromOptionsBuilder {
  @scala.inline
  def apply(
    paths: (js.Array[String], js.Any) => ToOptionsBuilder,
    strings: (js.Array[String], js.Any) => ToOptionsBuilder
  ): ConcatFromOptionsBuilder = {
    val __obj = js.Dynamic.literal(paths = js.Any.fromFunction2(paths), strings = js.Any.fromFunction2(strings))
    __obj.asInstanceOf[ConcatFromOptionsBuilder]
  }
  @scala.inline
  implicit class ConcatFromOptionsBuilderOps[Self <: ConcatFromOptionsBuilder] (val x: Self) extends AnyVal {
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
    def setPaths(value: (js.Array[String], js.Any) => ToOptionsBuilder): Self = this.set("paths", js.Any.fromFunction2(value))
    @scala.inline
    def setStrings(value: (js.Array[String], js.Any) => ToOptionsBuilder): Self = this.set("strings", js.Any.fromFunction2(value))
  }
  
}

