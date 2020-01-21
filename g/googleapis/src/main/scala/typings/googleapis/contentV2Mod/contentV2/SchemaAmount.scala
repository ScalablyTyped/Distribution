package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAmount extends js.Object {
  /**
    * [required] Value before taxes.
    */
  var pretax: js.UndefOr[SchemaPrice] = js.native
  /**
    * [required] Tax value.
    */
  var tax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaAmount {
  @scala.inline
  def apply(pretax: SchemaPrice = null, tax: SchemaPrice = null): SchemaAmount = {
    val __obj = js.Dynamic.literal()
    if (pretax != null) __obj.updateDynamic("pretax")(pretax.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAmount]
  }
}

