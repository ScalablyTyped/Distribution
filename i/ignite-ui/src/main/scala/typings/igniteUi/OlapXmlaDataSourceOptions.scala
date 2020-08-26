package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapXmlaDataSourceOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * The catalog name.
    */
  var catalog: js.UndefOr[String] = js.native
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the columns of the data source.
    */
  var columns: js.UndefOr[String] = js.native
  /**
    * The name of the cube in the data source.
    */
  var cube: js.UndefOr[String] = js.native
  /**
    * Additional properties sent with every discover request.
    *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var discoverProperties: js.UndefOr[js.Any] = js.native
  /**
    * Enables/disables caching of the XMLA result object.
    */
  var enableResultCache: js.UndefOr[Boolean] = js.native
  /**
    * Additional properties sent with every execute request.
    *             The object is treated as a key/value store where each property name is used as the key and the property value as the value.
    */
  var executeProperties: js.UndefOr[js.Any] = js.native
  /**
    * A list of hierarchy names separated by comma (,). These will be hierarchies in the filters of the data source.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Specifies if the data is to be served by a XMLA remote provider.
    */
  var isRemote: js.UndefOr[Boolean] = js.native
  /**
    * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
    */
  var mdxSettings: js.UndefOr[OlapXmlaDataSourceOptionsMdxSettings] = js.native
  /**
    * The name of the measure group in the data source.
    */
  var measureGroup: js.UndefOr[String] = js.native
  /**
    * A list of measure names separated by comma (,). These will be the measures of the data source.
    */
  var measures: js.UndefOr[String] = js.native
  /**
    * An object containing information about how the request to the XMLA server should be processed.
    */
  var requestOptions: js.UndefOr[OlapXmlaDataSourceOptionsRequestOptions] = js.native
  /**
    * A list of hierarchy names separated by comma (,). These will be the hierarchies in the rows of the data source.
    */
  var rows: js.UndefOr[String] = js.native
  /**
    * Optional="false" The URL of the XMLA server.
    */
  var serverUrl: js.UndefOr[String] = js.native
}

object OlapXmlaDataSourceOptions {
  @scala.inline
  def apply(): OlapXmlaDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapXmlaDataSourceOptions]
  }
  @scala.inline
  implicit class OlapXmlaDataSourceOptionsOps[Self <: OlapXmlaDataSourceOptions] (val x: Self) extends AnyVal {
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
    def setCatalog(value: String): Self = this.set("catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalog: Self = this.set("catalog", js.undefined)
    @scala.inline
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCube(value: String): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    @scala.inline
    def setDiscoverProperties(value: js.Any): Self = this.set("discoverProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscoverProperties: Self = this.set("discoverProperties", js.undefined)
    @scala.inline
    def setEnableResultCache(value: Boolean): Self = this.set("enableResultCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResultCache: Self = this.set("enableResultCache", js.undefined)
    @scala.inline
    def setExecuteProperties(value: js.Any): Self = this.set("executeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecuteProperties: Self = this.set("executeProperties", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setIsRemote(value: Boolean): Self = this.set("isRemote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRemote: Self = this.set("isRemote", js.undefined)
    @scala.inline
    def setMdxSettings(value: OlapXmlaDataSourceOptionsMdxSettings): Self = this.set("mdxSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMdxSettings: Self = this.set("mdxSettings", js.undefined)
    @scala.inline
    def setMeasureGroup(value: String): Self = this.set("measureGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureGroup: Self = this.set("measureGroup", js.undefined)
    @scala.inline
    def setMeasures(value: String): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    @scala.inline
    def setRequestOptions(value: OlapXmlaDataSourceOptionsRequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    @scala.inline
    def setRows(value: String): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerUrl: Self = this.set("serverUrl", js.undefined)
  }
  
}

