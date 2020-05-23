package typings.hapiServerSession.mod

import typings.hapiHapi.mod.CachePolicyOptions
import typings.hapiHapi.mod.ServerStateCookieOptions
import typings.node.cryptoMod.BinaryLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var cache: js.UndefOr[CachePolicyOptions[_]] = js.undefined
  var cookie: js.UndefOr[ServerStateCookieOptions] = js.undefined
  var expiresIn: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[BinaryLike] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    algorithm: String = null,
    cache: CachePolicyOptions[_] = null,
    cookie: ServerStateCookieOptions = null,
    expiresIn: js.UndefOr[Double] = js.undefined,
    key: BinaryLike = null,
    name: String = null,
    size: js.UndefOr[Double] = js.undefined,
    vhost: String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

