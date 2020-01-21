package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Healthcare API resource.
  */
@js.native
trait SchemaCloudHealthcareSource extends js.Object {
  /**
    * Full path of a Cloud Healthcare API resource.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaCloudHealthcareSource {
  @scala.inline
  def apply(name: String = null): SchemaCloudHealthcareSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloudHealthcareSource]
  }
}

