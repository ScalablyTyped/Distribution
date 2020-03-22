package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData, 'Tag'> */
trait UpdateDispute extends js.Object {
  var Tag: js.UndefOr[String] = js.undefined
}

object UpdateDispute {
  @scala.inline
  def apply(Tag: String = null): UpdateDispute = {
    val __obj = js.Dynamic.literal()
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDispute]
  }
}

