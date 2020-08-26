package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Names extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.native
  var names: js.UndefOr[js.Array[String] | Null] = js.native
}

object Names {
  @scala.inline
  def apply(): Names = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Names]
  }
  @scala.inline
  implicit class NamesOps[Self <: Names] (val x: Self) extends AnyVal {
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
    def setCode_blocks(value: Boolean): Self = this.set("code_blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode_blocks: Self = this.set("code_blocks", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setNamesNull: Self = this.set("names", null)
  }
  
}

