package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Transform
trait TransformedSource extends js.Object {
  var code: String
  var map: Maybe[js.Object | String]
}

object TransformedSource {
  @scala.inline
  def apply(code: String, map: Maybe[js.Object | String] = null): TransformedSource = {
    val __obj = js.Dynamic.literal(code = code)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformedSource]
  }
}

