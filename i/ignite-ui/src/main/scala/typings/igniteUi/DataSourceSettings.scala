package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * If set to true, the following behavior will take place:
    * if a new row is added, and then deleted, there will be no transaction added to the log
    * if an edit is made to a row or cell, then the value is brought back to its original value, the transaction should be removed
    * Note: This option takes effect only when autoCommit is set to false.
    *
    */
  var aggregateTransactions: js.UndefOr[Boolean] = js.native
  /**
    * If auto commit is true, data will be automatically commited to the data source, once a value or a batch of values are updated via saveChanges()
    *
    */
  var autoCommit: js.UndefOr[Boolean] = js.native
  /**
    * Callback function to call when data binding is complete
    *
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * Object on which to invoke the callback function
    *
    */
  var callee: js.UndefOr[js.Any] = js.native
  /**
    * This is the normalized (transformed) resulting data, after it's fetched from the data source
    *
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * Client-side dataBinding event. Can be a string pointing to a function name, or an object pointing to a function
    *
    */
  var dataBinding: js.UndefOr[js.Any] = js.native
  /**
    * Client-side dataBound event. Can be a string pointing to a function name, or an object pointing to a function
    *
    */
  var dataBound: js.UndefOr[js.Any] = js.native
  /**
    * This is the source of data - non normalized. Can be an array, can be reference to some JSON object, can be a DOM element for a HTML TABLE, or a function
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * *** IMPORTANT DEPRECATED ***
    * A list of field definitions specifying the schema of the data source.
    * Field objects description: {name, [type], [xpath]}
    *
    */
  var fields: js.UndefOr[js.Array[_]] = js.native
  /**
    * Settings related to built-in filtering functionality
    *
    */
  var filtering: js.UndefOr[DataSourceSettingsFiltering] = js.native
  /**
    * Settings related to built-in group by functionality
    *
    */
  var groupby: js.UndefOr[DataSourceSettingsGroupby] = js.native
  /**
    * Setting this is only necessary when the data source is set to a table in string format. we need to create an invisible dummy data container in the body and append the table data to it
    *
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If set to false will disable transformations on schema, even if it is defined locally in the javascript code
    *
    */
  var localSchemaTransform: js.UndefOr[Boolean] = js.native
  /**
    * This is the property in the dataView where actual resulting records will be put. (So the dataView will not be array but an object if this is defined), after the potential data source transformation
    *
    */
  var outputResultsName: js.UndefOr[String] = js.native
  /**
    * Settings related to built-in paging functionality
    *
    */
  var paging: js.UndefOr[DataSourceSettingsPaging] = js.native
  /**
    * The unique field identifier
    *
    */
  var primaryKey: js.UndefOr[String] = js.native
  /**
    * Specifies the HTTP verb to be used to issue the request
    *
    */
  var requestType: js.UndefOr[String] = js.native
  /**
    * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
    *
    */
  var responseContentType: js.UndefOr[String] = js.native
  /**
    * Property in the response which specifies where the data records array will be held (if the response is wrapped)
    *
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * Response type when a URL is set as the data source. See http://api.jquery.com/jQuery.ajax/ => dataType
    *
    *
    * Valid values:
    * "json"
    * "xml"
    * "html"
    * "script"
    * "jsonp"
    * "text"
    */
  var responseDataType: js.UndefOr[String] = js.native
  /**
    * Property in the response which specifies the total number of records in the backend (this is needed for paging)
    *
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
    * A function to call when row is added.
    * Function takes first argument item and second argument dataSource.
    * Use item.row to obtain reference to the added row.
    * Use item.rowId to get the row ID.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowAdded: js.UndefOr[js.Function] = js.native
  /**
    * A function to call when row is deleted.
    * Use item.row to obtain reference to the deleted row.
    * Use item.rowId to get the row ID.
    * Use item.rowIndex to get the row index.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowDeleted: js.UndefOr[js.Function] = js.native
  /**
    * A function to call when row is inserted.
    * Function takes first argument item and second argument dataSource.
    * Use item.row to obtain reference to the inserted row.
    * Use item.rowId to get the row ID.
    * Use item.rowIndex to get the row index.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowInserted: js.UndefOr[js.Function] = js.native
  /**
    * A function to call when row is updated (edited).
    * Function takes first argument item and second argument dataSource.
    * Use item.rowIndex to get the row index.
    * Use item.newRow to obtain reference to the updated row.
    * Use item.oldRow to obtain reference to the row that was updated.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowUpdated: js.UndefOr[js.Function] = js.native
  /**
    * A schema object that defines which fields from the data to bind to
    *
    */
  var schema: js.UndefOr[js.Any] = js.native
  /**
    * If true, will serialize the transaction log of updated values - if any - whenever commit is performed via a remote request.
    *
    */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.native
  /**
    * Settings related to built-in sorting functionality
    *
    */
  var sorting: js.UndefOr[DataSourceSettingsSorting] = js.native
  /**
    * Settings related to built-in summaries functionality
    *
    */
  var summaries: js.UndefOr[DataSourceSettingsSummaries] = js.native
  /**
    * Type of the data source
    *
    *
    * Valid values:
    * "json" Specifies that the data source is an already evaluated JSON (JavaScript object/array) or a string that can be evaluated to JSON
    * "xml" Specifies that the data source is a XML Document object or a string that can be evaluated to XML
    * "unknown" Specifies that the data source is of unknown type. In that case it will be analyzed and automatically detected if possible
    * "array" Specifies that the data source is a simple array of objects.
    * "function" Specifies that the data source points to a function. During data binding the function will be called and the result will be assumed to be an array of objects
    * "htmlTableString" Specifies that the data source points to a string that represents a HTML table
    * "htmlTableId" Specifies that the data source points to an ID of a HTML Table element that's loaded on the page
    * "htmlTableDom" The data source points to a DOM object that is of TABLE type
    * "invalid" Set whenever data source is analyzed (in case its type is unknown) and the type cannot be detected
    * "remoteUrl" Specifies that the data source points to a remote URL, from which data will be retrieved using an AJAX call ($.ajax)
    * "htmlListDom" The data source points to a DOM object that is of UL/OL type
    * "htmlSelectDom" The data source points to a DOM object that is of SELECT type
    * "empty"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Specifies an update remote URL, to which an AJAX request will be made as soon as saveChages() is called.
    *
    */
  var updateUrl: js.UndefOr[String] = js.native
  /**
    * Event that is fired after URL parameters are encoded (When a remote request is done). Can point to a function name or the function object itself
    *
    */
  var urlParamsEncoded: js.UndefOr[js.Any] = js.native
  /**
    * Event that is fired before URL parameters are encoded. Can point to a function name or the function object itself
    *
    */
  var urlParamsEncoding: js.UndefOr[js.Any] = js.native
}

