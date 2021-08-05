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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hookrouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def A(props: AProps): ReactHTMLElement[HTMLAnchorElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("A")(props.asInstanceOf[js.Any]).asInstanceOf[ReactHTMLElement[HTMLAnchorElement]]
  
  inline def confirmNavigation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmNavigation")().asInstanceOf[Unit]
  
  inline def get(componentId: Double): RouteObject[js.Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(componentId.asInstanceOf[js.Any]).asInstanceOf[RouteObject[js.Any] | Null]
  
  inline def getBasepath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasepath")().asInstanceOf[String]
  
  inline def getPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[String]
  
  inline def getQueryParams(): QueryParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParams")().asInstanceOf[QueryParams]
  
  inline def getTitle(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")().asInstanceOf[String]
  
  inline def getWorkingPath(parentRouterId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkingPath")(parentRouterId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def interceptRoute(previousRoute: String, nextRoute: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptRoute")(previousRoute.asInstanceOf[js.Any], nextRoute.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def navigate(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Boolean, queryParams: Null, replaceQueryParams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replaceQueryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Boolean, queryParams: Unit, replaceQueryParams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replaceQueryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Boolean, queryParams: QueryParams): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Boolean, queryParams: QueryParams, replaceQueryParams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replaceQueryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Unit, queryParams: Null, replaceQueryParams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replaceQueryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Unit, queryParams: Unit, replaceQueryParams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replaceQueryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Unit, queryParams: QueryParams): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def navigate(url: String, replace: Unit, queryParams: QueryParams, replaceQueryParams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(url.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replaceQueryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def objectToQueryString(inObj: QueryParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToQueryString")(inObj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prepareRoute(inRoute: String): js.Tuple2[RegExp, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareRoute")(inRoute.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RegExp, js.Array[String]]]
  
  inline def queryStringToObject(inStr: String): QueryParams = ^.asInstanceOf[js.Dynamic].applyDynamic("queryStringToObject")(inStr.asInstanceOf[js.Any]).asInstanceOf[QueryParams]
  
  inline def remove(componentId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(componentId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetPath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetPath")().asInstanceOf[Unit]
  
  inline def resolvePath(inPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePath")(inPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setBasepath(inBasepath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBasepath")(inBasepath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLinkProps(props: AProps): AProps = ^.asInstanceOf[js.Dynamic].applyDynamic("setLinkProps")(props.asInstanceOf[js.Any]).asInstanceOf[AProps]
  
  inline def setPath(inPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(inPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setQueryParams(inObj: QueryParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setQueryParams")(inObj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setQueryParams(inObj: QueryParams, replace: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setQueryParams")(inObj.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stopInterception(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopInterception")().asInstanceOf[Unit]
  
  inline def updatePathHooks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updatePathHooks")().asInstanceOf[Unit]
  
  inline def useControlledInterceptor(): js.Tuple4[InterceptedPath, js.Function0[Unit], js.Function0[Unit], js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlledInterceptor")().asInstanceOf[js.Tuple4[InterceptedPath, js.Function0[Unit], js.Function0[Unit], js.Function0[Unit]]]
  
  inline def useInterceptor(handlerFn: js.Function2[/* currentPath */ String, /* nextPath */ String, String]): js.Function0[js.Function1[/* componentId */ Double, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterceptor")(handlerFn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Function1[/* componentId */ Double, Unit]]]
  
  inline def usePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("usePath")().asInstanceOf[String]
  inline def usePath(active: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("usePath")(active.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def usePath(active: Boolean, withBasePath: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("usePath")(active.asInstanceOf[js.Any], withBasePath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def usePath(active: Unit, withBasePath: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("usePath")(active.asInstanceOf[js.Any], withBasePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useQueryParams(): js.Tuple2[
    QueryParams, 
    js.Function2[/* inObj */ QueryParams, /* replace */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryParams")().asInstanceOf[js.Tuple2[
    QueryParams, 
    js.Function2[/* inObj */ QueryParams, /* replace */ js.UndefOr[Boolean], Unit]
  ]]
  
  inline def useRedirect(fromURL: String, toURL: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRedirect")(fromURL.asInstanceOf[js.Any], toURL.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRedirect(fromURL: String, toURL: String, queryParams: Null, replace: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRedirect")(fromURL.asInstanceOf[js.Any], toURL.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRedirect(fromURL: String, toURL: String, queryParams: Unit, replace: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRedirect")(fromURL.asInstanceOf[js.Any], toURL.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRedirect(fromURL: String, toURL: String, queryParams: QueryParams): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRedirect")(fromURL.asInstanceOf[js.Any], toURL.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useRedirect(fromURL: String, toURL: String, queryParams: QueryParams, replace: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRedirect")(fromURL.asInstanceOf[js.Any], toURL.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useRoutes[T](routeObj: RouteObject[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoutes")(routeObj.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def useTitle(inString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useTitle")(inString.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object HookRouter {
    
    trait AProps
      extends StObject
         with AnchorHTMLAttributes[HTMLAnchorElement] {
      
      @JSName("href")
      var href_AProps: String
    }
    object AProps {
      
      inline def apply(href: String): AProps = {
        val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
        __obj.asInstanceOf[AProps]
      }
      
      extension [Self <: AProps](x: Self) {
        
        inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      }
    }
    
    type InterceptedPath = String | Null
    
    type QueryParams = StringDictionary[js.Any]
    
    type RouteObject[T] = StringDictionary[js.Function1[/* params */ QueryParams, T]]
  }
}
