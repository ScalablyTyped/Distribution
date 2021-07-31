package typings.koaDecRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-dec-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(opts: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
  
  @scala.inline
  def all(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def controller(path: js.Any, opts: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def controller(path: js.Any, opts: Unit, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def del(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def get(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def head(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def patch(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def post(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def put(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def route(method: String, path: js.Any, opts: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def route(method: String, path: js.Any, opts: Unit, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
