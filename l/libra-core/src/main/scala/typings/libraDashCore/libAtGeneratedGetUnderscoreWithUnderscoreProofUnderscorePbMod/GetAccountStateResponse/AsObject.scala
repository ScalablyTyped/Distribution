package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountStateResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountStateWithProof: js.UndefOr[
    typings.libraDashCore.libAtGeneratedAccountUnderscoreStateUnderscoreBlobUnderscorePbMod.AccountStateWithProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    accountStateWithProof: typings.libraDashCore.libAtGeneratedAccountUnderscoreStateUnderscoreBlobUnderscorePbMod.AccountStateWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (accountStateWithProof != null) __obj.updateDynamic("accountStateWithProof")(accountStateWithProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

