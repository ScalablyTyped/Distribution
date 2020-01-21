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
  def apply(rotateServerCaContext: SchemaRotateServerCaContext = null): SchemaInstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    if (rotateServerCaContext != null) __obj.updateDynamic("rotateServerCaContext")(rotateServerCaContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesRotateServerCaRequest]
  }
}

