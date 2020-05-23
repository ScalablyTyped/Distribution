package typings.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError' | 'updatedItem'> */
trait OmitResolveInputHooksOptiContext extends js.Object {
  var context: js.Any
  var existingItem: js.Any
  var list: QueryManyMeta
  var originalInput: js.Any
  var resolvedData: js.Any
}

object OmitResolveInputHooksOptiContext {
  @scala.inline
  def apply(
    context: js.Any,
    existingItem: js.Any,
    list: QueryManyMeta,
    originalInput: js.Any,
    resolvedData: js.Any
  ): OmitResolveInputHooksOptiContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], resolvedData = resolvedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitResolveInputHooksOptiContext]
  }
}

