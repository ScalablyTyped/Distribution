package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSavedReport extends js.Object {
  /**
    * Unique identifier of this saved report.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#savedReport.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * This saved report&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaSavedReport {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): SchemaSavedReport = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSavedReport]
  }
}

