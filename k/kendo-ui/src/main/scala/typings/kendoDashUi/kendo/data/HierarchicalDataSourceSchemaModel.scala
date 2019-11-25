package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalDataSourceSchemaModel extends DataSourceSchemaModel {
  var children: js.UndefOr[js.Any] = js.undefined
  var hasChildren: js.UndefOr[js.Any] = js.undefined
}

object HierarchicalDataSourceSchemaModel {
  @scala.inline
  def apply(children: js.Any = null, fields: js.Any = null, hasChildren: js.Any = null, id: String = null): HierarchicalDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hasChildren != null) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchicalDataSourceSchemaModel]
  }
}

