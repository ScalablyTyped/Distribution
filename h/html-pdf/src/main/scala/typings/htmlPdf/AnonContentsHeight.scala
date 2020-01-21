package typings.htmlPdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentsHeight extends js.Object {
  var contents: js.UndefOr[AnonDefault] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object AnonContentsHeight {
  @scala.inline
  def apply(contents: AnonDefault = null, height: String = null): AnonContentsHeight = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentsHeight]
  }
}

