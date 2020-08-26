package typings.jsonFilePlus.mod

import typings.jsonFilePlus.jsonFilePlusStrings.Charactertabulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  val indent: Double | Charactertabulation = js.native
  val trailing: Boolean = js.native
}

object Format {
  @scala.inline
  def apply(indent: Double | Charactertabulation, trailing: Boolean): Format = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setIndent(value: Double | Charactertabulation): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailing(value: Boolean): Self = this.set("trailing", value.asInstanceOf[js.Any])
  }
  
}

