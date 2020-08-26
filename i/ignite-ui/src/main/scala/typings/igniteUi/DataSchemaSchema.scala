package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSchemaSchema
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * This is the property (xpath) in the data source where the child records of a record are located. Used in XML binding.
    */
  var childDataProperty: js.UndefOr[String] = js.native
  /**
    * A list of field definitions specifying the schema of the data source. Field objects description: {name, [type], [xpath]}
    * returnType="array"
    */
  var fields: js.UndefOr[DataSchemaSchemaFields] = js.native
  /**
    * This is the property in the resulting object where actual resulting records will be put. (So the result will not be array but an object if this is defined), after the potential data source transformation
    */
  var outputResultsName: js.UndefOr[String] = js.native
  /**
    * This is the property (path) in the data source where the records are located.
    */
  var searchField: js.UndefOr[String] = js.native
}

object DataSchemaSchema {
  @scala.inline
  def apply(): DataSchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSchemaSchema]
  }
  @scala.inline
  implicit class DataSchemaSchemaOps[Self <: DataSchemaSchema] (val x: Self) extends AnyVal {
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
    def setChildDataProperty(value: String): Self = this.set("childDataProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildDataProperty: Self = this.set("childDataProperty", js.undefined)
    @scala.inline
    def setFields(value: DataSchemaSchemaFields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setOutputResultsName(value: String): Self = this.set("outputResultsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputResultsName: Self = this.set("outputResultsName", js.undefined)
    @scala.inline
    def setSearchField(value: String): Self = this.set("searchField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchField: Self = this.set("searchField", js.undefined)
  }
  
}

