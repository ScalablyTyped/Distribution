package typings.hardSourceWebpackPlugin

import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.debug
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.error
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.info
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.log
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.none
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.test
import typings.hardSourceWebpackPlugin.hardSourceWebpackPluginStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Directories extends StObject {
    
    var directories: js.Array[String]
    
    var files: js.Array[String]
    
    var root: String
  }
  object Directories {
    
    inline def apply(directories: js.Array[String], files: js.Array[String], root: String): Directories = {
      val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Directories] (val x: Self) extends AnyVal {
      
      inline def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var level: debug | log | info | warn | error
    
    var mode: none | test
  }
  object Level {
    
    inline def apply(level: debug | log | info | warn | error, mode: none | test): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: debug | log | info | warn | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMode(value: none | test): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxAge extends StObject {
    
    var maxAge: Double
    
    var sizeThreshold: Double
  }
  object MaxAge {
    
    inline def apply(maxAge: Double, sizeThreshold: Double): MaxAge = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sizeThreshold = sizeThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxAge]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxAge] (val x: Self) extends AnyVal {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setSizeThreshold(value: Double): Self = StObject.set(x, "sizeThreshold", value.asInstanceOf[js.Any])
    }
  }
}
