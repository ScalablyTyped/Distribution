package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.libTypesPublicMod.Callback
import typings.jsdevtoolsReaddirEnhanced.libTypesPublicMod.FilterFunction
import typings.jsdevtoolsReaddirEnhanced.libTypesPublicMod.Stats
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
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
    var deep: js.UndefOr[Boolean | Double | String | js.RegExp | FilterFunction] = js.undefined
    
    /**
      * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
      *
      * Defaults to returning all files.
      */
    var filter: js.UndefOr[Boolean | String | js.RegExp | FilterFunction] = js.undefined
    
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
    var stats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for the `stats` option. This property is supported for compatibility with the Node.js
      * built-in `fs.readdir()` function.
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstatsfalseundefine {
    
    inline def apply(): Optionsstatsfalseundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsstatsfalseundefine]
    }
    
    extension [Self <: Optionsstatsfalseundefine](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setDeep(value: Boolean | Double | String | js.RegExp | FilterFunction): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepFunction1(value: /* stat */ Stats => Any): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setFilter(value: Boolean | String | js.RegExp | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* stat */ Stats => Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFs(value: PartialFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
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
    var deep: js.UndefOr[Boolean | Double | String | js.RegExp | FilterFunction] = js.undefined
    
    /**
      * Filter critiera. Can be a glob pattern, a regular expression, or a filter function.
      *
      * Defaults to returning all files.
      */
    var filter: js.UndefOr[Boolean | String | js.RegExp | FilterFunction] = js.undefined
    
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
    var stats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for the `stats` option. This property is supported for compatibility with the Node.js
      * built-in `fs.readdir()` function.
      */
    var withFileTypes: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsstatstrue {
    
    inline def apply(): Optionsstatstrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsstatstrue]
    }
    
    extension [Self <: Optionsstatstrue](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setDeep(value: Boolean | Double | String | js.RegExp | FilterFunction): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepFunction1(value: /* stat */ Stats => Any): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setFilter(value: Boolean | String | js.RegExp | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* stat */ Stats => Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFs(value: PartialFileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
      
      inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
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
    
    inline def apply(): PartialFileSystem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileSystem]
    }
    
    extension [Self <: PartialFileSystem](x: Self) {
      
      inline def setLstat(value: (/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats]) => Unit): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReaddir(value: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      inline def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      inline def setStat(value: (/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats]) => Unit): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
}
