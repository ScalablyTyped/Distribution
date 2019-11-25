package typings.atIonicAngular.distProvidersNavDashControllerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularRouter.atAngularRouterMod.ActivatedRoute
import typings.atAngularRouter.atAngularRouterMod.NavigationExtras
import typings.atAngularRouter.atAngularRouterMod.Params
import typings.atAngularRouter.atAngularRouterMod.QueryParamsHandling
import typings.atIonicAngular.atIonicAngularStrings.back
import typings.atIonicAngular.atIonicAngularStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions
  extends NavigationExtras
     with AnimationOptions

object NavigationOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationDirection: forward | back = null,
    fragment: String = null,
    preserveFragment: js.UndefOr[Boolean] = js.undefined,
    preserveQueryParams: js.UndefOr[Boolean] = js.undefined,
    queryParams: Params = null,
    queryParamsHandling: QueryParamsHandling = null,
    relativeTo: ActivatedRoute = null,
    replaceUrl: js.UndefOr[Boolean] = js.undefined,
    skipLocationChange: js.UndefOr[Boolean] = js.undefined,
    state: StringDictionary[js.Any] = null
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (animationDirection != null) __obj.updateDynamic("animationDirection")(animationDirection.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFragment)) __obj.updateDynamic("preserveFragment")(preserveFragment.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveQueryParams)) __obj.updateDynamic("preserveQueryParams")(preserveQueryParams.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (queryParamsHandling != null) __obj.updateDynamic("queryParamsHandling")(queryParamsHandling.asInstanceOf[js.Any])
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceUrl)) __obj.updateDynamic("replaceUrl")(replaceUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLocationChange)) __obj.updateDynamic("skipLocationChange")(skipLocationChange.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions]
  }
}

