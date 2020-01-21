package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The access controls set on the resource.
  */
@js.native
trait SchemaResourceAccessControl extends js.Object {
  /**
    * The GCP IAM Policy to set on the resource.
    */
  var gcpIamPolicy: js.UndefOr[String] = js.native
}

object SchemaResourceAccessControl {
  @scala.inline
  def apply(gcpIamPolicy: String = null): SchemaResourceAccessControl = {
    val __obj = js.Dynamic.literal()
    if (gcpIamPolicy != null) __obj.updateDynamic("gcpIamPolicy")(gcpIamPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceAccessControl]
  }
}

