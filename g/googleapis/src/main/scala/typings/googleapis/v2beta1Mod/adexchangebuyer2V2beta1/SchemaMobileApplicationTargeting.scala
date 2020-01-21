package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile application targeting settings.
  */
@js.native
trait SchemaMobileApplicationTargeting extends js.Object {
  /**
    * Publisher owned apps to be targeted or excluded by the publisher to
    * display the ads in.
    */
  var firstPartyTargeting: js.UndefOr[SchemaFirstPartyMobileApplicationTargeting] = js.native
}

object SchemaMobileApplicationTargeting {
  @scala.inline
  def apply(firstPartyTargeting: SchemaFirstPartyMobileApplicationTargeting = null): SchemaMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    if (firstPartyTargeting != null) __obj.updateDynamic("firstPartyTargeting")(firstPartyTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileApplicationTargeting]
  }
}