object DataSourceSettings {
  @scala.inline
  def apply(): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettings]
  }
  @scala.inline
  implicit class DataSourceSettingsOps[Self <: DataSourceSettings] (val x: Self) extends AnyVal {
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
    def setAggregateTransactions(value: Boolean): Self = this.set("aggregateTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateTransactions: Self = this.set("aggregateTransactions", js.undefined)
    @scala.inline
    def setAutoCommit(value: Boolean): Self = this.set("autoCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCommit: Self = this.set("autoCommit", js.undefined)
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCallee(value: js.Any): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallee: Self = this.set("callee", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataBinding(value: js.Any): Self = this.set("dataBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: js.Any): Self = this.set("dataBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: js.Any*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[_]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFiltering(value: DataSourceSettingsFiltering): Self = this.set("filtering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setGroupby(value: DataSourceSettingsGroupby): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLocalSchemaTransform(value: Boolean): Self = this.set("localSchemaTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSchemaTransform: Self = this.set("localSchemaTransform", js.undefined)
    @scala.inline
    def setOutputResultsName(value: String): Self = this.set("outputResultsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputResultsName: Self = this.set("outputResultsName", js.undefined)
    @scala.inline
    def setPaging(value: DataSourceSettingsPaging): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    @scala.inline
    def setPrimaryKey(value: String): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
    @scala.inline
    def setResponseContentType(value: String): Self = this.set("responseContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseContentType: Self = this.set("responseContentType", js.undefined)
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    @scala.inline
    def setResponseDataType(value: String): Self = this.set("responseDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataType: Self = this.set("responseDataType", js.undefined)
    @scala.inline
    def setResponseTotalRecCountKey(value: String): Self = this.set("responseTotalRecCountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTotalRecCountKey: Self = this.set("responseTotalRecCountKey", js.undefined)
    @scala.inline
    def setRowAdded(value: js.Function): Self = this.set("rowAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowAdded: Self = this.set("rowAdded", js.undefined)
    @scala.inline
    def setRowDeleted(value: js.Function): Self = this.set("rowDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDeleted: Self = this.set("rowDeleted", js.undefined)
    @scala.inline
    def setRowInserted(value: js.Function): Self = this.set("rowInserted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowInserted: Self = this.set("rowInserted", js.undefined)
    @scala.inline
    def setRowUpdated(value: js.Function): Self = this.set("rowUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowUpdated: Self = this.set("rowUpdated", js.undefined)
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSerializeTransactionLog(value: Boolean): Self = this.set("serializeTransactionLog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializeTransactionLog: Self = this.set("serializeTransactionLog", js.undefined)
    @scala.inline
    def setSorting(value: DataSourceSettingsSorting): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    @scala.inline
    def setSummaries(value: DataSourceSettingsSummaries): Self = this.set("summaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaries: Self = this.set("summaries", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdateUrl(value: String): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
    @scala.inline
    def setUrlParamsEncoded(value: js.Any): Self = this.set("urlParamsEncoded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParamsEncoded: Self = this.set("urlParamsEncoded", js.undefined)
    @scala.inline
    def setUrlParamsEncoding(value: js.Any): Self = this.set("urlParamsEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParamsEncoding: Self = this.set("urlParamsEncoding", js.undefined)
  }
  
}

