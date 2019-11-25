package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.CAROUSEL
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.PHOTO
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CAROUSEL extends js.Object {
  var mediaId: String
  var mediaType: js.UndefOr[PHOTO | VIDEO | CAROUSEL] = js.undefined
}

object Anon_CAROUSEL {
  @scala.inline
  def apply(mediaId: String, mediaType: PHOTO | VIDEO | CAROUSEL = null): Anon_CAROUSEL = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CAROUSEL]
  }
}

