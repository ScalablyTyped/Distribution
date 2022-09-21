package typings.koaDecRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-dec-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("koa-dec-router", "CTRL_PATH")
  @js.native
  val CTRL_PATH: js.Symbol = js.native
  
  @JSImport("koa-dec-router", "MIDDLEWARES")
  @js.native
  val MIDDLEWARES: js.Symbol = js.native
  
  @JSImport("koa-dec-router", "OPTIONS")
  @js.native
  val OPTIONS: js.Symbol = js.native
  
  @JSImport("koa-dec-router", "ROUTES")
  @js.native
  val ROUTES: js.Symbol = js.native
  
  inline def all(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def controller(path: Any, opts: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")((List(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def controller(path: Any, opts: Unit, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")((List(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def del(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def get(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def head(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def patch(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def post(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def put(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def route(method: String, path: Any, opts: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("route")((List(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def route(method: String, path: Any, opts: Unit, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("route")((List(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
}
