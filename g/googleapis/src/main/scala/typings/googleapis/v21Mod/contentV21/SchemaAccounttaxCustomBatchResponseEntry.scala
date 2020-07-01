package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accounttax response.
  */
@js.native
trait SchemaAccounttaxCustomBatchResponseEntry extends js.Object {
  /**
    * The retrieved or updated account tax settings.
    */
  var accountTax: js.UndefOr[SchemaAccountTax] = js.native
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accounttaxCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccounttaxCustomBatchResponseEntry {
  @scala.inline
  def apply(
    accountTax: SchemaAccountTax = null,
    batchId: js.UndefOr[Double] = js.undefined,
    errors: SchemaErrors = null,
    kind: String = null
  ): SchemaAccounttaxCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax.asInstanceOf[js.Any])
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccounttaxCustomBatchResponseEntry]
  }
}

