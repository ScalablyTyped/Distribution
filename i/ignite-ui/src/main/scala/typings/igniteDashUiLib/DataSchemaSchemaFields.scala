package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSchemaSchemaFields
  extends /**
	 * Option for DataSchemaSchemaFields
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

