package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashDocument extends js.Object {
  
   // Posts a XMLUI dialog box.
  var accName: String = js.native
  
  // "integer", "integerArray", "double", "doubleArray", "string", and "byteArray"
  def addDataToDocument(name: String, `type`: String, data: js.Any): Unit = js.native
  
   // Stores specified data with a document.
  def addDataToSelection(name: String, `type`: String, data: js.Any): Unit = js.native
  
   // Stores specified data with the selected object(s).
  def addFilter(filterName: String): Unit = js.native
  
   // Applies a filter to the selected objects.
  def addItem(position: FlashPoint, item: FlashItem): Boolean = js.native
  
   // Adds an item from any open document or library
  def addNewLine(startPoint: FlashPoint, endpoint: FlashPoint): Unit = js.native
  
   // Adds a new path between two points.
  def addNewOval(boundingRectangle: FlashRectangle): Unit = js.native
  def addNewOval(
    boundingRectangle: FlashRectangle,
    bSuppressFill: js.UndefOr[scala.Nothing],
    bSuppressStroke: Boolean
  ): Unit = js.native
  def addNewOval(boundingRectangle: FlashRectangle, bSuppressFill: Boolean): Unit = js.native
  def addNewOval(boundingRectangle: FlashRectangle, bSuppressFill: Boolean, bSuppressStroke: Boolean): Unit = js.native
  
   // Adds a new Oval object in the specified
  def addNewPrimitiveOval(boundingRectangle: FlashRectangle): Unit = js.native
  def addNewPrimitiveOval(
    boundingRectangle: FlashRectangle,
    bSpupressFill: js.UndefOr[scala.Nothing],
    bSuppressStroke: Boolean
  ): Unit = js.native
  def addNewPrimitiveOval(boundingRectangle: FlashRectangle, bSpupressFill: Boolean): Unit = js.native
  def addNewPrimitiveOval(boundingRectangle: FlashRectangle, bSpupressFill: Boolean, bSuppressStroke: Boolean): Unit = js.native
  
   // Adds a new rectangle or rounded rectangle,
  def addNewPrimitiveRectangle(boundingRectangle: FlashRectangle, roundness: Double): js.Any = js.native
  def addNewPrimitiveRectangle(
    boundingRectangle: FlashRectangle,
    roundness: Double,
    bSuppressFill: js.UndefOr[scala.Nothing],
    bSuppressStroke: Boolean
  ): js.Any = js.native
  def addNewPrimitiveRectangle(boundingRectangle: FlashRectangle, roundness: Double, bSuppressFill: Boolean): js.Any = js.native
  def addNewPrimitiveRectangle(
    boundingRectangle: FlashRectangle,
    roundness: Double,
    bSuppressFill: Boolean,
    bSuppressStroke: Boolean
  ): js.Any = js.native
  
   // Adds a new rectangle or rounded rectangle,
  def addNewPublishProfile(): Unit = js.native
  def addNewPublishProfile(profileName: String): Unit = js.native
  
  def addNewRectangle(boundingRectangle: FlashRectangle, roundness: Double): js.Any = js.native
  def addNewRectangle(
    boundingRectangle: FlashRectangle,
    roundness: Double,
    bSuppressFill: js.UndefOr[scala.Nothing],
    bSuppressStroke: Boolean
  ): js.Any = js.native
  def addNewRectangle(boundingRectangle: FlashRectangle, roundness: Double, bSuppressFill: Boolean): js.Any = js.native
  def addNewRectangle(
    boundingRectangle: FlashRectangle,
    roundness: Double,
    bSuppressFill: Boolean,
    bSuppressStroke: Boolean
  ): js.Any = js.native
  
  def addNewScene(name: String): Boolean = js.native
  
   // Adds a new scene (Timeline object) as the next
  def addNewText(boundingRectangle: FlashRectangle): Unit = js.native
  def addNewText(boundingRectangle: FlashRectangle, text: String): Unit = js.native
  
   // Inserts a new empty text field.
  def align(alignmode: String): js.Any = js.native
  def align(alignmode: String, bUseDocumentBounds: Boolean): js.Any = js.native
  
   // Aligns the selection.
  def allowScreens(): Unit = js.native
  
   // Use this method before using the
  /** Arranges the selection on the Stage. "back", "backward", "forward", and "front" */
  def arrange(arrangeMode: String): Unit = js.native
  
   // A string that is equivalent to the Name field in the
  var as3AutoDeclare: Boolean = js.native
  
   // A Boolean value that describes whether the
  var as3Dialect: String = js.native
  
   // A string that describes the ActionScript 3.0
  var as3ExportFrame: Double = js.native
  
   // An integer that specifies in which frame to export
  var as3StrictMode: Boolean = js.native
  
   // A Boolean value that specifies whether the
  var as3WarningsMode: Boolean = js.native
  
   // A Boolean value that specifies whether the
  var asVersion: Double = js.native
  
   // An integer that specifies which version of
  var autoLabel: Boolean = js.native
  
   // A Boolean value that is equivalent to the Auto
  var backgroundColor: js.Any = js.native
  
  /** Performs a break-apart operation on the current */
  def breakApart(): Unit = js.native
  
  /** Indicates whether the Edit Symbols menu and */
  def canEditSymbol(): Boolean = js.native
  
  /** Determines whether you can use the */
  def canRevert(): Boolean = js.native
  
  ///** Determines whether a version of the specified */
  //canSaveAVersion(): boolean;
  /** Determines whether you can use the */
  def canTestMovie(): Boolean = js.native
  
  /** Determines whether you can use the */
  def canTestScene(): Boolean = js.native
  
  /** Changes the index of the filter in the Filter list. */
  def changeFilterOrder(oldIndex: Double, newIndex: Double): Unit = js.native
  
  /** Copies the current selection from the document */
  def clipCopy(): Unit = js.native
  
  /** Cuts the current selection from the document */
  def clipCut(): Unit = js.native
  
  /** Pastes the contents of the Clipboard into the document. */
  def clipPaste(): Unit = js.native
  def clipPaste(bInPlace: Boolean): Unit = js.native
  
  /** Closes the specified document. */
  def close(): Unit = js.native
  def close(bPromptToSaveChanges: Boolean): Unit = js.native
  
  /** Converts lines to fills on the selected objects. */
  def convertLinesToFills(): Unit = js.native
  
  /** Converts the selected Stage item(s) to a new */
  def convertToSymbol(`type`: String, name: String, registrationPoint: String): FlashSymbolInstance = js.native
  
  /** Uses the top selected drawing object to crop all */
  def crop(): Unit = js.native
  
   // A string, hexadecimal value, or integer that
  var currentPublishProfile: String = js.native
  
   // A string that specifies the name of the active
  var currentTimeline: FlashTimeline = js.native
  
  /** Method; Invokes the Debug Movie command on the document. */
  def debugMovie(): Unit = js.native
  def debugMovie(abortIfErrorsExist: Boolean): Unit = js.native
  
  /** Deletes the envelope (bounding box that */
  def deleteEnvelope(): Boolean = js.native
  
  /** Deletes the currently active profile, if there is */
  def deletePublishProfile(): Boolean = js.native
  
  /** Deletes the current scene (Timeline object), and */
  def deleteScene(): Boolean = js.native
  
  /** Deletes the current selection on the Stage. */
  def deleteSelection(): Unit = js.native
  
   // An integer that specifies the index of the active
  var description: String = js.native
  
  /** Disables all filters on the selected objects. */
  def disableAllFilters(): Unit = js.native
  
  /** Disables the specified filter in the Filters list. */
  def disableFilter(filterIndex: Double): Unit = js.native
  
  /** Disables all filters except the one at the specified */
  def disableOtherFilters(enabledFilterIndex: Double): Unit = js.native
  
  /** Distributes the selection. */
  def distribute(distributemode: String): Unit = js.native
  def distribute(distributemode: String, bUseDocumentBounds: Boolean): Unit = js.native
  
  /** Performs a distribute-to-layers operation on the */
  def distributeToLayers(): Unit = js.native
  
  /** Checks the document for persistent data with the */
  def documentHasData(name: String): Boolean = js.native
  
  /** Duplicates the currently active profile and gives */
  def duplicatePublishProfile(): Double = js.native
  def duplicatePublishProfile(profileName: String): Double = js.native
  
  /** Makes a copy of the currently selected scene, */
  def duplicateScene(): Boolean = js.native
  
  /** Duplicates the selection on the Stage. */
  def duplicateSelection(): Unit = js.native
  
  /** Makes the specified scene the currently selected */
  def editScene(index: Double): Unit = js.native
  
  /** Enables all the filters on the Filters list for the */
  def enableAllFilters(): Unit = js.native
  
  /** Enables the specified filter for the selected */
  def enableFilter(filterIndex: Double): Unit = js.native
  
  /** Switches the authoring tool into the editing mode */
  def enterEditMode(): Unit = js.native
  def enterEditMode(editMode: String): Unit = js.native
  
  /** Exits from symbol-editing mode and returns */
  def exitEditMode(): Unit = js.native
  
  /** Exports the document as one or more PNG files. */
  def exportPNG(fileURI: String): Boolean = js.native
  def exportPNG(fileURI: String, bCurrentPNGSettings: js.UndefOr[scala.Nothing], bCurrentFrame: Boolean): Boolean = js.native
  def exportPNG(fileURI: String, bCurrentPNGSettings: Boolean): Boolean = js.native
  def exportPNG(fileURI: String, bCurrentPNGSettings: Boolean, bCurrentFrame: Boolean): Boolean = js.native
  
  /** Exports the currently active profile to an XML */
  def exportPublishProfile(fileURI: String): Unit = js.native
  
  /** returns a string that specifies, in XML format, the specified profile. If you don't pass a value for profileName, the current profile is exported. */
  def exportPublishProfileString(): String = js.native
  def exportPublishProfileString(profileName: String): String = js.native
  
  /** Exports the document in the Flash SWF format. */
  def exportSWF(fileURI: String): Unit = js.native
  def exportSWF(fileURI: String, bCurrentSettings: Boolean): Unit = js.native
  
   // A string that is equivalent to the Description field in
  var forceSimple: Boolean = js.native
  
   // A Boolean value that specifies whether the children
  var frameRate: Double = js.native
  
  /** Identical to retrieving the value of the To Stage */
  def getAlignToDocument(): Boolean = js.native
  
  /** Returns a string that specifies the blending mode */
  def getBlendMode(): String = js.native
  
  /** Retrieves the fill object of the selected shape, or */
  def getCustomFill(): FlashFill = js.native
  def getCustomFill(objectToFill: String): FlashFill = js.native
  
  /** Returns the stroke object of the selected shape, */
  def getCustomStroke(): FlashStroke = js.native
  def getCustomStroke(locationOfStroke: String): FlashStroke = js.native
  
  /** Retrieves the value of the specified data. */
  def getDataFromDocument(name: String): js.Any = js.native
  
  /** Gets the specified Element property for the */
  def getElementProperty(propertyName: String): js.Any = js.native
  
  /** Gets a specified TextAttrs property of the*/
  def getElementTextAttr(attrName: String): FlashTextAttrs = js.native
  def getElementTextAttr(attrName: String, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): FlashTextAttrs = js.native
  def getElementTextAttr(attrName: String, startIndex: Double): FlashTextAttrs = js.native
  def getElementTextAttr(attrName: String, startIndex: Double, endIndex: Double): FlashTextAttrs = js.native
  
  /** Returns an array that contains the list of filters*/
  def getFilters(): js.Array[FlashFilter] = js.native
  
  /** Returns a string containing the XML metadata */
  def getMetadata(): String = js.native
  
  /** returns the mobile XML settings for the document. */
  def getMobileSettings(): String = js.native
  
  /** Returns a string that represents the targeted */
  def getPlayerVersion(): String = js.native
  
  /** Gets the bounding rectangle of the current */
  def getSelectionRect(): FlashRectangle = js.native
  
  /** Gets the currently selected text. */
  def getTextString(): String = js.native
  def getTextString(startIndex: js.UndefOr[scala.Nothing], endIndex: Double): String = js.native
  def getTextString(startIndex: Double): String = js.native
  def getTextString(startIndex: Double, endIndex: Double): String = js.native
  
  /** Retrieves the current Timeline object in the */
  def getTimeline(): FlashTimeline = js.native
  
  /** gets the location of the transformation point of the current selection. You can use the transformation point for commutations such as rotate and skew. */
  def getTransformationPoint(): FlashPoint = js.native
  
  /** Converts the current selection to a group.*/
  def group(): Unit = js.native
  
   // A float value that specifies the number of frames
  var height: Double = js.native
  
   // An integer that specifies the height of the
  var id: Double = js.native
  
  /** Imports a file into the document. */
  def importFile(fileURI: String): Unit = js.native
  def importFile(fileURI: String, importToLibrary: Boolean): Unit = js.native
  
  /** Imports a profile from a file. */
  def importPublishProfile(fileURI: String): Double = js.native
  
  /** imports an XML string that represents a publish profile and sets it as the current profile. To generate an XML string to import, use document.exportPublishProfileString() before using this method. */
  def importPublishProfileString(xmlString: String): Double = js.native
  
  /** Imports a SWF file into the document.*/
  def importSWF(fileURI: String): Unit = js.native
  
  /** creates an intersection drawing object from all selected drawing objects. This method returns false if there are no drawing objects selected, or if any of the selected items are not drawing objects. */
  def intersect(): Boolean = js.native
  
   // A unique integer (assigned automatically) that
  var library: FlashLibrary = js.native
  
   // Read-only; the library object for a document.
  var livePreview: Boolean = js.native
  
  /** loads a cue point XML file. The format and DTD of the XML file is the same as the one imported and exported by the Cue Points Property inspector. The return value is the same as the string serialized in the Cue Point property of the object containing the instance of an FLVPlayback Component. */
  def loadCuepointXML(uri: String): js.Array[_] = js.native
  
  /** Makes the size of the selected objects the same. */
  def `match`(bWidth: Boolean, bHeight: Boolean): Unit = js.native
  def `match`(bWidth: Boolean, bHeight: Boolean, bUseDocumentBounds: Boolean): Unit = js.native
  
  /** Performs a mouse click from the Selection tool. */
  def mouseClick(position: FlashPoint, bToggleSel: Boolean, bShiftSel: Boolean): Unit = js.native
  
  /** Performs a double mouse click from the */
  def mouseDblClk(position: FlashPoint, bAltDown: Boolean, bShiftDown: Boolean, bShiftSelect: Boolean): Unit = js.native
  
  /** If the selection contains at least one path with at */
  def moveSelectedBezierPointsBy(delta: FlashPoint): Unit = js.native
  
  /** Moves selected objects by a specified distance. */
  def moveSelectionBy(distanceToMove: FlashPoint): Unit = js.native
  
   // A Boolean value that specifies if Live Preview is
  var name: String = js.native
  
  /** Optimizes smoothing for the current selection, */
  def optimizeCurves(smoothing: Double, bUseMultiplePasses: Boolean): Unit = js.native
  
   // Read-only; a string that represents the name of a
  var path: String = js.native
  
   // Read-only; a string that represents the path of the
  var pathURI: String = js.native
  
  /** Publishes the document according to the active */
  def publish(): Unit = js.native
  
   // Read-only property; a string that represents the path of the document, expressed as a file:/// URI. If the document has never been saved, this property is undefined.
  var publishProfiles: js.Array[String] = js.native
  
  /** uses the top selected drawing object to punch through all selected drawing objects underneath it. This method returns false if there are no drawing objects selected or if any of the selected items are not drawing objects.  */
  def punch(): Boolean = js.native
  
  /** Removes all filters from the selected object(s).*/
  def removeAllFilters(): Unit = js.native
  
  /** Removes persistent data with the specified*/
  def removeDataFromDocument(name: String): Unit = js.native
  
  /** Removes persistent data with the specified */
  def removeDataFromSelection(name: String): Unit = js.native
  
  /** Removes the specified filter from the Filters list*/
  def removeFilter(filterIndex: Double): Unit = js.native
  
  /** Renames the current profile.*/
  def renamePublishProfile(): Boolean = js.native
  def renamePublishProfile(profileNewName: String): Boolean = js.native
  
  /** Renames the currently selected scene in the */
  def renameScene(name: String): Boolean = js.native
  
  /** Moves the specified scene before another */
  def reorderScene(sceneToMove: Double, sceneToPutItBefore: Double): Unit = js.native
  
  /** Sets all values in the Property inspector to */
  def resetOvalObject(): Unit = js.native
  
  /** Sets all values in the Property inspector to */
  def resetRectangleObject(): Unit = js.native
  
  /** Resets the transformation matrix; equivalent to */
  def resetTransformation(): Unit = js.native
  
  /** Method; reverts the specified document to its previously saved version. This method is equivalent to selecting File > Revert. */
  def revert(): Unit = js.native
  
  ///** Reverts the specified document to the version */
  //revertToLastVersion();
  /** applies a 3D rotation to the selection. This method is available only for movie clips. */
  def rotate3DSelection(xyzCoordinate: FlashPoint3D, bGlobalTransform: Boolean): Unit = js.native
  
  /** Rotates the selection by a specified number of */
  def rotateSelection(angle: Double): Unit = js.native
  def rotateSelection(angle: Double, rotationPoint: String): Unit = js.native
  
  /** Saves the document in its default location;*/
  def save(): Boolean = js.native
  def save(bOkToSaveAs: Boolean): Boolean = js.native
  
  /** saves and compacts the file. This method is equivalent to selecting File > Save and Compact. */
  def saveAndCompact(): Boolean = js.native
  def saveAndCompact(bOkToSaveAs: Boolean): Boolean = js.native
  
  //saveAsVersion(); // Saves a version of the specified document to the
  /** Scales the selection by a specified amount;*/
  def scaleSelection(xScale: Double, yScale: Double): Unit = js.native
  def scaleSelection(xScale: Double, yScale: Double, whichCorner: String): Unit = js.native
  
  /** Selects all items on the Stage; equivalent to*/
  def selectAll(): Unit = js.native
  
  /** Deselects any selected items. */
  def selectNone(): Unit = js.native
  
   // Read-only; an array of the publish profile names for
  /** Read-only; the current ScreenOutline object for the */
  // Not available in CS5
  //screenOutline: FlashScreenOutline;
  /** An array of the selected objects in the document. */
  var selection: js.Array[FlashElement] = js.native
  
  /** Sets the preferences for document.align(),*/
  def setAlignToDocument(): Unit = js.native
  def setAlignToDocument(bToStage: Boolean): Unit = js.native
  
  /** Sets the blending mode for the selected objects.*/
  def setBlendMode(mode: String): Unit = js.native
  
  /** Sets the fill settings for the Tools panel, Property */
  def setCustomFill(fill: FlashFill): Unit = js.native
  
  /** Sets the stroke settings for the Tools panel,*/
  def setCustomStroke(stroke: FlashStroke): Unit = js.native
  
  /** Sets the specified Element property on selected */
  def setElementProperty(property: String, value: Double): Unit = js.native
  
  /** Sets the specified TextAttrs property of the */
  def setElementTextAttr(attrName: String, attrValue: FlashTextAttrs): Boolean = js.native
  def setElementTextAttr(
    attrName: String,
    attrValue: FlashTextAttrs,
    startIndex: js.UndefOr[scala.Nothing],
    endIndex: Double
  ): Boolean = js.native
  def setElementTextAttr(attrName: String, attrValue: FlashTextAttrs, startIndex: Double): Boolean = js.native
  def setElementTextAttr(attrName: String, attrValue: FlashTextAttrs, startIndex: Double, endIndex: Double): Boolean = js.native
  
  /** Changes the fill color of the selection to the */
  def setFillColor(color: js.Any): Unit = js.native
  
  /** Sets a specified filter property for the currently */
  def setFilterProperty(property: String, filterIndex: Double, value: js.Any): Unit = js.native
  
  /** Applies filters to the selected objects .*/
  def setFilters(filterArray: js.Array[FlashFilter]): Unit = js.native
  
  /** Sets the opacity of the instance. */
  def setInstanceAlpha(opacity: Double): Unit = js.native
  
  /** Sets the brightness for the instance. */
  def setInstanceBrightness(brightness: Double): Unit = js.native
  
  /** Sets the tint for the instance.*/
  def setInstanceTint(color: js.Any, strength: Double): Unit = js.native
  
  /** Sets the XML metadata for the specified */
  def setMetadata(strMetadata: String): Boolean = js.native
  
  /** Sets the value of an XML settings string in a */
  def setMobileSettings(xmlString: String): Boolean = js.native
  
  /** Specifies a value for a specified property of*/
  def setOvalObjectProperty(propertyName: String, value: js.Any): Unit = js.native
  
  /** Sets the version of the Flash Player targeted by*/
  def setPlayerVersion(version: String): Boolean = js.native
  
  /** Specifies a value for a specified property of*/
  def setRectangleObjectProperty(propertyName: String, value: js.Any): Unit = js.native
  
  /** Moves and resizes the selection in a single */
  def setSelectionBounds(boundingRectangle: FlashRectangle): Unit = js.native
  def setSelectionBounds(boundingRectangle: FlashRectangle, bContactSensitiveSelection: Boolean): Unit = js.native
  
  /** Draws a rectangular selection marquee relative */
  def setSelectionRect(rect: FlashRectangle): Unit = js.native
  def setSelectionRect(
    rect: FlashRectangle,
    bReplaceCurrentSelection: js.UndefOr[scala.Nothing],
    bContactSensitiveSelection: Boolean
  ): Unit = js.native
  def setSelectionRect(rect: FlashRectangle, bReplaceCurrentSelection: Boolean): Unit = js.native
  def setSelectionRect(rect: FlashRectangle, bReplaceCurrentSelection: Boolean, bContactSensitiveSelection: Boolean): Unit = js.native
  
  /** Specifies the vanishing point for viewing 3D objects. */
  def setStageVanishingPoint(point: FlashPoint): Unit = js.native
  
  def setStageViewAngle(angle: Double): Unit = js.native
  
  /** Sets the color, width, and style of the selected */
  def setStroke(color: js.Any, size: Double, strokeType: String): Unit = js.native
  
  /** Changes the stroke color of the selection to the*/
  def setStrokeColor(color: js.Any): Unit = js.native
  
  /** Changes the stroke size of the selection to the*/
  def setStrokeSize(size: Double): Unit = js.native
  
  /** Changes the stroke style of the selection to the */
  def setStrokeStyle(strokeType: String): Unit = js.native
  
  /** Changes the bounding rectangle for the selected */
  def setTextRectangle(boundingRectangle: FlashRectangle): Boolean = js.native
  
  /** Sets the text selection of the currently selected */
  def setTextSelection(startIndex: Double, endIndex: Double): Boolean = js.native
  
  /** Inserts a string of text. */
  def setTextString(text: String): Boolean = js.native
  def setTextString(text: String, startIndex: js.UndefOr[scala.Nothing], endIndex: Double): Boolean = js.native
  def setTextString(text: String, startIndex: Double): Boolean = js.native
  def setTextString(text: String, startIndex: Double, endIndex: Double): Boolean = js.native
  
  /** Moves the transformation point of the current */
  def setTransformationPoint(transformationPoint: FlashPoint): Unit = js.native
  
  /** A Boolean value that specifies whether the object */
  var silent: Boolean = js.native
  
  /** Skews the selection by a specified amount. */
  def skewSelection(xSkew: Double, ySkew: Double): Unit = js.native
  def skewSelection(xSkew: Double, ySkew: Double, whichEdge: String): Unit = js.native
  
  /** Smooths the curve of each selected fill outline or */
  def smoothSelection(): Unit = js.native
  
  /** Spaces the objects in the selection evenly. */
  def space(direction: String): Unit = js.native
  def space(direction: String, bUseDocumentBounds: Boolean): Unit = js.native
  
  /** Straightens the currently selected strokes; */
  def straightenSelection(): Unit = js.native
  
  /** Swaps the current selection with the specified */
  def swapElement(name: String): Unit = js.native
  
  /** Swaps the Stroke and Fill colors. */
  def swapStrokeAndFill(): Unit = js.native
  
  //synchronizeWithHeadVersion(); // Synchronizes the specified document with the
  /** Executes a Test Movie operation on the */
  def testMovie(): Unit = js.native
  
  /** Executes a Test Scene operation on the current */
  def testScene(): Unit = js.native
  
  /** Read-only; an array of Timeline objects (see */
  var timelines: js.Array[FlashTimeline] = js.native
  
  /** Performs a trace bitmap on the current selection; */
  def traceBitmap(threshold: Double, minimumArea: Double, curveFit: String, cornerThreshold: String): Unit = js.native
  
  def transformSelection(a: Double, b: Double, c: Double, d: Double): Unit = js.native
  
   // Performs a general transformation on the current
  def unGroup(): Unit = js.native
  
   // Ungroups the current selection.
  def union(): Unit = js.native
  
   // Combines all selected shapes into a drawing
  def unlockAllElements(): Unit = js.native
  
  /** Read-only; a Matrix object. */
  var viewMatrix: FlashMatrix = js.native
  
  /** An integer that specifies the width of the document */
  var width: Double = js.native
  
   // Unlocks all locked elements on the currently
  def xmlPanel(fileURI: String): js.Any = js.native
  
  /** Specifies the zoom percent of the Stage at author */
  var zoomFactor: Double = js.native
}
