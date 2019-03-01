package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerMedia extends js.Object {
  var source: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object MediaPlayerMedia {
  @scala.inline
  def apply(source: java.lang.String = null, title: java.lang.String = null): MediaPlayerMedia = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MediaPlayerMedia]
  }
}

