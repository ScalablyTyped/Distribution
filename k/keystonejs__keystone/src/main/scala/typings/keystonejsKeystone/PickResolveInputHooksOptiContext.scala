package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'> */
trait PickResolveInputHooksOptiContext extends js.Object {
  var context: js.Any
  var existingItem: js.Any
  var list: AnonQueryManyMeta
}

object PickResolveInputHooksOptiContext {
  @scala.inline
  def apply(context: js.Any, existingItem: js.Any, list: AnonQueryManyMeta): PickResolveInputHooksOptiContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResolveInputHooksOptiContext]
  }
}

