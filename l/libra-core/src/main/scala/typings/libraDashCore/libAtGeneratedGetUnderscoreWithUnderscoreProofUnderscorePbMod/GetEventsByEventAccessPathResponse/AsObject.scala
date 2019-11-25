package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetEventsByEventAccessPathResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsWithProofList: js.Array[
    typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof.AsObject
  ]
  var proofOfLatestEvent: js.UndefOr[
    typings.libraDashCore.libAtGeneratedAccountUnderscoreStateUnderscoreBlobUnderscorePbMod.AccountStateWithProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    eventsWithProofList: js.Array[
      typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventWithProof.AsObject
    ],
    proofOfLatestEvent: typings.libraDashCore.libAtGeneratedAccountUnderscoreStateUnderscoreBlobUnderscorePbMod.AccountStateWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventsWithProofList = eventsWithProofList.asInstanceOf[js.Any])
    if (proofOfLatestEvent != null) __obj.updateDynamic("proofOfLatestEvent")(proofOfLatestEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

