package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
@js.native
trait SchemaResponseMetadata extends js.Object {
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.native
}

object SchemaResponseMetadata {
  @scala.inline
  def apply(): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
  @scala.inline
  implicit class SchemaResponseMetadataOps[Self <: SchemaResponseMetadata] (val x: Self) extends AnyVal {
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
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

