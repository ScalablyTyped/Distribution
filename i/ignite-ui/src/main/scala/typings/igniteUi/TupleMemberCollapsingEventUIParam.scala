package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TupleMemberCollapsingEventUIParam extends js.Object {
  /**
    * Gets the name of axis, which holds the member and the tuple.
    */
  var axisName: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Gets the index of the member in the tuple.
    */
  var memberIndex: js.UndefOr[Double] = js.native
  /**
    * Gets a reference to the pivot grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the index of the tuple in the axis.
    */
  var tupleIndex: js.UndefOr[Double] = js.native
}

object TupleMemberCollapsingEventUIParam {
  @scala.inline
  def apply(): TupleMemberCollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TupleMemberCollapsingEventUIParam]
  }
  @scala.inline
  implicit class TupleMemberCollapsingEventUIParamOps[Self <: TupleMemberCollapsingEventUIParam] (val x: Self) extends AnyVal {
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
    def setAxisName(value: String): Self = this.set("axisName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisName: Self = this.set("axisName", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setMemberIndex(value: Double): Self = this.set("memberIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberIndex: Self = this.set("memberIndex", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTupleIndex(value: Double): Self = this.set("tupleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTupleIndex: Self = this.set("tupleIndex", js.undefined)
  }
  
}

