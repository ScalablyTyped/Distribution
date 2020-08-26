package typings.googleapis.v33Mod.dfareportingV33

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
  def apply(): SchemaCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomRichMediaEvents]
  }
  @scala.inline
  implicit class SchemaCustomRichMediaEventsOps[Self <: SchemaCustomRichMediaEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilteredEventIdsVarargs(value: SchemaDimensionValue*): Self = this.set("filteredEventIds", js.Array(value :_*))
    @scala.inline
    def setFilteredEventIds(value: js.Array[SchemaDimensionValue]): Self = this.set("filteredEventIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredEventIds: Self = this.set("filteredEventIds", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

