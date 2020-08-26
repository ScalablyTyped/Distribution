package typings.ionic.anon

import typings.ionic.definitionsMod.Org
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<ionic.ionic/definitions.App, 'name' | 'org'> */
@js.native
trait PickAppnameorg extends js.Object {
  var name: String = js.native
  @JSName("org")
  var org_ : Null | Org = js.native
}

object PickAppnameorg {
  @scala.inline
  def apply(name: String): PickAppnameorg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAppnameorg]
  }
  @scala.inline
  implicit class PickAppnameorgOps[Self <: PickAppnameorg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_(value: Org): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrg_Null: Self = this.set("org", null)
  }
  
}

