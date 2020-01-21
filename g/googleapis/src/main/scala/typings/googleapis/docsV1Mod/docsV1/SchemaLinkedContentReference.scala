package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to the external linked source content.
  */
@js.native
trait SchemaLinkedContentReference extends js.Object {
  /**
    * A reference to the linked chart.
    */
  var sheetsChartReference: js.UndefOr[SchemaSheetsChartReference] = js.native
}

object SchemaLinkedContentReference {
  @scala.inline
  def apply(sheetsChartReference: SchemaSheetsChartReference = null): SchemaLinkedContentReference = {
    val __obj = js.Dynamic.literal()
    if (sheetsChartReference != null) __obj.updateDynamic("sheetsChartReference")(sheetsChartReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLinkedContentReference]
  }
}

