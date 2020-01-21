package typings.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An account feed lists Ad Exchange buyer accounts that the user has access
  * to. Each entry in the feed corresponds to a single buyer account.
  */
@js.native
trait SchemaAccountsList extends js.Object {
  /**
    * A list of accounts.
    */
  var items: js.UndefOr[js.Array[SchemaAccount]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountsList {
  @scala.inline
  def apply(items: js.Array[SchemaAccount] = null, kind: String = null): SchemaAccountsList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountsList]
  }
}

