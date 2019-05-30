package typings
package atIonicAngularLib.distProvidersNavDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions
  extends atAngularRouterLib.atAngularRouterMod.NavigationExtras
     with AnimationOptions

object NavigationOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationDirection: atIonicAngularLib.atIonicAngularLibStrings.forward | atIonicAngularLib.atIonicAngularLibStrings.back = null,
    fragment: java.lang.String = null,
    preserveFragment: js.UndefOr[scala.Boolean] = js.undefined,
    preserveQueryParams: js.UndefOr[scala.Boolean] = js.undefined,
    queryParams: atAngularRouterLib.atAngularRouterMod.Params = null,
    queryParamsHandling: atAngularRouterLib.atAngularRouterMod.QueryParamsHandling = null,
    relativeTo: atAngularRouterLib.atAngularRouterMod.ActivatedRoute = null,
    replaceUrl: js.UndefOr[scala.Boolean] = js.undefined,
    skipLocationChange: js.UndefOr[scala.Boolean] = js.undefined,
    state: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationDirection != null) __obj.updateDynamic("animationDirection")(animationDirection.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment)
    if (!js.isUndefined(preserveFragment)) __obj.updateDynamic("preserveFragment")(preserveFragment)
    if (!js.isUndefined(preserveQueryParams)) __obj.updateDynamic("preserveQueryParams")(preserveQueryParams)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (queryParamsHandling != null) __obj.updateDynamic("queryParamsHandling")(queryParamsHandling)
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo)
    if (!js.isUndefined(replaceUrl)) __obj.updateDynamic("replaceUrl")(replaceUrl)
    if (!js.isUndefined(skipLocationChange)) __obj.updateDynamic("skipLocationChange")(skipLocationChange)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[NavigationOptions]
  }
}

