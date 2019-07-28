package typings.materialDashUi.internalAppCanvasMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCanvasProps extends Props[AppCanvas]

object AppCanvasProps {
  @scala.inline
  def apply(children: ReactNode = null, key: Key = null, ref: LegacyRef[AppCanvas] = null): AppCanvasProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCanvasProps]
  }
}

