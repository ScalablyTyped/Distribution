package typings.graphql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxErrors extends js.Object {
  var maxErrors: js.UndefOr[Double] = js.native
}

object MaxErrors {
  @scala.inline
  def apply(): MaxErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxErrors]
  }
  @scala.inline
  implicit class MaxErrorsOps[Self <: MaxErrors] (val x: Self) extends AnyVal {
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
    def setMaxErrors(value: Double): Self = this.set("maxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("maxErrors", js.undefined)
  }
  
}

