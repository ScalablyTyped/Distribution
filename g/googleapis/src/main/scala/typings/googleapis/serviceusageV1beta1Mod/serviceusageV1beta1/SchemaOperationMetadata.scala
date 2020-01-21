package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The operation metadata returned for the batchend services operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(resourceNames: js.Array[String] = null): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
}

