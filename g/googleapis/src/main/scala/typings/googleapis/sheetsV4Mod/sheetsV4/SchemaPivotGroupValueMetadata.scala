package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a value in a pivot grouping.
  */
@js.native
trait SchemaPivotGroupValueMetadata extends js.Object {
  /**
    * True if the data corresponding to the value is collapsed.
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /**
    * The calculated value the metadata corresponds to. (Note that formulaValue
    * is not valid,  because the values will be calculated.)
    */
  var value: js.UndefOr[SchemaExtendedValue] = js.native
}

object SchemaPivotGroupValueMetadata {
  @scala.inline
  def apply(): SchemaPivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupValueMetadata]
  }
  @scala.inline
  implicit class SchemaPivotGroupValueMetadataOps[Self <: SchemaPivotGroupValueMetadata] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setValue(value: SchemaExtendedValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

