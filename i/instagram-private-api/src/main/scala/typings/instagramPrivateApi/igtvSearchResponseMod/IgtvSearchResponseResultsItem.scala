package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseResultsItem extends js.Object {
  var channel: IgtvSearchResponseChannel
  var `type`: String
  var user: IgtvSearchResponseUser
}

object IgtvSearchResponseResultsItem {
  @scala.inline
  def apply(channel: IgtvSearchResponseChannel, `type`: String, user: IgtvSearchResponseUser): IgtvSearchResponseResultsItem = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseResultsItem]
  }
}

