package typings
package materialDashUiLib.internalAppCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCanvasProps
  extends reactLib.reactMod.Props[AppCanvas]

object AppCanvasProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[AppCanvas] = null
  ): AppCanvasProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCanvasProps]
  }
}

