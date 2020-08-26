package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends js.Object {
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z*[a-z0-9]` and must be between 6 and 30 characters in length.
    */
  var instanceId: js.UndefOr[String] = js.native
}

object SchemaCreateInstanceRequest {
  @scala.inline
  def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  @scala.inline
  implicit class SchemaCreateInstanceRequestOps[Self <: SchemaCreateInstanceRequest] (val x: Self) extends AnyVal {
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
    def setInstance(value: SchemaInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
  }
  
}

