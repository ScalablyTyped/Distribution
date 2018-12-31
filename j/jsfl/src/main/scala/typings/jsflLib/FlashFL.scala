package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashFL extends js.Object {
  var Math: FlashMath = js.native
  var actionsPanel: FlashActionsPanel = js.native
  //activeEffect;
  var as3PackagePaths: java.lang.String = js.native
  var compilerErrors: FlashCompilerErrors = js.native
  var componentsPanel: FlashComponentsPanel = js.native
  var configDirectory: java.lang.String = js.native
  var configURI: java.lang.String = js.native
  var contactSensitiveSelection: scala.Boolean = js.native
  var createNewDocList: js.Array[java.lang.String] = js.native
  var createNewDocListType: js.Array[java.lang.String] = js.native
  var createNewTemplateList: js.Array[java.lang.String] = js.native
  var documents: js.Array[FlashDocument] = js.native
  var drawingLayer: FlashDrawingLayer = js.native
  //effects;
  var externalLibraryPath: java.lang.String = js.native
  var flexSDKPath: java.lang.String = js.native
  var installedPlayers: js.Array[_] = js.native
  var languageCode: java.lang.String = js.native
  var libraryPath: java.lang.String = js.native
  var mruRecentFileList: js.Array[java.lang.String] = js.native
  var mruRecentFileListType: js.Array[java.lang.String] = js.native
  var objectDrawingMode: scala.Double = js.native
  var outputPanel: FlashOutputPanel = js.native
  var packagePaths: js.Array[java.lang.String] = js.native
  var presetPanel: FlashPresetPanel = js.native
  var publishCacheDiskSizeMax: scala.Double = js.native
  var publishCacheEnabled: scala.Boolean = js.native
  var publishCacheMemoryEntrySizeLimit: scala.Double = js.native
  var publishCacheMemorySizeMax: scala.Double = js.native
  var scriptURI: java.lang.String = js.native
  var sourcePath: java.lang.String = js.native
  var swfPanels: js.Array[FlashSwfPanel] = js.native
  var tools: js.Array[FlashTools] = js.native
  var version: java.lang.String = js.native
  var xmlui: FlashXMLUI = js.native
  def addEventListener(eventType: js.Any, callbackFunction: js.Any): js.Any = js.native
  def browseForFileURL(browseType: js.Any): js.Any = js.native
  def browseForFileURL(browseType: js.Any, title: js.Any): js.Any = js.native
  def browseForFileURL(browseType: js.Any, title: js.Any, previewArea: js.Any): js.Any = js.native
  def browseForFileURL(browseType: js.Any, title: js.Any, previewArea: js.Any, fileFilter: js.Any): js.Any = js.native
  def browseForFolderURL(description: java.lang.String): js.Any = js.native
  def clearPublishCache(): scala.Unit = js.native
  def clipCopyString(string: java.lang.String): scala.Unit = js.native
  def closeAll(): scala.Unit = js.native
  def closeAll(bPromptToSave: scala.Boolean): scala.Unit = js.native
  def closeAllPlayerDocuments(): scala.Boolean = js.native
  def closeDocument(documentObject: FlashDocument): js.Any = js.native
  def closeDocument(documentObject: FlashDocument, bPromptToSaveChanges: scala.Boolean): js.Any = js.native
  //closeProject();
  /** A string that specifies the type of document to create. Acceptable values are "timeline", "presentation", and "application". The default value is "timeline", which has the same effect as choosing File > New > Flash File (ActionScript 3.0). This parameter is optional. */
  def createDocument(): FlashDocument = js.native
  def createDocument(document: java.lang.String): FlashDocument = js.native
  def exportPublishProfileString(ucfURI: java.lang.String, profileName: java.lang.String): java.lang.String = js.native
  //createProject();
  //downloadLatestVersion(); // Not in CS5
  //enableImmediateUpdates();
  def fileExists(fileURI: java.lang.String): scala.Boolean = js.native
  def findDocumentDOM(id: scala.Double): FlashDocument = js.native
  def findDocumentIndex(name: java.lang.String): js.Array[scala.Double] = js.native
  def findObjectInDocByName(instanceName: java.lang.String, document: FlashDocument): js.Array[Anon_Layer] = js.native
  /** elementType = "shape", "text", "instance", or "shapeObj". */
  def findObjectInDocByType(elementType: java.lang.String, document: FlashDocument): js.Array[_] = js.native
  def getAppMemoryInfo(memType: scala.Double): js.Any = js.native
  /*
  	 * Method; retrieves the DOM (Document object) of the currently active document (FLA file).
  	 * If one or more documents are open but a document does not currently have focus (for
  	 * example, if a JSFL file has focus), retrieves the DOM of the most recently active document.
  	 * getDocumentDOM(): Document;
  	 */
  def getDocumentDOM(): FlashDocument = js.native
  //getProject();
  def getSwfPanel(): js.Any = js.native
  def isFontInstalled(): js.Any = js.native
  def mapPlayerURL(URI: java.lang.String): java.lang.String = js.native
  def mapPlayerURL(URI: java.lang.String, returnMBCS: scala.Boolean): java.lang.String = js.native
  /** Method; opens a Flash document (FLA file) for editing in a new Flash Document window and gives it focus. For a user, the effect is the same as selecting File > Open and then selecting a file. If the specified file is already open, the window that contains the document comes to the front. The window that contains the specified file becomes the currently selected document. */
  def openDocument(fileURI: java.lang.String): FlashDocument = js.native
  //openProject();
  def openScript(fileURI: java.lang.String): scala.Unit = js.native
  def openScript(fileURI: java.lang.String, createExtension: java.lang.String): scala.Unit = js.native
  def openScript(fileURI: java.lang.String, createExtension: java.lang.String, className: java.lang.String): scala.Unit = js.native
  def quit(): scala.Unit = js.native
  def quit(bPromptIfNeeded: scala.Boolean): scala.Unit = js.native
  //reloadEffects(): void;
  def reloadTools(): scala.Unit = js.native
  /** documentNew", "documentOpened", "documentClosed", "mouseMove", "documentChanged", "layerChanged", and "frameChanged". */
  def removeEventListener(eventType: java.lang.String): scala.Boolean = js.native
  def resetAS3PackagePaths(): scala.Unit = js.native
  def resetPackagePaths(): scala.Unit = js.native
  def revertDocument(document: FlashDocument): scala.Unit = js.native
  //revertDocumentToLastVersion();
  def runScript(fileURI: java.lang.String): js.Any = js.native
  def runScript(fileURI: java.lang.String, funcName: js.Function): js.Any = js.native
  def runScript(fileURI: java.lang.String, funcName: js.Function, args: js.Array[_]): js.Any = js.native
  def saveAll(): scala.Unit = js.native
  //saveVersionOfDocument();
  def saveDocument(document: FlashDocument): scala.Boolean = js.native
  def saveDocument(document: FlashDocument, fileURI: java.lang.String): scala.Boolean = js.native
  def saveDocumentAs(document: FlashDocument): scala.Boolean = js.native
  def selectActiveWindow(document: FlashDocument): scala.Unit = js.native
  def selectActiveWindow(document: FlashDocument, bActivateFrame: scala.Boolean): scala.Unit = js.native
  /** Method; enables selection or editing of an element. Generally, you will use this method on objects returned by fl.findObjectInDocByName() or fl.findObjectInDocByType(). */
  def selectElement(elementObject: FlashElement, editMode: scala.Boolean): scala.Boolean = js.native
  /** "arrow","bezierSelect","freeXform","fillXform","lasso","pen","penplus","penminus","penmodify","text","line","rect","oval","rectPrimitive","ovalPrimitive","polystar","pencil","brush","inkBottle","bucket","eyeDropper","eraser","hand", and "magnifier". */
  def selectTool(toolName: java.lang.String): scala.Unit = js.native
  def showIdleMessage(show: scala.Boolean): scala.Unit = js.native
  def toggleBreakpoint(): js.Any = js.native
  //synchronizeDocumentWithHeadVersion();
  def trace(message: js.Any): scala.Unit = js.native
}

