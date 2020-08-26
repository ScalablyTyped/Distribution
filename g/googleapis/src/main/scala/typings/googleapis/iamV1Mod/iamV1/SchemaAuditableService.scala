package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about an auditable service.
  */
@js.native
trait SchemaAuditableService extends js.Object {
  /**
    * Public name of the service. For example, the service name for Cloud IAM
    * is &#39;iam.googleapis.com&#39;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaAuditableService {
  @scala.inline
  def apply(): SchemaAuditableService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditableService]
  }
  @scala.inline
  implicit class SchemaAuditableServiceOps[Self <: SchemaAuditableService] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

