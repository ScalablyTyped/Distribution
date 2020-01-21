package typings.libraCore.accountStateBlobPbMod.AccountStateWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var blob: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject] = js.undefined
  var proof: js.UndefOr[typings.libraCore.proofPbMod.AccountStateProof.AsObject] = js.undefined
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    version: String,
    blob: typings.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject = null,
    proof: typings.libraCore.proofPbMod.AccountStateProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (proof != null) __obj.updateDynamic("proof")(proof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

