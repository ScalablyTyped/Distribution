package typings.ionic.anon

import typings.ionic.definitionsMod.Org
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ionic.ionic/definitions.App, 'name' | 'org'> */
trait PickAppnameorg extends js.Object {
  var name: String
  @JSName("org")
  var org_ : js.UndefOr[Org] = js.undefined
}

object PickAppnameorg {
  @scala.inline
  def apply(name: String, org_ : Org = null): PickAppnameorg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (org_ != null) __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAppnameorg]
  }
}

