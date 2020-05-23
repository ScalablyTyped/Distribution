package typings.hapiAccept.mod.parseAll

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers
  extends /* header */ StringDictionary[js.Any] {
  val accept: js.UndefOr[String] = js.undefined
  val `accept-charset`: js.UndefOr[String] = js.undefined
  val `accept-encoding`: js.UndefOr[String] = js.undefined
  val `accept-language`: js.UndefOr[String] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    accept: String = null,
    `accept-charset`: String = null,
    `accept-encoding`: String = null,
    `accept-language`: String = null
  ): Headers = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (`accept-charset` != null) __obj.updateDynamic("accept-charset")(`accept-charset`.asInstanceOf[js.Any])
    if (`accept-encoding` != null) __obj.updateDynamic("accept-encoding")(`accept-encoding`.asInstanceOf[js.Any])
    if (`accept-language` != null) __obj.updateDynamic("accept-language")(`accept-language`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

