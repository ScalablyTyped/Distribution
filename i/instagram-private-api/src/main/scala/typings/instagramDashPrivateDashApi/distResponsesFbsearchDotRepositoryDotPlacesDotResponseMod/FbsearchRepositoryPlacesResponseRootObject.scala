package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotPlacesDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryPlacesResponseRootObject extends js.Object {
  var has_more: Boolean
  var items: js.Array[FbsearchRepositoryPlacesResponseItemsItem]
  var rank_token: String
  var status: String
}

object FbsearchRepositoryPlacesResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    items: js.Array[FbsearchRepositoryPlacesResponseItemsItem],
    rank_token: String,
    status: String
  ): FbsearchRepositoryPlacesResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FbsearchRepositoryPlacesResponseRootObject]
  }
}

