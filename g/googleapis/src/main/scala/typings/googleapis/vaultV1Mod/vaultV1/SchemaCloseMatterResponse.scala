package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a CloseMatterRequest.
  */
@js.native
trait SchemaCloseMatterResponse extends js.Object {
  /**
    * The updated matter, with state CLOSED.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}

object SchemaCloseMatterResponse {
  @scala.inline
  def apply(matter: SchemaMatter = null): SchemaCloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    if (matter != null) __obj.updateDynamic("matter")(matter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCloseMatterResponse]
  }
}

