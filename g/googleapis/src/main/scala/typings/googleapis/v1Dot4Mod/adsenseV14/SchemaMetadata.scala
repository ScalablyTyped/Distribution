package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMetadata extends js.Object {
  var items: js.UndefOr[js.Array[SchemaReportingMetadataEntry]] = js.native
  /**
    * Kind of list this is, in this case adsense#metadata.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaMetadata {
  @scala.inline
  def apply(items: js.Array[SchemaReportingMetadataEntry] = null, kind: String = null): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
}

