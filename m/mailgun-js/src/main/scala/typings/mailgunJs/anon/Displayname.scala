package typings.mailgunJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displayname extends js.Object {
  var display_name: String | Null = js.native
  var domain: String = js.native
  var local_part: String = js.native
}

object Displayname {
  @scala.inline
  def apply(domain: String, local_part: String): Displayname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], local_part = local_part.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
  @scala.inline
  implicit class DisplaynameOps[Self <: Displayname] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal_part(value: String): Self = this.set("local_part", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_nameNull: Self = this.set("display_name", null)
  }
  
}

