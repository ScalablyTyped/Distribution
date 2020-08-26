package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedEventUIParam extends js.Object {
  /**
    * Used to get a reference the igSplitButton.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ExpandedEventUIParam {
  @scala.inline
  def apply(): ExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandedEventUIParam]
  }
  @scala.inline
  implicit class ExpandedEventUIParamOps[Self <: ExpandedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

