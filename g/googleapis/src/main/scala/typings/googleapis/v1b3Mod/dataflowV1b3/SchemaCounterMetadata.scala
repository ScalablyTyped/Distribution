package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CounterMetadata includes all static non-name non-value counter attributes.
  */
@js.native
trait SchemaCounterMetadata extends js.Object {
  /**
    * Human-readable description of the counter semantics.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A string referring to the unit type.
    */
  var otherUnits: js.UndefOr[String] = js.native
  /**
    * System defined Units, see above enum.
    */
  var standardUnits: js.UndefOr[String] = js.native
}

object SchemaCounterMetadata {
  @scala.inline
  def apply(): SchemaCounterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterMetadata]
  }
  @scala.inline
  implicit class SchemaCounterMetadataOps[Self <: SchemaCounterMetadata] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOtherUnits(value: String): Self = this.set("otherUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherUnits: Self = this.set("otherUnits", js.undefined)
    @scala.inline
    def setStandardUnits(value: String): Self = this.set("standardUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardUnits: Self = this.set("standardUnits", js.undefined)
  }
  
}

