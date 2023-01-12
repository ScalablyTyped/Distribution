package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * If set to true, the following behavior will take place:
    * if a new row is added, and then deleted, there will be no transaction added to the log
    * if an edit is made to a row or cell, then the value is brought back to its original value, the transaction should be removed
    * Note: This option takes effect only when autoCommit is set to false.
    *
    */
  var aggregateTransactions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If auto commit is true, data will be automatically commited to the data source, once a value or a batch of values are updated via saveChanges()
    *
    */
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback function to call when data binding is complete
    *
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Object on which to invoke the callback function
    *
    */
  var callee: js.UndefOr[Any] = js.undefined
  
  /**
    * This is the normalized (transformed) resulting data, after it's fetched from the data source
    *
    */
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Client-side dataBinding event. Can be a string pointing to a function name, or an object pointing to a function
    *
    */
  var dataBinding: js.UndefOr[Any] = js.undefined
  
  /**
    * Client-side dataBound event. Can be a string pointing to a function name, or an object pointing to a function
    *
    */
  var dataBound: js.UndefOr[Any] = js.undefined
  
  /**
    * This is the source of data - non normalized. Can be an array, can be reference to some JSON object, can be a DOM element for a HTML TABLE, or a function
    *
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * *** IMPORTANT DEPRECATED ***
    * A list of field definitions specifying the schema of the data source.
    * Field objects description: {name, [type], [xpath]}
    *
    */
  var fields: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Settings related to built-in filtering functionality
    *
    */
  var filtering: js.UndefOr[DataSourceSettingsFiltering] = js.undefined
  
  /**
    * Settings related to built-in group by functionality
    *
    */
  var groupby: js.UndefOr[DataSourceSettingsGroupby] = js.undefined
  
  /**
    * Setting this is only necessary when the data source is set to a table in string format. we need to create an invisible dummy data container in the body and append the table data to it
    *
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * If set to false will disable transformations on schema, even if it is defined locally in the javascript code
    *
    */
  var localSchemaTransform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This is the property in the dataView where actual resulting records will be put. (So the dataView will not be array but an object if this is defined), after the potential data source transformation
    *
    */
  var outputResultsName: js.UndefOr[String] = js.undefined
  
  /**
    * Settings related to built-in paging functionality
    *
    */
  var paging: js.UndefOr[DataSourceSettingsPaging] = js.undefined
  
  /**
    * The unique field identifier
    *
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the HTTP verb to be used to issue the request
    *
    */
  var requestType: js.UndefOr[String] = js.undefined
  
  /**
    * Content type of the response. See http://api.jquery.com/jQuery.ajax/ => contentType
    *
    */
  var responseContentType: js.UndefOr[String] = js.undefined
  
  /**
    * Property in the response which specifies where the data records array will be held (if the response is wrapped)
    *
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  
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
  var responseDataType: js.UndefOr[String] = js.undefined
  
  /**
    * Property in the response which specifies the total number of records in the backend (this is needed for paging)
    *
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  
  /**
    * A function to call when row is added.
    * Function takes first argument item and second argument dataSource.
    * Use item.row to obtain reference to the added row.
    * Use item.rowId to get the row ID.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowAdded: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call when row is deleted.
    * Use item.row to obtain reference to the deleted row.
    * Use item.rowId to get the row ID.
    * Use item.rowIndex to get the row index.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowDeleted: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call when row is inserted.
    * Function takes first argument item and second argument dataSource.
    * Use item.row to obtain reference to the inserted row.
    * Use item.rowId to get the row ID.
    * Use item.rowIndex to get the row index.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowInserted: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A function to call when row is updated (edited).
    * Function takes first argument item and second argument dataSource.
    * Use item.rowIndex to get the row index.
    * Use item.newRow to obtain reference to the updated row.
    * Use item.oldRow to obtain reference to the row that was updated.
    * Use dataSource to obtain reference to $.ig.DataSource.
    *
    */
  var rowUpdated: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A schema object that defines which fields from the data to bind to
    *
    */
  var schema: js.UndefOr[Any] = js.undefined
  
  /**
    * If true, will serialize the transaction log of updated values - if any - whenever commit is performed via a remote request.
    *
    */
  var serializeTransactionLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Settings related to built-in sorting functionality
    *
    */
  var sorting: js.UndefOr[DataSourceSettingsSorting] = js.undefined
  
  /**
    * Settings related to built-in summaries functionality
    *
    */
  var summaries: js.UndefOr[DataSourceSettingsSummaries] = js.undefined
  
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
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an update remote URL, to which an AJAX request will be made as soon as saveChages() is called.
    *
    */
  var updateUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Event that is fired after URL parameters are encoded (When a remote request is done). Can point to a function name or the function object itself
    *
    */
  var urlParamsEncoded: js.UndefOr[Any] = js.undefined
  
  /**
    * Event that is fired before URL parameters are encoded. Can point to a function name or the function object itself
    *
    */
  var urlParamsEncoding: js.UndefOr[Any] = js.undefined
}
object DataSourceSettings {
  
