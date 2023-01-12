package typings.lessMiddleware

import typings.express.mod.Request_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CacheFile extends StObject {
    
    /**
      * Path to a JSON file that will be used to cache less data across server restarts.
      * This can greatly speed up initial load time after a server restart - if the less
      * files haven't changed and the css files still exist, specifying this option will
      * mean that the less files don't need to be recompiled after a server restart.
      */
    var cacheFile: js.UndefOr[String] = js.undefined
    
    /**
      * Show more verbose logging?
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Destination directory to output the compiled .css files.
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * Always re-compile less files on each request.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only recompile once after each server restart.
      * Useful for reducing disk i/o on production.
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Common root of the source and destination.
      * It is prepended to both the source and destination before being used.
      */
    var pathRoot: js.UndefOr[String] = js.undefined
    
    /**
      * Object containing functions relevant to preprocessing data.
      */
    var postprocess: js.UndefOr[Css] = js.undefined
    
    /**
      * Object containing functions relevant to preprocessing data.
      */
    var preprocess: js.UndefOr[ImportPaths] = js.undefined
    
    /**
      * Options for the less render.
      */
    var render: js.UndefOr[Compress] = js.undefined
    
    /**
      * Function that is in charge of storing the css in the filesystem.
      */
    var storeCss: js.UndefOr[
        js.Function4[
          /* pathname */ String, 
          /* css */ String, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* next */ js.Function, 
          Unit
        ]
      ] = js.undefined
  }
  object CacheFile {
    
    inline def apply(): CacheFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheFile] (val x: Self) extends AnyVal {
      
      inline def setCacheFile(value: String): Self = StObject.set(x, "cacheFile", value.asInstanceOf[js.Any])
      
      inline def setCacheFileUndefined: Self = StObject.set(x, "cacheFile", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPathRoot(value: String): Self = StObject.set(x, "pathRoot", value.asInstanceOf[js.Any])
      
      inline def setPathRootUndefined: Self = StObject.set(x, "pathRoot", js.undefined)
      
      inline def setPostprocess(value: Css): Self = StObject.set(x, "postprocess", value.asInstanceOf[js.Any])
      
      inline def setPostprocessUndefined: Self = StObject.set(x, "postprocess", js.undefined)
      
      inline def setPreprocess(value: ImportPaths): Self = StObject.set(x, "preprocess", value.asInstanceOf[js.Any])
      
      inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
      
      inline def setRender(value: Compress): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setStoreCss(
        value: (/* pathname */ String, /* css */ String, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* next */ js.Function) => Unit
      ): Self = StObject.set(x, "storeCss", js.Any.fromFunction4(value))
      
      inline def setStoreCssUndefined: Self = StObject.set(x, "storeCss", js.undefined)
    }
  }
  
  trait Compress extends StObject {
    
    var compress: js.UndefOr[String | Boolean] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    var yuicompress: js.UndefOr[Boolean] = js.undefined
  }
  object Compress {
    
    inline def apply(): Compress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compress] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: String | Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setYuicompress(value: Boolean): Self = StObject.set(x, "yuicompress", value.asInstanceOf[js.Any])
      
      inline def setYuicompressUndefined: Self = StObject.set(x, "yuicompress", js.undefined)
    }
  }
  
  trait Css extends StObject {
    
    /**
      * Function that modifies the compiled css output before being stored.
      */
    var css: js.UndefOr[
        js.Function2[
          /* css */ String, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]
      ] = js.undefined
  }
  object Css {
    
    inline def apply(): Css = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      inline def setCss(
        value: (/* css */ String, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => String
      ): Self = StObject.set(x, "css", js.Any.fromFunction2(value))
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    }
  }
  
  trait ImportPaths extends StObject {
    
    /**
      * Function that modifies the import paths used by the less parser per request.
      */
    var importPaths: js.UndefOr[
        js.Function2[
          /* paths */ js.Array[String], 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          js.Array[String]
        ]
      ] = js.undefined
    
    /**
      * Function that modifies the raw less output before being parsed and compiled.
      */
    var less: js.UndefOr[
        js.Function2[
          /* css */ String, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]
      ] = js.undefined
    
    /**
      * Function that modifies the less pathname before being loaded from the filesystem.
      */
    var path: js.UndefOr[
        js.Function2[
          /* pathname */ String, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]
      ] = js.undefined
  }
  object ImportPaths {
    
    inline def apply(): ImportPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportPaths]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportPaths] (val x: Self) extends AnyVal {
      
      inline def setImportPaths(
        value: (/* paths */ js.Array[String], /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => js.Array[String]
      ): Self = StObject.set(x, "importPaths", js.Any.fromFunction2(value))
      
      inline def setImportPathsUndefined: Self = StObject.set(x, "importPaths", js.undefined)
      
      inline def setLess(
        value: (/* css */ String, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => String
      ): Self = StObject.set(x, "less", js.Any.fromFunction2(value))
      
      inline def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
      
      inline def setPath(
        value: (/* pathname */ String, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => String
      ): Self = StObject.set(x, "path", js.Any.fromFunction2(value))
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
