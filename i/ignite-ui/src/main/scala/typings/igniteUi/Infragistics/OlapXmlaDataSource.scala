package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlapXmlaDataSource extends StObject {
  
  /**
    * Adds a hierarchy to the columns of the pivot grid.
    *
    * @param columnItem an object of type $.ig.Hierarchy which is the hierarchy to add in the pivot grid columns.
    */
  def addColumnItem(columnItem: js.Object): Unit
  
  /**
    * Adds a hierarchy to the filter axis of the pivot grid.
    *
    * @param filterItem an object of type $.ig.Hierarchy which is the hierarchy to add.
    */
  def addFilterItem(filterItem: js.Object): Unit
  
  /**
    * Adds a member to list of filter members that will be present in result.
    *             If a member of given hierarchy is added to this filter list then only those members which are present in this filter list will be present for that hierarchy in the result.
    *
    * @param hierarchyUniqueName the unique name of the hierarchy this member belongs to.
    * @param memberUniqueName the unique name of the member to be added.
    */
  def addFilterMember(hierarchyUniqueName: String, memberUniqueName: String): Unit
  
  /**
    * Adds a measure to the measures of the pivot grid.
    *
    * @param measureItem an object of type $.ig.Measure which is the measure to add.
    */
  def addMeasureItem(measureItem: js.Object): Unit
  
  /**
    * Adds a hierarchy to the rows of the pivot grid.
    *
    * @param rowItem An object of type $.ig.Hierarchy which is the hierarchy to add in the pivot grid rows.
    */
  def addRowItem(rowItem: js.Object): Unit
  
  /**
    * Retrieves the current catalog in the data source.
    */
  def catalog(): js.Object
  
  /**
    * Retrieves the currently loaded catalogs in the data source.
    */
  def catalogs(): js.Array[Any]
  
  /**
    * Clears all pending changes since last time the update() method is called.
    */
  def clearPendingChanges(): Unit
  
  /**
    * Sets a tuple member to be collapsed next time the update() method is called.
    *             Calling this method on an already collapsed member does nothing.
    *
    * @param axisName the name of the axis for the tuple.
    * @param tupleIndex the index of the tuple in the axis.
    * @param memberIndex the index of the member in the tuple.
    */
  def collapseTupleMember(axisName: String, tupleIndex: Double, memberIndex: Double): Unit
  
  /**
    * Returns the items in the column axis.
    */
  def columnAxis(): js.Array[Any]
  
  /**
    * Retrieves the current cube in the data source.
    */
  def cube(): js.Object
  
  /**
    * Retrieves the currently loaded cubes in the data source.
    */
  def cubes(): js.Array[Any]
  
  /**
    * Sets a tuple member to be expanded next time the update() method is called.
    *             Calling this method on an already expanded member does nothing.
    *
    * @param axisName the name of the axis for the tuple.
    * @param tupleIndex the index of the tuple in the axis.
    * @param memberIndex the index of the member in the tuple.
    */
  def expandTupleMember(axisName: String, tupleIndex: Double, memberIndex: Double): Unit
  
  /**
    * Returns the items in the filter axis.
    */
  def filters(): js.Array[Any]
  
  /**
    * Gets the first element of the specified elementType which matches the specified predicate or null if there is no such element found.
    *
    * @param predicate a predicate callback invoked against each core element of the specified type. It has to return true when the element has matched the serach criteria, otherwise - false.
    * @param elementType an object specified by $.ig.ICoreOlapElement.prototype.$type property. Valid types which prototype can be examined are: $.ig.Dimension, $.ig.Hierarchy, $.ig.Level, $.ig.Measure and $.ig.MeasureList.
    */
  def getCoreElement(predicate: js.Function, elementType: js.Object): js.Object
  
  /**
    * Gets an array with elements of the specified elementType which match the specified predicate or empty array if there is no such element found.
    *
    * @param predicate a predicate callback invoked against each core element of the specified type. It has to return true when the element has matched the serach criteria, otherwise - false.
    * @param elementType an object specified by $.ig.ICoreOlapElement.prototype.$type property. Valid types which prototype can be examined are: $.ig.Dimension, $.ig.Hierarchy, $.ig.Level, $.ig.Measure and $.ig.MeasureList.
    */
  def getCoreElements(predicate: js.Function, elementType: js.Object): js.Object
  
  /**
    * Returns $.ig.Dimension object for the specified unique name.
    *
    * @param dimensionUniqueName the unique name of the searched dimension object.
    */
  def getDimension(dimensionUniqueName: String): js.Object
  
  /**
    * Returns an array of strings with the unique names of selected for given hierarchy filter members.
    *
    * @param hierarchyUniqueName the unique name of the hierarchy whose active filter members are returned.
    */
  def getFilterMemberNames(hierarchyUniqueName: String): js.Array[Any]
  
  /**
    * Returns $.ig.Hierarchy object for the specified unique name.
    *
    * @param hierarchyUniqueName the unique name of the searched hierarchy object.
    */
  def getHierarchy(hierarchyUniqueName: String): js.Object
  
  /**
    * Returns $.ig.Level object for the specified unique name.
    *
    * @param levelUniqueName the unique name of the searched level object.
    */
  def getLevel(levelUniqueName: String): js.Object
  
  /**
    * Returns $.ig.Measure object for the specified unique name.
    *
    * @param measureUniqueName the unique name of the searched measure object.
    */
  def getMeasure(measureUniqueName: String): js.Object
  
  /**
    * Returns $.ig.MeasureList object available when operates with more than one $.ig.Measure object.
    */
  def getMeasureList(): js.Object
  
  /**
    * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects of selected for given hierarchy filter member.
    *
    * @param hierarchyUniqueName the unique name of the member whose active filter members are returned.
    */
  def getMembersOfHierarchy(hierarchyUniqueName: String): Unit
  
  /**
    * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects of selected for given level filter member.
    *
    * @param levelUniqueName the unique name of the member whose active filter members are returned.
    */
  def getMembersOfLevel(levelUniqueName: String): Unit
  
  /**
    * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects that are children of the current member.
    *
    * @param memberUniqueName the unique name of the member whose active filter members are returned.
    */
  def getMembersOfMember(memberUniqueName: String): Unit
  
  /**
    * Initializes the data source and returns a promise that will be resolved once the data source is initialized.
    *             The promise's result will be the metadata tree for the catalog/cube/measureGroup specified in the settings or null if the settings do not provide a valid cube initialization data.
    *             The data source is not functional until it has been initialized and all other methods other than initialize() will throw an error if isInitialized() returns false.
    */
  def initialize(): js.Object
  
  /**
    * Retrieves the initialization state of the data source.
    */
  def isInitialized(): Boolean
  
  /**
    * Indicates whether the data source is modified.
    */
  def isModified(): Boolean
  
  /**
    * Indicates whether the update() method execution is in progress.
    */
  def isUpdating(): Boolean
  
  /**
    * Retrieves the current measureGroup in the data source.
    */
  def measureGroup(): js.Object
  
  /**
    * Retrieves the currently loaded measure groups in the data source.
    */
  def measureGroups(): js.Array[Any]
  
  /**
    * Returns the items in the measures axis.
    */
  def measures(): js.Array[Any]
  
  /**
    * Returns the fully loaded metadata tree.
    */
  def metadataTree(): js.Object
  
  /**
    * Removes all members from the list of filter members and the filter for the specified hierarchy is cleared.
    *
    * @param hierarchyUniqueName the unique name of the hierarchy which filter members to be cleared.
    */
  def removeAllFilterMembers(hierarchyUniqueName: String): Unit
  
  /**
    * Removes a hierarchy or the measure list from the columns of the pivot grid.
    *
    * @param columnItem an object of type $.ig.Hierarchy or $.ig.MeasureList which is the hierarchy to remove or the measure list if there are more than one measures added and the measure list location is set to "columns".
    */
  def removeColumnItem(columnItem: js.Object): Unit
  
  /**
    * Removes a hierarchy from the filter axis of the pivot grid.
    *
    * @param filterItem an object of type $.ig.Hierarchy which is the hierarchy to remove.
    */
  def removeFilterItem(filterItem: js.Object): Unit
  
  /**
    * Removes a member from the list of filter members that will be present in result.
    *
    * @param hierarchyUniqueName the unique name of the hierarchy this member belongs to.
    * @param memberUniqueName the unique name of the member to be removed.
    */
  def removeFilterMember(hierarchyUniqueName: String, memberUniqueName: String): Unit
  
  /**
    * Removes a measure from the measures of the pivot grid.
    *
    * @param measureItem An object of type $.ig.Measure which is the measure to remove.
    */
  def removeMeasureItem(measureItem: js.Object): Unit
  
  /**
    * Removes a hierarchy or the measure list from the rows of the pivot grid.
    *
    * @param rowItem an object of type $.ig.Hierarchy or $.ig.MeasureList which is the hierarchy to remove or the measure list if there are more than one measures added and the measure list location is set to "rows".
    */
  def removeRowItem(rowItem: js.Object): Unit
  
  /**
    * Returns the result from the last update or null if the last update was unsuccessful.
    */
  def result(): js.Object
  
  /**
    * Returns the items in the row axis.
    */
  def rowAxis(): js.Array[Any]
  
  /**
    * Sets the current catalog for the data source and updates the cubes() and catalog() properties.
    *
    * @param catalogName the name of the catalog.
    */
  def setCatalog(catalogName: String): js.Object
  
  /**
    * Sets the current cube for the data source and updates the cube(), measureGroup() and metadataTree() properties.
    *
    * @param cubeName the name of the cube.
    */
  def setCube(cubeName: String): js.Object
  
  /**
    * Sets the current measure group for the data source and updates the measureGroup() and metadataTree() properties.
    *             Even though the catalogs/cubes/measureGroups items are cascading(e.g. in order to load the cubes a catalog has to be set) in order to construct the metadata tree a measure group is not required as it just filters the resulting metadata.
    *             Once setCube(cubeName) is called the metadata tree would be loaded and the measureGroup() property would be filled with the default '(All)' measure group which indicates that no measure group is selected.
    *
    * @param measureGroupName the name of the measure group.
    */
  def setMeasureGroup(measureGroupName: String): js.Object
  
  /**
    * Sets the index at which the measure list will be positioned in the rows/columns it resides.
    *
    * @param index the index where measure list to appear.
    */
  def setMeasureListIndex(index: Double): Unit
  
  /**
    * Sets the location of the measure list.
    *
    * @param location accepted values are 'rows' and 'columns'.
    */
  def setMeasureListLocation(location: js.Object): Unit
  
  /**
    * Performs an update with the list of pending changes and updates the data source result.
    */
  def update(): js.Object
}
object OlapXmlaDataSource {
  
