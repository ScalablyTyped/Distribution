package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of each row in a table.
  */
@js.native
trait SchemaTableRowProperties extends js.Object {
  /**
    * Minimum height of the row. The row will be rendered in the Slides editor
    * at a height equal to or greater than this value in order to show all the
    * text in the row&#39;s cell(s).
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableRowProperties {
  @scala.inline
  def apply(): SchemaTableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowProperties]
  }
  @scala.inline
  implicit class SchemaTableRowPropertiesOps[Self <: SchemaTableRowProperties] (val x: Self) extends AnyVal {
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
    def setMinRowHeight(value: SchemaDimension): Self = this.set("minRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRowHeight: Self = this.set("minRowHeight", js.undefined)
  }
  
}

