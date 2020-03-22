package typings.mangopay2NodejsSdk.mod.card

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCard extends js.Object {
  var Active: js.UndefOr[`false`] = js.undefined
  var Id: String
}

object UpdateCard {
  @scala.inline
  def apply(Id: String, Active: `false` = null): UpdateCard = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Active != null) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCard]
  }
}

