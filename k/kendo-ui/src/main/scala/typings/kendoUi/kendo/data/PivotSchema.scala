package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotSchema extends DataSourceSchema {
  var axes: js.UndefOr[js.Any] = js.native
  var catalogs: js.UndefOr[js.Any] = js.native
  var cube: js.UndefOr[js.Any] = js.native
  var cubes: js.UndefOr[js.Any] = js.native
  var dimensions: js.UndefOr[js.Any] = js.native
  var hierarchies: js.UndefOr[js.Any] = js.native
  var levels: js.UndefOr[js.Any] = js.native
  var measures: js.UndefOr[js.Any] = js.native
}

object PivotSchema {
  @scala.inline
  def apply(): PivotSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotSchema]
  }
  @scala.inline
  implicit class PivotSchemaOps[Self <: PivotSchema] (val x: Self) extends AnyVal {
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
    def setAxes(value: js.Any): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setCatalogs(value: js.Any): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogs: Self = this.set("catalogs", js.undefined)
    @scala.inline
    def setCube(value: js.Any): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    @scala.inline
    def setCubes(value: js.Any): Self = this.set("cubes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCubes: Self = this.set("cubes", js.undefined)
    @scala.inline
    def setDimensions(value: js.Any): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setHierarchies(value: js.Any): Self = this.set("hierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchies: Self = this.set("hierarchies", js.undefined)
    @scala.inline
    def setLevels(value: js.Any): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setMeasures(value: js.Any): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
  }
  
}

