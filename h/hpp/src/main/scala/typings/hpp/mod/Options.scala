package typings.hpp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var checkBody: js.UndefOr[Boolean] = js.undefined
  var checkBodyOnlyForContentType: js.UndefOr[String] = js.undefined
  var checkQuery: js.UndefOr[Boolean] = js.undefined
  var whitelist: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkBody: js.UndefOr[Boolean] = js.undefined,
    checkBodyOnlyForContentType: String = null,
    checkQuery: js.UndefOr[Boolean] = js.undefined,
    whitelist: String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkBody)) __obj.updateDynamic("checkBody")(checkBody.asInstanceOf[js.Any])
    if (checkBodyOnlyForContentType != null) __obj.updateDynamic("checkBodyOnlyForContentType")(checkBodyOnlyForContentType.asInstanceOf[js.Any])
    if (!js.isUndefined(checkQuery)) __obj.updateDynamic("checkQuery")(checkQuery.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

