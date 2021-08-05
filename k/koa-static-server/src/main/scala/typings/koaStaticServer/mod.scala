package typings.koaStaticServer

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-static-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested
      */
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow transfer of hidden files. defaults to false
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[String] = js.undefined
    
    /**
      * don't execute any downstream middleware. defaults to true
      */
    var last: js.UndefOr[Boolean] = js.undefined
    
    /**
      * request access log to console
      */
    var log: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Browser cache max-age in milliseconds. defaults to 0
      */
    var maxage: js.UndefOr[Double] = js.undefined
    
    /**
      * optional default file to serve if requested static is missing
      */
    var notFoundFile: js.UndefOr[String] = js.undefined
    
    /**
      * directory that is to be served
      */
    var rootDir: js.UndefOr[String] = js.undefined
    
    /**
      * optional rewrite path
      */
    var rootPath: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
      
      inline def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
      
      inline def setNotFoundFile(value: String): Self = StObject.set(x, "notFoundFile", value.asInstanceOf[js.Any])
      
      inline def setNotFoundFileUndefined: Self = StObject.set(x, "notFoundFile", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    }
  }
}
