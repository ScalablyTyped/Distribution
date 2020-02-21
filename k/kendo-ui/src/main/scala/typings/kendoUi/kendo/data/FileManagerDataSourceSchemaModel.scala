package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerDataSourceSchemaModel extends HierarchicalDataSourceSchemaModel {
  var isDirectory: js.UndefOr[js.Any] = js.undefined
}

object FileManagerDataSourceSchemaModel {
  @scala.inline
  def apply(
    children: js.Any = null,
    fields: js.Any = null,
    hasChildren: js.Any = null,
    id: String = null,
    isDirectory: js.Any = null
  ): FileManagerDataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hasChildren != null) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(isDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerDataSourceSchemaModel]
  }
}

