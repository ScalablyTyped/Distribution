package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message captures metadata about the serving status of a deal.
  */
@js.native
trait SchemaDealServingMetadata extends js.Object {
  /**
    * Tracks which parties (if any) have paused a deal. @OutputOnly
    */
  var dealPauseStatus: js.UndefOr[SchemaDealPauseStatus] = js.native
}

object SchemaDealServingMetadata {
  @scala.inline
  def apply(dealPauseStatus: SchemaDealPauseStatus = null): SchemaDealServingMetadata = {
    val __obj = js.Dynamic.literal()
    if (dealPauseStatus != null) __obj.updateDynamic("dealPauseStatus")(dealPauseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDealServingMetadata]
  }
}

