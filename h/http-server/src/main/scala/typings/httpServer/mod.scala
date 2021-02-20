package typings.httpServer

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.HandleFunction
import typings.httpServer.httpServerBooleans.`true`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.ServerOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-server", "createServer")
  @js.native
  def createServer(): Server | typings.node.httpsMod.Server = js.native
  @JSImport("http-server", "createServer")
  @js.native
  def createServer(options: Options): Server | typings.node.httpsMod.Server = js.native
  
  @js.native
  trait Options extends StObject {
    
    var autoIndex: js.UndefOr[Boolean] = js.native
    
    var before: js.UndefOr[js.Array[HandleFunction]] = js.native
    
    var cache: js.UndefOr[Double] = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    var cors: js.UndefOr[Boolean] = js.native
    
    var corsHeaders: js.UndefOr[String] = js.native
    
    var ext: js.UndefOr[Boolean] = js.native
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var https: js.UndefOr[ServerOptions] = js.native
    
    var logFn: js.UndefOr[
        js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* err */ Error, Unit]
      ] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var robots: js.UndefOr[String | `true`] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var showDir: js.UndefOr[Boolean] = js.native
    
    var showDotfiles: js.UndefOr[Boolean] = js.native
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
      def setAutoIndex(value: Boolean): Self = StObject.set(x, "autoIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoIndexUndefined: Self = StObject.set(x, "autoIndex", js.undefined)
      
      @scala.inline
      def setBefore(value: js.Array[HandleFunction]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBeforeVarargs(value: HandleFunction*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsHeaders(value: String): Self = StObject.set(x, "corsHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsHeadersUndefined: Self = StObject.set(x, "corsHeaders", js.undefined)
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setExt(value: Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLogFn(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* err */ Error) => Unit): Self = StObject.set(x, "logFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLogFnUndefined: Self = StObject.set(x, "logFn", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRobots(value: String | `true`): Self = StObject.set(x, "robots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRobotsUndefined: Self = StObject.set(x, "robots", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
      
      @scala.inline
      def setShowDotfiles(value: Boolean): Self = StObject.set(x, "showDotfiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDotfilesUndefined: Self = StObject.set(x, "showDotfiles", js.undefined)
    }
  }
}
