package typings.igniteUi.Infragistics

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeHierarchicalDataSource extends StObject {
  
  /**
    * Adds a new node to the tree data source. Creates a transaction that can be committed / rolled back
    *
    * @param data the transaction data
    */
  def addNode(data: js.Object): Unit = js.native
  
  /**
    * Adds a new row to the data source. Creates a transaction that can be committed / rolled back
    *
    * @param rowId the record key - primaryKey (string) or index (number)
    * @param rowObject the new record data.
    * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
    */
  def addRow(rowId: js.Object, rowObject: js.Object, autoCommit: Boolean): js.Object = js.native
  
  /**
    * Returns a list of all transaction objects that are either pending, or have been committed in the data source.
    */
  def allTransactions(): js.Array[_] = js.native
  
  /**
    * Analyzes the dataSource setting to automatically determine the type of the data source. Returns the data source type. See settings.type
    */
  def analyzeDataSource(): String = js.native
  
  /**
    * This clears local filtering applied to the data view by resetting it to the original data and applying any paging.
    */
  def clearLocalFilter(): Unit = js.native
  
  /**
    * This clears local sorting applied to the data view by resetting it to the original data and applying any paging
    */
  def clearLocalSorting(): Unit = js.native
  
  /**
    * Clears __matchFiltering property from the data record objects in the filtered data source. The __matchFiltering property determines whether a record matches the specified filtering condition.
    *
    * @param data the array of data objects to be cleared. If not set the current filtered data array is used.
    */
  def clearMatchFiltering(): Unit = js.native
  def clearMatchFiltering(data: js.Object): Unit = js.native
  
  /**
    * Update the data source with every transaction from the log
    *
    * @param id Id of the transaction to commit. If no id is specified, will commit all transactions to the data source.
    */
  def commit(): Unit = js.native
  def commit(id: Double): Unit = js.native
  
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
    * the value of settings.type is set to XML or JSON. If string, eval for JSON, and parse for the XML to build the object ree
    * 4. now normalize/transform the data, if a schema is supplied. This inplies any additional data type  conversion
    * 5. next, if OpType is Local, apply paging, sorting, and/or filtering to the data, and store the result in this._dataView
    * 6. fire the databound event
    *
    * @param callback callback function
    * @param callee callee object on which the callback will be executed. If none is specified, will assume global execution context
    */
  def dataBind(): Unit = js.native
  def dataBind(callback: js.UndefOr[scala.Nothing], callee: js.Object): Unit = js.native
  def dataBind(callback: String): Unit = js.native
  def dataBind(callback: String, callee: js.Object): Unit = js.native
  
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
  def deleteRow(rowId: js.Object, autoCommit: Boolean): js.Object = js.native
  
  /**
    * Sets a list of fields to the data source. If no parameter is specified, just returns the already existing list of fields
    *
    * @param fields a field has the following format: {key: 'fieldKey', dataType: 'string/number/date' }
    */
  def fields(): js.Object = js.native
  def fields(fields: js.Object): js.Object = js.native
  
  /**
    * Filters the data source locally. Remote filtering can be performed by just calling dataBind() and setting the settings.filtering.expressions. The result (filtered data) can be obtained by calling dataView()
    * example: [{fieldName : "firstName", expr: "abc", cond: "StartsWith"}, {fieldName : "lastName"}]
    * example 2: [{fieldIndex : 1} , {fieldIndex : 2, expr: "a", cond : "contains"}]
    * expr is the filter expression text , such as "abc", or a regular expression such as *test*
    * cond is the filtering condition such as startsWith, endsWith, contains, equals, doesNotEqual, doesNotContain
    * if expr is detected to be a regular expression, the "cond" part is skipped
    *
    * @param fieldExpressions a list of field expression definitions
    * @param boolLogic boolean logic. Accepted values are AND and OR.
    * @param keepFilterState if keepFilterState is set to true, it will not discard previous filtering expressions
    * @param fieldExpressionsOnStrings
    */
  def filter(
    fieldExpressions: js.Object,
    boolLogic: js.Object,
    keepFilterState: Boolean,
    fieldExpressionsOnStrings: js.Object
  ): Unit = js.native
  
  /**
    * Filters the data source locally by text. If "fields" parameter is set search is performed only in the listed fields otherwise all fields are searched.
    *
    * @param expression a text to search for. Multiple search texts should be separated by space. When multiple search texts are provided all of them should be presented in the search fields (bool logic "and" is applied).
    * @param fields an array of fields that will be searched.
    */
  def filterByText(expression: String): Unit = js.native
  def filterByText(expression: String, fields: js.Array[_]): Unit = js.native
  
  /**
    * Gets/sets a list of filtering settings
    *
    * @param f object holding all filtering settings. See settings.filtering
    */
  def filterSettings(): Unit = js.native
  def filterSettings(f: js.Object): Unit = js.native
  
  /**
    * Returns filtered data if local filtering is applied. If filtering is not applied OR type of filtering is remote returns undefined.
    */
  def filteredData(): js.Array[_] = js.native
  
  /**
    * Returns a record by a specified key (requires that primaryKey is set in the settings)
    *
    * @param key Primary key of the record
    * @param ds the data source in which to search for the record. When not set it will use the current data source.
    * @param objPath path to the object. Example: {path: '5/1'}
    */
  def findRecordByKey(key: js.Object): js.Object = js.native
  def findRecordByKey(key: js.Object, ds: js.UndefOr[scala.Nothing], objPath: js.Object): js.Object = js.native
  def findRecordByKey(key: js.Object, ds: String): js.Object = js.native
  def findRecordByKey(key: js.Object, ds: String, objPath: js.Object): js.Object = js.native
  
  /**
    * Returns the current flat data view
    */
  def flatDataView(): js.Object = js.native
  
  /**
    * Generates flat data.
    * Returns an object that contains the generated flat data, the flat visible data, records count and visible records count.
    *
    * @param data The data record whose data is transformed.
    * @param level The level from which to start recursively generating the flat data. If not set defaults to 0.
    */
  def generateFlatData(data: js.Object): js.Object = js.native
  def generateFlatData(data: js.Object, level: Double): js.Object = js.native
  
  /**
    * Generates a flat data view from the current (hierarchical)data
    */
  def generateFlatDataView(): Unit = js.native
  
  /**
    * Gets a cell value from the record by the specified fieldName. If there's a mapper defined for the field, the resolved by the mapper value will be returned.
    *
    * @param fieldName the fieldName - name of the field
    * @param record the record from which to get it
    */
  def getCellValue(fieldName: String, record: js.Object): js.Object = js.native
  
  /**
    * Gets the chilren records by the parent record's key in the passed data source
    *
    * @param key primary key of the record
    * @param ds the data source
    */
  def getChildrenByKey(key: js.Object, ds: js.Object): js.Object = js.native
  
  /**
    * Gets the current data bound depth of the tree grid hierarchy.
    */
  def getDataBoundDepth(): Unit = js.native
  
  /**
    * Returns a standalone object (copy) that represents the commited transactions, but detached from the data source
    *
    * @param t a transaction object
    */
  def getDetachedRecord(t: js.Object): js.Object = js.native
  
  /**
    * Gets whether the row with the specified id is expanded.Returns true if the row is expanded or false if it's not.
    *
    * @param rowId //The id of the row.
    */
  def getExpandStateById(rowId: String): Boolean = js.native
  
  /**
    * Gets the count of the filtered records
    */
  def getFilteredRecordsCount(): Double = js.native
  
  /**
    * Gets the count of the filtered records in the dataView
    */
  def getFilteredRecordsCountFromDataView(): Double = js.native
  
  /**
    * Returns the total number of match filtering records in the data source.
    * When the dataSource is remote and filtering is applied then it is taken value
    * of property "filtering.countRecords" in metatadata - if set. If it is not set returns totalRecordsCount
    */
  def getFilteringMatchRecordsCount(): Double = js.native
  
  /**
    * Returns flat data(without taking into account visible/expansion state).
    */
  def getFlatData(): js.Object = js.native
  
  /**
    * Returns total records count(without taking into account visible/expansion state).
    */
  def getFlatDataCount(): Double = js.native
  
  /**
    * Returnschild data transformed to flat data
    *
    * @param record The data record whose data is transformed and returned as flat
    * @param level The level. If not set defaults to 0.
    */
  def getFlatDataForRecord(record: js.Object): js.Object = js.native
  def getFlatDataForRecord(record: js.Object, level: Double): js.Object = js.native
  
  /**
    * Gets the passed record's parent records
    *
    * @param dataRow the child record.
    * @param ds the data source in which to search for the related parent records.
    */
  def getParentRowsForRow(dataRow: js.Object): js.Object = js.native
  def getParentRowsForRow(dataRow: js.Object, ds: js.Object): js.Object = js.native
  
  /**
    * Gets the path of a record by the record or the record's key
    *
    * @param record
    */
  def getPathBy(record: js.Object): String = js.native
  
  /**
    * Returns flat visible data.
    */
  def getVisibleFlatData(): js.Object = js.native
  
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
  def hasTotalRecordsCount(hasCount: Boolean): Unit = js.native
  
  /**
    * Adds a new row to the data source. Creates a transaction that can be committed / rolled back
    *
    * @param rowId the record key - primaryKey (string) or index (number)
    * @param rowObject the new record data.
    * @param rowIndex row index at which to be insert the new row
    * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
    * @param parentRowId the value of the primary key of the parent row(if any)
    */
  def insertRow(
    rowId: js.Object,
    rowObject: js.Object,
    rowIndex: Double,
    autoCommit: Boolean,
    parentRowId: js.Object
  ): js.Object = js.native
  
  /**
    * Check whether grouping is applied for the specified sorting expressions.
    *
    * @param exprs array of sorting expressions. If not set check expressions defined in sorting settings
    */
  def isGroupByApplied(): Boolean = js.native
  def isGroupByApplied(exprs: js.Array[_]): Boolean = js.native
  
  /**
    * Check whether the specified gorupby record is collapsed
    *
    * @param gbRec id of the grouped record OR grouped record
    */
  def isGroupByRecordCollapsed(gbRec: js.Object): Boolean = js.native
  
  /**
    * Gets/Sets whether the data source has been transformed from flat to hierarchical
    *
    * @param isTransformed Determines if the data source is marked as transformed or not.
    */
  def isTransformedToHierarchicalData(): Unit = js.native
  def isTransformedToHierarchicalData(isTransformed: Boolean): Unit = js.native
  
  /**
    * Returns metadata object for the specified key
    *
    * @param key Primary key of the record
    */
  def metadata(key: String): js.Object = js.native
  
  /**
    * Sets the page index to be equal to the next page index and rebinds the data source
    */
  def nextPage(): Unit = js.native
  
  /**
    * Returns the total number of pages
    */
  def pageCount(): Double = js.native
  
  /**
    * Gets /sets the current page index. If an index is passed as a parameter, the data source is re-bound.
    *
    * @param index the page index. If none is specified, returns the current page index.
    */
  def pageIndex(): Double = js.native
  def pageIndex(index: Double): Double = js.native
  
  /**
    * Gets /sets the page size and rebinds the data source if a parameter is specified. If no parameter is passed, returns the current page size
    *
    * @param s the page size.
    */
  def pageSize(): Double = js.native
  def pageSize(s: Double): Double = js.native
  
  /**
    * For internal use
    *
    * @param dirty
    */
  def pageSizeDirty(dirty: js.Object): Unit = js.native
  
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
  def persistedPageIndex(): Double = js.native
  def persistedPageIndex(value: Double): Double = js.native
  
  /**
    * Sets the page index to be equal to the previous page index and rebinds the data source
    */
  def prevPage(): Unit = js.native
  
  /**
    * This processes the passed data for the specified level and applies the schema transformation to it.
    *
    * @param data The data to be processed and transformed
    * @param level The level to which the data belongs to. If this is not set it defaults to 0.
    * @param suppressTransformation Determines whether the data should go through schema transformation. If true schema transofrmatin will not be applied.
    */
  def processDataPerLevel(data: js.Object): js.Object = js.native
  def processDataPerLevel(data: js.Object, level: js.UndefOr[scala.Nothing], suppressTransformation: Boolean): js.Object = js.native
  def processDataPerLevel(data: js.Object, level: Double): js.Object = js.native
  def processDataPerLevel(data: js.Object, level: Double, suppressTransformation: Boolean): js.Object = js.native
  
  /**
    * Returns a list of records for the specified page. Implies that paging is enabled.
    *
    * @param p the page index for which records will be returned
    */
  def recordsForPage(p: Double): Unit = js.native
  
  /**
    * Removes a node from the tree data source. Creates a transaction that can be committed / rolled back
    *
    * @param data the transaction data
    */
  def removeNode(data: js.Object): Unit = js.native
  
  /**
    * Removes a record from the data source at specific index.
    *
    * @param index index of record
    * @param origDs
    */
  def removeRecordByIndex(index: Double, origDs: js.Object): Unit = js.native
  
  /**
    * Removes a specific record denoted by the primaryKey of the passed key parameter from the data source
    *
    * @param key primary key of the record
    * @param origDs
    */
  def removeRecordByKey(key: js.Object, origDs: js.Object): Unit = js.native
  
  /**
    * Clears the transaction log without updating anything in the data source
    *
    * @param id Record Id to find transactions for. If no id is specified, will rollback all transactions to the data source.
    */
  def rollback(): Unit = js.native
  def rollback(id: js.Object): Unit = js.native
  
  /**
    * Posts to the settings.updateUrl using $.ajax, by serializing the changes as url params
    *
    * @param success Specifies a custom function to be called when AJAX request to the updateUrl option succeeds(optional)
    * @param error Specifies a custom function to be called when AJAX request to the updateUrl option fails(optional)
    */
  def saveChanges(success: js.Function, error: js.Function): Unit = js.native
  
  /**
    * Gets/sets the schema definition.
    *
    * @param s a schema object
    * @param t type of the data source. See settings.type
    */
  def schema(): Unit = js.native
  def schema(s: js.UndefOr[scala.Nothing], t: String): Unit = js.native
  def schema(s: js.Object): Unit = js.native
  def schema(s: js.Object, t: String): Unit = js.native
  
  /**
    * Sets a cell value for the cell denoted by rowId and colId. Creates a transaction for the update operation and returns it
    *
    * @param rowId the rowId - row key (string) or index (number)
    * @param colId the column id - column key (string) or index (number)
    * @param val The new value
    * @param autoCommit if autoCommit is true, it updates the datasource automatically and the transaction is still stored in the accumulated transaction log
    */
  def setCellValue(rowId: js.Object, colId: js.Object, `val`: js.Object, autoCommit: Boolean): js.Object = js.native
  
  /**
    * Sets the expanded state of a row by its primary key
    *
    * @param rowId The id of the row.
    * @param expanded If true the row will be expanded. Otherwise it will be collapsed.
    * @param callbackArgs Specifies a custom function to be called when the state of the row is changed.
    */
  def setExpandedStateByPrimaryKey(rowId: String, expanded: Boolean, callbackArgs: js.Function): Unit = js.native
  
  /**
    * Sets the expanded/collapsed state of a row by its index
    *
    * @param index The index of the row.
    * @param expanded If true then the row will be expanded. Otherwise it will be collapsed.
    * @param callbackArgs Specifies a custom function to be called when the state of the row is changed.
    */
  def setExpandedStateByRowIndex(index: Double, expanded: Boolean, callbackArgs: js.Function): Unit = js.native
  
  /**
    * Gets whether the flat data view should be generated by calling the generateFlatDataView method.
    */
  def shouldCallGenerateFlatDataView(): Unit = js.native
  
  /**
    * Sorts the data source locally. The result (sorted data) can be obtained by calling dataView().
    * Remote filtering can be performed by just calling dataBind() and setting the settings.sorting.expressions
    * multi-column sorting can be enabled by setting keepSortState to true.
    * fields => an array of fields object definitions:
    * example: [{fieldName : "firstName"}, {fieldName : "lastName"}]
    * example 2: [{fieldIndex : 1} , {fieldIndex : 2}]
    *
    * @param fields an array of fields object definitions
    * @param direction asc / desc direction
    */
  def sort(fields: js.Object, direction: String): Unit = js.native
  
  /**
    * Sorts the passed data and returns the sorted result.
    *
    * @param data the data to be sorted
    *
    * fields => an array of fields object definitions:
    * example: [{fieldName : "firstName"}, {fieldName : "lastName"}]
    * example 2: [{fieldIndex : 1} , {fieldIndex : 2}]
    *
    * @param fields an array of fields object definitions
    * @param direction asc / desc direction
    */
  def sortData(data: js.Object, fields: js.Object, direction: String): Unit = js.native
  
  /**
    * Sorts the given data recursively
    * fields => an array of fields object definitions:
    * example: [{fieldName : "firstName"}, {fieldName : "lastName"}]
    * example 2: [{fieldIndex : 1} , {fieldIndex : 2}]
    *
    * @param data the data array that will be sorted.
    * @param level the level to which the data belongs to
    * @param fields an array of fields object definitions
    * @param direction asc / desc direction
    */
  def sortDataRecursive(data: js.Object, level: Double, fields: js.Object, direction: String): Unit = js.native
  
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
  def stringToJSONObject(s: String): Unit = js.native
  
  /**
    * Parses a string and returns a XML Document
    *
    * @param s the XML represented as a string
    */
  def stringToXmlObject(s: String): Unit = js.native
  
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
  def summariesResponse(key: js.UndefOr[scala.Nothing], dsObj: js.Object): js.Object = js.native
  def summariesResponse(key: String): js.Object = js.native
  def summariesResponse(key: String, dsObj: js.Object): js.Object = js.native
  
  /**
    * Gets/sets a list of summaries settings.
    *
    * @param s object holding all summaries settings. See settings.summaries
    */
  def summariesSettings(): Unit = js.native
  def summariesSettings(s: js.Object): Unit = js.native
  
  /**
    * Converts a HTML TABLE dom element to a JavaScript array of objects that contain the records data
    *
    * @param tableDOM TABLE dom element to transform
    */
  def tableToObject(tableDOM: Element): js.Object = js.native
  
  /**
    * Toggle grouped record with the specified id and updates collections visible groupby data and data view
    *
    * @param id data-id attribute of the respective group row in the DOM
    * @param collapsed if true the record should be collapsed, otherwise expanded
    */
  def toggleGroupByRecord(id: String, collapsed: Boolean): Unit = js.native
  
  /**
    * Toggles the row's state by the row's id.
    *
    * @param rowId The id of the row.
    * @param callbackArgs Specifies a custom function to be called when the state of the row is changed.
    */
  def toggleRow(rowId: String, callbackArgs: js.Function): Unit = js.native
  
  /**
    * Returns the total number of records in the local data source
    */
  def totalLocalRecordsCount(): Double = js.native
  
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
  def totalRecordsCount(): Double = js.native
  def totalRecordsCount(
    count: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    dsObj: js.UndefOr[scala.Nothing],
    context: js.Object
  ): Double = js.native
  def totalRecordsCount(count: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], dsObj: js.Object): Double = js.native
  def totalRecordsCount(
    count: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    dsObj: js.Object,
    context: js.Object
  ): Double = js.native
  def totalRecordsCount(count: js.UndefOr[scala.Nothing], key: js.Object): Double = js.native
  def totalRecordsCount(
    count: js.UndefOr[scala.Nothing],
    key: js.Object,
    dsObj: js.UndefOr[scala.Nothing],
    context: js.Object
  ): Double = js.native
  def totalRecordsCount(count: js.UndefOr[scala.Nothing], key: js.Object, dsObj: js.Object): Double = js.native
  def totalRecordsCount(count: js.UndefOr[scala.Nothing], key: js.Object, dsObj: js.Object, context: js.Object): Double = js.native
  def totalRecordsCount(count: Double): Double = js.native
  def totalRecordsCount(
    count: Double,
    key: js.UndefOr[scala.Nothing],
    dsObj: js.UndefOr[scala.Nothing],
    context: js.Object
  ): Double = js.native
  def totalRecordsCount(count: Double, key: js.UndefOr[scala.Nothing], dsObj: js.Object): Double = js.native
  def totalRecordsCount(count: Double, key: js.UndefOr[scala.Nothing], dsObj: js.Object, context: js.Object): Double = js.native
  def totalRecordsCount(count: Double, key: js.Object): Double = js.native
  def totalRecordsCount(count: Double, key: js.Object, dsObj: js.UndefOr[scala.Nothing], context: js.Object): Double = js.native
  def totalRecordsCount(count: Double, key: js.Object, dsObj: js.Object): Double = js.native
  def totalRecordsCount(count: Double, key: js.Object, dsObj: js.Object, context: js.Object): Double = js.native
  
  /**
    * Returns the accumulated transaction log as a string. The purpose of this is to be passed to URLs or used conveniently
    */
  def transactionsAsString(): String = js.native
  
  /**
    * Transforms flat data to hierararchical data and returns the result
    *
    * @param data The flat data that will be transformed to hierarchical
    */
  def transformToHierarchicalData(data: js.Object): js.Object = js.native
  
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
  def `type`(): String = js.native
  def `type`(t: js.Object): String = js.native
  
  /**
    * Updates a record in the datasource. Creates a transaction that can be committed / rolled back
    *
    * @param rowId the record key - primaryKey (string) or index (number)
    * @param rowObject the record object containing the key/value pairs we want to update. It doesn't have to include key/value pairs for all fields defined in the schema or in the data source (if no schema is defined)
    * @param autoCommit if autoCommit is true, the datasource will be updated automatically and the transaction is still stored in the accumulated transaction log
    */
  def updateRow(rowId: js.Object, rowObject: js.Object, autoCommit: Boolean): js.Object = js.native
  
  /**
    * Returns collection of data and non-data(grouped) records. Returns only visible records(children of collapsed grouped records are not included in the collection)
    */
  def visibleGroupByData(): js.Array[_] = js.native
}
