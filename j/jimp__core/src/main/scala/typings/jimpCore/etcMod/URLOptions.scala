package typings.jimpCore.etcMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLOptions extends js.Object {
  var compression: js.UndefOr[Boolean] = js.undefined
  var headers: StringDictionary[js.Any]
  var url: String
}

object URLOptions {
  @scala.inline
  def apply(headers: StringDictionary[js.Any], url: String, compression: js.UndefOr[Boolean] = js.undefined): URLOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLOptions]
  }
}

