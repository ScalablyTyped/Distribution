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
  def apply(name: String = null): SchemaAuditableService = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuditableService]
  }
}

