package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Debugging information about the result.
  */
@js.native
trait SchemaResultDebugInfo extends js.Object {
  /**
    * General debug info formatted for display.
    */
  var formattedDebugInfo: js.UndefOr[String] = js.native
}

object SchemaResultDebugInfo {
  @scala.inline
  def apply(): SchemaResultDebugInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDebugInfo]
  }
  @scala.inline
  implicit class SchemaResultDebugInfoOps[Self <: SchemaResultDebugInfo] (val x: Self) extends AnyVal {
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
    def setFormattedDebugInfo(value: String): Self = this.set("formattedDebugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedDebugInfo: Self = this.set("formattedDebugInfo", js.undefined)
  }
  
}

