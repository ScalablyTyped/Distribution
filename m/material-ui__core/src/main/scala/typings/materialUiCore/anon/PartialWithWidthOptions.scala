package typings.materialUiCore.anon

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/withWidth.WithWidthOptions> */
@js.native
trait PartialWithWidthOptions extends js.Object {
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  var noSSR: js.UndefOr[Boolean] = js.native
  var resizeInterval: js.UndefOr[Double] = js.native
  var withTheme: js.UndefOr[Boolean] = js.native
}

object PartialWithWidthOptions {
  @scala.inline
  def apply(): PartialWithWidthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithWidthOptions]
  }
  @scala.inline
  implicit class PartialWithWidthOptionsOps[Self <: PartialWithWidthOptions] (val x: Self) extends AnyVal {
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
    def setInitialWidth(value: Breakpoint): Self = this.set("initialWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialWidth: Self = this.set("initialWidth", js.undefined)
    @scala.inline
    def setNoSSR(value: Boolean): Self = this.set("noSSR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSSR: Self = this.set("noSSR", js.undefined)
    @scala.inline
    def setResizeInterval(value: Double): Self = this.set("resizeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeInterval: Self = this.set("resizeInterval", js.undefined)
    @scala.inline
    def setWithTheme(value: Boolean): Self = this.set("withTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithTheme: Self = this.set("withTheme", js.undefined)
  }
  
}

