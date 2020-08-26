package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a get debug configuration request.
  */
@js.native
trait SchemaGetDebugConfigResponse extends js.Object {
  /**
    * The encoded debug configuration for the requested component.
    */
  var config: js.UndefOr[String] = js.native
}

object SchemaGetDebugConfigResponse {
  @scala.inline
  def apply(): SchemaGetDebugConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDebugConfigResponse]
  }
  @scala.inline
  implicit class SchemaGetDebugConfigResponseOps[Self <: SchemaGetDebugConfigResponse] (val x: Self) extends AnyVal {
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
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
  
}

