package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMembersLoadedEventUIParam extends js.Object {
  /**
    * A collection with the newly loaded filter members.
    */
  var filterMembers: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the parent node or the igTree instance in the initial load.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * A collection with the root filter members .
    */
  var rootFilterMembers: js.UndefOr[js.Array[_]] = js.native
}

object FilterMembersLoadedEventUIParam {
  @scala.inline
  def apply(): FilterMembersLoadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMembersLoadedEventUIParam]
  }
  @scala.inline
  implicit class FilterMembersLoadedEventUIParamOps[Self <: FilterMembersLoadedEventUIParam] (val x: Self) extends AnyVal {
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
    def setFilterMembersVarargs(value: js.Any*): Self = this.set("filterMembers", js.Array(value :_*))
    @scala.inline
    def setFilterMembers(value: js.Array[_]): Self = this.set("filterMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMembers: Self = this.set("filterMembers", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setRootFilterMembersVarargs(value: js.Any*): Self = this.set("rootFilterMembers", js.Array(value :_*))
    @scala.inline
    def setRootFilterMembers(value: js.Array[_]): Self = this.set("rootFilterMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootFilterMembers: Self = this.set("rootFilterMembers", js.undefined)
  }
  
}

