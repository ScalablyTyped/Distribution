package typings
package atLinguiReactLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPropsWithoutI18n
  extends atLinguiReactLib.renderMod.RenderProps
     with /* exact */ org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode] {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var other: reactLib.reactMod.ReactNs.ReactNode
  var value: java.lang.String
}

object SelectPropsWithoutI18n {
  @scala.inline
  def apply(
    other: reactLib.reactMod.ReactNs.ReactNode,
    value: java.lang.String,
    StringDictionary: /* exact */ org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactNode] = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    render: reactLib.reactMod.ReactNs.ReactNode = null
  ): SelectPropsWithoutI18n = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPropsWithoutI18n]
  }
}

