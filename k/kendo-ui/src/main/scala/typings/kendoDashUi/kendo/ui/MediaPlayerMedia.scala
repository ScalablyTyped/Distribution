package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerMedia extends js.Object {
  var source: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MediaPlayerMedia {
  @scala.inline
  def apply(source: String = null, title: String = null): MediaPlayerMedia = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerMedia]
  }
}

