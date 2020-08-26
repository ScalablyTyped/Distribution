package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'> */
@js.native
trait PickResolveInputHooksOpti extends js.Object {
  var context: js.Any = js.native
  var existingItem: js.Any = js.native
  var list: QueryManyMeta = js.native
}

object PickResolveInputHooksOpti {
  @scala.inline
  def apply(context: js.Any, existingItem: js.Any, list: QueryManyMeta): PickResolveInputHooksOpti = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResolveInputHooksOpti]
  }
  @scala.inline
  implicit class PickResolveInputHooksOptiOps[Self <: PickResolveInputHooksOpti] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setExistingItem(value: js.Any): Self = this.set("existingItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: QueryManyMeta): Self = this.set("list", value.asInstanceOf[js.Any])
  }
  
}

