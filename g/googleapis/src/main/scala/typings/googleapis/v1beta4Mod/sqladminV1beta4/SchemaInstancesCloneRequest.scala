package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance clone request.
  */
@js.native
trait SchemaInstancesCloneRequest extends js.Object {
  /**
    * Contains details about the clone operation.
    */
  var cloneContext: js.UndefOr[SchemaCloneContext] = js.native
}

object SchemaInstancesCloneRequest {
  @scala.inline
  def apply(cloneContext: SchemaCloneContext = null): SchemaInstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    if (cloneContext != null) __obj.updateDynamic("cloneContext")(cloneContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesCloneRequest]
  }
}

