package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.PartialFileSystem
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPublicMod {
  
  type Callback[T] = js.Function2[/* err */ Error | Null, /* result */ T, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.error
    - typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.file
    - typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.directory
    - typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.symlink
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def directory: typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.directory = "directory".asInstanceOf[typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.directory]
    
    @scala.inline
    def error: typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.error = "error".asInstanceOf[typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.error]
    
    @scala.inline
    def file: typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.file = "file".asInstanceOf[typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.file]
    
    @scala.inline
    def symlink: typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.symlink = "symlink".asInstanceOf[typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedStrings.symlink]
  }
  
  @js.native
  trait FileSystem extends StObject {
    
    /**
      * Returns filesystem information about a symlink.
      */
    def lstat(path: String, callback: Callback[typings.node.fsMod.Stats]): Unit = js.native
    
    /**
      * Returns the names of files in a directory.
      */
    def readdir(path: String, callback: Callback[js.Array[String]]): Unit = js.native
    
    /**
      * Returns filesystem information about a directory entry.
      */
    def stat(path: String, callback: Callback[typings.node.fsMod.Stats]): Unit = js.native
  }
  object FileSystem {
    
    @scala.inline
    def apply(
      lstat: (String, Callback[typings.node.fsMod.Stats]) => Unit,
      readdir: (String, Callback[js.Array[String]]) => Unit,
      stat: (String, Callback[typings.node.fsMod.Stats]) => Unit
    ): FileSystem = {
      val __obj = js.Dynamic.literal(lstat = js.Any.fromFunction2(lstat), readdir = js.Any.fromFunction2(readdir), stat = js.Any.fromFunction2(stat))
      __obj.asInstanceOf[FileSystem]
    }
    
    @scala.inline
    implicit class FileSystemMutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLstat(value: (String, Callback[typings.node.fsMod.Stats]) => Unit): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReaddir(value: (String, Callback[js.Array[String]]) => Unit): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStat(value: (String, Callback[typings.node.fsMod.Stats]) => Unit): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
    }
  }
  
  type FilterFunction = js.Function1[/* stat */ Stats, js.Any]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The baase path to prefix results with.
      *
      * Defaults to an empty string, which means results will be relative to the directory path.
      */
    var basePath: js.UndefOr[String] = js.native
    
    /**
      * The depth to crawl. Can be `true` to crawl indefinitely, a number to crawl only to that
      * depth, or a filter (see the `filter` option) to crawl only directories that match the filter.
      *
      * Defaults to zero, which will not crawl subdirectories.
      */
    var deep: js.UndefOr[Boolean | Double | String | RegExp | FilterFunction] = js.native
    
    /**
      * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
      *
      * Defaults to returning all files.
      */
    var filter: js.UndefOr[Boolean | String | RegExp | FilterFunction] = js.native
    
    /**
      * Custom implementations of filesystem methods.
      *
      * Defaults to the Node "fs" module.
      */
    var fs: js.UndefOr[PartialFileSystem] = js.native
    
    /**
      * The path separator to use.
      *
      * Defaults to "\" on Windows and "/" on other platforms.
      */
    var sep: js.UndefOr[String] = js.native
    
    /**
      * Return `Stats` objects instead of just path strings.
      *
      * Defaults to `false`.
      */
    var stats: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for the `stats` option. This property is supported for compatibility with the Node.js
      * built-in `fs.readdir()` function.
      */
    var withFileTypes: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean | Double | String | RegExp | FilterFunction): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepFunction1(value: /* stat */ Stats => js.Any): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean | String | RegExp | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* stat */ Stats => js.Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFs(value: PartialFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  @js.native
  trait Stats
    extends typings.node.fsMod.Stats {
    
    /**
      * The depth of this entry, relative to the original directory.
      */
    var depth: Double = js.native
    
    /**
      * The relative path of the file.
      *
      * NOTE: The value is affected by the `basePath` and `sep` options.
      */
    var path: String = js.native
  }
}
