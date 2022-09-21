package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractFileManager extends StObject {
  
  /**
    * Whether the rootpath should be converted to be absolute.
    * The browser ovverides this to return true because urls must be absolute.
    */
  def alwaysMakePathsAbsolute(): Boolean
  
  /**
    * Given the full path to a file, return the path component.
    */
  def getPath(filename: String): String
  
  /**
    * Returns whether a path is absolute.
    */
  def isPathAbsolute(path: String): Boolean
  
  /**
    * Joins together 2 paths.
    */
  def join(basePath: String, laterPath: String): String
  
  /**
    * Returns the difference between 2 paths
    * E.g. url = a/ baseUrl = a/b/ returns ../
    * url = a/b/ baseUrl = a/ returns b/
    */
  def pathDiff(url: String, baseUrl: String): String
  
  /**
    * Returns whether this file manager supports this file for syncronous file retrieval
    * If true is returned, loadFileSync will then be called with the file.
    */
  def supportsSync(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): Boolean
  
  /**
    * Append a .less extension if appropriate. Only called if less thinks one could be added.
    */
  def tryAppendLessExtension(filename: String): String
}
object AbstractFileManager {
  
  inline def apply(
    alwaysMakePathsAbsolute: () => Boolean,
    getPath: String => String,
    isPathAbsolute: String => Boolean,
    join: (String, String) => String,
    pathDiff: (String, String) => String,
    supportsSync: (String, String, LoadFileOptions, Environment) => Boolean,
    tryAppendLessExtension: String => String
  ): AbstractFileManager = {
    val __obj = js.Dynamic.literal(alwaysMakePathsAbsolute = js.Any.fromFunction0(alwaysMakePathsAbsolute), getPath = js.Any.fromFunction1(getPath), isPathAbsolute = js.Any.fromFunction1(isPathAbsolute), join = js.Any.fromFunction2(join), pathDiff = js.Any.fromFunction2(pathDiff), supportsSync = js.Any.fromFunction4(supportsSync), tryAppendLessExtension = js.Any.fromFunction1(tryAppendLessExtension))
    __obj.asInstanceOf[AbstractFileManager]
  }
  
  extension [Self <: AbstractFileManager](x: Self) {
    
    inline def setAlwaysMakePathsAbsolute(value: () => Boolean): Self = StObject.set(x, "alwaysMakePathsAbsolute", js.Any.fromFunction0(value))
    
    inline def setGetPath(value: String => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
    
    inline def setIsPathAbsolute(value: String => Boolean): Self = StObject.set(x, "isPathAbsolute", js.Any.fromFunction1(value))
    
    inline def setJoin(value: (String, String) => String): Self = StObject.set(x, "join", js.Any.fromFunction2(value))
    
    inline def setPathDiff(value: (String, String) => String): Self = StObject.set(x, "pathDiff", js.Any.fromFunction2(value))
    
    inline def setSupportsSync(value: (String, String, LoadFileOptions, Environment) => Boolean): Self = StObject.set(x, "supportsSync", js.Any.fromFunction4(value))
    
    inline def setTryAppendLessExtension(value: String => String): Self = StObject.set(x, "tryAppendLessExtension", js.Any.fromFunction1(value))
  }
}
