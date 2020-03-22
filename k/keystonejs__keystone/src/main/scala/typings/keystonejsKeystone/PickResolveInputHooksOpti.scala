package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'> */
trait PickResolveInputHooksOpti extends js.Object {
  var context: js.Any
  var existingItem: js.Any
  var list: AnonQueryManyMeta
  var originalInput: js.Any
  var updatedItem: js.Any
}

object PickResolveInputHooksOpti {
  @scala.inline
  def apply(
    context: js.Any,
    existingItem: js.Any,
    list: AnonQueryManyMeta,
    originalInput: js.Any,
    updatedItem: js.Any
  ): PickResolveInputHooksOpti = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickResolveInputHooksOpti]
  }
}

