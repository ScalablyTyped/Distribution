package typings.hoek.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReachOptions extends js.Object {
  /** Value to return if the path or value is not present. Default is undefined. */
  var default: js.UndefOr[js.Any] = js.native
  /** Allow traversing functions for properties? */
  var functions: js.UndefOr[Boolean] = js.native
  /** String to split chain path on. Defaults to ".". */
  var separator: js.UndefOr[String] = js.native
  /** Throw an error on missing member? Default is false. */
  var strict: js.UndefOr[Boolean] = js.native
}

object ReachOptions {
  @scala.inline
  def apply(): ReachOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachOptions]
  }
  @scala.inline
  implicit class ReachOptionsOps[Self <: ReachOptions] (val x: Self) extends AnyVal {
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setFunctions(value: Boolean): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

