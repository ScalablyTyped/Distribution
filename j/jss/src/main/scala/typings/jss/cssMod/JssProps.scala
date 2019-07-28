package typings.jss.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JssProps extends js.Object {
  var `@global`: js.UndefOr[CSSProperties] = js.undefined
  var composes: js.UndefOr[String | js.Array[String]] = js.undefined
  var extend: js.UndefOr[String] = js.undefined
}

object JssProps {
  @scala.inline
  def apply(`@global`: CSSProperties = null, composes: String | js.Array[String] = null, extend: String = null): JssProps = {
    val __obj = js.Dynamic.literal()
    if (`@global` != null) __obj.updateDynamic("@global")(`@global`)
    if (composes != null) __obj.updateDynamic("composes")(composes.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[JssProps]
  }
}

