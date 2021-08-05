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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json-server", "bodyParser")
  @js.native
  val bodyParser: js.Tuple2[NextHandleFunction, NextHandleFunction] = js.native
  
  inline def create(): Application_ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Application_]
  
  inline def defaults(): js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  inline def defaults(options: MiddlewaresOptions): js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  
  inline def rewriter(rules: StringDictionary[String]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriter")(rules.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  inline def router(source: String): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("router")(source.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def router(source: String, options: ForeignKeySuffix): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("router")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router]
  inline def router(source: js.Object): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("router")(source.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def router(source: js.Object, options: ForeignKeySuffix): Router = (^.asInstanceOf[js.Dynamic].applyDynamic("router")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  trait MiddlewaresOptions extends StObject {
    
    /**
      * Enable body-parser middleware
      * @default true
      */
    var bodyParser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable logger middleware
      * @default true
      */
    var logger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable CORS
      * @default false
      */
    var noCors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable compression
      * @default false
      */
    var noGzip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept only GET requests
      * @default false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to static files
      * @default "public" (if folder exists)
      */
    var static: js.UndefOr[String] = js.undefined
  }
  object MiddlewaresOptions {
    
    inline def apply(): MiddlewaresOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewaresOptions]
    }
    
    extension [Self <: MiddlewaresOptions](x: Self) {
      
      inline def setBodyParser(value: Boolean): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
      
      inline def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
      
      inline def setLogger(value: Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setNoCors(value: Boolean): Self = StObject.set(x, "noCors", value.asInstanceOf[js.Any])
      
      inline def setNoCorsUndefined: Self = StObject.set(x, "noCors", js.undefined)
      
      inline def setNoGzip(value: Boolean): Self = StObject.set(x, "noGzip", value.asInstanceOf[js.Any])
      
      inline def setNoGzipUndefined: Self = StObject.set(x, "noGzip", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
}
