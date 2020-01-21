package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [`rewrite`](/docs/hosting/full-config#rewrites) represents an internal
  * content rewrite on the version. If the pattern matches, the request will be
  * handled as if it were to the destination path specified in the
  * configuration.
  */
@js.native
trait SchemaRewrite extends js.Object {
  /**
    * The request will be forwarded to Firebase Dynamic Links.
    */
  var dynamicLinks: js.UndefOr[Boolean] = js.native
  /**
    * The function to proxy requests to. Must match the exported function name
    * exactly.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.native
  /**
    * The URL path to rewrite the request to.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The request will be forwarded to Cloud Run.
    */
  var run: js.UndefOr[SchemaCloudRunRewrite] = js.native
}

object SchemaRewrite {
  @scala.inline
  def apply(
    dynamicLinks: js.UndefOr[Boolean] = js.undefined,
    function: String = null,
    glob: String = null,
    path: String = null,
    run: SchemaCloudRunRewrite = null
  ): SchemaRewrite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicLinks)) __obj.updateDynamic("dynamicLinks")(dynamicLinks.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRewrite]
  }
}

