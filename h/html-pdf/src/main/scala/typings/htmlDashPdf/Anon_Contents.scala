package typings.htmlDashPdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contents extends js.Object {
  var contents: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object Anon_Contents {
  @scala.inline
  def apply(contents: String = null, height: String = null): Anon_Contents = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Contents]
  }
}

