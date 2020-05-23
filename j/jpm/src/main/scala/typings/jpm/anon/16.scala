package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `16` extends js.Object {
  var `16`: js.UndefOr[String] = js.undefined
  var `32`: js.UndefOr[String] = js.undefined
  var `64`: js.UndefOr[String] = js.undefined
}

object `16` {
  @scala.inline
  def apply(`16`: String = null, `32`: String = null, `64`: String = null): `16` = {
    val __obj = js.Dynamic.literal()
    if (`16` != null) __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
    if (`32` != null) __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
    if (`64` != null) __obj.updateDynamic("64")(`64`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
}

