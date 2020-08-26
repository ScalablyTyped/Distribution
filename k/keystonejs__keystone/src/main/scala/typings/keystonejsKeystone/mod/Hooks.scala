package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.anon.OmitResolveInputHooksOpti
import typings.keystonejsKeystone.anon.OmitResolveInputHooksOptiAddFieldValidationError
import typings.keystonejsKeystone.anon.OmitResolveInputHooksOptiContext
import typings.keystonejsKeystone.anon.PickResolveInputHooksOpti
import typings.keystonejsKeystone.anon.PickResolveInputHooksOptiAddFieldValidationError
import typings.keystonejsKeystone.anon.PickResolveInputHooksOptiContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{resolveInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError' | 'updatedItem'>): any, validateInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem'>): void, beforeChange (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError'>): void, afterChange (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'>): void, beforeDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void, validateDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list' | 'addFieldValidationError'>): void, afterDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void}> */
@js.native
trait Hooks extends js.Object {
  var afterChange: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.native
  var afterDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOpti, Unit]] = js.native
  var beforeChange: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOpti, Unit]] = js.native
  var beforeDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOpti, Unit]] = js.native
  var resolveInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiContext, _]] = js.native
  var validateDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiAddFieldValidationError, Unit]] = js.native
  var validateInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiAddFieldValidationError, Unit]] = js.native
}

object Hooks {
  @scala.inline
  def apply(): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
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
    def setAfterChange(value: /* opts */ PickResolveInputHooksOptiContext => Unit): Self = this.set("afterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setAfterDelete(value: /* opts */ PickResolveInputHooksOpti => Unit): Self = this.set("afterDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDelete: Self = this.set("afterDelete", js.undefined)
    @scala.inline
    def setBeforeChange(value: /* opts */ OmitResolveInputHooksOpti => Unit): Self = this.set("beforeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    @scala.inline
    def setBeforeDelete(value: /* opts */ PickResolveInputHooksOpti => Unit): Self = this.set("beforeDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDelete: Self = this.set("beforeDelete", js.undefined)
    @scala.inline
    def setResolveInput(value: /* opts */ OmitResolveInputHooksOptiContext => _): Self = this.set("resolveInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolveInput: Self = this.set("resolveInput", js.undefined)
    @scala.inline
    def setValidateDelete(value: /* opts */ PickResolveInputHooksOptiAddFieldValidationError => Unit): Self = this.set("validateDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateDelete: Self = this.set("validateDelete", js.undefined)
    @scala.inline
    def setValidateInput(value: /* opts */ OmitResolveInputHooksOptiAddFieldValidationError => Unit): Self = this.set("validateInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidateInput: Self = this.set("validateInput", js.undefined)
  }
  
}

