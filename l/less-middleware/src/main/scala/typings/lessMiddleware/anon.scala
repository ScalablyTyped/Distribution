package typings.lessMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CacheFile extends StObject {
    
    /**
      * Path to a JSON file that will be used to cache less data across server restarts.
      * This can greatly speed up initial load time after a server restart - if the less
      * files haven't changed and the css files still exist, specifying this option will
      * mean that the less files don't need to be recompiled after a server restart.
      */
    var cacheFile: js.UndefOr[String] = js.native
    
    /**
      * Show more verbose logging?
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Destination directory to output the compiled .css files.
      */
    var dest: js.UndefOr[String] = js.native
    
    /**
      * Always re-compile less files on each request.
      */
    var force: js.UndefOr[Boolean] = js.native
    
    /**
      * Only recompile once after each server restart.
      * Useful for reducing disk i/o on production.
      */
    var once: js.UndefOr[Boolean] = js.native
    
    /**
      * Common root of the source and destination.
      * It is prepended to both the source and destination before being used.
      */
    var pathRoot: js.UndefOr[String] = js.native
    
    /**
      * Object containing functions relevant to preprocessing data.
      */
    var postprocess: js.UndefOr[Css] = js.native
    
    /**
      * Object containing functions relevant to preprocessing data.
      */
    var preprocess: js.UndefOr[ImportPaths] = js.native
    
    /**
      * Options for the less render.
      */
    var render: js.UndefOr[Compress] = js.native
    
    /**
      * Function that is in charge of storing the css in the filesystem.
      */
    var storeCss: js.UndefOr[
        js.Function4[
          /* pathname */ String, 
          /* css */ String, 
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          /* next */ js.Function, 
          Unit
        ]
      ] = js.native
  }
  object CacheFile {
    
    @scala.inline
    def apply(): CacheFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheFile]
    }
    
    @scala.inline
    implicit class CacheFileMutableBuilder[Self <: CacheFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheFile(value: String): Self = StObject.set(x, "cacheFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheFileUndefined: Self = StObject.set(x, "cacheFile", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setPathRoot(value: String): Self = StObject.set(x, "pathRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRootUndefined: Self = StObject.set(x, "pathRoot", js.undefined)
      
      @scala.inline
      def setPostprocess(value: Css): Self = StObject.set(x, "postprocess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostprocessUndefined: Self = StObject.set(x, "postprocess", js.undefined)
      
      @scala.inline
      def setPreprocess(value: ImportPaths): Self = StObject.set(x, "preprocess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      @scala.inline
      def setRender(value: Compress): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setStoreCss(
        value: (/* pathname */ String, /* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], /* next */ js.Function) => Unit
      ): Self = StObject.set(x, "storeCss", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStoreCssUndefined: Self = StObject.set(x, "storeCss", js.undefined)
    }
  }
  
  @js.native
  trait Compress extends StObject {
    
    var compress: js.UndefOr[String] = js.native
    
    var paths: js.UndefOr[js.Array[String]] = js.native
    
    var yuicompress: js.UndefOr[Boolean] = js.native
  }
  object Compress {
    
    @scala.inline
    def apply(): Compress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compress]
    }
    
    @scala.inline
    implicit class CompressMutableBuilder[Self <: Compress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: String): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setYuicompress(value: Boolean): Self = StObject.set(x, "yuicompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYuicompressUndefined: Self = StObject.set(x, "yuicompress", js.undefined)
    }
  }
  
  @js.native
  trait Css extends StObject {
    
    /**
      * Function that modifies the compiled css output before being stored.
      */
    var css: js.UndefOr[
        js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
      ] = js.native
  }
  object Css {
    
    @scala.inline
    def apply(): Css = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: (/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = StObject.set(x, "css", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    }
  }
  
  @js.native
  trait ImportPaths extends StObject {
    
    /**
      * Function that modifies the import paths used by the less parser per request.
      */
    var importPaths: js.UndefOr[
        js.Function2[
          /* paths */ js.Array[String], 
          /* req */ Request_[ParamsDictionary, _, _, Query], 
          js.Array[String]
        ]
      ] = js.native
    
    /**
      * Function that modifies the raw less output before being parsed and compiled.
      */
    var less: js.UndefOr[
        js.Function2[/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
      ] = js.native
    
    /**
      * Function that modifies the less pathname before being loaded from the filesystem.
      */
    var path: js.UndefOr[
        js.Function2[/* pathname */ String, /* req */ Request_[ParamsDictionary, _, _, Query], String]
      ] = js.native
  }
  object ImportPaths {
    
    @scala.inline
    def apply(): ImportPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportPaths]
    }
    
    @scala.inline
    implicit class ImportPathsMutableBuilder[Self <: ImportPaths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportPaths(
        value: (/* paths */ js.Array[String], /* req */ Request_[ParamsDictionary, _, _, Query]) => js.Array[String]
      ): Self = StObject.set(x, "importPaths", js.Any.fromFunction2(value))
      
      @scala.inline
      def setImportPathsUndefined: Self = StObject.set(x, "importPaths", js.undefined)
      
      @scala.inline
      def setLess(value: (/* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = StObject.set(x, "less", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
      
      @scala.inline
      def setPath(value: (/* pathname */ String, /* req */ Request_[ParamsDictionary, _, _, Query]) => String): Self = StObject.set(x, "path", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
