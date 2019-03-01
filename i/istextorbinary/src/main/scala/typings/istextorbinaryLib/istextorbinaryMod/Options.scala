package typings
package istextorbinaryLib.istextorbinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkBegin: js.UndefOr[scala.Double] = js.undefined
  var chunkLength: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(chunkBegin: scala.Int | scala.Double = null, chunkLength: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (chunkBegin != null) __obj.updateDynamic("chunkBegin")(chunkBegin.asInstanceOf[js.Any])
    if (chunkLength != null) __obj.updateDynamic("chunkLength")(chunkLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

