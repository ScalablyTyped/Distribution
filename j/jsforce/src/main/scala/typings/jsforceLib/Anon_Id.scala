package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var Id: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(Id: jsforceLib.salesforceDashIdMod.SalesforceId = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[Anon_Id]
  }
}

