package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.hook_start
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.Hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hook extends Event {
  var hook: Hook
  var name: hook_start
}

object Anon_Hook {
  @scala.inline
  def apply(hook: Hook, name: hook_start): Anon_Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hook]
  }
}

