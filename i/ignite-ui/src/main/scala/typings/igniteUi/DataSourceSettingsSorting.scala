package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsSorting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * If the sorting type is local and applyToAllData is true, sorting will be performed on the whole data source that's present locally, otherwise only on the current dataView. If sorting type is remote, this setting doesn't have any effect.
    *
    */
  var applyToAllData: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if sorting will be case sensitive or not. Works only for local sorting
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /**
    * Custom comparison sorting function. Accepts the following arguments: fields, schema, booleand value whether sorting is ascending , convert function(please check option for customConvertFunc) and returns a value 0 indicating that values are equal, 1 indicating that val1 > val2 and -1 indicating that val1 < val2
    *
    */
  var compareFunc: js.UndefOr[js.Any] = js.native
  /**
    * Custom data value conversion function(called from sorting function). Accepts a value of the data cell and column key and should return the converted value
    *
    */
  var customConvertFunc: js.UndefOr[js.Any] = js.native
  /**
    * Custom sorting function that can point to either a string or a function object. When the function is called, the following arguments are passed: data array, fields (array of field definitions) , direction ("asc" or "desc"). The function should return a sorted data array
    *
    */
  var customFunc: js.UndefOr[js.Any] = js.native
  /**
    * Sorting direction
    *
    *
    * Valid values:
    * "none"
    * "asc"
    * "desc"
    */
  var defaultDirection: js.UndefOr[String] = js.native
  /**
    * When defaultDirection is different than "none", and defaultFields is specified, data will be initially sorted accordingly, directly after dataBind()
    *
    */
  var defaultFields: js.UndefOr[js.Array[_]] = js.native
  /**
    * Takes precedence over experssions, an "SQL-like" encoded expressions string  : see sort(). Example col2 > 100 ORDER BY asc
    *
    */
  var exprString: js.UndefOr[String] = js.native
  /**
    * A list of sorting expressions , consisting of the following keys (and their respective values): fieldName, direction and compareFunc (optional)
    *
    */
  var expressions: js.UndefOr[js.Array[_]] = js.native
  /**
    * URL param value for ascending type of sorting. Default is null and uses OData conventions
    *
    */
  var sortUrlAscValueKey: js.UndefOr[String] = js.native
  /**
    * URL param value for descending type of sorting. Default is null and uses OData conventions
    *
    */
  var sortUrlDescValueKey: js.UndefOr[String] = js.native
  /**
    * URL param name which specifies how sorting expressions will be encoded in the URL. Default is null and uses OData conventions
    *
    */
  var sortUrlKey: js.UndefOr[String] = js.native
  /**
    * Specifies whether sorting will be applied locally or remotely (via a remote request)
    *
    *
    * Valid values:
    * "remote"
    * "local"
    */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsSorting {
  @scala.inline
  def apply(): DataSourceSettingsSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSorting]
  }
  @scala.inline
  implicit class DataSourceSettingsSortingOps[Self <: DataSourceSettingsSorting] (val x: Self) extends AnyVal {
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
    def setApplyToAllData(value: Boolean): Self = this.set("applyToAllData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyToAllData: Self = this.set("applyToAllData", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setCompareFunc(value: js.Any): Self = this.set("compareFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareFunc: Self = this.set("compareFunc", js.undefined)
    @scala.inline
    def setCustomConvertFunc(value: js.Any): Self = this.set("customConvertFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomConvertFunc: Self = this.set("customConvertFunc", js.undefined)
    @scala.inline
    def setCustomFunc(value: js.Any): Self = this.set("customFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFunc: Self = this.set("customFunc", js.undefined)
    @scala.inline
    def setDefaultDirection(value: String): Self = this.set("defaultDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDirection: Self = this.set("defaultDirection", js.undefined)
    @scala.inline
    def setDefaultFieldsVarargs(value: js.Any*): Self = this.set("defaultFields", js.Array(value :_*))
    @scala.inline
    def setDefaultFields(value: js.Array[_]): Self = this.set("defaultFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFields: Self = this.set("defaultFields", js.undefined)
    @scala.inline
    def setExprString(value: String): Self = this.set("exprString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExprString: Self = this.set("exprString", js.undefined)
    @scala.inline
    def setExpressionsVarargs(value: js.Any*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[_]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
    @scala.inline
    def setSortUrlAscValueKey(value: String): Self = this.set("sortUrlAscValueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortUrlAscValueKey: Self = this.set("sortUrlAscValueKey", js.undefined)
    @scala.inline
    def setSortUrlDescValueKey(value: String): Self = this.set("sortUrlDescValueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortUrlDescValueKey: Self = this.set("sortUrlDescValueKey", js.undefined)
    @scala.inline
    def setSortUrlKey(value: String): Self = this.set("sortUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortUrlKey: Self = this.set("sortUrlKey", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

