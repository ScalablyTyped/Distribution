package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Environments Response.
  */
@js.native
trait SchemaListEnvironmentsResponse extends js.Object {
  /**
    * All Environments of a GTM Container.
    */
  var environments: js.UndefOr[js.Array[SchemaEnvironment]] = js.native
}

object SchemaListEnvironmentsResponse {
  @scala.inline
  def apply(environments: js.Array[SchemaEnvironment] = null): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
}

