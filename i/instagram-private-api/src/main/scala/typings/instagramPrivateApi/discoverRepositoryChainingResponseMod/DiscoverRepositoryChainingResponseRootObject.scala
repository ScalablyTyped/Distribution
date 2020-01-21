package typings.instagramPrivateApi.discoverRepositoryChainingResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverRepositoryChainingResponseRootObject extends js.Object {
  var available_recommend_count: Double
  var is_backup: Boolean
  var is_recommend_account: Boolean
  var status: String
  var users: js.Array[DiscoverRepositoryChainingResponseUsersItem]
}

object DiscoverRepositoryChainingResponseRootObject {
  @scala.inline
  def apply(
    available_recommend_count: Double,
    is_backup: Boolean,
    is_recommend_account: Boolean,
    status: String,
    users: js.Array[DiscoverRepositoryChainingResponseUsersItem]
  ): DiscoverRepositoryChainingResponseRootObject = {
    val __obj = js.Dynamic.literal(available_recommend_count = available_recommend_count.asInstanceOf[js.Any], is_backup = is_backup.asInstanceOf[js.Any], is_recommend_account = is_recommend_account.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiscoverRepositoryChainingResponseRootObject]
  }
}

