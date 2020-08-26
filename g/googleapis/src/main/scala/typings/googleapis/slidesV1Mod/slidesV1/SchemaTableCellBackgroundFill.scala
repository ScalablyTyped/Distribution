package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The table cell background fill.
  */
@js.native
trait SchemaTableCellBackgroundFill extends js.Object {
  /**
    * The background fill property state.  Updating the fill on a table cell
    * will implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a table cell, set this
    * field to `NOT_RENDERED`. In this case, any other fill fields set in the
    * same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
}

object SchemaTableCellBackgroundFill {
  @scala.inline
  def apply(): SchemaTableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellBackgroundFill]
  }
  @scala.inline
  implicit class SchemaTableCellBackgroundFillOps[Self <: SchemaTableCellBackgroundFill] (val x: Self) extends AnyVal {
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
    def setPropertyState(value: String): Self = this.set("propertyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyState: Self = this.set("propertyState", js.undefined)
    @scala.inline
    def setSolidFill(value: SchemaSolidFill): Self = this.set("solidFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolidFill: Self = this.set("solidFill", js.undefined)
  }
  
}

