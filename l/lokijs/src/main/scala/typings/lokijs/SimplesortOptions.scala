package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplesortOptions extends js.Object {
  var desc: Boolean = js.native
  var disableIndexIntersect: Boolean = js.native
  var forceIndexIntersect: Boolean = js.native
  var useJavascriptSorting: Boolean = js.native
}

object SimplesortOptions {
  @scala.inline
  def apply(
    desc: Boolean,
    disableIndexIntersect: Boolean,
    forceIndexIntersect: Boolean,
    useJavascriptSorting: Boolean
  ): SimplesortOptions = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], disableIndexIntersect = disableIndexIntersect.asInstanceOf[js.Any], forceIndexIntersect = forceIndexIntersect.asInstanceOf[js.Any], useJavascriptSorting = useJavascriptSorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplesortOptions]
  }
  @scala.inline
  implicit class SimplesortOptionsOps[Self <: SimplesortOptions] (val x: Self) extends AnyVal {
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
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableIndexIntersect(value: Boolean): Self = this.set("disableIndexIntersect", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceIndexIntersect(value: Boolean): Self = this.set("forceIndexIntersect", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseJavascriptSorting(value: Boolean): Self = this.set("useJavascriptSorting", value.asInstanceOf[js.Any])
  }
  
}

