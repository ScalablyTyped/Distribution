package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBreaks extends js.Object {
  /*This controls the automatic breaking of expressions: when false, only linebreak="newline" is processed; when
    * true, line breaks are inserted automatically in long expressions.
    */
  var automatic: js.UndefOr[Boolean] = js.native
  /*This controls how wide the lines of mathematics can be.
    * Use an explicit width like "30em" for a fixed width. Use "container" to compute the size from the containing
    * element. Use "nn% container" for a portion of the container. Use "nn%" for a portion of the window size.
    * The container-based widths may be slower, and may not produce the expected results if the layout width changes
    * due to the removal of previews or inclusion of mathematics during typesetting.
    */
  var width: js.UndefOr[String] = js.native
}

object LineBreaks {
  @scala.inline
  def apply(): LineBreaks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineBreaks]
  }
  @scala.inline
  implicit class LineBreaksOps[Self <: LineBreaks] (val x: Self) extends AnyVal {
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
    def setAutomatic(value: Boolean): Self = this.set("automatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatic: Self = this.set("automatic", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

