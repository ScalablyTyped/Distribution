package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.RemoteDataSource")
@js.native
class RemoteDataSource protected () extends js.Object {
  def this(settings: igniteDashUiLib.DataSourceSettings) = this()
  /**
  	 * Adds a new node to the tree data source. Creates a transaction that can be committed / rolled back
  	 *
  	 * @param data the transaction data
  	 */
  def addNode(data: js.Object): scala.Unit = js.native
  /**
  	 * Adds a new row to the data source. Creates a transaction that can be committed / rolled back
  	 *
  	 * @param rowId the record key - primaryKey (string) or index (number)
  	 * @param rowObject the new record data.
  	 * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
  	 */
  def addRow(rowId: js.Object, rowObject: js.Object, autoCommit: scala.Boolean): js.Object = js.native
  /**
  	 * Returns a list of all transaction objects that are either pending, or have been committed in the data source.
  	 */
  def allTransactions(): js.Array[_] = js.native
  /**
  	 * Analyzes the dataSource setting to automatically determine the type of the data source. Returns the data source type. See settings.type
  	 */
  def analyzeDataSource(): java.lang.String = js.native
  /**
  	 * This clears local filtering applied to the data view by resetting it to the original data and applying any paging
  	 */
  def clearLocalFilter(): scala.Unit = js.native
  /**
  	 * This clears local sorting applied to the data view by resetting it to the original data and applying any paging
  	 */
  def clearLocalSorting(): scala.Unit = js.native
  /**
  	 * Update the data source with every transaction from the log
  	 *
  	 * @param id Id of the transaction to commit. If no id is specified, will commit all transactions to the data source.
  	 */
  def commit(): scala.Unit = js.native
  def commit(id: scala.Double): scala.Unit = js.native
  /**
  	 * Returns all of the bound data, without taking into account local paging, sorting, filtering, etc.
  	 */
  def data(): js.Object = js.native
  /**
  	 * Data binds to the current data source
  	 * databinding works using the following workflow:
  	 * 1. fire the databinding event
  	 * 2. based on the data source type (see analyzeDataSource()), do the following:
  	 * 3. if type is HtmlTable, parse the table and set the data and dataView respectively.
  	 * if the type is Function, call it, apply Paging/Filtering/Sorting, and set this._dataView . If the developer wants to do his own paging, filtering or sorting
  	 * in that case, then he should handle the PageIndexChanging and/or DataFiltering, and/or ColumnSorting client-side events, and cancel them.
  	 * if no paging/sorting/filtering are enabled, use just this._data to save space
  	 * if the data source is of type RemoteUrl, use jQuery's $.ajax API to trigger a remote request to the service. Use the param() API to encode the URL
  	 * if the data source is invalid, throw an exception
  	 * if the analyzed runtime data source type , that is, the result of analyzeDataSource(), is Unknown, check if
  	 * the value of settings.type is set to XML or JSON. If string, eval for JSON, and parse for the XML to build the object tree
  	 * 4. now normalize/transform the data, if a schema is supplied. This inplies any additional data type  conversion
  	 * 5. next, if OpType is Local, apply paging, sorting, and/or filtering to the data, and store the result in this._dataView
  	 * 6. fire the databound event
  	 *
  	 * @param callback callback function
  	 * @param callee callee object on which the callback will be executed. If none is specified, will assume global execution context
  	 */
  def dataBind(): scala.Unit = js.native
  def dataBind(callback: java.lang.String): scala.Unit = js.native
  def dataBind(callback: java.lang.String, callee: js.Object): scala.Unit = js.native
  /**
  	 * Gets/sets the dataSource setting. If no parameter is specified, returns settings.dataSource
  	 *
  	 * @param ds
  	 */
  def dataSource(): js.Object = js.native
  def dataSource(ds: js.Object): js.Object = js.native
  /**
  	 * Returns summaries data
  	 */
  def dataSummaries(): js.Object = js.native
  /**
  	 * Returns the current normalized/transformed and paged/filtered/sorted data, i.e. the dataView
  	 */
  def dataView(): js.Array[_] = js.native
  /**
  	 * Deletes a row from the data source.
  	 *
  	 * @param rowId the record key - primaryKey (string) or index (number)
  	 * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
  	 */
  def deleteRow(rowId: js.Object, autoCommit: scala.Boolean): js.Object = js.native
  /**
  	 * Sets a list of fields to the data source. If no parameter is specified, just returns the already existing list of fields
  	 *
  	 * @param fields a field has the following format: {key: 'fieldKey', dataType: 'string/number/date' }
  	 */
  def fields(): js.Object = js.native
  def fields(fields: js.Object): js.Object = js.native
  /**
  	 * Filters the data source locally. Remote filtering can be performed by just calling dataBind() and
  	 * setting the settings.filtering.expressions. The result (filtered data) can be obtained by calling dataView()
  	 * example: [{fieldName : "firstName", expr: "abc", cond: "StartsWith"}, {fieldName : "lastName"}]
  	 * example 2: [{fieldIndex : 1} , {fieldIndex : 2, expr: "a", cond : "contains"}]
  	 * example 3: [{filterAllFields: true, expr: "abc", fields: [name: "Description", type: "string"]}]
  	 * expr is the filter expression text , such as "abc", or a regular expression such as *test*
  	 * cond is the filtering condition such as startsWith, endsWith, contains, equals, doesNotEqual, doesNotContain
  	 * if expr is detected to be a regular expression, the "cond" part is skipped
  	 * To [filter by text](ig.datasource#methods:filterByText) "fieldExpressions" should have only one object with the following schema:
  	 * {filterAllFields: <type="bool" should be set to true>, expr: <type="string" the text to search for>, fields: <type="array" an array of [fields](ig.dataschema#options:schema.fields) to search in>}
  	 *
  	 * @param fieldExpressions a list of field expression definitions
  	 * @param boolLogic boolean logic. Accepted values are AND and OR.
  	 * @param keepFilterState if keepFilterState is set to true, it will not discard previous filtering expressions
  	 * @param fieldExpressionsOnStrings a list of field expression definitions (or a string with the conditions separated by AND/OR operator, example: "ID = 1 OR ID = 2"), which when applied will threat the related field as if it's string and can only apply conditions valid for string types.
  	 */
  def filter(
    fieldExpressions: js.Object,
    boolLogic: js.Object,
    keepFilterState: scala.Boolean,
    fieldExpressionsOnStrings: js.Object
  ): scala.Unit = js.native
  /**
  	 * Filters the data source locally by text. If "fields" parameter is set search is performed only in the listed fields otherwise all fields are searched.
  	 *
  	 * @param expression a text to search for. Multiple search texts should be separated by space. When multiple search texts are provided all of them should be presented in the search fields (bool logic "and" is applied).
  	 * @param fields an array of fields that will be searched.
  	 */
  def filterByText(expression: java.lang.String): scala.Unit = js.native
  def filterByText(expression: java.lang.String, fields: js.Array[_]): scala.Unit = js.native
  /**
  	 * Gets/sets a list of filtering settings
  	 *
  	 * @param f object holding all filtering settings. See settings.filtering
  	 */
  def filterSettings(): scala.Unit = js.native
  def filterSettings(f: js.Object): scala.Unit = js.native
  /**
  	 * Returns filtered data if local filtering is applied. If filtering is not applied OR type of filtering is remote returns undefined.
  	 */
  def filteredData(): js.Array[_] = js.native
  /**
  	 * Returns a record by a specified key (requires that primaryKey is set in the settings)
  	 *
  	 * @param key Primary key of the record
  	 * @param ds the data source in which to search for the record. When not set it will use the current data source.
  	 * @param objPath Not used in $.ig.DataSource
  	 */
  def findRecordByKey(key: js.Object): js.Object = js.native
  def findRecordByKey(key: js.Object, ds: java.lang.String): js.Object = js.native
  def findRecordByKey(key: js.Object, ds: java.lang.String, objPath: java.lang.String): js.Object = js.native
  /**
  	 * Gets a cell value from the record by the specified fieldName. If there's a mapper defined for the field, the resolved by the mapper value will be returned.
  	 *
  	 * @param fieldName the fieldName - name of the field
  	 * @param record the record from which to get it
  	 */
  def getCellValue(fieldName: java.lang.String, record: js.Object): js.Object = js.native
  /**
  	 * Returns a standalone object (copy) that represents the commited transactions, but detached from the data source
  	 *
  	 * @param t a transaction object
  	 */
  def getDetachedRecord(t: js.Object): js.Object = js.native
  /**
  	 * Returns collection of data and non-data(grouped) records. Flat representation of hierarchical data
  	 */
  def groupByData(): js.Array[_] = js.native
  /**
  	 * Returns the current normalized/transformed and paged/filtered/sorted group-by data
  	 */
  def groupByDataView(): js.Array[_] = js.native
  /**
  	 * Gets / sets if the response from the server contains a property which specifies the total number of records in the server-side backend
  	 *
  	 * @param hasCount specifies if the data source contains a property that denotes the total number of records in the server-side backend
  	 */
  def hasTotalRecordsCount(hasCount: scala.Boolean): scala.Unit = js.native
  /**
  	 * Adds a new row to the data source. Creates a transaction that can be committed / rolled back
  	 *
  	 * @param rowId the record key - primaryKey (string) or index (number)
  	 * @param rowObject the new record data.
  	 * @param rowIndex row index at which to insert the new row
  	 * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
  	 * @param parentRowId Not used in $.ig.DataSource
  	 */
  def insertRow(
    rowId: js.Object,
    rowObject: js.Object,
    rowIndex: scala.Double,
    autoCommit: scala.Boolean,
    parentRowId: js.Object
  ): js.Object = js.native
  /**
  	 * Check whether grouping is applied for the specified sorting expressions.
  	 *
  	 * @param exprs array of sorting expressions. If not set check expressions defined in sorting settings
  	 */
  def isGroupByApplied(): scala.Boolean = js.native
  def isGroupByApplied(exprs: js.Array[_]): scala.Boolean = js.native
  /**
  	 * Check whether the specified gorupby record is collapsed
  	 *
  	 * @param gbRec id of the grouped record OR grouped record
  	 */
  def isGroupByRecordCollapsed(gbRec: js.Object): scala.Boolean = js.native
  /**
  	 * Returns metadata object for the specified key
  	 *
  	 * @param key Primary key of the record
  	 */
  def metadata(key: java.lang.String): js.Object = js.native
  /**
  	 * Sets the page index to be equal to the next page index and rebinds the data source
  	 */
  def nextPage(): scala.Unit = js.native
  /**
  	 * Returns the total number of pages
  	 */
  def pageCount(): scala.Double = js.native
  /**
  	 * Gets /sets the current page index. If an index is passed as a parameter, the data source is re-bound.
  	 *
  	 * @param index the page index. If none is specified, returns the current page index.
  	 */
  def pageIndex(): scala.Double = js.native
  def pageIndex(index: scala.Double): scala.Double = js.native
  /**
  	 * Gets /sets the page size and rebinds the data source if a parameter is specified. If no parameter is passed, returns the current page size
  	 *
  	 * @param s the page size.
  	 */
  def pageSize(): scala.Double = js.native
  def pageSize(s: scala.Double): scala.Double = js.native
  /**
  	 * For internal use
  	 *
  	 * @param dirty
  	 */
  def pageSizeDirty(dirty: js.Object): scala.Unit = js.native
  /**
  	 * Gets/sets a list of paging settings
  	 *
  	 * @param p object holding all paging settings. See settings.paging
  	 */
  def pagingSettings(): js.Object = js.native
  def pagingSettings(p: js.Object): js.Object = js.native
  /**
  	 * Returns a list of all transaction objects that are pending to be committed or rolled back to the data source
  	 */
  def pendingTransactions(): js.Array[_] = js.native
  /**
  	 * Gets /sets the page index that should be persisted. For now ONLY when filtering is applied and call explicitly DataBind.
  	 *
  	 * @param value the page index that should be persisted. If none is specified, returns the current page index that should be persisted.
  	 */
  def persistedPageIndex(): scala.Double = js.native
  def persistedPageIndex(value: scala.Double): scala.Double = js.native
  /**
  	 * Sets the page index to be equal to the previous page index and rebinds the data source
  	 */
  def prevPage(): scala.Unit = js.native
  /**
  	 * Returns a list of records for the specified page. Implies that paging is enabled.
  	 *
  	 * @param p the page index for which records will be returned
  	 */
  def recordsForPage(p: scala.Double): scala.Unit = js.native
  /**
  	 * Removes a node from the tree data source. Creates a transaction that can be committed / rolled back
  	 *
  	 * @param data the transaction data
  	 */
  def removeNode(data: js.Object): scala.Unit = js.native
  /**
  	 * Removes a record from the data source at specific index.
  	 *
  	 * @param index index of record
  	 * @param origDs
  	 */
  def removeRecordByIndex(index: scala.Double, origDs: js.Object): scala.Unit = js.native
  /**
  	 * Removes a specific record denoted by the primaryKey of the passed key parameter from the data source
  	 *
  	 * @param key primary key of the record
  	 * @param origDs
  	 */
  def removeRecordByKey(key: js.Object, origDs: js.Object): scala.Unit = js.native
  /**
  	 * Clears the transaction log without updating anything in the data source
  	 *
  	 * @param id Record Id to find transactions for. If no id is specified, will rollback all transactions to the data source.
  	 */
  def rollback(): scala.Unit = js.native
  def rollback(id: js.Object): scala.Unit = js.native
  /**
  	 * Posts to the settings.updateUrl using $.ajax, by serializing the changes as url params
  	 *
  	 * @param success Specifies a custom function to be called when AJAX request to the updateUrl option succeeds(optional)
  	 * @param error Specifies a custom function to be called when AJAX request to the updateUrl option fails(optional)
  	 */
  def saveChanges(success: js.Function, error: js.Function): scala.Unit = js.native
  /**
  	 * Gets/sets the schema definition.
  	 *
  	 * @param s a schema object
  	 * @param t type of the data source. See settings.type
  	 */
  def schema(): scala.Unit = js.native
  def schema(s: js.Object): scala.Unit = js.native
  def schema(s: js.Object, t: java.lang.String): scala.Unit = js.native
  /**
  	 * Sets a cell value for the cell denoted by rowId and colId. Creates a transaction for the update operation and returns it
  	 *
  	 * @param rowId the rowId - row key (string) or index (number)
  	 * @param colId the column id - column key (string) or index (number)
  	 * @param val The new value
  	 * @param autoCommit if autoCommit is true, it updates the datasource automatically and the transaction is still stored in the accumulated transaction log
  	 */
  def setCellValue(rowId: js.Object, colId: js.Object, `val`: js.Object, autoCommit: scala.Boolean): js.Object = js.native
  /**
  	 * Sorts the data source locally. The result (filtered data) can be obtained by calling dataView().
  	 * Remote filtering can be performed by just calling dataBind() and setting the settings.filtering.expressions
  	 * multi-column sorting can be enabled by setting keepSortState to true.
  	 * fields => an array of fields object definitions:
  	 * example: [{fieldName : "firstName"}, {fieldName : "lastName"}]
  	 * example 2: [{fieldIndex : 1} , {fieldIndex : 2}]
  	 *
  	 * @param fields an array of fields object definitions
  	 * @param direction asc / desc direction
  	 */
  def sort(fields: js.Object, direction: java.lang.String): scala.Unit = js.native
  /**
  	 * Gets/sets a list of paging settings
  	 *
  	 * @param s object holding all sorting settings. See settings.sorting
  	 */
  def sortSettings(): js.Object = js.native
  def sortSettings(s: js.Object): js.Object = js.native
  /**
  	 * Parses the string and returns an evaluated JSON object
  	 *
  	 * @param s the JSON as string.
  	 */
  def stringToJSONObject(s: java.lang.String): scala.Unit = js.native
  /**
  	 * Parses a string and returns a XML Document
  	 *
  	 * @param s the XML represented as a string
  	 */
  def stringToXmlObject(s: java.lang.String): scala.Unit = js.native
  /**
  	 * Applicable only when the data source is bound to remote data.
  	 * Gets or sets summaries data.
  	 * If key or dsObj are not set then returns summaries data.
  	 * Takes summary data from passed argument dsObj(using argument key)
  	 *
  	 * @param key response key to take summary data(for example "Metadata.Summaries")
  	 * @param dsObj data source object - usually contains information about data records and metadata(holds info about summaries)
  	 */
  def summariesResponse(): js.Object = js.native
  def summariesResponse(key: java.lang.String): js.Object = js.native
  def summariesResponse(key: java.lang.String, dsObj: js.Object): js.Object = js.native
  /**
  	 * Gets/sets a list of summaries settings.
  	 *
  	 * @param s object holding all summaries settings. See settings.summaries
  	 */
  def summariesSettings(): scala.Unit = js.native
  def summariesSettings(s: js.Object): scala.Unit = js.native
  /**
  	 * Converts a HTML TABLE dom element to a JavaScript array of objects that contain the records data
  	 *
  	 * @param tableDOM TABLE dom element to transform
  	 */
  def tableToObject(tableDOM: stdLib.Element): js.Object = js.native
  /**
  	 * Toggle grouped record with the specified id and updates collections visible groupby data and data view
  	 *
  	 * @param id data-id attribute of the respective group row in the DOM
  	 * @param collapsed if true the record should be collapsed, otherwise expanded
  	 */
  def toggleGroupByRecord(id: java.lang.String, collapsed: scala.Boolean): scala.Unit = js.native
  /**
  	 * Returns the total number of records in the local data source
  	 */
  def totalLocalRecordsCount(): scala.Double = js.native
  /**
  	 * Applicable only when the data source is bound to remote data.
  	 * Gets / sets the total number of records in the data source.
  	 * If data binding is remote, and there's paging or filtering enabled,
  	 * the actual total number of records may not
  	 * match the number of records that exists on the client
  	 *
  	 * @param count the total number of records
  	 * @param key
  	 * @param dsObj
  	 * @param context
  	 */
  def totalRecordsCount(): scala.Double = js.native
  def totalRecordsCount(count: scala.Double): scala.Double = js.native
  def totalRecordsCount(count: scala.Double, key: js.Object): scala.Double = js.native
  def totalRecordsCount(count: scala.Double, key: js.Object, dsObj: js.Object): scala.Double = js.native
  def totalRecordsCount(count: scala.Double, key: js.Object, dsObj: js.Object, context: js.Object): scala.Double = js.native
  /**
  	 * Returns the accumulated transaction log as a string. The purpose of this is to be passed to URLs or used conveniently
  	 */
  def transactionsAsString(): java.lang.String = js.native
  /**
  	 * Returns transformed data according to transformed execution:
  	 * 1. Before paging and filtering
  	 * 2. After filtering before paging
  	 * 3. After filtering and paging
  	 *
  	 * @param transformedExecution
  	 */
  def transformedData(transformedExecution: js.Object): js.Object = js.native
  /**
  	 * Gets/sets the type of the dataSource. If no parameter is specified, returns settings.type
  	 *
  	 * @param t
  	 * @return json|xml|unknown|array|function|htmlTableString|htmlTableId|htmlTableDom|invalid|remoteUrl|empty
  	 */
  def `type`(): java.lang.String = js.native
  def `type`(t: js.Object): java.lang.String = js.native
  /**
  	 * Updates a record in the datasource. Creates a transaction that can be committed / rolled back
  	 *
  	 * @param rowId the record key - primaryKey (string) or index (number)
  	 * @param rowObject the record object containing the key/value pairs we want to update. It doesn't have to include key/value pairs for all fields defined in the schema or in the data source (if no schema is defined)
  	 * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
  	 */
  def updateRow(rowId: js.Object, rowObject: js.Object, autoCommit: scala.Boolean): js.Object = js.native
  /**
  	 * Returns collection of data and non-data(grouped) records. Returns only visible records(children of collapsed grouped records are not included in the collection)
  	 */
  def visibleGroupByData(): js.Array[_] = js.native
}

