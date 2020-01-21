package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Custom Rich Media Events group.
  */
@js.native
trait SchemaCustomRichMediaEvents extends js.Object {
  /**
    * List of custom rich media event IDs. Dimension values must be all of type
    * dfa:richMediaEventTypeIdAndName.
    */
  var filteredEventIds: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#customRichMediaEvents.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCustomRichMediaEvents {
  @scala.inline
  def apply(filteredEventIds: js.Array[SchemaDimensionValue] = null, kind: String = null): SchemaCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (filteredEventIds != null) __obj.updateDynamic("filteredEventIds")(filteredEventIds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomRichMediaEvents]
  }
}

