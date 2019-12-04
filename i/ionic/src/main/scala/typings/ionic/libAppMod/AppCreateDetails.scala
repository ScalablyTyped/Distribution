package typings.ionic.libAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCreateDetails extends js.Object {
  val name: String
  val org_id: js.UndefOr[String] = js.undefined
}

object AppCreateDetails {
  @scala.inline
  def apply(name: String, org_id: String = null): AppCreateDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (org_id != null) __obj.updateDynamic("org_id")(org_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCreateDetails]
  }
}

