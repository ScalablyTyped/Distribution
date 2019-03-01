package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSchemaSchemaFields
  extends /**
	 * Option for DataSchemaSchemaFields
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * ParamType="function" optional="true" formatter function which accepts three parameters: val - value of the field; record - data source record; field - field definition; and return the formatted string. Formatter function is used when filtering by all fields.
  	 */
  var formatter: js.UndefOr[js.Any] = js.undefined
  /**
  	 * This option is applicable only for fields with fieldDataType="object". Reference to a function (string or function) that can be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this field.
  	 */
  var mapper: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /**
  	 * Name of the field
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * data type of the fieldstring
  	 * number
  	 * bool
  	 * date
  	 * time
  	 * object
  	 *
  	 *
  	 * Valid values:
  	 * "time"
  	 */
  var `type`: js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Object] = js.undefined
  /**
  	 * The XPath expression to map the node to the field
  	 */
  var xpath: js.UndefOr[java.lang.String] = js.undefined
}

object DataSchemaSchemaFields {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSchemaSchemaFields
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    formatter: js.Any = null,
    mapper: java.lang.String | js.Function = null,
    name: java.lang.String = null,
    `type`: java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Object = null,
    xpath: java.lang.String = null
  ): DataSchemaSchemaFields = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (mapper != null) __obj.updateDynamic("mapper")(mapper.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xpath != null) __obj.updateDynamic("xpath")(xpath)
    __obj.asInstanceOf[DataSchemaSchemaFields]
  }
}

