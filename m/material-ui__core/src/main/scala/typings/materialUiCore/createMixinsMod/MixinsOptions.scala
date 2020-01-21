package typings.materialUiCore.createMixinsMod

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createMixins.Mixins> */
@js.native
trait MixinsOptions extends js.Object {
  var gutters: js.UndefOr[js.Function1[/* styles */ js.UndefOr[CSSProperties], CSSProperties]] = js.native
  var toolbar: js.UndefOr[CSSProperties] = js.native
}

object MixinsOptions {
  @scala.inline
  def apply(
    gutters: /* styles */ js.UndefOr[CSSProperties] => CSSProperties = null,
    toolbar: CSSProperties = null
  ): MixinsOptions = {
    val __obj = js.Dynamic.literal()
    if (gutters != null) __obj.updateDynamic("gutters")(js.Any.fromFunction1(gutters))
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixinsOptions]
  }
}

