package typings.jestTransform.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformedSource extends js.Object {
  var code: String
  var map: js.UndefOr[FixedRawSourceMap | String | Null] = js.undefined
}

object TransformedSource {
  @scala.inline
  def apply(code: String, map: FixedRawSourceMap | String = null): TransformedSource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformedSource]
  }
}

