package typings.licenseWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemMod {
  
  trait FileSystem extends StObject {
    
    def isDirectory(dir: String): Boolean
    
    def isFileInDirectory(filename: String, directory: String): Boolean
    
    def join(paths: String*): String
    
    def listPaths(dir: String): js.Array[String]
    
    def pathExists(filename: String): Boolean
    
    var pathSeparator: String
    
    def readFileAsUtf8(filename: String): String
    
    def resolvePath(path: String): String
  }
  object FileSystem {
    
    inline def apply(
      isDirectory: String => Boolean,
      isFileInDirectory: (String, String) => Boolean,
      join: /* repeated */ String => String,
      listPaths: String => js.Array[String],
      pathExists: String => Boolean,
      pathSeparator: String,
      readFileAsUtf8: String => String,
      resolvePath: String => String
    ): FileSystem = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction1(isDirectory), isFileInDirectory = js.Any.fromFunction2(isFileInDirectory), join = js.Any.fromFunction1(join), listPaths = js.Any.fromFunction1(listPaths), pathExists = js.Any.fromFunction1(pathExists), pathSeparator = pathSeparator.asInstanceOf[js.Any], readFileAsUtf8 = js.Any.fromFunction1(readFileAsUtf8), resolvePath = js.Any.fromFunction1(resolvePath))
      __obj.asInstanceOf[FileSystem]
    }
    
    extension [Self <: FileSystem](x: Self) {
      
      inline def setIsDirectory(value: String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
      
      inline def setIsFileInDirectory(value: (String, String) => Boolean): Self = StObject.set(x, "isFileInDirectory", js.Any.fromFunction2(value))
      
      inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setListPaths(value: String => js.Array[String]): Self = StObject.set(x, "listPaths", js.Any.fromFunction1(value))
      
      inline def setPathExists(value: String => Boolean): Self = StObject.set(x, "pathExists", js.Any.fromFunction1(value))
      
      inline def setPathSeparator(value: String): Self = StObject.set(x, "pathSeparator", value.asInstanceOf[js.Any])
      
      inline def setReadFileAsUtf8(value: String => String): Self = StObject.set(x, "readFileAsUtf8", js.Any.fromFunction1(value))
      
      inline def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
    }
  }
}
