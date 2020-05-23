package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uri extends js.Object {
  var byterange: js.UndefOr[typings.hlsParser.mod.Byterange] = js.undefined
  var uri: String
}

object Uri {
  @scala.inline
  def apply(uri: String, byterange: typings.hlsParser.mod.Byterange = null): Uri = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (byterange != null) __obj.updateDynamic("byterange")(byterange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
}

