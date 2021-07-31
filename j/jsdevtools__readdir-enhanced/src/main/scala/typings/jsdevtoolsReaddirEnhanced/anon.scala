package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedBooleans.`false`
import typings.jsdevtoolsReaddirEnhanced.jsdevtoolsReaddirEnhancedBooleans.`true`
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.FilterFunction
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(dir: String): AsyncIterableIterator[String] = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
    def apply(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(dir: String): js.Array[String] = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
    def apply(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
  }
  
  @js.native
  trait FnCallDirOptions extends StObject {
    
    def apply(dir: String): Readable = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
    def apply(dir: String, options: Optionsstatstrue): Readable = js.native
  }
  
  @js.native
  trait FnCallDirOptionsCallback extends StObject {
    
    def apply(dir: String): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Unit, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
    def apply(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  }
  
  /* Inlined @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :false | undefined} */
  trait Optionsstatsfalseundefine extends StObject {
    
    /**
      * The baase path to prefix results with.
      *
      * Defaults to an empty string, which means results will be relative to the directory path.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * The depth to crawl. Can be `true` to crawl indefinitely, a number to crawl only to that
      * depth, or a filter (see the `filter` option) to crawl only directories that match the filter.
      *
      * Defaults to zero, which will not crawl subdirectories.
      */
    var deep: js.UndefOr[Boolean | Double | String | RegExp | FilterFunction] = js.undefined
    
    /**
      * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
      *
      * Defaults to returning all files.
      */
    var filter: js.UndefOr[Boolean | String | RegExp | FilterFunction] = js.undefined
    
    /**
      * Custom implementations of filesystem methods.
      *
      * Defaults to the Node "fs" module.
      */
    var fs: js.UndefOr[PartialFileSystem] = js.undefined
    
    /**
      * The path separator to use.
      *
      * Defaults to "\" on Windows and "/" on other platforms.
      */
    var sep: js.UndefOr[String] = js.undefined
    
    /**
      * Return `Stats` objects instead of just path strings.
      *
      * Defaults to `false`.
      */
    var stats: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    /**
      * Alias for the `stats` option. This property is supported for compatibility with the Node.js
      * built-in `fs.readdir()` function.
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstatsfalseundefine {
    
    @scala.inline
    def apply(stats: js.UndefOr[Boolean] & js.UndefOr[`false`]): Optionsstatsfalseundefine = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsstatsfalseundefine]
    }
    
    @scala.inline
    implicit class OptionsstatsfalseundefineMutableBuilder[Self <: Optionsstatsfalseundefine] (val x: Self) extends AnyVal {
      
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
      def setStats(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  /* Inlined @jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.Options & {  stats :true} */
  trait Optionsstatstrue extends StObject {
    
    /**
      * The baase path to prefix results with.
      *
      * Defaults to an empty string, which means results will be relative to the directory path.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * The depth to crawl. Can be `true` to crawl indefinitely, a number to crawl only to that
      * depth, or a filter (see the `filter` option) to crawl only directories that match the filter.
      *
      * Defaults to zero, which will not crawl subdirectories.
      */
    var deep: js.UndefOr[Boolean | Double | String | RegExp | FilterFunction] = js.undefined
    
    /**
      * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
      *
      * Defaults to returning all files.
      */
    var filter: js.UndefOr[Boolean | String | RegExp | FilterFunction] = js.undefined
    
    /**
      * Custom implementations of filesystem methods.
      *
      * Defaults to the Node "fs" module.
      */
    var fs: js.UndefOr[PartialFileSystem] = js.undefined
    
    /**
      * The path separator to use.
      *
      * Defaults to "\" on Windows and "/" on other platforms.
      */
    var sep: js.UndefOr[String] = js.undefined
    
    /**
      * Return `Stats` objects instead of just path strings.
      *
      * Defaults to `false`.
      */
    var stats: js.UndefOr[Boolean] & `true`
    
    /**
      * Alias for the `stats` option. This property is supported for compatibility with the Node.js
      * built-in `fs.readdir()` function.
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstatstrue {
    
    @scala.inline
    def apply(stats: js.UndefOr[Boolean] & `true`): Optionsstatstrue = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsstatstrue]
    }
    
    @scala.inline
    implicit class OptionsstatstrueMutableBuilder[Self <: Optionsstatstrue] (val x: Self) extends AnyVal {
      
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
      def setStats(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jsdevtools/readdir-enhanced.@jsdevtools/readdir-enhanced/lib/types-public.FileSystem> */
  trait PartialFileSystem extends StObject {
    
    var lstat: js.UndefOr[
        js.Function2[/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats], Unit]
      ] = js.undefined
    
    var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.undefined
    
    var stat: js.UndefOr[
        js.Function2[/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats], Unit]
      ] = js.undefined
  }
  object PartialFileSystem {
    
    @scala.inline
    def apply(): PartialFileSystem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystem]
    }
    
    @scala.inline
    implicit class PartialFileSystemMutableBuilder[Self <: PartialFileSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLstat(value: (/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats]) => Unit): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setReaddir(value: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      @scala.inline
      def setStat(value: (/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats]) => Unit): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
}
