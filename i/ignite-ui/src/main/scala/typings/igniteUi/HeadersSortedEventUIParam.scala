package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadersSortedEventUIParam extends js.Object {
  /**
    * Gets an array of the level names and sort directions that were actually applied to the table view.
    */
  var appliedLevelSortDirections: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets an array of the level names and sort directions that were used.
    */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object HeadersSortedEventUIParam {
  @scala.inline
  def apply(): HeadersSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersSortedEventUIParam]
  }
  @scala.inline
  implicit class HeadersSortedEventUIParamOps[Self <: HeadersSortedEventUIParam] (val x: Self) extends AnyVal {
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
    def setAppliedLevelSortDirectionsVarargs(value: js.Any*): Self = this.set("appliedLevelSortDirections", js.Array(value :_*))
    @scala.inline
    def setAppliedLevelSortDirections(value: js.Array[_]): Self = this.set("appliedLevelSortDirections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedLevelSortDirections: Self = this.set("appliedLevelSortDirections", js.undefined)
    @scala.inline
    def setLevelSortDirectionsVarargs(value: js.Any*): Self = this.set("levelSortDirections", js.Array(value :_*))
    @scala.inline
    def setLevelSortDirections(value: js.Array[_]): Self = this.set("levelSortDirections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelSortDirections: Self = this.set("levelSortDirections", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

