package typings.materialUiCore.createMixinsMod

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
@js.native
trait MixinsOptions extends js.Object {
  var gutters: js.UndefOr[js.Function1[/* styles */ js.UndefOr[CSSProperties], CSSProperties]] = js.native
  var toolbar: js.UndefOr[CSSProperties] = js.native
}

object MixinsOptions {
  @scala.inline
  def apply(): MixinsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinsOptions]
  }
  @scala.inline
  implicit class MixinsOptionsOps[Self <: MixinsOptions] (val x: Self) extends AnyVal {
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
    def setGutters(value: /* styles */ js.UndefOr[CSSProperties] => CSSProperties): Self = this.set("gutters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    @scala.inline
    def setToolbar(value: CSSProperties): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
  
}

