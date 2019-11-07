package typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var currentVersion: String
  var status: js.UndefOr[
    typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatus.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    currentVersion: String,
    status: typings.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatus.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AsObject]
  }
}

