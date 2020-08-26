package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecation status for a public resource.
  */
@js.native
trait SchemaDeprecationStatus extends js.Object {
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to DELETED. This is only informational and
    * the status will not change unless the client explicitly changes it.
    */
  var deleted: js.UndefOr[String] = js.native
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to DEPRECATED. This is only informational
    * and the status will not change unless the client explicitly changes it.
    */
  var deprecated: js.UndefOr[String] = js.native
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to OBSOLETE. This is only informational
    * and the status will not change unless the client explicitly changes it.
    */
  var obsolete: js.UndefOr[String] = js.native
  /**
    * The URL of the suggested replacement for a deprecated resource. The
    * suggested replacement resource must be the same kind of resource as the
    * deprecated resource.
    */
  var replacement: js.UndefOr[String] = js.native
  /**
    * The deprecation state of this resource. This can be ACTIVE, DEPRECATED,
    * OBSOLETE, or DELETED. Operations which communicate the end of life date
    * for an image, can use ACTIVE. Operations which create a new resource
    * using a DEPRECATED resource will return successfully, but with a warning
    * indicating the deprecated resource and recommending its replacement.
    * Operations which use OBSOLETE or DELETED resources will be rejected and
    * result in an error.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaDeprecationStatus {
  @scala.inline
  def apply(): SchemaDeprecationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeprecationStatus]
  }
  @scala.inline
  implicit class SchemaDeprecationStatusOps[Self <: SchemaDeprecationStatus] (val x: Self) extends AnyVal {
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
    def setDeleted(value: String): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setObsolete(value: String): Self = this.set("obsolete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObsolete: Self = this.set("obsolete", js.undefined)
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

