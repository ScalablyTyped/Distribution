package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSchemaSchema
  extends /**
	 * Option for DataSchemaSchema
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * This is the property (xpath) in the data source where the child records of a record are located. Used in XML binding.
  	 */
  var childDataProperty: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of field definitions specifying the schema of the data source. Field objects description: {name, [type], [xpath]}
  	 * returnType="array"
  	 */
  var fields: js.UndefOr[DataSchemaSchemaFields] = js.undefined
  /**
  	 * This is the property in the resulting object where actual resulting records will be put. (So the result will not be array but an object if this is defined), after the potential data source transformation
  	 */
  var outputResultsName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This is the property (path) in the data source where the records are located.
  	 */
  var searchField: js.UndefOr[java.lang.String] = js.undefined
}

object DataSchemaSchema {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSchemaSchema
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    childDataProperty: java.lang.String = null,
    fields: DataSchemaSchemaFields = null,
    outputResultsName: java.lang.String = null,
    searchField: java.lang.String = null
  ): DataSchemaSchema = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childDataProperty != null) __obj.updateDynamic("childDataProperty")(childDataProperty)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (outputResultsName != null) __obj.updateDynamic("outputResultsName")(outputResultsName)
    if (searchField != null) __obj.updateDynamic("searchField")(searchField)
    __obj.asInstanceOf[DataSchemaSchema]
  }
}

