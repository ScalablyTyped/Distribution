package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Backend` defines the backend configuration for a service.
  */
@js.native
trait SchemaBackend extends js.Object {
  /**
    * A list of API backend rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaBackendRule]] = js.native
}

object SchemaBackend {
  @scala.inline
  def apply(rules: js.Array[SchemaBackendRule] = null): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackend]
  }
}

