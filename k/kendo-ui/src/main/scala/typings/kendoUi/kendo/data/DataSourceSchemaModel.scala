package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModel
  extends /* index */ StringDictionary[js.Any] {
  var fields: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object DataSourceSchemaModel {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    fields: js.Any = null,
    id: String = null
  ): DataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSchemaModel]
  }
}

