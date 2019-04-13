package typings
package hppLib.hppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var checkBody: js.UndefOr[scala.Boolean] = js.undefined
  var checkBodyOnlyForContentType: js.UndefOr[java.lang.String] = js.undefined
  var checkQuery: js.UndefOr[scala.Boolean] = js.undefined
  var whitelist: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkBody: js.UndefOr[scala.Boolean] = js.undefined,
    checkBodyOnlyForContentType: java.lang.String = null,
    checkQuery: js.UndefOr[scala.Boolean] = js.undefined,
    whitelist: java.lang.String | js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkBody)) __obj.updateDynamic("checkBody")(checkBody)
    if (checkBodyOnlyForContentType != null) __obj.updateDynamic("checkBodyOnlyForContentType")(checkBodyOnlyForContentType)
    if (!js.isUndefined(checkQuery)) __obj.updateDynamic("checkQuery")(checkQuery)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

