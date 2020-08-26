package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterDropDownOkEventUIParam extends js.Object {
  /**
    * A reference to the drop down.
    */
  var dropDownElement: js.UndefOr[String] = js.native
  /**
    * A collection with the selected filter members. If all filter members are selected the collection will be empty.
    */
  var filterMembers: js.UndefOr[js.Array[_]] = js.native
  /**
    * A reference to the hierarchy.
    */
  var hierarchy: js.UndefOr[js.Any] = js.native
}

object FilterDropDownOkEventUIParam {
  @scala.inline
  def apply(): FilterDropDownOkEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDropDownOkEventUIParam]
  }
  @scala.inline
  implicit class FilterDropDownOkEventUIParamOps[Self <: FilterDropDownOkEventUIParam] (val x: Self) extends AnyVal {
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
    def setDropDownElement(value: String): Self = this.set("dropDownElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownElement: Self = this.set("dropDownElement", js.undefined)
    @scala.inline
    def setFilterMembersVarargs(value: js.Any*): Self = this.set("filterMembers", js.Array(value :_*))
    @scala.inline
    def setFilterMembers(value: js.Array[_]): Self = this.set("filterMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMembers: Self = this.set("filterMembers", js.undefined)
    @scala.inline
    def setHierarchy(value: js.Any): Self = this.set("hierarchy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchy: Self = this.set("hierarchy", js.undefined)
  }
  
}

