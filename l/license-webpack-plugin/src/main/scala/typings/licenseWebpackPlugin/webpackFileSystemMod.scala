package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackFileSystemMod {
  
  @JSImport("license-webpack-plugin/dist/WebpackFileSystem", "WebpackFileSystem")
  @js.native
  open class WebpackFileSystem protected ()
    extends StObject
       with FileSystem {
    def this(fs: Any) = this()
    
    /* private */ var fs: Any = js.native
    
    /* CompleteClass */
    override def isDirectory(dir: String): Boolean = js.native
    
    /* CompleteClass */
    override def isFileInDirectory(filename: String, directory: String): Boolean = js.native
    
    /* CompleteClass */
    override def join(paths: String*): String = js.native
    
    /* CompleteClass */
    override def listPaths(dir: String): js.Array[String] = js.native
    
    /* CompleteClass */
    override def pathExists(filename: String): Boolean = js.native
    
    /* CompleteClass */
    var pathSeparator: String = js.native
    
    /* CompleteClass */
    override def readFileAsUtf8(filename: String): String = js.native
    
    /* CompleteClass */
    override def resolvePath(path: String): String = js.native
  }
}
