package typings
package jqueryDashGalleriaLib.GalleriaJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleriaEntry extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var thumbnail: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object GalleriaEntry {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    image: java.lang.String = null,
    thumbnail: java.lang.String = null,
    title: java.lang.String = null
  ): GalleriaEntry = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[GalleriaEntry]
  }
}

