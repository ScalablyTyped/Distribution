package typings.jqueryDashGalleria.GalleriaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleriaEntry extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var thumbnail: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GalleriaEntry {
  @scala.inline
  def apply(description: String = null, image: String = null, thumbnail: String = null, title: String = null): GalleriaEntry = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GalleriaEntry]
  }
}

