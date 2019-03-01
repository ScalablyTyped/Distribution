package typings
package jssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JssProps extends js.Object {
  var `@global`: js.UndefOr[CSSProperties] = js.undefined
  var composes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var extend: js.UndefOr[java.lang.String] = js.undefined
}

object JssProps {
  @scala.inline
  def apply(
    `@global`: CSSProperties = null,
    composes: java.lang.String | js.Array[java.lang.String] = null,
    extend: java.lang.String = null
  ): JssProps = {
    val __obj = js.Dynamic.literal()
    if (`@global` != null) __obj.updateDynamic("@global")(`@global`)
    if (composes != null) __obj.updateDynamic("composes")(composes.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[JssProps]
  }
}

