package typings.kendoDashUi.kendoNs.dataNs

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
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    if (cubes != null) __obj.updateDynamic("cubes")(cubes)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (total != null) __obj.updateDynamic("total")(total)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PivotSchema]
  }
}

