package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pub extends js.Object {
  var ok: typings.gun.gunNumbers.`0` = js.native
  var pub: String = js.native
}

object Pub {
  @scala.inline
  def apply(ok: typings.gun.gunNumbers.`0`, pub: String): Pub = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pub]
  }
  @scala.inline
  implicit class PubOps[Self <: Pub] (val x: Self) extends AnyVal {
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
    def setOk(value: typings.gun.gunNumbers.`0`): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setPub(value: String): Self = this.set("pub", value.asInstanceOf[js.Any])
  }
  
}