  inline def apply(): DataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setAggregateTransactions(value: Boolean): Self = StObject.set(x, "aggregateTransactions", value.asInstanceOf[js.Any])
    
    inline def setAggregateTransactionsUndefined: Self = StObject.set(x, "aggregateTransactions", js.undefined)
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCallee(value: Any): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setCalleeUndefined: Self = StObject.set(x, "callee", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataBinding(value: Any): Self = StObject.set(x, "dataBinding", value.asInstanceOf[js.Any])
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: Any): Self = StObject.set(x, "dataBound", value.asInstanceOf[js.Any])
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFields(value: js.Array[Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Any*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFiltering(value: DataSourceSettingsFiltering): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setGroupby(value: DataSourceSettingsGroupby): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocalSchemaTransform(value: Boolean): Self = StObject.set(x, "localSchemaTransform", value.asInstanceOf[js.Any])
    
    inline def setLocalSchemaTransformUndefined: Self = StObject.set(x, "localSchemaTransform", js.undefined)
    
    inline def setOutputResultsName(value: String): Self = StObject.set(x, "outputResultsName", value.asInstanceOf[js.Any])
    
    inline def setOutputResultsNameUndefined: Self = StObject.set(x, "outputResultsName", js.undefined)
    
    inline def setPaging(value: DataSourceSettingsPaging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
    
    inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    inline def setResponseDataType(value: String): Self = StObject.set(x, "responseDataType", value.asInstanceOf[js.Any])
    
    inline def setResponseDataTypeUndefined: Self = StObject.set(x, "responseDataType", js.undefined)
    
    inline def setResponseTotalRecCountKey(value: String): Self = StObject.set(x, "responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    inline def setResponseTotalRecCountKeyUndefined: Self = StObject.set(x, "responseTotalRecCountKey", js.undefined)
    
    inline def setRowAdded(value: js.Function): Self = StObject.set(x, "rowAdded", value.asInstanceOf[js.Any])
    
    inline def setRowAddedUndefined: Self = StObject.set(x, "rowAdded", js.undefined)
    
    inline def setRowDeleted(value: js.Function): Self = StObject.set(x, "rowDeleted", value.asInstanceOf[js.Any])
    
    inline def setRowDeletedUndefined: Self = StObject.set(x, "rowDeleted", js.undefined)
    
    inline def setRowInserted(value: js.Function): Self = StObject.set(x, "rowInserted", value.asInstanceOf[js.Any])
    
    inline def setRowInsertedUndefined: Self = StObject.set(x, "rowInserted", js.undefined)
    
    inline def setRowUpdated(value: js.Function): Self = StObject.set(x, "rowUpdated", value.asInstanceOf[js.Any])
    
    inline def setRowUpdatedUndefined: Self = StObject.set(x, "rowUpdated", js.undefined)
    
    inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSerializeTransactionLog(value: Boolean): Self = StObject.set(x, "serializeTransactionLog", value.asInstanceOf[js.Any])
    
    inline def setSerializeTransactionLogUndefined: Self = StObject.set(x, "serializeTransactionLog", js.undefined)
    
    inline def setSorting(value: DataSourceSettingsSorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSummaries(value: DataSourceSettingsSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
    
    inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
    
    inline def setUrlParamsEncoded(value: Any): Self = StObject.set(x, "urlParamsEncoded", value.asInstanceOf[js.Any])
    
    inline def setUrlParamsEncodedUndefined: Self = StObject.set(x, "urlParamsEncoded", js.undefined)
    
    inline def setUrlParamsEncoding(value: Any): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
    
    inline def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
  }
}
