package typings.hookrouter.hookrouterMod

import typings.hookrouter.hookrouterMod.HookRouterNs.AProps
import typings.hookrouter.hookrouterMod.HookRouterNs.InterceptedPath
import typings.hookrouter.hookrouterMod.HookRouterNs.QueryParams
import typings.hookrouter.hookrouterMod.HookRouterNs.RouteObject
import typings.react.reactMod.ReactHTMLElement
import typings.std.HTMLAnchorElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hookrouter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def A(props: AProps): ReactHTMLElement[HTMLAnchorElement] = js.native
  def confirmNavigation(): Unit = js.native
  def get(componentId: Double): RouteObject | Null = js.native
  def getBasepath(): String = js.native
  def getPath(): String = js.native
  def getQueryParams(): QueryParams = js.native
  def getTitle(): String = js.native
  def getWorkingPath(parentRouterId: String): String = js.native
  def interceptRoute(previousRoute: String, nextRoute: String): js.Array[String] = js.native
  def navigate(url: String): Unit = js.native
  def navigate(url: String, replace: Boolean): Unit = js.native
  def navigate(url: String, replace: Boolean, queryParams: Null, replaceQueryParams: Boolean): Unit = js.native
  def navigate(url: String, replace: Boolean, queryParams: QueryParams): Unit = js.native
  def navigate(url: String, replace: Boolean, queryParams: QueryParams, replaceQueryParams: Boolean): Unit = js.native
  def objectToQueryString(inObj: QueryParams): String = js.native
  def prepareRoute(inRoute: String): js.Tuple2[RegExp, js.Array[String]] = js.native
  def queryStringToObject(inStr: String): QueryParams = js.native
  def remove(componentId: Double): Unit = js.native
  def resetPath(): Unit = js.native
  def resolvePath(inPath: String): String = js.native
  def setBasepath(inBasepath: String): Unit = js.native
  def setLinkProps(props: AProps): AProps = js.native
  def setPath(inPath: String): Unit = js.native
  def setQueryParams(inObj: QueryParams): Unit = js.native
  def setQueryParams(inObj: QueryParams, replace: Boolean): Unit = js.native
  def stopInterception(): Unit = js.native
  def updatePathHooks(): Unit = js.native
  def useControlledInterceptor(): js.Tuple4[InterceptedPath, js.Function0[Unit], js.Function0[Unit], js.Function0[Unit]] = js.native
  def useInterceptor(handlerFn: js.Function1[/* repeated */ js.Any, _]): js.Function0[js.Function1[/* componentId */ Double, Unit]] = js.native
  def usePath(): String = js.native
  def usePath(active: Boolean): String = js.native
  def usePath(active: Boolean, withBasePath: Boolean): String = js.native
  def useQueryParams(): js.Tuple2[
    QueryParams, 
    js.Function2[/* inObj */ QueryParams, /* replace */ js.UndefOr[Boolean], Unit]
  ] = js.native
  def useRedirect(fromURL: String, toURL: String): Unit = js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: Null, replace: Boolean): Unit = js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: QueryParams): Unit = js.native
  def useRedirect(fromURL: String, toURL: String, queryParams: QueryParams, replace: Boolean): Unit = js.native
  def useRoutes(routeObj: RouteObject): js.Any = js.native
  def useTitle(inString: String): Unit = js.native
}

