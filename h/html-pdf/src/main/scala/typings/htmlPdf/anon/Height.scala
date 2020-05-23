package typings.htmlPdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var contents: js.UndefOr[Dictpage] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object Height {
  @scala.inline
  def apply(contents: Dictpage = null, height: String = null): Height = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

