package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAlerts extends js.Object {
  /**
    * The alerts returned in this list response.
    */
  var items: js.UndefOr[js.Array[SchemaAlert]] = js.native
  /**
    * Kind of list this is, in this case adsense#alerts.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAlerts {
  @scala.inline
  def apply(items: js.Array[SchemaAlert] = null, kind: String = null): SchemaAlerts = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAlerts]
  }
}

