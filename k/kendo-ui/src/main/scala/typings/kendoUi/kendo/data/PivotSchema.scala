package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotSchema extends DataSourceSchema {
  var axes: js.UndefOr[js.Any] = js.undefined
  var catalogs: js.UndefOr[js.Any] = js.undefined
  var cube: js.UndefOr[js.Any] = js.undefined
  var cubes: js.UndefOr[js.Any] = js.undefined
  var dimensions: js.UndefOr[js.Any] = js.undefined
  var hierarchies: js.UndefOr[js.Any] = js.undefined
  var levels: js.UndefOr[js.Any] = js.undefined
  var measures: js.UndefOr[js.Any] = js.undefined
}

object PivotSchema {
  @scala.inline
  def apply(
    aggregates: js.Any = null,
    axes: js.Any = null,
    catalogs: js.Any = null,
    cube: js.Any = null,
    cubes: js.Any = null,
    data: js.Any = null,
    dimensions: js.Any = null,
    errors: js.Any = null,
    groups: js.Any = null,
    hierarchies: js.Any = null,
    levels: js.Any = null,
    measures: js.Any = null,
    model: js.Any = null,
    parse: js.Function = null,
    total: js.Any = null,
    `type`: String = null
  ): PivotSchema = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    if (cubes != null) __obj.updateDynamic("cubes")(cubes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchema]
  }
}

