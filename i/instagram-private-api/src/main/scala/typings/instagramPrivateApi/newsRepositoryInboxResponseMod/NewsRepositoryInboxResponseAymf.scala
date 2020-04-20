package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseAymf extends js.Object {
  var items: js.Array[NewsRepositoryInboxResponseItemsItem]
  var more_available: Boolean
}

object NewsRepositoryInboxResponseAymf {
  @scala.inline
  def apply(items: js.Array[NewsRepositoryInboxResponseItemsItem], more_available: Boolean): NewsRepositoryInboxResponseAymf = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseAymf]
  }
}

