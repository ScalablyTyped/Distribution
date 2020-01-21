package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nonprofit information.
  */
@js.native
trait SchemaNonprofit extends js.Object {
  /**
    * Id of the nonprofit.
    */
  var nonprofitId: js.UndefOr[SchemaNonprofitId] = js.native
  /**
    * Legal name of the nonprofit.
    */
  var nonprofitLegalName: js.UndefOr[String] = js.native
}

object SchemaNonprofit {
  @scala.inline
  def apply(nonprofitId: SchemaNonprofitId = null, nonprofitLegalName: String = null): SchemaNonprofit = {
    val __obj = js.Dynamic.literal()
    if (nonprofitId != null) __obj.updateDynamic("nonprofitId")(nonprofitId.asInstanceOf[js.Any])
    if (nonprofitLegalName != null) __obj.updateDynamic("nonprofitLegalName")(nonprofitLegalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNonprofit]
  }
}

