package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapFlatDataSource extends js.Object {
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
  def columnAxis(): js.Array[_]
  /**
    * Retrieves the current cube in the data source.
    */
  def cube(): js.Object
  /**
    * Retrieves the currently loaded cubes in the data source.
    */
  def cubes(): js.Array[_]
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
  def filters(): js.Array[_]
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
  def getFilterMemberNames(hierarchyUniqueName: String): js.Array[_]
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
    * @param hierarchyUniqueName the unique name of the hierarchy whose active filter members are returned.
    */
  def getMembersOfHierarchy(hierarchyUniqueName: String): Unit
  /**
    * Returns Promise which on completion provides an array of $.ig.OlapResultAxisMember objects of selected for given level filter member.
    *
    * @param levelUniqueName the unique name of the level whose active filter members are returned.
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
    * Returns the items in the measures axis.
    */
  def measures(): js.Array[_]
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
  def rowAxis(): js.Array[_]
  /**
    * Sets the current cube for the data source and updates the cube(), measureGroup() and metadataTree() properties.
    *
    * @param cubeName the name of the cube.
    */
  def setCube(cubeName: String): js.Object
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

object OlapFlatDataSource {
  @scala.inline
  def apply(
    addColumnItem: js.Object => Unit,
    addFilterItem: js.Object => Unit,
    addFilterMember: (String, String) => Unit,
    addMeasureItem: js.Object => Unit,
    addRowItem: js.Object => Unit,
    clearPendingChanges: () => Unit,
    collapseTupleMember: (String, Double, Double) => Unit,
    columnAxis: () => js.Array[_],
    cube: () => js.Object,
    cubes: () => js.Array[_],
    expandTupleMember: (String, Double, Double) => Unit,
    filters: () => js.Array[_],
    getCoreElement: (js.Function, js.Object) => js.Object,
    getCoreElements: (js.Function, js.Object) => js.Object,
    getDimension: String => js.Object,
    getFilterMemberNames: String => js.Array[_],
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
    measures: () => js.Array[_],
    metadataTree: () => js.Object,
    removeAllFilterMembers: String => Unit,
    removeColumnItem: js.Object => Unit,
    removeFilterItem: js.Object => Unit,
    removeFilterMember: (String, String) => Unit,
    removeMeasureItem: js.Object => Unit,
    removeRowItem: js.Object => Unit,
    result: () => js.Object,
    rowAxis: () => js.Array[_],
    setCube: String => js.Object,
    setMeasureListIndex: Double => Unit,
    setMeasureListLocation: js.Object => Unit,
    update: () => js.Object
  ): OlapFlatDataSource = {
    val __obj = js.Dynamic.literal(addColumnItem = js.Any.fromFunction1(addColumnItem), addFilterItem = js.Any.fromFunction1(addFilterItem), addFilterMember = js.Any.fromFunction2(addFilterMember), addMeasureItem = js.Any.fromFunction1(addMeasureItem), addRowItem = js.Any.fromFunction1(addRowItem), clearPendingChanges = js.Any.fromFunction0(clearPendingChanges), collapseTupleMember = js.Any.fromFunction3(collapseTupleMember), columnAxis = js.Any.fromFunction0(columnAxis), cube = js.Any.fromFunction0(cube), cubes = js.Any.fromFunction0(cubes), expandTupleMember = js.Any.fromFunction3(expandTupleMember), filters = js.Any.fromFunction0(filters), getCoreElement = js.Any.fromFunction2(getCoreElement), getCoreElements = js.Any.fromFunction2(getCoreElements), getDimension = js.Any.fromFunction1(getDimension), getFilterMemberNames = js.Any.fromFunction1(getFilterMemberNames), getHierarchy = js.Any.fromFunction1(getHierarchy), getLevel = js.Any.fromFunction1(getLevel), getMeasure = js.Any.fromFunction1(getMeasure), getMeasureList = js.Any.fromFunction0(getMeasureList), getMembersOfHierarchy = js.Any.fromFunction1(getMembersOfHierarchy), getMembersOfLevel = js.Any.fromFunction1(getMembersOfLevel), getMembersOfMember = js.Any.fromFunction1(getMembersOfMember), initialize = js.Any.fromFunction0(initialize), isInitialized = js.Any.fromFunction0(isInitialized), isModified = js.Any.fromFunction0(isModified), isUpdating = js.Any.fromFunction0(isUpdating), measures = js.Any.fromFunction0(measures), metadataTree = js.Any.fromFunction0(metadataTree), removeAllFilterMembers = js.Any.fromFunction1(removeAllFilterMembers), removeColumnItem = js.Any.fromFunction1(removeColumnItem), removeFilterItem = js.Any.fromFunction1(removeFilterItem), removeFilterMember = js.Any.fromFunction2(removeFilterMember), removeMeasureItem = js.Any.fromFunction1(removeMeasureItem), removeRowItem = js.Any.fromFunction1(removeRowItem), result = js.Any.fromFunction0(result), rowAxis = js.Any.fromFunction0(rowAxis), setCube = js.Any.fromFunction1(setCube), setMeasureListIndex = js.Any.fromFunction1(setMeasureListIndex), setMeasureListLocation = js.Any.fromFunction1(setMeasureListLocation), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[OlapFlatDataSource]
  }
}

