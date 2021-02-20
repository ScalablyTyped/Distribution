package typings.jsonServer

import org.scalablytyped.runtime.StringDictionary
import typings.connect.mod.NextHandleFunction
import typings.express.mod.Application_
import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.jsonServer.anon.ForeignKeySuffix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-server", "bodyParser")
  @js.native
  val bodyParser: js.Tuple2[NextHandleFunction, NextHandleFunction] = js.native
  
  @JSImport("json-server", "create")
  @js.native
  def create(): Application_ = js.native
  
  @JSImport("json-server", "defaults")
  @js.native
  def defaults(): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("json-server", "defaults")
  @js.native
  def defaults(options: MiddlewaresOptions): js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  @JSImport("json-server", "rewriter")
  @js.native
  def rewriter(rules: StringDictionary[String]): Router = js.native
  
  @JSImport("json-server", "router")
  @js.native
  def router(source: String): Router = js.native
  @JSImport("json-server", "router")
  @js.native
  def router(source: String, options: ForeignKeySuffix): Router = js.native
  @JSImport("json-server", "router")
  @js.native
  def router(source: js.Object): Router = js.native
  @JSImport("json-server", "router")
  @js.native
  def router(source: js.Object, options: ForeignKeySuffix): Router = js.native
  
  @js.native
  trait MiddlewaresOptions extends StObject {
    
    /**
      * Enable body-parser middleware
      * @default true
      */
    var bodyParser: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable logger middleware
      * @default true
      */
    var logger: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable CORS
      * @default false
      */
    var noCors: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable compression
      * @default false
      */
    var noGzip: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept only GET requests
      * @default false
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Path to static files
      * @default "public" (if folder exists)
      */
    var static: js.UndefOr[String] = js.native
  }
  object MiddlewaresOptions {
    
    @scala.inline
    def apply(): MiddlewaresOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewaresOptions]
    }
    
    @scala.inline
    implicit class MiddlewaresOptionsMutableBuilder[Self <: MiddlewaresOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyParser(value: Boolean): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
      
      @scala.inline
      def setLogger(value: Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setNoCors(value: Boolean): Self = StObject.set(x, "noCors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCorsUndefined: Self = StObject.set(x, "noCors", js.undefined)
      
      @scala.inline
      def setNoGzip(value: Boolean): Self = StObject.set(x, "noGzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoGzipUndefined: Self = StObject.set(x, "noGzip", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
}
