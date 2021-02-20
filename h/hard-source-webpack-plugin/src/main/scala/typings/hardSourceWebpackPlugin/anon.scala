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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Directories extends StObject {
    
    var directories: js.Array[String] = js.native
    
    var files: js.Array[String] = js.native
    
    var root: String = js.native
  }
  object Directories {
    
    @scala.inline
    def apply(directories: js.Array[String], files: js.Array[String], root: String): Directories = {
      val __obj = js.Dynamic.literal(directories = directories.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directories]
    }
    
    @scala.inline
    implicit class DirectoriesMutableBuilder[Self <: Directories] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    var level: debug | log | info | warn | error = js.native
    
    var mode: none | test = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: debug | log | info | warn | error, mode: none | test): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: debug | log | info | warn | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: none | test): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaxAge extends StObject {
    
    var maxAge: Double = js.native
    
    var sizeThreshold: Double = js.native
  }
  object MaxAge {
    
    @scala.inline
    def apply(maxAge: Double, sizeThreshold: Double): MaxAge = {
      val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sizeThreshold = sizeThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxAge]
    }
    
    @scala.inline
    implicit class MaxAgeMutableBuilder[Self <: MaxAge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeThreshold(value: Double): Self = StObject.set(x, "sizeThreshold", value.asInstanceOf[js.Any])
    }
  }
}
