package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The Geo criteria the restriction applies to.
  */
@js.native
trait SchemaLocationContext extends js.Object {
  /**
    * IDs representing the geo location for this context. Please refer to the
    * [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv)
    * file for different geo criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaLocationContext {
  @scala.inline
  def apply(geoCriteriaIds: js.Array[Double] = null): SchemaLocationContext = {
    val __obj = js.Dynamic.literal()
    if (geoCriteriaIds != null) __obj.updateDynamic("geoCriteriaIds")(geoCriteriaIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocationContext]
  }
}

