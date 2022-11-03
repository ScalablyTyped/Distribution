package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.Thenable
import typings.vscode.anon.Content
import typings.vscode.anon.IsCaseSensitive
import typings.vscode.anon.Name
import typings.vscode.mod.CancellationToken
import typings.vscode.mod.ConfigurationChangeEvent
import typings.vscode.mod.ConfigurationScope
import typings.vscode.mod.Event
import typings.vscode.mod.FileCreateEvent
import typings.vscode.mod.FileDeleteEvent
import typings.vscode.mod.FileRenameEvent
import typings.vscode.mod.FileSystem
import typings.vscode.mod.FileSystemProvider
import typings.vscode.mod.FileSystemWatcher
import typings.vscode.mod.FileWillCreateEvent
import typings.vscode.mod.FileWillDeleteEvent
import typings.vscode.mod.FileWillRenameEvent
import typings.vscode.mod.GlobPattern
import typings.vscode.mod.NotebookDocument
import typings.vscode.mod.NotebookDocumentChangeEvent
import typings.vscode.mod.NotebookDocumentContentOptions
import typings.vscode.mod.NotebookSerializer
import typings.vscode.mod.TaskProvider
import typings.vscode.mod.TextDocument
import typings.vscode.mod.TextDocumentChangeEvent
import typings.vscode.mod.TextDocumentContentProvider
import typings.vscode.mod.TextDocumentWillSaveEvent
import typings.vscode.mod.WorkspaceConfiguration
import typings.vscode.mod.WorkspaceEditMetadata
import typings.vscode.mod.WorkspaceFolder
import typings.vscode.mod.WorkspaceFoldersChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspace {
  
  @JSGlobal("vscode.workspace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyEdit(edit: typings.vscode.mod.WorkspaceEdit): Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyEdit")(edit.asInstanceOf[js.Any]).asInstanceOf[Thenable[Boolean]]
  inline def applyEdit(edit: typings.vscode.mod.WorkspaceEdit, metadata: WorkspaceEditMetadata): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEdit")(edit.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  
  inline def asRelativePath(pathOrUri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asRelativePath")(pathOrUri.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asRelativePath(pathOrUri: String, includeWorkspaceFolder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asRelativePath")(pathOrUri.asInstanceOf[js.Any], includeWorkspaceFolder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def asRelativePath(pathOrUri: typings.vscode.mod.Uri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asRelativePath")(pathOrUri.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asRelativePath(pathOrUri: typings.vscode.mod.Uri, includeWorkspaceFolder: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asRelativePath")(pathOrUri.asInstanceOf[js.Any], includeWorkspaceFolder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createFileSystemWatcher(globPattern: GlobPattern): FileSystemWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any]).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Boolean, ignoreChangeEvents: Boolean): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any], ignoreChangeEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Boolean,
    ignoreChangeEvents: Boolean,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any], ignoreChangeEvents.asInstanceOf[js.Any], ignoreDeleteEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Boolean,
    ignoreChangeEvents: Unit,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any], ignoreChangeEvents.asInstanceOf[js.Any], ignoreDeleteEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(globPattern: GlobPattern, ignoreCreateEvents: Unit, ignoreChangeEvents: Boolean): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any], ignoreChangeEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Unit,
    ignoreChangeEvents: Boolean,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any], ignoreChangeEvents.asInstanceOf[js.Any], ignoreDeleteEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  inline def createFileSystemWatcher(
    globPattern: GlobPattern,
    ignoreCreateEvents: Unit,
    ignoreChangeEvents: Unit,
    ignoreDeleteEvents: Boolean
  ): FileSystemWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystemWatcher")(globPattern.asInstanceOf[js.Any], ignoreCreateEvents.asInstanceOf[js.Any], ignoreChangeEvents.asInstanceOf[js.Any], ignoreDeleteEvents.asInstanceOf[js.Any])).asInstanceOf[FileSystemWatcher]
  
  inline def findFiles(include: GlobPattern): Thenable[js.Array[typings.vscode.mod.Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: Null, maxResults: Double): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: Null, maxResults: Double, token: CancellationToken): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: Null, maxResults: Unit, token: CancellationToken): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: Unit, maxResults: Double): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: Unit, maxResults: Double, token: CancellationToken): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: Unit, maxResults: Unit, token: CancellationToken): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: GlobPattern): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: GlobPattern, maxResults: Double): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: GlobPattern, maxResults: Double, token: CancellationToken): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  inline def findFiles(include: GlobPattern, exclude: GlobPattern, maxResults: Unit, token: CancellationToken): Thenable[js.Array[typings.vscode.mod.Uri]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], maxResults.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.Array[typings.vscode.mod.Uri]]]
  
  @JSGlobal("vscode.workspace.fs")
  @js.native
  val fs: FileSystem = js.native
  
  inline def getConfiguration(): WorkspaceConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")().asInstanceOf[WorkspaceConfiguration]
  inline def getConfiguration(section: String): WorkspaceConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(section.asInstanceOf[js.Any]).asInstanceOf[WorkspaceConfiguration]
  inline def getConfiguration(section: String, scope: ConfigurationScope): WorkspaceConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(section.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[WorkspaceConfiguration]
  inline def getConfiguration(section: Unit, scope: ConfigurationScope): WorkspaceConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfiguration")(section.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[WorkspaceConfiguration]
  
  inline def getWorkspaceFolder(uri: typings.vscode.mod.Uri): js.UndefOr[WorkspaceFolder] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspaceFolder")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WorkspaceFolder]]
  
  @JSGlobal("vscode.workspace.isTrusted")
  @js.native
  val isTrusted: Boolean = js.native
  
  @JSGlobal("vscode.workspace.name")
  @js.native
  val name: js.UndefOr[String] = js.native
  
  @JSGlobal("vscode.workspace.notebookDocuments")
  @js.native
  val notebookDocuments: js.Array[NotebookDocument] = js.native
  
  @JSGlobal("vscode.workspace.onDidChangeConfiguration")
  @js.native
  val onDidChangeConfiguration: Event[ConfigurationChangeEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidChangeNotebookDocument")
  @js.native
  val onDidChangeNotebookDocument: Event[NotebookDocumentChangeEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidChangeTextDocument")
  @js.native
  val onDidChangeTextDocument: Event[TextDocumentChangeEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidChangeWorkspaceFolders")
  @js.native
  val onDidChangeWorkspaceFolders: Event[WorkspaceFoldersChangeEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidCloseNotebookDocument")
  @js.native
  val onDidCloseNotebookDocument: Event[NotebookDocument] = js.native
  
  @JSGlobal("vscode.workspace.onDidCloseTextDocument")
  @js.native
  val onDidCloseTextDocument: Event[TextDocument] = js.native
  
  @JSGlobal("vscode.workspace.onDidCreateFiles")
  @js.native
  val onDidCreateFiles: Event[FileCreateEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidDeleteFiles")
  @js.native
  val onDidDeleteFiles: Event[FileDeleteEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidGrantWorkspaceTrust")
  @js.native
  val onDidGrantWorkspaceTrust: Event[Unit] = js.native
  
  @JSGlobal("vscode.workspace.onDidOpenNotebookDocument")
  @js.native
  val onDidOpenNotebookDocument: Event[NotebookDocument] = js.native
  
  @JSGlobal("vscode.workspace.onDidOpenTextDocument")
  @js.native
  val onDidOpenTextDocument: Event[TextDocument] = js.native
  
  @JSGlobal("vscode.workspace.onDidRenameFiles")
  @js.native
  val onDidRenameFiles: Event[FileRenameEvent] = js.native
  
  @JSGlobal("vscode.workspace.onDidSaveNotebookDocument")
  @js.native
  val onDidSaveNotebookDocument: Event[NotebookDocument] = js.native
  
  @JSGlobal("vscode.workspace.onDidSaveTextDocument")
  @js.native
  val onDidSaveTextDocument: Event[TextDocument] = js.native
  
  @JSGlobal("vscode.workspace.onWillCreateFiles")
  @js.native
  val onWillCreateFiles: Event[FileWillCreateEvent] = js.native
  
  @JSGlobal("vscode.workspace.onWillDeleteFiles")
  @js.native
  val onWillDeleteFiles: Event[FileWillDeleteEvent] = js.native
  
  @JSGlobal("vscode.workspace.onWillRenameFiles")
  @js.native
  val onWillRenameFiles: Event[FileWillRenameEvent] = js.native
  
  @JSGlobal("vscode.workspace.onWillSaveTextDocument")
  @js.native
  val onWillSaveTextDocument: Event[TextDocumentWillSaveEvent] = js.native
  
  inline def openNotebookDocument(notebookType: String): Thenable[NotebookDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openNotebookDocument")(notebookType.asInstanceOf[js.Any]).asInstanceOf[Thenable[NotebookDocument]]
  inline def openNotebookDocument(notebookType: String, content: typings.vscode.mod.NotebookData): Thenable[NotebookDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("openNotebookDocument")(notebookType.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Thenable[NotebookDocument]]
  inline def openNotebookDocument(uri: typings.vscode.mod.Uri): Thenable[NotebookDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openNotebookDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[Thenable[NotebookDocument]]
  
  inline def openTextDocument(): Thenable[TextDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openTextDocument")().asInstanceOf[Thenable[TextDocument]]
  inline def openTextDocument(fileName: String): Thenable[TextDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openTextDocument")(fileName.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextDocument]]
  inline def openTextDocument(options: Content): Thenable[TextDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openTextDocument")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextDocument]]
  inline def openTextDocument(uri: typings.vscode.mod.Uri): Thenable[TextDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("openTextDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextDocument]]
  
  inline def registerFileSystemProvider(scheme: String, provider: FileSystemProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFileSystemProvider")(scheme.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  inline def registerFileSystemProvider(scheme: String, provider: FileSystemProvider, options: IsCaseSensitive): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFileSystemProvider")(scheme.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerNotebookSerializer(notebookType: String, serializer: NotebookSerializer): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNotebookSerializer")(notebookType.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  inline def registerNotebookSerializer(notebookType: String, serializer: NotebookSerializer, options: NotebookDocumentContentOptions): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNotebookSerializer")(notebookType.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerTaskProvider(`type`: String, provider: TaskProvider[typings.vscode.mod.Task]): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTaskProvider")(`type`.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  inline def registerTextDocumentContentProvider(scheme: String, provider: TextDocumentContentProvider): typings.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTextDocumentContentProvider")(scheme.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.mod.Disposable]
  
  @JSGlobal("vscode.workspace.rootPath")
  @js.native
  val rootPath: js.UndefOr[String] = js.native
  
  inline def saveAll(): Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAll")().asInstanceOf[Thenable[Boolean]]
  inline def saveAll(includeUntitled: Boolean): Thenable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAll")(includeUntitled.asInstanceOf[js.Any]).asInstanceOf[Thenable[Boolean]]
  
  @JSGlobal("vscode.workspace.textDocuments")
  @js.native
  val textDocuments: js.Array[TextDocument] = js.native
  
  inline def updateWorkspaceFolders(start: Double, deleteCount: Double, workspaceFoldersToAdd: Name*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspaceFolders")((scala.List(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(workspaceFoldersToAdd.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  inline def updateWorkspaceFolders(start: Double, deleteCount: Null, workspaceFoldersToAdd: Name*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspaceFolders")((scala.List(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(workspaceFoldersToAdd.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  inline def updateWorkspaceFolders(start: Double, deleteCount: Unit, workspaceFoldersToAdd: Name*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspaceFolders")((scala.List(start.asInstanceOf[js.Any], deleteCount.asInstanceOf[js.Any])).`++`(workspaceFoldersToAdd.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
  
  @JSGlobal("vscode.workspace.workspaceFile")
  @js.native
  val workspaceFile: js.UndefOr[typings.vscode.mod.Uri] = js.native
  
  @JSGlobal("vscode.workspace.workspaceFolders")
  @js.native
  val workspaceFolders: js.UndefOr[js.Array[WorkspaceFolder]] = js.native
}
