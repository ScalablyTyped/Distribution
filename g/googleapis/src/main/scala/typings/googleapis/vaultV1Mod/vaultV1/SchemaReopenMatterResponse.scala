package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a ReopenMatterRequest.
  */
@js.native
trait SchemaReopenMatterResponse extends js.Object {
  /**
    * The updated matter, with state OPEN.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}

object SchemaReopenMatterResponse {
  @scala.inline
  def apply(matter: SchemaMatter = null): SchemaReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    if (matter != null) __obj.updateDynamic("matter")(matter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReopenMatterResponse]
  }
}

