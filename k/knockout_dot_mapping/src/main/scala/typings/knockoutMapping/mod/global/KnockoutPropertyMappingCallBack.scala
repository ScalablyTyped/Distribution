package typings.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPropertyMappingCallBack extends js.Object {
  var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, Unit]] = js.native
  var key: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, Unit]] = js.native
}

object KnockoutPropertyMappingCallBack {
  @scala.inline
  def apply(): KnockoutPropertyMappingCallBack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutPropertyMappingCallBack]
  }
  @scala.inline
  implicit class KnockoutPropertyMappingCallBackOps[Self <: KnockoutPropertyMappingCallBack] (val x: Self) extends AnyVal {
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
    def setCreate(value: /* options */ KnockoutMappingCreateOptions => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setKey(value: /* data */ js.Any => _): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setUpdate(value: /* options */ KnockoutMappingUpdateOptions => Unit): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

