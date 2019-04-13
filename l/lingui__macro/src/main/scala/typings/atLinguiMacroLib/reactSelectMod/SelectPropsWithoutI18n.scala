package typings
package atLinguiMacroLib.reactSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPropsWithoutI18n
  extends atLinguiMacroLib.renderMod.RenderProps
     with /* exact */ org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNode] {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var other: reactLib.reactMod.ReactNode
  var value: java.lang.String
}

object SelectPropsWithoutI18n {
  @scala.inline
  def apply(
    other: reactLib.reactMod.ReactNode,
    value: java.lang.String,
    StringDictionary: /* exact */ org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNode] = null,
    className: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    render: reactLib.reactMod.ReactNode = null
  ): SelectPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPropsWithoutI18n]
  }
}

