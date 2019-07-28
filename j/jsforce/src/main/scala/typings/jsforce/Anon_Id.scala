package typings.jsforce

import typings.jsforce.salesforceDashIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var Id: js.UndefOr[SalesforceId] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(Id: SalesforceId = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[Anon_Id]
  }
}

