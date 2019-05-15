package typings
package hookrouterLib.hookrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hookrouter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def A(props: hookrouterLib.hookrouterMod.HookRouterNs.AProps): reactLib.reactMod.ReactHTMLElement[stdLib.HTMLAnchorElement] = js.native
  def confirmNavigation(): scala.Unit = js.native
  def get(componentId: scala.Double): hookrouterLib.hookrouterMod.HookRouterNs.RouteObject | scala.Null = js.native
  def getBasepath(): java.lang.String = js.native
  def getPath(): java.lang.String = js.native
  def getQueryParams(): hookrouterLib.hookrouterMod.HookRouterNs.QueryParams = js.native
  def getTitle(): java.lang.String = js.native
  def getWorkingPath(parentRouterId: java.lang.String): java.lang.String = js.native
  def interceptRoute(previousRoute: java.lang.String, nextRoute: java.lang.String): js.Array[java.lang.String] = js.native
  def navigate(url: java.lang.String, replace: hookrouterLib.hookrouterLibNumbers.`true`): scala.Unit = js.native
  def navigate(
    url: java.lang.String,
    replace: hookrouterLib.hookrouterLibNumbers.`true`,
    queryParams: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams
  ): scala.Unit = js.native
  def navigate(
    url: java.lang.String,
    replace: hookrouterLib.hookrouterLibNumbers.`true`,
    queryParams: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams,
    replaceQueryParams: scala.Boolean
  ): scala.Unit = js.native
  def navigate(
    url: java.lang.String,
    replace: hookrouterLib.hookrouterLibNumbers.`true`,
    queryParams: scala.Null,
    replaceQueryParams: scala.Boolean
  ): scala.Unit = js.native
  def objectToQueryString(inObj: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams): java.lang.String = js.native
  def prepareRoute(inRoute: java.lang.String): js.Tuple2[stdLib.RegExp, js.Array[java.lang.String]] = js.native
  def queryStringToObject(inStr: java.lang.String): hookrouterLib.hookrouterMod.HookRouterNs.QueryParams = js.native
  def remove(componentId: scala.Double): scala.Unit = js.native
  def resetPath(): scala.Unit = js.native
  def resolvePath(inPath: java.lang.String): java.lang.String = js.native
  def setBasepath(inBasepath: java.lang.String): scala.Unit = js.native
  def setLinkProps(props: hookrouterLib.hookrouterMod.HookRouterNs.AProps): hookrouterLib.hookrouterMod.HookRouterNs.AProps = js.native
  def setPath(inPath: java.lang.String): scala.Unit = js.native
  def setQueryParams(inObj: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams): scala.Unit = js.native
  def setQueryParams(inObj: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams, replace: scala.Boolean): scala.Unit = js.native
  def stopInterception(): scala.Unit = js.native
  def updatePathHooks(): scala.Unit = js.native
  def useControlledInterceptor(): js.Tuple4[
    hookrouterLib.hookrouterMod.HookRouterNs.InterceptedPath, 
    js.Function0[scala.Unit], 
    js.Function0[scala.Unit], 
    js.Function0[scala.Unit]
  ] = js.native
  def useInterceptor(handlerFn: js.Function1[/* repeated */ js.Any, _]): js.Function0[js.Function1[/* componentId */ scala.Double, scala.Unit]] = js.native
  def usePath(): java.lang.String = js.native
  def usePath(active: scala.Boolean): java.lang.String = js.native
  def usePath(active: scala.Boolean, withBasePath: scala.Boolean): java.lang.String = js.native
  def useQueryParams(): js.Tuple2[
    hookrouterLib.hookrouterMod.HookRouterNs.QueryParams, 
    js.Function2[
      /* inObj */ hookrouterLib.hookrouterMod.HookRouterNs.QueryParams, 
      /* replace */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.native
  def useRedirect(fromURL: java.lang.String, toURL: java.lang.String): scala.Unit = js.native
  def useRedirect(
    fromURL: java.lang.String,
    toURL: java.lang.String,
    queryParams: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams
  ): scala.Unit = js.native
  def useRedirect(
    fromURL: java.lang.String,
    toURL: java.lang.String,
    queryParams: hookrouterLib.hookrouterMod.HookRouterNs.QueryParams,
    replace: scala.Boolean
  ): scala.Unit = js.native
  def useRedirect(
    fromURL: java.lang.String,
    toURL: java.lang.String,
    queryParams: scala.Null,
    replace: scala.Boolean
  ): scala.Unit = js.native
  def useRoutes(routeObj: hookrouterLib.hookrouterMod.HookRouterNs.RouteObject): reactLib.reactMod.ReactNode = js.native
  def useTitle(inString: java.lang.String): scala.Unit = js.native
}

