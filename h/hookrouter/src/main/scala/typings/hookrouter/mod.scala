package typings.hookrouter

import org.scalablytyped.runtime.StringDictionary
import typings.hookrouter.mod.HookRouter.AProps
import typings.hookrouter.mod.HookRouter.InterceptedPath
import typings.hookrouter.mod.HookRouter.QueryParams
import typings.hookrouter.mod.HookRouter.RouteObject
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ReactHTMLElement
import typings.std.HTMLAnchorElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hookrouter", "A")
  @js.native
  def A(props: AProps): ReactHTMLElement[HTMLAnchorElement] = js.native
  
  @JSImport("hookrouter", "confirmNavigation")
  @js.native
  def confirmNavigation(): Unit = js.native
  
  @JSImport("hookrouter", "get")
  @js.native
  def get(componentId: Double): RouteObject[_] | Null = js.native
  
  @JSImport("hookrouter", "getBasepath")
  @js.native
  def getBasepath(): String = js.native
  
  @JSImport("hookrouter", "getPath")
  @js.native
  def getPath(): String = js.native
  
  @JSImport("hookrouter", "getQueryParams")
  @js.native
  def getQueryParams(): QueryParams = js.native
  
  @JSImport("hookrouter", "getTitle")
  @js.native
  def getTitle(): String = js.native
  
  @JSImport("hookrouter", "getWorkingPath")
  @js.native
  def getWorkingPath(parentRouterId: String): String = js.native
  
  @JSImport("hookrouter", "interceptRoute")
  @js.native
  def interceptRoute(previousRoute: String, nextRoute: String): js.Array[String] = js.native
  
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(
    url: String,
    replace: js.UndefOr[scala.Nothing],
    queryParams: js.UndefOr[scala.Nothing],
    replaceQueryParams: Boolean
  ): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: js.UndefOr[scala.Nothing], queryParams: Null, replaceQueryParams: Boolean): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: js.UndefOr[scala.Nothing], queryParams: QueryParams): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(
    url: String,
    replace: js.UndefOr[scala.Nothing],
    queryParams: QueryParams,
    replaceQueryParams: Boolean
  ): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: Boolean): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: Boolean, queryParams: js.UndefOr[scala.Nothing], replaceQueryParams: Boolean): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: Boolean, queryParams: Null, replaceQueryParams: Boolean): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: Boolean, queryParams: QueryParams): Unit = js.native
  @JSImport("hookrouter", "navigate")
  @js.native
  def navigate(url: String, replace: Boolean, queryParams: QueryParams, replaceQueryParams: Boolean): Unit = js.native
  
  @JSImport("hookrouter", "objectToQueryString")
  @js.native
  def objectToQueryString(inObj: QueryParams): String = js.native
  
  @JSImport("hookrouter", "prepareRoute")
  @js.native
  def prepareRoute(inRoute: String): js.Tuple2[RegExp, js.Array[String]] = js.native
  
  @JSImport("hookrouter", "queryStringToObject")
  @js.native
  def queryStringToObject(inStr: String): QueryParams = js.native
  
  @JSImport("hookrouter", "remove")
  @js.native
  def remove(componentId: Double): Unit = js.native
  
  @JSImport("hookrouter", "resetPath")
  @js.native
  def resetPath(): Unit = js.native
  
  @JSImport("hookrouter", "resolvePath")
  @js.native
  def resolvePath(inPath: String): String = js.native
  
  @JSImport("hookrouter", "setBasepath")
  @js.native
  def setBasepath(inBasepath: String): Unit = js.native
  
  @JSImport("hookrouter", "setLinkProps")
  @js.native
  def setLinkProps(props: AProps): AProps = js.native
  
  @JSImport("hookrouter", "setPath")
  @js.native
  def setPath(inPath: String): Unit = js.native
  
  @JSImport("hookrouter", "setQueryParams")
  @js.native
  def setQueryParams(inObj: QueryParams): Unit = js.native
  @JSImport("hookrouter", "setQueryParams")
  @js.native
  def setQueryParams(inObj: QueryParams, replace: Boolean): Unit = js.native
  
  @JSImport("hookrouter", "stopInterception")
  @js.native
  def stopInterception(): Unit = js.native
  
  @JSImport("hookrouter", "updatePathHooks")
  @js.native
  def updatePathHooks(): Unit = js.native
  
  @JSImport("hookrouter", "useControlledInterceptor")
  @js.native
  def useControlledInterceptor(): js.Tuple4[InterceptedPath, js.Function0[Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
  
  @JSImport("hookrouter", "useInterceptor")
  @js.native
  def useInterceptor(handlerFn: js.Function2[/* currentPath */ String, /* nextPath */ String, String]): js.Function0[js.Function1[/* componentId */ Double, Unit]] = js.native
  
  @JSImport("hookrouter", "usePath")
  @js.native
  def usePath(): String = js.native
  @JSImport("hookrouter", "usePath")
  @js.native
  def usePath(active: js.UndefOr[scala.Nothing], withBasePath: Boolean): String = js.native
  @JSImport("hookrouter", "usePath")
  @js.native
  def usePath(active: Boolean): String = js.native
  @JSImport("hookrouter", "usePath")
  @js.native
  def usePath(active: Boolean, withBasePath: Boolean): String = js.native
  
  @JSImport("hookrouter", "useQueryParams")
  @js.native
  def useQueryParams(): js.Tuple2[
    QueryParams, 
    js.Function2[/* inObj */ QueryParams, /* replace */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  @JSImport("hookrouter", "useRedirect")
  @js.native
  def useRedirect(fromURL: String, toURL: String): Unit = js.native
  @JSImport("hookrouter", "useRedirect")
  @js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: js.UndefOr[scala.Nothing], replace: Boolean): Unit = js.native
  @JSImport("hookrouter", "useRedirect")
  @js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: Null, replace: Boolean): Unit = js.native
  @JSImport("hookrouter", "useRedirect")
  @js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: QueryParams): Unit = js.native
  @JSImport("hookrouter", "useRedirect")
  @js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: QueryParams, replace: Boolean): Unit = js.native
  
  @JSImport("hookrouter", "useRoutes")
  @js.native
  def useRoutes[T](routeObj: RouteObject[T]): T | Null = js.native
  
  @JSImport("hookrouter", "useTitle")
  @js.native
  def useTitle(inString: String): Unit = js.native
  
  object HookRouter {
    
    @js.native
    trait AProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
      
      @JSName("href")
      var href_AProps: String = js.native
    }
    object AProps {
      
      @scala.inline
      def apply(href: String): AProps = {
        val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
        __obj.asInstanceOf[AProps]
      }
      
      @scala.inline
      implicit class APropsMutableBuilder[Self <: AProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      }
    }
    
    type InterceptedPath = String | Null
    
    type QueryParams = StringDictionary[js.Any]
    
    type RouteObject[T] = StringDictionary[js.Function1[/* params */ QueryParams, T]]
  }
}
