package typings.loadableComponent.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithoutResolver[Props] extends js.Object {
  var cacheKey: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
  var fallback: js.UndefOr[Element] = js.native
  var ssr: js.UndefOr[Boolean] = js.native
}

object OptionsWithoutResolver {
  @scala.inline
  def apply[Props](): OptionsWithoutResolver[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsWithoutResolver[Props]]
  }
  @scala.inline
  implicit class OptionsWithoutResolverOps[Self <: OptionsWithoutResolver[_], Props] (val x: Self with OptionsWithoutResolver[Props]) extends AnyVal {
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
    def setCacheKey(value: /* props */ Props => _): Self = this.set("cacheKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    @scala.inline
    def setFallback(value: Element): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
  }
  
}

