package typings.jsforce

import typings.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var Id: js.UndefOr[SalesforceId] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(Id: SalesforceId = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

