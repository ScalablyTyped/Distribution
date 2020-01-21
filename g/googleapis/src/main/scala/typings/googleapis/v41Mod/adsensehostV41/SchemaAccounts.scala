package typings.googleapis.v41Mod.adsensehostV41

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccounts extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The accounts returned in this list response.
    */
  var items: js.UndefOr[js.Array[SchemaAccount]] = js.native
  /**
    * Kind of list this is, in this case adsensehost#accounts.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccounts {
  @scala.inline
  def apply(etag: String = null, items: js.Array[SchemaAccount] = null, kind: String = null): SchemaAccounts = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccounts]
  }
}

