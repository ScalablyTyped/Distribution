package typings.hlsParser

import typings.hlsParser.mod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUri extends js.Object {
  var byterange: js.UndefOr[Byterange] = js.undefined
  var uri: String
}

object AnonUri {
  @scala.inline
  def apply(uri: String, byterange: Byterange = null): AnonUri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (byterange != null) __obj.updateDynamic("byterange")(byterange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUri]
  }
}

