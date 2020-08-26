package typings.materialTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTabIndex extends js.Object {
  var activeTabIndex: Double = js.native
}

object ActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  @scala.inline
  implicit class ActiveTabIndexOps[Self <: ActiveTabIndex] (val x: Self) extends AnyVal {
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
    def setActiveTabIndex(value: Double): Self = this.set("activeTabIndex", value.asInstanceOf[js.Any])
  }
  
}

