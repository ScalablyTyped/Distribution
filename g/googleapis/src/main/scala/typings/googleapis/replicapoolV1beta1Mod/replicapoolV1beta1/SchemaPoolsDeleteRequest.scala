package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPoolsDeleteRequest extends js.Object {
  /**
    * If there are instances you would like to keep, you can specify them here.
    * These instances won&#39;t be deleted, but the associated replica objects
    * will be removed.
    */
  var abandonInstances: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPoolsDeleteRequest {
  @scala.inline
  def apply(abandonInstances: js.Array[String] = null): SchemaPoolsDeleteRequest = {
    val __obj = js.Dynamic.literal()
    if (abandonInstances != null) __obj.updateDynamic("abandonInstances")(abandonInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPoolsDeleteRequest]
  }
}

