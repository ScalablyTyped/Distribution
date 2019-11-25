package typings.atMaterialDashUiLab.autocompleteAutocompleteMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderGroupParams extends js.Object {
  var children: ReactNode
  var key: String
}

object RenderGroupParams {
  @scala.inline
  def apply(key: String, children: ReactNode = null): RenderGroupParams = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderGroupParams]
  }
}

