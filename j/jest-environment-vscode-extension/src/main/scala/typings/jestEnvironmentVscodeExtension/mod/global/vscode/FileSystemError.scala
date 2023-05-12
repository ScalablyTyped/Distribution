package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.FileSystemError")
@js.native
/**
		 * Creates a new filesystem error.
		 *
		 * @param messageOrUri Message or uri.
		 */
open class FileSystemError ()
  extends typings.vscode.mod.FileSystemError {
  def this(messageOrUri: String) = this()
  def this(messageOrUri: typings.vscode.mod.Uri) = this()
}
/* static members */
object FileSystemError {
  
  @JSGlobal("vscode.FileSystemError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Create an error to signal that a file or folder already exists, e.g. when
  		 * creating but not overwriting a file.
  		 * @param messageOrUri Message or uri.
  		 */
  inline def FileExists(): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")().asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileExists(messageOrUri: String): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileExists(messageOrUri: typings.vscode.mod.Uri): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  
  /**
  		 * Create an error to signal that a file is a folder.
  		 * @param messageOrUri Message or uri.
  		 */
  inline def FileIsADirectory(): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")().asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileIsADirectory(messageOrUri: String): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileIsADirectory(messageOrUri: typings.vscode.mod.Uri): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  
  /**
  		 * Create an error to signal that a file is not a folder.
  		 * @param messageOrUri Message or uri.
  		 */
  inline def FileNotADirectory(): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")().asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileNotADirectory(messageOrUri: String): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileNotADirectory(messageOrUri: typings.vscode.mod.Uri): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  
  /**
  		 * Create an error to signal that a file or folder wasn't found.
  		 * @param messageOrUri Message or uri.
  		 */
  inline def FileNotFound(): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")().asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileNotFound(messageOrUri: String): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def FileNotFound(messageOrUri: typings.vscode.mod.Uri): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  
  /**
  		 * Create an error to signal that an operation lacks required permissions.
  		 * @param messageOrUri Message or uri.
  		 */
  inline def NoPermissions(): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")().asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def NoPermissions(messageOrUri: String): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def NoPermissions(messageOrUri: typings.vscode.mod.Uri): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  
  /**
  		 * Create an error to signal that the file system is unavailable or too busy to
  		 * complete a request.
  		 * @param messageOrUri Message or uri.
  		 */
  inline def Unavailable(): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")().asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def Unavailable(messageOrUri: String): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
  inline def Unavailable(messageOrUri: typings.vscode.mod.Uri): typings.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.FileSystemError]
}
