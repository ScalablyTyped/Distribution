package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.native
  var minimumValue: js.UndefOr[Double] = js.native
  var targetUsers: js.UndefOr[js.Array[User]] = js.native
}

object MinimumValue {
  @scala.inline
  def apply(): MinimumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumValue]
  }
  @scala.inline
  implicit class MinimumValueOps[Self <: MinimumValue] (val x: Self) extends AnyVal {
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
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    @scala.inline
    def setTargetUsersVarargs(value: User*): Self = this.set("targetUsers", js.Array(value :_*))
    @scala.inline
    def setTargetUsers(value: js.Array[User]): Self = this.set("targetUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetUsers: Self = this.set("targetUsers", js.undefined)
  }
  
}

