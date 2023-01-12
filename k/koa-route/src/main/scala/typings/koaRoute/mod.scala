package typings.koaRoute

import org.scalablytyped.runtime.Shortcut
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaRoute.mod.KoaRoute.Routes
import typings.pathToRegexp.mod.ParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-route", JSImport.Namespace)
  @js.native
  val ^ : Routes = js.native
  
  object KoaRoute {
    
    type CreateMethod = js.Function1[/* method */ String, Method]
    
    type CreateRoute = js.Function1[/* routeFunc */ Handler, Middleware[DefaultState, DefaultContext, Any]]
    
    /**
      * The Koa handler will receive parameters extracted from the route as extra arguments.
      */
    @js.native
    trait Handler extends StObject {
      
      def apply(ctx: Context, params: Any*): Any = js.native
    }
    
    @js.native
    trait Method extends StObject {
      
      def apply(path: Path): CreateRoute = js.native
      def apply(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any] = js.native
      def apply(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any] = js.native
    }
    
    type Path = String | js.RegExp | (js.Array[String | js.RegExp])
    
    trait Routes extends StObject {
      
      def acl(path: Path): CreateRoute
      def acl(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def acl(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("acl")
      var acl_Original: Method
      
      def all(path: Path): CreateRoute
      def all(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def all(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("all")
      var all_Original: Method
      
      def bind(path: Path): CreateRoute
      def bind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def bind(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("bind")
      var bind_Original: Method
      
      def checkout(path: Path): CreateRoute
      def checkout(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def checkout(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("checkout")
      var checkout_Original: Method
      
      def connect(path: Path): CreateRoute
      def connect(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def connect(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("connect")
      var connect_Original: Method
      
      def copy(path: Path): CreateRoute
      def copy(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def copy(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("copy")
      var copy_Original: Method
      
      def del(path: Path): CreateRoute
      def del(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def del(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("del")
      var del_Original: Method
      
      def delete(path: Path): CreateRoute
      def delete(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def delete(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("delete")
      var delete_Original: Method
      
      def get(path: Path): CreateRoute
      def get(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def get(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("get")
      var get_Original: Method
      
      def head(path: Path): CreateRoute
      def head(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def head(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("head")
      var head_Original: Method
      
      def link(path: Path): CreateRoute
      def link(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def link(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("link")
      var link_Original: Method
      
      def lock(path: Path): CreateRoute
      def lock(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def lock(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("lock")
      var lock_Original: Method
      
      def merge(path: Path): CreateRoute
      def merge(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def merge(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("merge")
      var merge_Original: Method
      
      def mkactivity(path: Path): CreateRoute
      def mkactivity(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def mkactivity(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("mkactivity")
      var mkactivity_Original: Method
      
      def mkcalendar(path: Path): CreateRoute
      def mkcalendar(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def mkcalendar(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("mkcalendar")
      var mkcalendar_Original: Method
      
      def mkcol(path: Path): CreateRoute
      def mkcol(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def mkcol(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("mkcol")
      var mkcol_Original: Method
      
      def move(path: Path): CreateRoute
      def move(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def move(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("move")
      var move_Original: Method
      
      def msearch(path: Path): CreateRoute
      def msearch(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def msearch(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("msearch")
      var msearch_Original: Method
      
      def notify(path: Path): CreateRoute
      def notify(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def notify(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("notify")
      var notify_Original: Method
      
      def options(path: Path): CreateRoute
      def options(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def options(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("options")
      var options_Original: Method
      
      def patch(path: Path): CreateRoute
      def patch(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def patch(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("patch")
      var patch_Original: Method
      
      def post(path: Path): CreateRoute
      def post(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def post(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("post")
      var post_Original: Method
      
      def propfind(path: Path): CreateRoute
      def propfind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def propfind(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("propfind")
      var propfind_Original: Method
      
      def proppatch(path: Path): CreateRoute
      def proppatch(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def proppatch(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("proppatch")
      var proppatch_Original: Method
      
      def purge(path: Path): CreateRoute
      def purge(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def purge(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("purge")
      var purge_Original: Method
      
      def put(path: Path): CreateRoute
      def put(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def put(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("put")
      var put_Original: Method
      
      def rebind(path: Path): CreateRoute
      def rebind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def rebind(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("rebind")
      var rebind_Original: Method
      
      def report(path: Path): CreateRoute
      def report(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def report(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("report")
      var report_Original: Method
      
      def search(path: Path): CreateRoute
      def search(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def search(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("search")
      var search_Original: Method
      
      def subscribe(path: Path): CreateRoute
      def subscribe(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def subscribe(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("subscribe")
      var subscribe_Original: Method
      
      def trace(path: Path): CreateRoute
      def trace(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def trace(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("trace")
      var trace_Original: Method
      
      def unbind(path: Path): CreateRoute
      def unbind(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def unbind(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("unbind")
      var unbind_Original: Method
      
      def unlink(path: Path): CreateRoute
      def unlink(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def unlink(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("unlink")
      var unlink_Original: Method
      
      def unlock(path: Path): CreateRoute
      def unlock(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def unlock(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("unlock")
      var unlock_Original: Method
      
      def unsubscribe(path: Path): CreateRoute
      def unsubscribe(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext, Any]
      def unsubscribe(
        path: Path,
        fn: Handler,
        opts: ParseOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify pathToRegexp.RegExpOptions */ Any)
      ): Middleware[DefaultState, DefaultContext, Any]
      @JSName("unsubscribe")
      var unsubscribe_Original: Method
    }
    object Routes {
      
      inline def apply(
        acl: Method,
        all: Method,
        bind: Method,
        checkout: Method,
        connect: Method,
        copy: Method,
        del: Method,
        delete: Method,
        get: Method,
        head: Method,
        link: Method,
        lock: Method,
        merge: Method,
        mkactivity: Method,
        mkcalendar: Method,
        mkcol: Method,
        move: Method,
        msearch: Method,
        notify_ : Method,
        options: Method,
        patch: Method,
        post: Method,
        propfind: Method,
        proppatch: Method,
        purge: Method,
        put: Method,
        rebind: Method,
        report: Method,
        search: Method,
        subscribe: Method,
        trace: Method,
        unbind: Method,
        unlink: Method,
        unlock: Method,
        unsubscribe: Method
      ): Routes = {
        val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], bind = bind.asInstanceOf[js.Any], checkout = checkout.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], mkactivity = mkactivity.asInstanceOf[js.Any], mkcalendar = mkcalendar.asInstanceOf[js.Any], mkcol = mkcol.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], msearch = msearch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], propfind = propfind.asInstanceOf[js.Any], proppatch = proppatch.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], rebind = rebind.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], unbind = unbind.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any], unlock = unlock.asInstanceOf[js.Any], unsubscribe = unsubscribe.asInstanceOf[js.Any])
        __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
        __obj.asInstanceOf[Routes]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Routes] (val x: Self) extends AnyVal {
        
        inline def setAcl(value: Method): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
        
        inline def setAll(value: Method): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
        
        inline def setBind(value: Method): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
        
        inline def setCheckout(value: Method): Self = StObject.set(x, "checkout", value.asInstanceOf[js.Any])
        
        inline def setConnect(value: Method): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
        
        inline def setCopy(value: Method): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
        
        inline def setDel(value: Method): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        inline def setDelete(value: Method): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
        
        inline def setGet(value: Method): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
        
        inline def setHead(value: Method): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        inline def setLink(value: Method): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLock(value: Method): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
        
        inline def setMerge(value: Method): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
        
        inline def setMkactivity(value: Method): Self = StObject.set(x, "mkactivity", value.asInstanceOf[js.Any])
        
        inline def setMkcalendar(value: Method): Self = StObject.set(x, "mkcalendar", value.asInstanceOf[js.Any])
        
        inline def setMkcol(value: Method): Self = StObject.set(x, "mkcol", value.asInstanceOf[js.Any])
        
        inline def setMove(value: Method): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
        
        inline def setMsearch(value: Method): Self = StObject.set(x, "msearch", value.asInstanceOf[js.Any])
        
        inline def setNotify_(value: Method): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: Method): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setPatch(value: Method): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
        
        inline def setPost(value: Method): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
        
        inline def setPropfind(value: Method): Self = StObject.set(x, "propfind", value.asInstanceOf[js.Any])
        
        inline def setProppatch(value: Method): Self = StObject.set(x, "proppatch", value.asInstanceOf[js.Any])
        
        inline def setPurge(value: Method): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
        
        inline def setPut(value: Method): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
        
        inline def setRebind(value: Method): Self = StObject.set(x, "rebind", value.asInstanceOf[js.Any])
        
        inline def setReport(value: Method): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
        
        inline def setSearch(value: Method): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
        
        inline def setSubscribe(value: Method): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
        
        inline def setTrace(value: Method): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
        
        inline def setUnbind(value: Method): Self = StObject.set(x, "unbind", value.asInstanceOf[js.Any])
        
        inline def setUnlink(value: Method): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
        
        inline def setUnlock(value: Method): Self = StObject.set(x, "unlock", value.asInstanceOf[js.Any])
        
        inline def setUnsubscribe(value: Method): Self = StObject.set(x, "unsubscribe", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = Routes
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Routes = ^
}
