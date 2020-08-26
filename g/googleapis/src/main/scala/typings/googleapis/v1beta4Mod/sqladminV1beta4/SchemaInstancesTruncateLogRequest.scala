package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance truncate log request.
  */
@js.native
trait SchemaInstancesTruncateLogRequest extends js.Object {
  /**
    * Contains details about the truncate log operation.
    */
  var truncateLogContext: js.UndefOr[SchemaTruncateLogContext] = js.native
}

object SchemaInstancesTruncateLogRequest {
  @scala.inline
  def apply(): SchemaInstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesTruncateLogRequest]
  }
  @scala.inline
  implicit class SchemaInstancesTruncateLogRequestOps[Self <: SchemaInstancesTruncateLogRequest] (val x: Self) extends AnyVal {
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
    def setTruncateLogContext(value: SchemaTruncateLogContext): Self = this.set("truncateLogContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncateLogContext: Self = this.set("truncateLogContext", js.undefined)
  }
  
}

