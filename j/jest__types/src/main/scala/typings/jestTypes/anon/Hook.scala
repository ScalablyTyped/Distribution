package typings.jestTypes.anon

import typings.jestTypes.circusMod.Event
import typings.jestTypes.jestTypesStrings.hook_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends Event {
  var hook: typings.jestTypes.circusMod.Hook = js.native
  var name: hook_start = js.native
}

object Hook {
  @scala.inline
  def apply(hook: typings.jestTypes.circusMod.Hook, name: hook_start): Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
  @scala.inline
  implicit class HookOps[Self <: Hook] (val x: Self) extends AnyVal {
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
    def setHook(value: typings.jestTypes.circusMod.Hook): Self = this.set("hook", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: hook_start): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

