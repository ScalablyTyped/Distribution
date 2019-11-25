package typings.atKoaRouter.atKoaRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  /**
    * Methods which should be supported by the router.
    */
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Prefix for all routes.
    */
  var prefix: js.UndefOr[String] = js.undefined
  var routerPath: js.UndefOr[String] = js.undefined
  /**
    * Whether or not routing should be case-sensitive.
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not routes should matched strictly.
    *
    * If strict matching is enabled, the trailing slash is taken into
    * account when matching routes.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    methods: js.Array[String] = null,
    prefix: String = null,
    routerPath: String = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (routerPath != null) __obj.updateDynamic("routerPath")(routerPath.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

