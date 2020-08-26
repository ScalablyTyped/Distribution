package typings.lokijs.anon

import typings.lokijs.lokijsStrings.find
import typings.lokijs.lokijsStrings.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var `type`: find | where = js.native
  var uid: js.UndefOr[String | Double] = js.native
  var `val`: js.Any = js.native
}

object Type {
  @scala.inline
  def apply(`type`: find | where, `val`: js.Any): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setType(value: find | where): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVal(value: js.Any): Self = this.set("val", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String | Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

