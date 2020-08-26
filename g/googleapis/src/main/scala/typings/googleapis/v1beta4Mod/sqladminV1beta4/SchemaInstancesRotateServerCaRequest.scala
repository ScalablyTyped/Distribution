package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rotate Server CA request.
  */
@js.native
trait SchemaInstancesRotateServerCaRequest extends js.Object {
  /**
    * Contains details about the rotate server CA operation.
    */
  var rotateServerCaContext: js.UndefOr[SchemaRotateServerCaContext] = js.native
}

object SchemaInstancesRotateServerCaRequest {
  @scala.inline
  def apply(): SchemaInstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesRotateServerCaRequest]
  }
  @scala.inline
  implicit class SchemaInstancesRotateServerCaRequestOps[Self <: SchemaInstancesRotateServerCaRequest] (val x: Self) extends AnyVal {
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
    def setRotateServerCaContext(value: SchemaRotateServerCaContext): Self = this.set("rotateServerCaContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateServerCaContext: Self = this.set("rotateServerCaContext", js.undefined)
  }
  
}

