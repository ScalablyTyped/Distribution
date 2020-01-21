package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An artifact that can be deployed in some runtime.
  */
@js.native
trait SchemaDeployable extends js.Object {
  /**
    * Required. Resource URI for the artifact being deployed.
    */
  var resourceUri: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDeployable {
  @scala.inline
  def apply(resourceUri: js.Array[String] = null): SchemaDeployable = {
    val __obj = js.Dynamic.literal()
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeployable]
  }
}

