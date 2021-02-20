package typings.koaRoute

import org.scalablytyped.runtime.Shortcut
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaRoute.mod.KoaRoute.Routes
import typings.pathToRegexp.mod.ParseOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-route", JSImport.Namespace)
  @js.native
  val ^ : Routes = js.native
  
  object KoaRoute {
    
    type CreateMethod = js.Function1[/* method */ String, Method]
    
    type CreateRoute = js.Function1[/* routeFunc */ Handler, Middleware[DefaultState, DefaultContext]]
    
    type Handler = js.ThisFunction2[/* this */ Context, /* ctx */ Context, /* repeated */ js.Any, js.Any]
    
    @js.native
    trait Method extends StObject {
      
      def apply(path: Path): CreateRoute = js.native
      def apply(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def apply(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
    }
    
    type Path = String | RegExp | (js.Array[String | RegExp])
    
    @js.native
    trait Routes extends StObject {
      
      def acl(path: Path): CreateRoute = js.native
      def acl(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def acl(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("acl")
      var acl_Original: Method = js.native
      
      def all(path: Path): CreateRoute = js.native
      def all(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def all(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("all")
      var all_Original: Method = js.native
      
      def bind(path: Path): CreateRoute = js.native
      def bind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def bind(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("bind")
      var bind_Original: Method = js.native
      
      def checkout(path: Path): CreateRoute = js.native
      def checkout(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def checkout(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("checkout")
      var checkout_Original: Method = js.native
      
      def connect(path: Path): CreateRoute = js.native
      def connect(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def connect(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("connect")
      var connect_Original: Method = js.native
      
      def copy(path: Path): CreateRoute = js.native
      def copy(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def copy(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("copy")
      var copy_Original: Method = js.native
      
      def del(path: Path): CreateRoute = js.native
      def del(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def del(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("del")
      var del_Original: Method = js.native
      
      def delete(path: Path): CreateRoute = js.native
      def delete(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def delete(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("delete")
      var delete_Original: Method = js.native
      
      def get(path: Path): CreateRoute = js.native
      def get(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def get(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("get")
      var get_Original: Method = js.native
      
      def head(path: Path): CreateRoute = js.native
      def head(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def head(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("head")
      var head_Original: Method = js.native
      
      def link(path: Path): CreateRoute = js.native
      def link(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def link(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("link")
      var link_Original: Method = js.native
      
      def lock(path: Path): CreateRoute = js.native
      def lock(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def lock(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("lock")
      var lock_Original: Method = js.native
      
      def merge(path: Path): CreateRoute = js.native
      def merge(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def merge(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("merge")
      var merge_Original: Method = js.native
      
      def mkactivity(path: Path): CreateRoute = js.native
      def mkactivity(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def mkactivity(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("mkactivity")
      var mkactivity_Original: Method = js.native
      
      def mkcalendar(path: Path): CreateRoute = js.native
      def mkcalendar(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def mkcalendar(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("mkcalendar")
      var mkcalendar_Original: Method = js.native
      
      def mkcol(path: Path): CreateRoute = js.native
      def mkcol(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def mkcol(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("mkcol")
      var mkcol_Original: Method = js.native
      
      def move(path: Path): CreateRoute = js.native
      def move(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def move(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("move")
      var move_Original: Method = js.native
      
      def msearch(path: Path): CreateRoute = js.native
      def msearch(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def msearch(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("msearch")
      var msearch_Original: Method = js.native
      
      def notify(path: Path): CreateRoute = js.native
      def notify(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def notify(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("notify")
      var notify_Original: Method = js.native
      
      def options(path: Path): CreateRoute = js.native
      def options(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def options(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("options")
      var options_Original: Method = js.native
      
      def patch(path: Path): CreateRoute = js.native
      def patch(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def patch(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("patch")
      var patch_Original: Method = js.native
      
      def post(path: Path): CreateRoute = js.native
      def post(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def post(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("post")
      var post_Original: Method = js.native
      
      def propfind(path: Path): CreateRoute = js.native
      def propfind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def propfind(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("propfind")
      var propfind_Original: Method = js.native
      
      def proppatch(path: Path): CreateRoute = js.native
      def proppatch(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def proppatch(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("proppatch")
      var proppatch_Original: Method = js.native
      
      def purge(path: Path): CreateRoute = js.native
      def purge(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def purge(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("purge")
      var purge_Original: Method = js.native
      
      def put(path: Path): CreateRoute = js.native
      def put(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def put(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("put")
      var put_Original: Method = js.native
      
      def rebind(path: Path): CreateRoute = js.native
      def rebind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def rebind(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("rebind")
      var rebind_Original: Method = js.native
      
      def report(path: Path): CreateRoute = js.native
      def report(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def report(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("report")
      var report_Original: Method = js.native
      
      def search(path: Path): CreateRoute = js.native
      def search(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def search(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("search")
      var search_Original: Method = js.native
      
      def subscribe(path: Path): CreateRoute = js.native
      def subscribe(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def subscribe(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("subscribe")
      var subscribe_Original: Method = js.native
      
      def trace(path: Path): CreateRoute = js.native
      def trace(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def trace(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("trace")
      var trace_Original: Method = js.native
      
      def unbind(path: Path): CreateRoute = js.native
      def unbind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def unbind(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("unbind")
      var unbind_Original: Method = js.native
      
      def unlink(path: Path): CreateRoute = js.native
      def unlink(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def unlink(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("unlink")
      var unlink_Original: Method = js.native
      
      def unlock(path: Path): CreateRoute = js.native
      def unlock(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def unlock(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("unlock")
      var unlock_Original: Method = js.native
      
      def unsubscribe(path: Path): CreateRoute = js.native
      def unsubscribe(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
      def unsubscribe(
        path: Path,
        fn: Handler,
        opts: ParseOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ js.Any)
      ): Middleware[DefaultState, DefaultContext] = js.native
      @JSName("unsubscribe")
      var unsubscribe_Original: Method = js.native
    }
  }
  
  type _To = Routes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Routes = ^
}
