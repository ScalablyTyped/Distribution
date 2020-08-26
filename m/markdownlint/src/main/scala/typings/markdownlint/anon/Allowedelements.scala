package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowedelements extends js.Object {
  var allowed_elements: js.UndefOr[js.Array[String]] = js.native
}

object Allowedelements {
  @scala.inline
  def apply(): Allowedelements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowedelements]
  }
  @scala.inline
  implicit class AllowedelementsOps[Self <: Allowedelements] (val x: Self) extends AnyVal {
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
    def setAllowed_elementsVarargs(value: String*): Self = this.set("allowed_elements", js.Array(value :_*))
    @scala.inline
    def setAllowed_elements(value: js.Array[String]): Self = this.set("allowed_elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowed_elements: Self = this.set("allowed_elements", js.undefined)
  }
  
}

