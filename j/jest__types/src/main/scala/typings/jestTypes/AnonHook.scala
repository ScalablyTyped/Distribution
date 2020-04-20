package typings.jestTypes

import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.Hook
import typings.jestTypes.jestTypesStrings.hook_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHook extends Event {
  var hook: Hook
  var name: hook_start
}

object AnonHook {
  @scala.inline
  def apply(hook: Hook, name: hook_start): AnonHook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHook]
  }
}

