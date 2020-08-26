package typings.knockoutSecureBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSecureBindingOptions extends js.Object {
  var attribute: js.UndefOr[String] = js.native
  var bindings: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandlers */ js.Any
  ] = js.native
  var globals: js.UndefOr[js.Any] = js.native
  var noVirtualElements: js.UndefOr[Boolean] = js.native
}

object KnockoutSecureBindingOptions {
  @scala.inline
  def apply(): KnockoutSecureBindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutSecureBindingOptions]
  }
  @scala.inline
  implicit class KnockoutSecureBindingOptionsOps[Self <: KnockoutSecureBindingOptions] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setBindings(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandlers */ js.Any
    ): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    @scala.inline
    def setGlobals(value: js.Any): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setNoVirtualElements(value: Boolean): Self = this.set("noVirtualElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoVirtualElements: Self = this.set("noVirtualElements", js.undefined)
  }
  
}

