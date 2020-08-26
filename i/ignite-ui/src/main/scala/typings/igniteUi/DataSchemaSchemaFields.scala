package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSchemaSchemaFields
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * ParamType="function" optional="true" formatter function which accepts three parameters: val - value of the field; record - data source record; field - field definition; and return the formatted string. Formatter function is used when filtering by all fields.
    */
  var formatter: js.UndefOr[js.Any] = js.native
  /**
    * This option is applicable only for fields with fieldDataType="object". Reference to a function (string or function) that can be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this field.
    */
  var mapper: js.UndefOr[String | js.Function] = js.native
  /**
    * Name of the field
    */
  var name: js.UndefOr[String] = js.native
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
  var `type`: js.UndefOr[String | Double | Boolean | Date | js.Object] = js.native
  /**
    * The XPath expression to map the node to the field
    */
  var xpath: js.UndefOr[String] = js.native
}

object DataSchemaSchemaFields {
  @scala.inline
  def apply(): DataSchemaSchemaFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSchemaSchemaFields]
  }
  @scala.inline
  implicit class DataSchemaSchemaFieldsOps[Self <: DataSchemaSchemaFields] (val x: Self) extends AnyVal {
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
    def setFormatter(value: js.Any): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setMapper(value: String | js.Function): Self = this.set("mapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapper: Self = this.set("mapper", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String | Double | Boolean | Date | js.Object): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXpath(value: String): Self = this.set("xpath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXpath: Self = this.set("xpath", js.undefined)
  }
  
}

