package typings.jsforce.anon

import typings.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var Id: js.UndefOr[SalesforceId] = js.undefined
}

object Id {
  @scala.inline
  def apply(Id: SalesforceId = null): Id = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

