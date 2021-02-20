package typings.koaStaticServer

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-static-server", JSImport.Namespace)
  @js.native
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested
      */
    var gzip: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow transfer of hidden files. defaults to false
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[String] = js.native
    
    /**
      * don't execute any downstream middleware. defaults to true
      */
    var last: js.UndefOr[Boolean] = js.native
    
    /**
      * request access log to console
      */
    var log: js.UndefOr[Boolean] = js.native
    
    /**
      * Browser cache max-age in milliseconds. defaults to 0
      */
    var maxage: js.UndefOr[Double] = js.native
    
    /**
      * optional default file to serve if requested static is missing
      */
    var notFoundFile: js.UndefOr[String] = js.native
    
    /**
      * directory that is to be served
      */
    var rootDir: js.UndefOr[String] = js.native
    
    /**
      * optional rewrite path
      */
    var rootPath: js.UndefOr[String] = js.native
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
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMaxage(value: Double): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
      
      @scala.inline
      def setNotFoundFile(value: String): Self = StObject.set(x, "notFoundFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundFileUndefined: Self = StObject.set(x, "notFoundFile", js.undefined)
      
      @scala.inline
      def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    }
  }
}
