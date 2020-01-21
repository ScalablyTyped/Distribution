package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseEntitiesItem extends js.Object {
  var hashtag: js.UndefOr[IgtvSearchResponseHashtag] = js.undefined
  var user: js.UndefOr[IgtvSearchResponseUser] = js.undefined
}

object IgtvSearchResponseEntitiesItem {
  @scala.inline
  def apply(hashtag: IgtvSearchResponseHashtag = null, user: IgtvSearchResponseUser = null): IgtvSearchResponseEntitiesItem = {
    val __obj = js.Dynamic.literal()
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseEntitiesItem]
  }
}

