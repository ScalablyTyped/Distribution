package typings.instagramDashPrivateDashApi.distResponsesNewsDotRepositoryDotInboxDotResponseMod

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
    val __obj = js.Dynamic.literal(items = items, more_available = more_available)
  
    __obj.asInstanceOf[NewsRepositoryInboxResponseAymf]
  }
}

