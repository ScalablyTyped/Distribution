package typings.ionicAngular.navControllerMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularRouter.mod.ActivatedRoute
import typings.angularRouter.mod.NavigationExtras
import typings.angularRouter.mod.Params
import typings.angularRouter.mod.QueryParamsHandling
import typings.ionicAngular.ionicAngularStrings.back
import typings.ionicAngular.ionicAngularStrings.forward
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
    queryParams: js.UndefOr[Null | Params] = js.undefined,
    queryParamsHandling: js.UndefOr[Null | QueryParamsHandling] = js.undefined,
    relativeTo: js.UndefOr[Null | ActivatedRoute] = js.undefined,
    replaceUrl: js.UndefOr[Boolean] = js.undefined,
    skipLocationChange: js.UndefOr[Boolean] = js.undefined,
    state: StringDictionary[js.Any] = null
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animationDirection != null) __obj.updateDynamic("animationDirection")(animationDirection.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFragment)) __obj.updateDynamic("preserveFragment")(preserveFragment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveQueryParams)) __obj.updateDynamic("preserveQueryParams")(preserveQueryParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queryParams)) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(queryParamsHandling)) __obj.updateDynamic("queryParamsHandling")(queryParamsHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeTo)) __obj.updateDynamic("relativeTo")(relativeTo.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceUrl)) __obj.updateDynamic("replaceUrl")(replaceUrl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipLocationChange)) __obj.updateDynamic("skipLocationChange")(skipLocationChange.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions]
  }
}

