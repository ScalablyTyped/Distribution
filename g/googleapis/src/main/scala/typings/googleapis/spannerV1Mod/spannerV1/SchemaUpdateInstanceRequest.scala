package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for UpdateInstance.
  */
@js.native
trait SchemaUpdateInstanceRequest extends js.Object {
  /**
    * Required. A mask specifying which fields in
    * [][google.spanner.admin.instance.v1.UpdateInstanceRequest.instance]
    * should be updated. The field mask must always be specified; this prevents
    * any future fields in [][google.spanner.admin.instance.v1.Instance] from
    * being erased accidentally by clients that do not know about them.
    */
  var fieldMask: js.UndefOr[String] = js.native
  /**
    * Required. The instance to update, which must always include the instance
    * name.  Otherwise, only fields mentioned in
    * [][google.spanner.admin.instance.v1.UpdateInstanceRequest.field_mask]
    * need be included.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
}

object SchemaUpdateInstanceRequest {
  @scala.inline
  def apply(fieldMask: String = null, instance: SchemaInstance = null): SchemaUpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (fieldMask != null) __obj.updateDynamic("fieldMask")(fieldMask.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateInstanceRequest]
  }
}

