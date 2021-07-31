package typings.marko

import typings.bodyParser.mod.Options
import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsText
import typings.bodyParser.mod.OptionsUrlencoded
import typings.connect.mod.NextHandleFunction
import typings.express.anon.FnCall
import typings.express.mod.Application_
import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.express.mod.RouterOptions
import typings.expressServeStaticCore.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.marko.templateMod.Template
import typings.qs.mod.IParseOptions
import typings.serveStatic.mod.RequestHandlerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressMod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  @scala.inline
  def apply(): Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Express]
  
  @JSImport("marko/express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Router(): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")().asInstanceOf[typings.expressServeStaticCore.mod.Router]
  @scala.inline
  def Router(options: RouterOptions): typings.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typings.expressServeStaticCore.mod.Router]
  
  /**
    * These are the exposed prototypes.
    */
  @JSImport("marko/express", "application")
  @js.native
  def application: Application_ = js.native
  @scala.inline
  def application_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def json(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("json")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def json(options: OptionsJson): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  @scala.inline
  def query(options: FnCall): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  @scala.inline
  def query(options: IParseOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def raw(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def raw(options: Options): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  @JSImport("marko/express", "request")
  @js.native
  def request: Request_[ParamsDictionary, js.Any, js.Any, Query] = js.native
  @scala.inline
  def request_=(x: Request_[ParamsDictionary, js.Any, js.Any, Query]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  @JSImport("marko/express", "response")
  @js.native
  def response: Response_[js.Any] = js.native
  @scala.inline
  def response_=(x: Response_[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("response")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("marko/express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[js.Any]] = js.native
  @scala.inline
  def static_=(x: RequestHandlerConstructor[Response_[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def text(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @scala.inline
  def text(options: OptionsText): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def urlencoded(): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencoded")().asInstanceOf[NextHandleFunction]
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @scala.inline
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencoded")(options.asInstanceOf[js.Any]).asInstanceOf[NextHandleFunction]
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Response extends StObject {
      
      def marko(template: Template): Unit = js.native
      def marko(template: Template, data: js.Any): Unit = js.native
    }
  }
}
