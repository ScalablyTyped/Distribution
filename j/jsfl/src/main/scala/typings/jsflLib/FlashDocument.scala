package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashDocument extends js.Object {
   // Posts a XMLUI dialog box.
  var accName: java.lang.String = js.native
   // A string that is equivalent to the Name field in the
  var as3AutoDeclare: scala.Boolean = js.native
   // A Boolean value that describes whether the
  var as3Dialect: java.lang.String = js.native
   // A string that describes the ActionScript 3.0
  var as3ExportFrame: scala.Double = js.native
   // An integer that specifies in which frame to export
  var as3StrictMode: scala.Boolean = js.native
   // A Boolean value that specifies whether the
  var as3WarningsMode: scala.Boolean = js.native
   // A Boolean value that specifies whether the
  var asVersion: scala.Double = js.native
   // An integer that specifies which version of
  var autoLabel: scala.Boolean = js.native
   // A Boolean value that is equivalent to the Auto
  var backgroundColor: js.Any = js.native
   // A string, hexadecimal value, or integer that
  var currentPublishProfile: java.lang.String = js.native
   // A string that specifies the name of the active
  var currentTimeline: FlashTimeline = js.native
   // An integer that specifies the index of the active
  var description: java.lang.String = js.native
   // A string that is equivalent to the Description field in
  var forceSimple: scala.Boolean = js.native
   // A Boolean value that specifies whether the children
  var frameRate: scala.Double = js.native
   // A float value that specifies the number of frames
  var height: scala.Double = js.native
   // An integer that specifies the height of the
  var id: scala.Double = js.native
   // A unique integer (assigned automatically) that
  var library: FlashLibrary = js.native
   // Read-only; the library object for a document.
  var livePreview: scala.Boolean = js.native
   // A Boolean value that specifies if Live Preview is
  var name: java.lang.String = js.native
   // Read-only; a string that represents the name of a
  var path: java.lang.String = js.native
   // Read-only; a string that represents the path of the
  var pathURI: java.lang.String = js.native
   // Read-only property; a string that represents the path of the document, expressed as a file:/// URI. If the document has never been saved, this property is undefined.
  var publishProfiles: js.Array[java.lang.String] = js.native
   // Read-only; an array of the publish profile names for
  /** Read-only; the current ScreenOutline object for the */
  // Not available in CS5
  //screenOutline: FlashScreenOutline;
  /** An array of the selected objects in the document. */
  var selection: js.Array[FlashElement] = js.native
  /** A Boolean value that specifies whether the object */
  var silent: scala.Boolean = js.native
  /** Read-only; an array of Timeline objects (see */
  var timelines: js.Array[FlashTimeline] = js.native
  /** Read-only; a Matrix object. */
  var viewMatrix: FlashMatrix = js.native
  /** An integer that specifies the width of the document */
  var width: scala.Double = js.native
  /** Specifies the zoom percent of the Stage at author */
  var zoomFactor: scala.Double = js.native
  // "integer", "integerArray", "double", "doubleArray", "string", and "byteArray"
  def addDataToDocument(name: java.lang.String, `type`: java.lang.String, data: js.Any): scala.Unit = js.native
   // Stores specified data with a document.
  def addDataToSelection(name: java.lang.String, `type`: java.lang.String, data: js.Any): scala.Unit = js.native
   // Stores specified data with the selected object(s).
  def addFilter(filterName: java.lang.String): scala.Unit = js.native
   // Applies a filter to the selected objects.
  def addItem(position: FlashPoint, item: FlashItem): scala.Boolean = js.native
   // Adds an item from any open document or library
  def addNewLine(startPoint: FlashPoint, endpoint: FlashPoint): scala.Unit = js.native
   // Adds a new path between two points.
  def addNewOval(boundingRectangle: FlashRectangle): scala.Unit = js.native
  def addNewOval(boundingRectangle: FlashRectangle, bSuppressFill: scala.Boolean): scala.Unit = js.native
  def addNewOval(boundingRectangle: FlashRectangle, bSuppressFill: scala.Boolean, bSuppressStroke: scala.Boolean): scala.Unit = js.native
   // Adds a new Oval object in the specified
  def addNewPrimitiveOval(boundingRectangle: FlashRectangle): scala.Unit = js.native
  def addNewPrimitiveOval(boundingRectangle: FlashRectangle, bSpupressFill: scala.Boolean): scala.Unit = js.native
  def addNewPrimitiveOval(boundingRectangle: FlashRectangle, bSpupressFill: scala.Boolean, bSuppressStroke: scala.Boolean): scala.Unit = js.native
   // Adds a new rectangle or rounded rectangle,
  def addNewPrimitiveRectangle(boundingRectangle: FlashRectangle, roundness: scala.Double): js.Any = js.native
  def addNewPrimitiveRectangle(boundingRectangle: FlashRectangle, roundness: scala.Double, bSuppressFill: scala.Boolean): js.Any = js.native
  def addNewPrimitiveRectangle(
    boundingRectangle: FlashRectangle,
    roundness: scala.Double,
    bSuppressFill: scala.Boolean,
    bSuppressStroke: scala.Boolean
  ): js.Any = js.native
   // Adds a new rectangle or rounded rectangle,
  def addNewPublishProfile(): scala.Unit = js.native
  def addNewPublishProfile(profileName: java.lang.String): scala.Unit = js.native
  def addNewRectangle(boundingRectangle: FlashRectangle, roundness: scala.Double): js.Any = js.native
  def addNewRectangle(boundingRectangle: FlashRectangle, roundness: scala.Double, bSuppressFill: scala.Boolean): js.Any = js.native
  def addNewRectangle(
    boundingRectangle: FlashRectangle,
    roundness: scala.Double,
    bSuppressFill: scala.Boolean,
    bSuppressStroke: scala.Boolean
  ): js.Any = js.native
  def addNewScene(name: java.lang.String): scala.Boolean = js.native
   // Adds a new scene (Timeline object) as the next
  def addNewText(boundingRectangle: FlashRectangle): scala.Unit = js.native
  def addNewText(boundingRectangle: FlashRectangle, text: java.lang.String): scala.Unit = js.native
   // Inserts a new empty text field.
  def align(alignmode: java.lang.String): js.Any = js.native
  def align(alignmode: java.lang.String, bUseDocumentBounds: scala.Boolean): js.Any = js.native
   // Aligns the selection.
  def allowScreens(): scala.Unit = js.native
   // Use this method before using the
  /** Arranges the selection on the Stage. "back", "backward", "forward", and "front" */
  def arrange(arrangeMode: java.lang.String): scala.Unit = js.native
  /** Performs a break-apart operation on the current */
  def breakApart(): scala.Unit = js.native
  /** Indicates whether the Edit Symbols menu and */
  def canEditSymbol(): scala.Boolean = js.native
  /** Determines whether you can use the */
  def canRevert(): scala.Boolean = js.native
  ///** Determines whether a version of the specified */
  //canSaveAVersion(): boolean;
  /** Determines whether you can use the */
  def canTestMovie(): scala.Boolean = js.native
  /** Determines whether you can use the */
  def canTestScene(): scala.Boolean = js.native
  /** Changes the index of the filter in the Filter list. */
  def changeFilterOrder(oldIndex: scala.Double, newIndex: scala.Double): scala.Unit = js.native
  /** Copies the current selection from the document */
  def clipCopy(): scala.Unit = js.native
  /** Cuts the current selection from the document */
  def clipCut(): scala.Unit = js.native
  /** Pastes the contents of the Clipboard into the document. */
  def clipPaste(): scala.Unit = js.native
  def clipPaste(bInPlace: scala.Boolean): scala.Unit = js.native
  /** Closes the specified document. */
  def close(): scala.Unit = js.native
  def close(bPromptToSaveChanges: scala.Boolean): scala.Unit = js.native
  /** Converts lines to fills on the selected objects. */
  def convertLinesToFills(): scala.Unit = js.native
  /** Converts the selected Stage item(s) to a new */
  def convertToSymbol(`type`: java.lang.String, name: java.lang.String, registrationPoint: java.lang.String): FlashSymbolInstance = js.native
  /** Uses the top selected drawing object to crop all */
  def crop(): scala.Unit = js.native
  /** Method; Invokes the Debug Movie command on the document. */
  def debugMovie(): scala.Unit = js.native
  def debugMovie(abortIfErrorsExist: scala.Boolean): scala.Unit = js.native
  /** Deletes the envelope (bounding box that */
  def deleteEnvelope(): scala.Boolean = js.native
  /** Deletes the currently active profile, if there is */
  def deletePublishProfile(): scala.Boolean = js.native
  /** Deletes the current scene (Timeline object), and */
  def deleteScene(): scala.Boolean = js.native
  /** Deletes the current selection on the Stage. */
  def deleteSelection(): scala.Unit = js.native
  /** Disables all filters on the selected objects. */
  def disableAllFilters(): scala.Unit = js.native
  /** Disables the specified filter in the Filters list. */
  def disableFilter(filterIndex: scala.Double): scala.Unit = js.native
  /** Disables all filters except the one at the specified */
  def disableOtherFilters(enabledFilterIndex: scala.Double): scala.Unit = js.native
  /** Distributes the selection. */
  def distribute(distributemode: java.lang.String): scala.Unit = js.native
  def distribute(distributemode: java.lang.String, bUseDocumentBounds: scala.Boolean): scala.Unit = js.native
  /** Performs a distribute-to-layers operation on the */
  def distributeToLayers(): scala.Unit = js.native
  /** Checks the document for persistent data with the */
  def documentHasData(name: java.lang.String): scala.Boolean = js.native
  /** Duplicates the currently active profile and gives */
  def duplicatePublishProfile(): scala.Double = js.native
  def duplicatePublishProfile(profileName: java.lang.String): scala.Double = js.native
  /** Makes a copy of the currently selected scene, */
  def duplicateScene(): scala.Boolean = js.native
  /** Duplicates the selection on the Stage. */
  def duplicateSelection(): scala.Unit = js.native
  /** Makes the specified scene the currently selected */
  def editScene(index: scala.Double): scala.Unit = js.native
  /** Enables all the filters on the Filters list for the */
  def enableAllFilters(): scala.Unit = js.native
  /** Enables the specified filter for the selected */
  def enableFilter(filterIndex: scala.Double): scala.Unit = js.native
  /** Switches the authoring tool into the editing mode */
  def enterEditMode(): scala.Unit = js.native
  def enterEditMode(editMode: java.lang.String): scala.Unit = js.native
  /** Exits from symbol-editing mode and returns */
  def exitEditMode(): scala.Unit = js.native
  /** Exports the document as one or more PNG files. */
  def exportPNG(fileURI: java.lang.String): scala.Boolean = js.native
  def exportPNG(fileURI: java.lang.String, bCurrentPNGSettings: scala.Boolean): scala.Boolean = js.native
  def exportPNG(fileURI: java.lang.String, bCurrentPNGSettings: scala.Boolean, bCurrentFrame: scala.Boolean): scala.Boolean = js.native
  /** Exports the currently active profile to an XML */
  def exportPublishProfile(fileURI: java.lang.String): scala.Unit = js.native
  /** returns a string that specifies, in XML format, the specified profile. If you don't pass a value for profileName, the current profile is exported. */
  def exportPublishProfileString(): java.lang.String = js.native
  def exportPublishProfileString(profileName: java.lang.String): java.lang.String = js.native
  /** Exports the document in the Flash SWF format. */
  def exportSWF(fileURI: java.lang.String): scala.Unit = js.native
  def exportSWF(fileURI: java.lang.String, bCurrentSettings: scala.Boolean): scala.Unit = js.native
  /** Identical to retrieving the value of the To Stage */
  def getAlignToDocument(): scala.Boolean = js.native
  /** Returns a string that specifies the blending mode */
  def getBlendMode(): java.lang.String = js.native
  /** Retrieves the fill object of the selected shape, or */
  def getCustomFill(): FlashFill = js.native
  def getCustomFill(objectToFill: java.lang.String): FlashFill = js.native
  /** Returns the stroke object of the selected shape, */
  def getCustomStroke(): FlashStroke = js.native
  def getCustomStroke(locationOfStroke: java.lang.String): FlashStroke = js.native
  /** Retrieves the value of the specified data. */
  def getDataFromDocument(name: java.lang.String): js.Any = js.native
  /** Gets the specified Element property for the */
  def getElementProperty(propertyName: java.lang.String): js.Any = js.native
  /** Gets a specified TextAttrs property of the*/
  def getElementTextAttr(attrName: java.lang.String): FlashTextAttrs = js.native
  def getElementTextAttr(attrName: java.lang.String, startIndex: scala.Double): FlashTextAttrs = js.native
  def getElementTextAttr(attrName: java.lang.String, startIndex: scala.Double, endIndex: scala.Double): FlashTextAttrs = js.native
  /** Returns an array that contains the list of filters*/
  def getFilters(): js.Array[FlashFilter] = js.native
  /** Returns a string containing the XML metadata */
  def getMetadata(): java.lang.String = js.native
  /** returns the mobile XML settings for the document. */
  def getMobileSettings(): java.lang.String = js.native
  /** Returns a string that represents the targeted */
  def getPlayerVersion(): java.lang.String = js.native
  /** Gets the bounding rectangle of the current */
  def getSelectionRect(): FlashRectangle = js.native
  /** Gets the currently selected text. */
  def getTextString(): java.lang.String = js.native
  def getTextString(startIndex: scala.Double): java.lang.String = js.native
  def getTextString(startIndex: scala.Double, endIndex: scala.Double): java.lang.String = js.native
  /** Retrieves the current Timeline object in the */
  def getTimeline(): FlashTimeline = js.native
  /** gets the location of the transformation point of the current selection. You can use the transformation point for commutations such as rotate and skew. */
  def getTransformationPoint(): FlashPoint = js.native
  /** Converts the current selection to a group.*/
  def group(): scala.Unit = js.native
  /** Imports a file into the document. */
  def importFile(fileURI: java.lang.String): scala.Unit = js.native
  def importFile(fileURI: java.lang.String, importToLibrary: scala.Boolean): scala.Unit = js.native
  /** Imports a profile from a file. */
  def importPublishProfile(fileURI: java.lang.String): scala.Double = js.native
  /** imports an XML string that represents a publish profile and sets it as the current profile. To generate an XML string to import, use document.exportPublishProfileString() before using this method. */
  def importPublishProfileString(xmlString: java.lang.String): scala.Double = js.native
  /** Imports a SWF file into the document.*/
  def importSWF(fileURI: java.lang.String): scala.Unit = js.native
  /** creates an intersection drawing object from all selected drawing objects. This method returns false if there are no drawing objects selected, or if any of the selected items are not drawing objects. */
  def intersect(): scala.Boolean = js.native
  /** loads a cue point XML file. The format and DTD of the XML file is the same as the one imported and exported by the Cue Points Property inspector. The return value is the same as the string serialized in the Cue Point property of the object containing the instance of an FLVPlayback Component. */
  def loadCuepointXML(uri: java.lang.String): js.Array[_] = js.native
  /** Makes the size of the selected objects the same. */
  def `match`(bWidth: scala.Boolean, bHeight: scala.Boolean): scala.Unit = js.native
  def `match`(bWidth: scala.Boolean, bHeight: scala.Boolean, bUseDocumentBounds: scala.Boolean): scala.Unit = js.native
  /** Performs a mouse click from the Selection tool. */
  def mouseClick(position: FlashPoint, bToggleSel: scala.Boolean, bShiftSel: scala.Boolean): scala.Unit = js.native
  /** Performs a double mouse click from the */
  def mouseDblClk(
    position: FlashPoint,
    bAltDown: scala.Boolean,
    bShiftDown: scala.Boolean,
    bShiftSelect: scala.Boolean
  ): scala.Unit = js.native
  /** If the selection contains at least one path with at */
  def moveSelectedBezierPointsBy(delta: FlashPoint): scala.Unit = js.native
  /** Moves selected objects by a specified distance. */
  def moveSelectionBy(distanceToMove: FlashPoint): scala.Unit = js.native
  /** Optimizes smoothing for the current selection, */
  def optimizeCurves(smoothing: scala.Double, bUseMultiplePasses: scala.Boolean): scala.Unit = js.native
  /** Publishes the document according to the active */
  def publish(): scala.Unit = js.native
  /** uses the top selected drawing object to punch through all selected drawing objects underneath it. This method returns false if there are no drawing objects selected or if any of the selected items are not drawing objects.  */
  def punch(): scala.Boolean = js.native
  /** Removes all filters from the selected object(s).*/
  def removeAllFilters(): scala.Unit = js.native
  /** Removes persistent data with the specified*/
  def removeDataFromDocument(name: java.lang.String): scala.Unit = js.native
  /** Removes persistent data with the specified */
  def removeDataFromSelection(name: java.lang.String): scala.Unit = js.native
  /** Removes the specified filter from the Filters list*/
  def removeFilter(filterIndex: scala.Double): scala.Unit = js.native
  /** Renames the current profile.*/
  def renamePublishProfile(): scala.Boolean = js.native
  def renamePublishProfile(profileNewName: java.lang.String): scala.Boolean = js.native
  /** Renames the currently selected scene in the */
  def renameScene(name: java.lang.String): scala.Boolean = js.native
  /** Moves the specified scene before another */
  def reorderScene(sceneToMove: scala.Double, sceneToPutItBefore: scala.Double): scala.Unit = js.native
  /** Sets all values in the Property inspector to */
  def resetOvalObject(): scala.Unit = js.native
  /** Sets all values in the Property inspector to */
  def resetRectangleObject(): scala.Unit = js.native
  /** Resets the transformation matrix; equivalent to */
  def resetTransformation(): scala.Unit = js.native
  /** Method; reverts the specified document to its previously saved version. This method is equivalent to selecting File > Revert. */
  def revert(): scala.Unit = js.native
  ///** Reverts the specified document to the version */
  //revertToLastVersion();
  /** applies a 3D rotation to the selection. This method is available only for movie clips. */
  def rotate3DSelection(xyzCoordinate: FlashPoint3D, bGlobalTransform: scala.Boolean): scala.Unit = js.native
  /** Rotates the selection by a specified number of */
  def rotateSelection(angle: scala.Double): scala.Unit = js.native
  def rotateSelection(angle: scala.Double, rotationPoint: java.lang.String): scala.Unit = js.native
  /** Saves the document in its default location;*/
  def save(): scala.Boolean = js.native
  def save(bOkToSaveAs: scala.Boolean): scala.Boolean = js.native
  /** saves and compacts the file. This method is equivalent to selecting File > Save and Compact. */
  def saveAndCompact(): scala.Boolean = js.native
  def saveAndCompact(bOkToSaveAs: scala.Boolean): scala.Boolean = js.native
  //saveAsVersion(); // Saves a version of the specified document to the
  /** Scales the selection by a specified amount;*/
  def scaleSelection(xScale: scala.Double, yScale: scala.Double): scala.Unit = js.native
  def scaleSelection(xScale: scala.Double, yScale: scala.Double, whichCorner: java.lang.String): scala.Unit = js.native
  /** Selects all items on the Stage; equivalent to*/
  def selectAll(): scala.Unit = js.native
  /** Deselects any selected items. */
  def selectNone(): scala.Unit = js.native
  /** Sets the preferences for document.align(),*/
  def setAlignToDocument(): scala.Unit = js.native
  def setAlignToDocument(bToStage: scala.Boolean): scala.Unit = js.native
  /** Sets the blending mode for the selected objects.*/
  def setBlendMode(mode: java.lang.String): scala.Unit = js.native
  /** Sets the fill settings for the Tools panel, Property */
  def setCustomFill(fill: FlashFill): scala.Unit = js.native
  /** Sets the stroke settings for the Tools panel,*/
  def setCustomStroke(stroke: FlashStroke): scala.Unit = js.native
  /** Sets the specified Element property on selected */
  def setElementProperty(property: java.lang.String, value: scala.Double): scala.Unit = js.native
  /** Sets the specified TextAttrs property of the */
  def setElementTextAttr(attrName: java.lang.String, attrValue: FlashTextAttrs): scala.Boolean = js.native
  def setElementTextAttr(attrName: java.lang.String, attrValue: FlashTextAttrs, startIndex: scala.Double): scala.Boolean = js.native
  def setElementTextAttr(
    attrName: java.lang.String,
    attrValue: FlashTextAttrs,
    startIndex: scala.Double,
    endIndex: scala.Double
  ): scala.Boolean = js.native
  /** Changes the fill color of the selection to the */
  def setFillColor(color: js.Any): scala.Unit = js.native
  /** Sets a specified filter property for the currently */
  def setFilterProperty(property: java.lang.String, filterIndex: scala.Double, value: js.Any): scala.Unit = js.native
  /** Applies filters to the selected objects .*/
  def setFilters(filterArray: js.Array[FlashFilter]): scala.Unit = js.native
  /** Sets the opacity of the instance. */
  def setInstanceAlpha(opacity: scala.Double): scala.Unit = js.native
  /** Sets the brightness for the instance. */
  def setInstanceBrightness(brightness: scala.Double): scala.Unit = js.native
  /** Sets the tint for the instance.*/
  def setInstanceTint(color: js.Any, strength: scala.Double): scala.Unit = js.native
  /** Sets the XML metadata for the specified */
  def setMetadata(strMetadata: java.lang.String): scala.Boolean = js.native
  /** Sets the value of an XML settings string in a */
  def setMobileSettings(xmlString: java.lang.String): scala.Boolean = js.native
  /** Specifies a value for a specified property of*/
  def setOvalObjectProperty(propertyName: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Sets the version of the Flash Player targeted by*/
  def setPlayerVersion(version: java.lang.String): scala.Boolean = js.native
  /** Specifies a value for a specified property of*/
  def setRectangleObjectProperty(propertyName: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Moves and resizes the selection in a single */
  def setSelectionBounds(boundingRectangle: FlashRectangle): scala.Unit = js.native
  def setSelectionBounds(boundingRectangle: FlashRectangle, bContactSensitiveSelection: scala.Boolean): scala.Unit = js.native
  /** Draws a rectangular selection marquee relative */
  def setSelectionRect(rect: FlashRectangle): scala.Unit = js.native
  def setSelectionRect(rect: FlashRectangle, bReplaceCurrentSelection: scala.Boolean): scala.Unit = js.native
  def setSelectionRect(
    rect: FlashRectangle,
    bReplaceCurrentSelection: scala.Boolean,
    bContactSensitiveSelection: scala.Boolean
  ): scala.Unit = js.native
  /** Specifies the vanishing point for viewing 3D objects. */
  def setStageVanishingPoint(point: FlashPoint): scala.Unit = js.native
  def setStageViewAngle(angle: scala.Double): scala.Unit = js.native
  /** Sets the color, width, and style of the selected */
  def setStroke(color: js.Any, size: scala.Double, strokeType: java.lang.String): scala.Unit = js.native
  /** Changes the stroke color of the selection to the*/
  def setStrokeColor(color: js.Any): scala.Unit = js.native
  /** Changes the stroke size of the selection to the*/
  def setStrokeSize(size: scala.Double): scala.Unit = js.native
  /** Changes the stroke style of the selection to the */
  def setStrokeStyle(strokeType: java.lang.String): scala.Unit = js.native
  /** Changes the bounding rectangle for the selected */
  def setTextRectangle(boundingRectangle: FlashRectangle): scala.Boolean = js.native
  /** Sets the text selection of the currently selected */
  def setTextSelection(startIndex: scala.Double, endIndex: scala.Double): scala.Boolean = js.native
  /** Inserts a string of text. */
  def setTextString(text: java.lang.String): scala.Boolean = js.native
  def setTextString(text: java.lang.String, startIndex: scala.Double): scala.Boolean = js.native
  def setTextString(text: java.lang.String, startIndex: scala.Double, endIndex: scala.Double): scala.Boolean = js.native
  /** Moves the transformation point of the current */
  def setTransformationPoint(transformationPoint: FlashPoint): scala.Unit = js.native
  /** Skews the selection by a specified amount. */
  def skewSelection(xSkew: scala.Double, ySkew: scala.Double): scala.Unit = js.native
  def skewSelection(xSkew: scala.Double, ySkew: scala.Double, whichEdge: java.lang.String): scala.Unit = js.native
  /** Smooths the curve of each selected fill outline or */
  def smoothSelection(): scala.Unit = js.native
  /** Spaces the objects in the selection evenly. */
  def space(direction: java.lang.String): scala.Unit = js.native
  def space(direction: java.lang.String, bUseDocumentBounds: scala.Boolean): scala.Unit = js.native
  /** Straightens the currently selected strokes; */
  def straightenSelection(): scala.Unit = js.native
  /** Swaps the current selection with the specified */
  def swapElement(name: java.lang.String): scala.Unit = js.native
  /** Swaps the Stroke and Fill colors. */
  def swapStrokeAndFill(): scala.Unit = js.native
  //synchronizeWithHeadVersion(); // Synchronizes the specified document with the
  /** Executes a Test Movie operation on the */
  def testMovie(): scala.Unit = js.native
  /** Executes a Test Scene operation on the current */
  def testScene(): scala.Unit = js.native
  /** Performs a trace bitmap on the current selection; */
  def traceBitmap(
    threshold: scala.Double,
    minimumArea: scala.Double,
    curveFit: java.lang.String,
    cornerThreshold: java.lang.String
  ): scala.Unit = js.native
  def transformSelection(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double): scala.Unit = js.native
   // Performs a general transformation on the current
  def unGroup(): scala.Unit = js.native
   // Ungroups the current selection.
  def union(): scala.Unit = js.native
   // Combines all selected shapes into a drawing
  def unlockAllElements(): scala.Unit = js.native
   // Unlocks all locked elements on the currently
  def xmlPanel(fileURI: java.lang.String): js.Any = js.native
}

