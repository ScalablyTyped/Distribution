package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponseRootObject extends js.Object {
  var clear_client_cache: Boolean
  var has_more: Boolean
  var list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]
  var rank_token: String
  var status: String
}

object FbsearchRepositoryTopsearchFlatResponseRootObject {
  @scala.inline
  def apply(
    clear_client_cache: Boolean,
    has_more: Boolean,
    list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem],
    rank_token: String,
    status: String
  ): FbsearchRepositoryTopsearchFlatResponseRootObject = {
    val __obj = js.Dynamic.literal(clear_client_cache = clear_client_cache, has_more = has_more, list = list, rank_token = rank_token, status = status)
  
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseRootObject]
  }
}

