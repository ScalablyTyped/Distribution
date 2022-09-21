package typings.marko

import typings.express.anon.FnCall
import typings.express.mod.Application_
import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.Express
import typings.marko.templateMod.Template
import typings.qs.mod.IParseOptions
import typings.serveStatic.mod.RequestHandlerConstructor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressMod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  inline def apply(): Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Express]
  
  @JSImport("marko/express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Router(): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")().asInstanceOf[typings.expressServeStaticCore.mod.Router]
  inline def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.expressServeStaticCore.mod.Router]
  
  /**
    * These are the exposed prototypes.
    */
  @JSImport("marko/express", "application")
  @js.native
  def application: Application_ = js.native
  inline def application_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("marko/express", "json")
  @js.native
  def json: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any = js.native
  inline def json_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
  
  inline def query(options: FnCall): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def query(options: IParseOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("marko/express", "raw")
  @js.native
  def raw: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.raw */ Any = js.native
  inline def raw_=(x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.raw */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raw")(x.asInstanceOf[js.Any])
  
  @JSImport("marko/express", "request")
  @js.native
  def request: Request_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = js.native
  inline def request_=(
    x: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  @JSImport("marko/express", "response")
  @js.native
  def response: Response_[Any, Record[String, Any]] = js.native
  inline def response_=(x: Response_[Any, Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("response")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("marko/express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[Any, Record[String, Any]]] = js.native
  inline def static_=(x: RequestHandlerConstructor[Response_[Any, Record[String, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("marko/express", "text")
  @js.native
  def text: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.text */ Any = js.native
  inline def text_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.text */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("marko/express", "urlencoded")
  @js.native
  def urlencoded: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any = js.native
  inline def urlencoded_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(x.asInstanceOf[js.Any])
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Response extends StObject {
      
      def marko(template: Template): Unit = js.native
      def marko(template: Template, data: Any): Unit = js.native
    }
  }
}
