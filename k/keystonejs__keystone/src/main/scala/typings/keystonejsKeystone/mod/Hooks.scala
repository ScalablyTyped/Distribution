package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.OmitResolveInputHooksOpti
import typings.keystonejsKeystone.OmitResolveInputHooksOptiAddFieldValidationError
import typings.keystonejsKeystone.OmitResolveInputHooksOptiContext
import typings.keystonejsKeystone.PickResolveInputHooksOpti
import typings.keystonejsKeystone.PickResolveInputHooksOptiAddFieldValidationError
import typings.keystonejsKeystone.PickResolveInputHooksOptiContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{resolveInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError' | 'updatedItem'>): any, validateInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem'>): void, beforeChange (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError'>): void, afterChange (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'>): void, beforeDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void, validateDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list' | 'addFieldValidationError'>): void, afterDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void}> */
trait Hooks extends js.Object {
  var afterChange: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOpti, Unit]] = js.undefined
  var afterDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.undefined
  var beforeChange: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOpti, Unit]] = js.undefined
  var beforeDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.undefined
  var resolveInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiContext, _]] = js.undefined
  var validateDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiAddFieldValidationError, Unit]] = js.undefined
  var validateInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiAddFieldValidationError, Unit]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    afterChange: /* opts */ PickResolveInputHooksOpti => Unit = null,
    afterDelete: /* opts */ PickResolveInputHooksOptiContext => Unit = null,
    beforeChange: /* opts */ OmitResolveInputHooksOpti => Unit = null,
    beforeDelete: /* opts */ PickResolveInputHooksOptiContext => Unit = null,
    resolveInput: /* opts */ OmitResolveInputHooksOptiContext => _ = null,
    validateDelete: /* opts */ PickResolveInputHooksOptiAddFieldValidationError => Unit = null,
    validateInput: /* opts */ OmitResolveInputHooksOptiAddFieldValidationError => Unit = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (afterDelete != null) __obj.updateDynamic("afterDelete")(js.Any.fromFunction1(afterDelete))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange))
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(js.Any.fromFunction1(beforeDelete))
    if (resolveInput != null) __obj.updateDynamic("resolveInput")(js.Any.fromFunction1(resolveInput))
    if (validateDelete != null) __obj.updateDynamic("validateDelete")(js.Any.fromFunction1(validateDelete))
    if (validateInput != null) __obj.updateDynamic("validateInput")(js.Any.fromFunction1(validateInput))
    __obj.asInstanceOf[Hooks]
  }
}

