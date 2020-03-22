package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL
import typings.instagramPrivateApi.instagramPrivateApiStrings.PHOTO
import typings.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaId extends js.Object {
  var mediaId: String
  var mediaType: js.UndefOr[PHOTO | VIDEO | CAROUSEL] = js.undefined
}

object AnonMediaId {
  @scala.inline
  def apply(mediaId: String, mediaType: PHOTO | VIDEO | CAROUSEL = null): AnonMediaId = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaId]
  }
}

