package typings.googleapis.customsearchV1Mod.customsearchV1

import typings.googleapis.AnonHeightSource
import typings.googleapis.AnonHtmlTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPromotion extends js.Object {
  var bodyLines: js.UndefOr[js.Array[AnonHtmlTitle]] = js.native
  var displayLink: js.UndefOr[String] = js.native
  var htmlTitle: js.UndefOr[String] = js.native
  var image: js.UndefOr[AnonHeightSource] = js.native
  var link: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaPromotion {
  @scala.inline
  def apply(
    bodyLines: js.Array[AnonHtmlTitle] = null,
    displayLink: String = null,
    htmlTitle: String = null,
    image: AnonHeightSource = null,
    link: String = null,
    title: String = null
  ): SchemaPromotion = {
    val __obj = js.Dynamic.literal()
    if (bodyLines != null) __obj.updateDynamic("bodyLines")(bodyLines.asInstanceOf[js.Any])
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPromotion]
  }
}

