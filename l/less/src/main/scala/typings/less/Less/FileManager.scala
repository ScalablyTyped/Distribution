package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManager
  extends StObject
     with AbstractFileManager {
  
  /**
    * Loads a file asynchronously. Expects a promise that either rejects with an error or fulfills with a FileLoadResult.
    */
  def loadFile(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): js.Promise[FileLoadResult]
  
  /**
    * Loads a file synchronously. Expects an immediate return with wither a FileLoadResult or FileLoadError.
    */
  def loadFileSync(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): FileLoadResult | FileLoadError
  
  /**
    * Returns whether this file manager supports this file for file retrieval
    * If true is returned, loadFile will then be called with the file.
    */
  def supports(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): Boolean
}
object FileManager {
  
  inline def apply(
    alwaysMakePathsAbsolute: () => Boolean,
    getPath: String => String,
    isPathAbsolute: String => Boolean,
    join: (String, String) => String,
    loadFile: (String, String, LoadFileOptions, Environment) => js.Promise[FileLoadResult],
    loadFileSync: (String, String, LoadFileOptions, Environment) => FileLoadResult | FileLoadError,
    pathDiff: (String, String) => String,
    supports: (String, String, LoadFileOptions, Environment) => Boolean,
    supportsSync: (String, String, LoadFileOptions, Environment) => Boolean,
    tryAppendLessExtension: String => String
  ): FileManager = {
    val __obj = js.Dynamic.literal(alwaysMakePathsAbsolute = js.Any.fromFunction0(alwaysMakePathsAbsolute), getPath = js.Any.fromFunction1(getPath), isPathAbsolute = js.Any.fromFunction1(isPathAbsolute), join = js.Any.fromFunction2(join), loadFile = js.Any.fromFunction4(loadFile), loadFileSync = js.Any.fromFunction4(loadFileSync), pathDiff = js.Any.fromFunction2(pathDiff), supports = js.Any.fromFunction4(supports), supportsSync = js.Any.fromFunction4(supportsSync), tryAppendLessExtension = js.Any.fromFunction1(tryAppendLessExtension))
    __obj.asInstanceOf[FileManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileManager] (val x: Self) extends AnyVal {
    
    inline def setLoadFile(value: (String, String, LoadFileOptions, Environment) => js.Promise[FileLoadResult]): Self = StObject.set(x, "loadFile", js.Any.fromFunction4(value))
    
    inline def setLoadFileSync(value: (String, String, LoadFileOptions, Environment) => FileLoadResult | FileLoadError): Self = StObject.set(x, "loadFileSync", js.Any.fromFunction4(value))
    
    inline def setSupports(value: (String, String, LoadFileOptions, Environment) => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction4(value))
  }
}
