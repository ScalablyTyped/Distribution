package typings.less

import org.scalablytyped.runtime.Shortcut
import typings.less.Less.Environment
import typings.less.Less.FileLoadError
import typings.less.Less.FileLoadResult
import typings.less.Less.LoadFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("less", JSImport.Namespace)
  @js.native
  val ^ : LessStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("less", "FileManager")
  @js.native
  open class FileManager ()
    extends StObject
       with typings.less.Less.FileManager {
    
    /**
      * Whether the rootpath should be converted to be absolute.
      * The browser ovverides this to return true because urls must be absolute.
      */
    /* CompleteClass */
    override def alwaysMakePathsAbsolute(): Boolean = js.native
    
    /**
      * Given the full path to a file, return the path component.
      */
    /* CompleteClass */
    override def getPath(filename: String): String = js.native
    
    /**
      * Returns whether a path is absolute.
      */
    /* CompleteClass */
    override def isPathAbsolute(path: String): Boolean = js.native
    
    /**
      * Joins together 2 paths.
      */
    /* CompleteClass */
    override def join(basePath: String, laterPath: String): String = js.native
    
    /**
      * Loads a file asynchronously. Expects a promise that either rejects with an error or fulfills with a FileLoadResult.
      */
    /* CompleteClass */
    override def loadFile(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): js.Promise[FileLoadResult] = js.native
    
    /**
      * Loads a file synchronously. Expects an immediate return with wither a FileLoadResult or FileLoadError.
      */
    /* CompleteClass */
    override def loadFileSync(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): FileLoadResult | FileLoadError = js.native
    
    /**
      * Returns the difference between 2 paths
      * E.g. url = a/ baseUrl = a/b/ returns ../
      * url = a/b/ baseUrl = a/ returns b/
      */
    /* CompleteClass */
    override def pathDiff(url: String, baseUrl: String): String = js.native
    
    /**
      * Returns whether this file manager supports this file for file retrieval
      * If true is returned, loadFile will then be called with the file.
      */
    /* CompleteClass */
    override def supports(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): Boolean = js.native
    
    /**
      * Returns whether this file manager supports this file for syncronous file retrieval
      * If true is returned, loadFileSync will then be called with the file.
      */
    /* CompleteClass */
    override def supportsSync(filename: String, currentDirectory: String, options: LoadFileOptions, environment: Environment): Boolean = js.native
    
    /**
      * Append a .less extension if appropriate. Only called if less thinks one could be added.
      */
    /* CompleteClass */
    override def tryAppendLessExtension(filename: String): String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("less", "PluginManager")
  @js.native
  open class PluginManager protected ()
    extends StObject
       with typings.less.Less.PluginManager {
    def this(less: LessStatic) = this()
  }
  
  type _To = LessStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LessStatic = ^
}
