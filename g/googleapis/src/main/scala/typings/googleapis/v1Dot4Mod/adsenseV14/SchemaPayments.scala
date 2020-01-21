package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPayments extends js.Object {
  /**
    * The list of Payments for the account. One or both of a) the account&#39;s
    * most recent payment; and b) the account&#39;s upcoming payment.
    */
  var items: js.UndefOr[js.Array[SchemaPayment]] = js.native
  /**
    * Kind of list this is, in this case adsense#payments.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPayments {
  @scala.inline
  def apply(items: js.Array[SchemaPayment] = null, kind: String = null): SchemaPayments = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPayments]
  }
}

