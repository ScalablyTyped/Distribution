package typings.ioDashTs.es6Mod

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
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (actual != null) __obj.updateDynamic("actual")(actual)
    __obj.asInstanceOf[ContextEntry]
  }
}

