package typings.ionic

import typings.ionic.definitionsMod.Org
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ionic.ionic/definitions.App, 'name' | 'org'> */
trait PickAppnameorg extends js.Object {
  var name: String
  var org: js.UndefOr[Org] = js.undefined
}

object PickAppnameorg {
  @scala.inline
  def apply(name: String, org: Org = null): PickAppnameorg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (org != null) __obj.updateDynamic("org")(org.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAppnameorg]
  }
}

