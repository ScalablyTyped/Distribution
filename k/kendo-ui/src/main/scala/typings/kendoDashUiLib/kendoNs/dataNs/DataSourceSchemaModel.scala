package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModel
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var fields: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceSchemaModel {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    fields: js.Any = null,
    id: java.lang.String = null
  ): DataSourceSchemaModel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DataSourceSchemaModel]
  }
}

