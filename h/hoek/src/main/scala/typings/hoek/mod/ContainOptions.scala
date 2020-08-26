package typings.hoek.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainOptions extends js.Object {
  /** Perform a deep comparison of the values? */
  var deep: js.UndefOr[Boolean] = js.native
  /** Allow only one occurrence of each value? */
  var once: js.UndefOr[Boolean] = js.native
  /** Don't allow values not explicitly listed? */
  var only: js.UndefOr[Boolean] = js.native
  /** Allow partial match of the values? */
  var part: js.UndefOr[Boolean] = js.native
}

object ContainOptions {
  @scala.inline
  def apply(): ContainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainOptions]
  }
  @scala.inline
  implicit class ContainOptionsOps[Self <: ContainOptions] (val x: Self) extends AnyVal {
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
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setPart(value: Boolean): Self = this.set("part", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
  }
  
}

