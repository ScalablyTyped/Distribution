package typings.jsfl

import typings.jsfl.anon.Keyframe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashFL extends js.Object {
  
  var Math: FlashMath = js.native
  
  var actionsPanel: FlashActionsPanel = js.native
  
  def addEventListener(eventType: js.Any, callbackFunction: js.Any): js.Any = js.native
  
  //activeEffect;
  var as3PackagePaths: String = js.native
  
  def browseForFileURL(browseType: js.Any, title: js.Any, previewArea: js.Any, fileFilter: js.Any): js.Any = js.native
  
  def browseForFolderURL(description: String): js.Any = js.native
  
  def clearPublishCache(): Unit = js.native
  
  def clipCopyString(string: String): Unit = js.native
  
  def closeAll(): Unit = js.native
  def closeAll(bPromptToSave: Boolean): Unit = js.native
  
  def closeAllPlayerDocuments(): Boolean = js.native
  
  def closeDocument(documentObject: FlashDocument): js.Any = js.native
  def closeDocument(documentObject: FlashDocument, bPromptToSaveChanges: Boolean): js.Any = js.native
  
  var compilerErrors: FlashCompilerErrors = js.native
  
  var componentsPanel: FlashComponentsPanel = js.native
  
  var configDirectory: String = js.native
  
  var configURI: String = js.native
  
  var contactSensitiveSelection: Boolean = js.native
  
  //closeProject();
  /** A string that specifies the type of document to create. Acceptable values are "timeline", "presentation", and "application". The default value is "timeline", which has the same effect as choosing File > New > Flash File (ActionScript 3.0). This parameter is optional. */
  def createDocument(): FlashDocument = js.native
  def createDocument(document: String): FlashDocument = js.native
  
  var createNewDocList: js.Array[String] = js.native
  
  var createNewDocListType: js.Array[String] = js.native
  
  var createNewTemplateList: js.Array[String] = js.native
  
  var documents: js.Array[FlashDocument] = js.native
  
  var drawingLayer: FlashDrawingLayer = js.native
  
  def exportPublishProfileString(ucfURI: String, profileName: String): String = js.native
  
  //effects;
  var externalLibraryPath: String = js.native
  
  //createProject();
  //downloadLatestVersion(); // Not in CS5
  //enableImmediateUpdates();
  def fileExists(fileURI: String): Boolean = js.native
  
  def findDocumentDOM(id: Double): FlashDocument = js.native
  
  def findDocumentIndex(name: String): js.Array[Double] = js.native
  
  def findObjectInDocByName(instanceName: String, document: FlashDocument): js.Array[Keyframe] = js.native
  
  /** elementType = "shape", "text", "instance", or "shapeObj". */
  def findObjectInDocByType(elementType: String, document: FlashDocument): js.Array[_] = js.native
  
  var flexSDKPath: String = js.native
  
  def getAppMemoryInfo(memType: Double): js.Any = js.native
  
  /*
    * Method; retrieves the DOM (Document object) of the currently active document (FLA file).
    * If one or more documents are open but a document does not currently have focus (for
    * example, if a JSFL file has focus), retrieves the DOM of the most recently active document.
    * getDocumentDOM(): Document;
    */
  def getDocumentDOM(): FlashDocument = js.native
  
  //getProject();
  def getSwfPanel(): js.Any = js.native
  
  var installedPlayers: js.Array[_] = js.native
  
  def isFontInstalled(): js.Any = js.native
  
  var languageCode: String = js.native
  
  var libraryPath: String = js.native
  
  def mapPlayerURL(URI: String): String = js.native
  def mapPlayerURL(URI: String, returnMBCS: Boolean): String = js.native
  
  var mruRecentFileList: js.Array[String] = js.native
  
  var mruRecentFileListType: js.Array[String] = js.native
  
  var objectDrawingMode: Double = js.native
  
  /** Method; opens a Flash document (FLA file) for editing in a new Flash Document window and gives it focus. For a user, the effect is the same as selecting File > Open and then selecting a file. If the specified file is already open, the window that contains the document comes to the front. The window that contains the specified file becomes the currently selected document. */
  def openDocument(fileURI: String): FlashDocument = js.native
  
  //openProject();
  def openScript(fileURI: String): Unit = js.native
  def openScript(fileURI: String, createExtension: js.UndefOr[scala.Nothing], className: String): Unit = js.native
  def openScript(fileURI: String, createExtension: String): Unit = js.native
  def openScript(fileURI: String, createExtension: String, className: String): Unit = js.native
  
  var outputPanel: FlashOutputPanel = js.native
  
  var packagePaths: js.Array[String] = js.native
  
  var presetPanel: FlashPresetPanel = js.native
  
  var publishCacheDiskSizeMax: Double = js.native
  
  var publishCacheEnabled: Boolean = js.native
  
  var publishCacheMemoryEntrySizeLimit: Double = js.native
  
  var publishCacheMemorySizeMax: Double = js.native
  
  def quit(): Unit = js.native
  def quit(bPromptIfNeeded: Boolean): Unit = js.native
  
  //reloadEffects(): void;
  def reloadTools(): Unit = js.native
  
  /** documentNew", "documentOpened", "documentClosed", "mouseMove", "documentChanged", "layerChanged", and "frameChanged". */
  def removeEventListener(eventType: String): Boolean = js.native
  
  def resetAS3PackagePaths(): Unit = js.native
  
  def resetPackagePaths(): Unit = js.native
  
  def revertDocument(document: FlashDocument): Unit = js.native
  
  //revertDocumentToLastVersion();
  def runScript(fileURI: String): js.Any = js.native
  def runScript(fileURI: String, funcName: js.UndefOr[scala.Nothing], args: js.Array[_]): js.Any = js.native
  def runScript(fileURI: String, funcName: js.Function): js.Any = js.native
  def runScript(fileURI: String, funcName: js.Function, args: js.Array[_]): js.Any = js.native
  
  def saveAll(): Unit = js.native
  
  //saveVersionOfDocument();
  def saveDocument(document: FlashDocument): Boolean = js.native
  def saveDocument(document: FlashDocument, fileURI: String): Boolean = js.native
  
  def saveDocumentAs(document: FlashDocument): Boolean = js.native
  
  var scriptURI: String = js.native
  
  def selectActiveWindow(document: FlashDocument): Unit = js.native
  def selectActiveWindow(document: FlashDocument, bActivateFrame: Boolean): Unit = js.native
  
  /** Method; enables selection or editing of an element. Generally, you will use this method on objects returned by fl.findObjectInDocByName() or fl.findObjectInDocByType(). */
  def selectElement(elementObject: FlashElement, editMode: Boolean): Boolean = js.native
  
  /** "arrow","bezierSelect","freeXform","fillXform","lasso","pen","penplus","penminus","penmodify","text","line","rect","oval","rectPrimitive","ovalPrimitive","polystar","pencil","brush","inkBottle","bucket","eyeDropper","eraser","hand", and "magnifier". */
  def selectTool(toolName: String): Unit = js.native
  
  def showIdleMessage(show: Boolean): Unit = js.native
  
  var sourcePath: String = js.native
  
  var swfPanels: js.Array[FlashSwfPanel] = js.native
  
  def toggleBreakpoint(): js.Any = js.native
  
  var tools: js.Array[FlashTools] = js.native
  
  //synchronizeDocumentWithHeadVersion();
  def trace(message: js.Any): Unit = js.native
  
  var version: String = js.native
  
  var xmlui: FlashXMLUI = js.native
}
