package typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfo: js.UndefOr[
    typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfo.AsObject
  ] = js.undefined
  var signaturesList: js.Array[
    typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.ValidatorSignature.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    signaturesList: js.Array[
      typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.ValidatorSignature.AsObject
    ],
    ledgerInfo: typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfo.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(signaturesList = signaturesList)
    if (ledgerInfo != null) __obj.updateDynamic("ledgerInfo")(ledgerInfo)
    __obj.asInstanceOf[AsObject]
  }
}

