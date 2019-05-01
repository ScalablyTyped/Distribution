package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLOptions extends js.Object {
  var compression: js.UndefOr[scala.Boolean] = js.undefined
  var headers: org.scalablytyped.runtime.StringDictionary[js.Any]
  var url: java.lang.String
}

object URLOptions {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[js.Any],
    url: java.lang.String,
    compression: js.UndefOr[scala.Boolean] = js.undefined
  ): URLOptions = {
    val __obj = js.Dynamic.literal(headers = headers, url = url)
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression)
    __obj.asInstanceOf[URLOptions]
  }
}

