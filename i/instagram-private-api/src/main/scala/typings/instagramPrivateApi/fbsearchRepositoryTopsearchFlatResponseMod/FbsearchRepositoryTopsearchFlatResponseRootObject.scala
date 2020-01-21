package typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

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
    val __obj = js.Dynamic.literal(clear_client_cache = clear_client_cache.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseRootObject]
  }
}

