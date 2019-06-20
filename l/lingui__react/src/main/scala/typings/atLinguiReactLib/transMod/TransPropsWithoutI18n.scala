package typings
package atLinguiReactLib.transMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransPropsWithoutI18n
  extends atLinguiReactLib.renderMod.RenderProps {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var components: js.UndefOr[js.Array[reactLib.reactMod.ReactElement]] = js.undefined
  var defaults: js.UndefOr[java.lang.String] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Object] = js.undefined
}

object TransPropsWithoutI18n {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    components: js.Array[reactLib.reactMod.ReactElement] = null,
    defaults: java.lang.String = null,
    formats: js.Object = null,
    id: java.lang.String = null,
    render: reactLib.reactMod.ReactNode = null,
    values: js.Object = null
  ): TransPropsWithoutI18n = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (components != null) __obj.updateDynamic("components")(components)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (id != null) __obj.updateDynamic("id")(id)
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TransPropsWithoutI18n]
  }
}

