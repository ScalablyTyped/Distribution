package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch accounts response.
  */
@js.native
trait SchemaAccountsCustomBatchResponseEntry extends js.Object {
  /**
    * The retrieved, created, or updated account. Not defined if the method was
    * delete, claimwebsite or link.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
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
    * &quot;content#accountsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    account: SchemaAccount = null,
    batchId: js.UndefOr[Double] = js.undefined,
    errors: SchemaErrors = null,
    kind: String = null
  ): SchemaAccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountsCustomBatchResponseEntry]
  }
}

