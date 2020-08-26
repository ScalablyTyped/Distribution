package typings.jsonServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForeignKeySuffix extends js.Object {
  var foreignKeySuffix: String = js.native
}

object ForeignKeySuffix {
  @scala.inline
  def apply(foreignKeySuffix: String): ForeignKeySuffix = {
    val __obj = js.Dynamic.literal(foreignKeySuffix = foreignKeySuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForeignKeySuffix]
  }
  @scala.inline
  implicit class ForeignKeySuffixOps[Self <: ForeignKeySuffix] (val x: Self) extends AnyVal {
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
    def setForeignKeySuffix(value: String): Self = this.set("foreignKeySuffix", value.asInstanceOf[js.Any])
  }
  
}

