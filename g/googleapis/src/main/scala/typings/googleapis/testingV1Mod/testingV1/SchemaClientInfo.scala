package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the client which invoked the test.
  */
@js.native
trait SchemaClientInfo extends js.Object {
  /**
    * The list of detailed information about client.
    */
  var clientInfoDetails: js.UndefOr[js.Array[SchemaClientInfoDetail]] = js.native
  /**
    * Required. Client name, such as gcloud.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaClientInfo {
  @scala.inline
  def apply(clientInfoDetails: js.Array[SchemaClientInfoDetail] = null, name: String = null): SchemaClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientInfoDetails != null) __obj.updateDynamic("clientInfoDetails")(clientInfoDetails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClientInfo]
  }
}

