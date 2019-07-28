package typings.htmlDashPdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentsHeight extends js.Object {
  var contents: js.UndefOr[Anon_Default] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object Anon_ContentsHeight {
  @scala.inline
  def apply(contents: Anon_Default = null, height: String = null): Anon_ContentsHeight = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[Anon_ContentsHeight]
  }
}

