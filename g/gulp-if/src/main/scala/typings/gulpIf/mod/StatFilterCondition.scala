package typings.gulpIf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatFilterCondition extends js.Object {
  var isDirectory: js.UndefOr[Boolean] = js.native
  var isFile: js.UndefOr[Boolean] = js.native
}

object StatFilterCondition {
  @scala.inline
  def apply(): StatFilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatFilterCondition]
  }
  @scala.inline
  implicit class StatFilterConditionOps[Self <: StatFilterCondition] (val x: Self) extends AnyVal {
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
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDirectory: Self = this.set("isDirectory", js.undefined)
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFile: Self = this.set("isFile", js.undefined)
  }
  
}

