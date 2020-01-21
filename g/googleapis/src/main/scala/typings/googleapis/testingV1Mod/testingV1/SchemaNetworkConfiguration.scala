package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkConfiguration extends js.Object {
  /**
    * The emulation rule applying to the download traffic.
    */
  var downRule: js.UndefOr[SchemaTrafficRule] = js.native
  /**
    * The unique opaque id for this network traffic configuration.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The emulation rule applying to the upload traffic.
    */
  var upRule: js.UndefOr[SchemaTrafficRule] = js.native
}

object SchemaNetworkConfiguration {
  @scala.inline
  def apply(downRule: SchemaTrafficRule = null, id: String = null, upRule: SchemaTrafficRule = null): SchemaNetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    if (downRule != null) __obj.updateDynamic("downRule")(downRule.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (upRule != null) __obj.updateDynamic("upRule")(upRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkConfiguration]
  }
}

