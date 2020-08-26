package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The border styling properties of the TableBorderCell.
  */
@js.native
trait SchemaTableBorderProperties extends js.Object {
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.native
  /**
    * The fill of the table border.
    */
  var tableBorderFill: js.UndefOr[SchemaTableBorderFill] = js.native
  /**
    * The thickness of the border.
    */
  var weight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableBorderProperties {
  @scala.inline
  def apply(): SchemaTableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderProperties]
  }
  @scala.inline
  implicit class SchemaTableBorderPropertiesOps[Self <: SchemaTableBorderProperties] (val x: Self) extends AnyVal {
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
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    @scala.inline
    def setTableBorderFill(value: SchemaTableBorderFill): Self = this.set("tableBorderFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableBorderFill: Self = this.set("tableBorderFill", js.undefined)
    @scala.inline
    def setWeight(value: SchemaDimension): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