  inline def apply(
    addColumnItem: js.Object => Unit,
    addFilterItem: js.Object => Unit,
    addFilterMember: (String, String) => Unit,
    addMeasureItem: js.Object => Unit,
    addRowItem: js.Object => Unit,
    catalog: () => js.Object,
    catalogs: () => js.Array[Any],
    clearPendingChanges: () => Unit,
    collapseTupleMember: (String, Double, Double) => Unit,
    columnAxis: () => js.Array[Any],
    cube: () => js.Object,
    cubes: () => js.Array[Any],
    expandTupleMember: (String, Double, Double) => Unit,
    filters: () => js.Array[Any],
    getCoreElement: (js.Function, js.Object) => js.Object,
    getCoreElements: (js.Function, js.Object) => js.Object,
    getDimension: String => js.Object,
    getFilterMemberNames: String => js.Array[Any],
    getHierarchy: String => js.Object,
    getLevel: String => js.Object,
    getMeasure: String => js.Object,
    getMeasureList: () => js.Object,
    getMembersOfHierarchy: String => Unit,
    getMembersOfLevel: String => Unit,
    getMembersOfMember: String => Unit,
    initialize: () => js.Object,
    isInitialized: () => Boolean,
    isModified: () => Boolean,
    isUpdating: () => Boolean,
    measureGroup: () => js.Object,
    measureGroups: () => js.Array[Any],
    measures: () => js.Array[Any],
    metadataTree: () => js.Object,
    removeAllFilterMembers: String => Unit,
    removeColumnItem: js.Object => Unit,
    removeFilterItem: js.Object => Unit,
    removeFilterMember: (String, String) => Unit,
    removeMeasureItem: js.Object => Unit,
    removeRowItem: js.Object => Unit,
    result: () => js.Object,
    rowAxis: () => js.Array[Any],
    setCatalog: String => js.Object,
    setCube: String => js.Object,
    setMeasureGroup: String => js.Object,
    setMeasureListIndex: Double => Unit,
    setMeasureListLocation: js.Object => Unit,
    update: () => js.Object
  ): OlapXmlaDataSource = {
    val __obj = js.Dynamic.literal(addColumnItem = js.Any.fromFunction1(addColumnItem), addFilterItem = js.Any.fromFunction1(addFilterItem), addFilterMember = js.Any.fromFunction2(addFilterMember), addMeasureItem = js.Any.fromFunction1(addMeasureItem), addRowItem = js.Any.fromFunction1(addRowItem), catalog = js.Any.fromFunction0(catalog), catalogs = js.Any.fromFunction0(catalogs), clearPendingChanges = js.Any.fromFunction0(clearPendingChanges), collapseTupleMember = js.Any.fromFunction3(collapseTupleMember), columnAxis = js.Any.fromFunction0(columnAxis), cube = js.Any.fromFunction0(cube), cubes = js.Any.fromFunction0(cubes), expandTupleMember = js.Any.fromFunction3(expandTupleMember), filters = js.Any.fromFunction0(filters), getCoreElement = js.Any.fromFunction2(getCoreElement), getCoreElements = js.Any.fromFunction2(getCoreElements), getDimension = js.Any.fromFunction1(getDimension), getFilterMemberNames = js.Any.fromFunction1(getFilterMemberNames), getHierarchy = js.Any.fromFunction1(getHierarchy), getLevel = js.Any.fromFunction1(getLevel), getMeasure = js.Any.fromFunction1(getMeasure), getMeasureList = js.Any.fromFunction0(getMeasureList), getMembersOfHierarchy = js.Any.fromFunction1(getMembersOfHierarchy), getMembersOfLevel = js.Any.fromFunction1(getMembersOfLevel), getMembersOfMember = js.Any.fromFunction1(getMembersOfMember), initialize = js.Any.fromFunction0(initialize), isInitialized = js.Any.fromFunction0(isInitialized), isModified = js.Any.fromFunction0(isModified), isUpdating = js.Any.fromFunction0(isUpdating), measureGroup = js.Any.fromFunction0(measureGroup), measureGroups = js.Any.fromFunction0(measureGroups), measures = js.Any.fromFunction0(measures), metadataTree = js.Any.fromFunction0(metadataTree), removeAllFilterMembers = js.Any.fromFunction1(removeAllFilterMembers), removeColumnItem = js.Any.fromFunction1(removeColumnItem), removeFilterItem = js.Any.fromFunction1(removeFilterItem), removeFilterMember = js.Any.fromFunction2(removeFilterMember), removeMeasureItem = js.Any.fromFunction1(removeMeasureItem), removeRowItem = js.Any.fromFunction1(removeRowItem), result = js.Any.fromFunction0(result), rowAxis = js.Any.fromFunction0(rowAxis), setCatalog = js.Any.fromFunction1(setCatalog), setCube = js.Any.fromFunction1(setCube), setMeasureGroup = js.Any.fromFunction1(setMeasureGroup), setMeasureListIndex = js.Any.fromFunction1(setMeasureListIndex), setMeasureListLocation = js.Any.fromFunction1(setMeasureListLocation), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[OlapXmlaDataSource]
  }
  
  extension [Self <: OlapXmlaDataSource](x: Self) {
    
    inline def setAddColumnItem(value: js.Object => Unit): Self = StObject.set(x, "addColumnItem", js.Any.fromFunction1(value))
    
    inline def setAddFilterItem(value: js.Object => Unit): Self = StObject.set(x, "addFilterItem", js.Any.fromFunction1(value))
    
    inline def setAddFilterMember(value: (String, String) => Unit): Self = StObject.set(x, "addFilterMember", js.Any.fromFunction2(value))
    
    inline def setAddMeasureItem(value: js.Object => Unit): Self = StObject.set(x, "addMeasureItem", js.Any.fromFunction1(value))
    
    inline def setAddRowItem(value: js.Object => Unit): Self = StObject.set(x, "addRowItem", js.Any.fromFunction1(value))
    
    inline def setCatalog(value: () => js.Object): Self = StObject.set(x, "catalog", js.Any.fromFunction0(value))
    
    inline def setCatalogs(value: () => js.Array[Any]): Self = StObject.set(x, "catalogs", js.Any.fromFunction0(value))
    
    inline def setClearPendingChanges(value: () => Unit): Self = StObject.set(x, "clearPendingChanges", js.Any.fromFunction0(value))
    
    inline def setCollapseTupleMember(value: (String, Double, Double) => Unit): Self = StObject.set(x, "collapseTupleMember", js.Any.fromFunction3(value))
    
    inline def setColumnAxis(value: () => js.Array[Any]): Self = StObject.set(x, "columnAxis", js.Any.fromFunction0(value))
    
    inline def setCube(value: () => js.Object): Self = StObject.set(x, "cube", js.Any.fromFunction0(value))
    
    inline def setCubes(value: () => js.Array[Any]): Self = StObject.set(x, "cubes", js.Any.fromFunction0(value))
    
    inline def setExpandTupleMember(value: (String, Double, Double) => Unit): Self = StObject.set(x, "expandTupleMember", js.Any.fromFunction3(value))
    
    inline def setFilters(value: () => js.Array[Any]): Self = StObject.set(x, "filters", js.Any.fromFunction0(value))
    
    inline def setGetCoreElement(value: (js.Function, js.Object) => js.Object): Self = StObject.set(x, "getCoreElement", js.Any.fromFunction2(value))
    
    inline def setGetCoreElements(value: (js.Function, js.Object) => js.Object): Self = StObject.set(x, "getCoreElements", js.Any.fromFunction2(value))
    
    inline def setGetDimension(value: String => js.Object): Self = StObject.set(x, "getDimension", js.Any.fromFunction1(value))
    
    inline def setGetFilterMemberNames(value: String => js.Array[Any]): Self = StObject.set(x, "getFilterMemberNames", js.Any.fromFunction1(value))
    
    inline def setGetHierarchy(value: String => js.Object): Self = StObject.set(x, "getHierarchy", js.Any.fromFunction1(value))
    
    inline def setGetLevel(value: String => js.Object): Self = StObject.set(x, "getLevel", js.Any.fromFunction1(value))
    
    inline def setGetMeasure(value: String => js.Object): Self = StObject.set(x, "getMeasure", js.Any.fromFunction1(value))
    
    inline def setGetMeasureList(value: () => js.Object): Self = StObject.set(x, "getMeasureList", js.Any.fromFunction0(value))
    
    inline def setGetMembersOfHierarchy(value: String => Unit): Self = StObject.set(x, "getMembersOfHierarchy", js.Any.fromFunction1(value))
    
    inline def setGetMembersOfLevel(value: String => Unit): Self = StObject.set(x, "getMembersOfLevel", js.Any.fromFunction1(value))
    
    inline def setGetMembersOfMember(value: String => Unit): Self = StObject.set(x, "getMembersOfMember", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: () => js.Object): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setIsInitialized(value: () => Boolean): Self = StObject.set(x, "isInitialized", js.Any.fromFunction0(value))
    
    inline def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
    
    inline def setIsUpdating(value: () => Boolean): Self = StObject.set(x, "isUpdating", js.Any.fromFunction0(value))
    
    inline def setMeasureGroup(value: () => js.Object): Self = StObject.set(x, "measureGroup", js.Any.fromFunction0(value))
    
    inline def setMeasureGroups(value: () => js.Array[Any]): Self = StObject.set(x, "measureGroups", js.Any.fromFunction0(value))
    
    inline def setMeasures(value: () => js.Array[Any]): Self = StObject.set(x, "measures", js.Any.fromFunction0(value))
    
    inline def setMetadataTree(value: () => js.Object): Self = StObject.set(x, "metadataTree", js.Any.fromFunction0(value))
    
    inline def setRemoveAllFilterMembers(value: String => Unit): Self = StObject.set(x, "removeAllFilterMembers", js.Any.fromFunction1(value))
    
    inline def setRemoveColumnItem(value: js.Object => Unit): Self = StObject.set(x, "removeColumnItem", js.Any.fromFunction1(value))
    
    inline def setRemoveFilterItem(value: js.Object => Unit): Self = StObject.set(x, "removeFilterItem", js.Any.fromFunction1(value))
    
    inline def setRemoveFilterMember(value: (String, String) => Unit): Self = StObject.set(x, "removeFilterMember", js.Any.fromFunction2(value))
    
    inline def setRemoveMeasureItem(value: js.Object => Unit): Self = StObject.set(x, "removeMeasureItem", js.Any.fromFunction1(value))
    
    inline def setRemoveRowItem(value: js.Object => Unit): Self = StObject.set(x, "removeRowItem", js.Any.fromFunction1(value))
    
    inline def setResult(value: () => js.Object): Self = StObject.set(x, "result", js.Any.fromFunction0(value))
    
    inline def setRowAxis(value: () => js.Array[Any]): Self = StObject.set(x, "rowAxis", js.Any.fromFunction0(value))
    
    inline def setSetCatalog(value: String => js.Object): Self = StObject.set(x, "setCatalog", js.Any.fromFunction1(value))
    
    inline def setSetCube(value: String => js.Object): Self = StObject.set(x, "setCube", js.Any.fromFunction1(value))
    
    inline def setSetMeasureGroup(value: String => js.Object): Self = StObject.set(x, "setMeasureGroup", js.Any.fromFunction1(value))
    
    inline def setSetMeasureListIndex(value: Double => Unit): Self = StObject.set(x, "setMeasureListIndex", js.Any.fromFunction1(value))
    
    inline def setSetMeasureListLocation(value: js.Object => Unit): Self = StObject.set(x, "setMeasureListLocation", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: () => js.Object): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
