package typings.lodash.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// truncate
@js.native
trait TruncateOptions extends js.Object {
  /** The maximum string length. */
  var length: js.UndefOr[Double] = js.native
  /** The string to indicate text is omitted. */
  var omission: js.UndefOr[String] = js.native
  /** The separator pattern to truncate to. */
  var separator: js.UndefOr[String | RegExp] = js.native
}

object TruncateOptions {
  @scala.inline
  def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  @scala.inline
  implicit class TruncateOptionsOps[Self <: TruncateOptions] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setOmission(value: String): Self = this.set("omission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmission: Self = this.set("omission", js.undefined)
    @scala.inline
    def setSeparator(value: String | RegExp): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

