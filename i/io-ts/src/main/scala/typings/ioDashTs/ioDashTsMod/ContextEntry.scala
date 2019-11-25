package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextEntry extends js.Object {
  /** the input data */
  val actual: js.UndefOr[js.Any] = js.undefined
  val key: String
  val `type`: Decoder[_, _]
}

object ContextEntry {
  @scala.inline
  def apply(key: String, `type`: Decoder[_, _], actual: js.Any = null): ContextEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEntry]
  }
}

