package typings.jimp.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAction extends js.Object {
  @JSName("apply")
  var apply: ColorActionName
  var params: js.Any
}

object ColorAction {
  @scala.inline
  def apply(apply: ColorActionName, params: js.Any): ColorAction = {
    val __obj = js.Dynamic.literal(apply = apply, params = params)
  
    __obj.asInstanceOf[ColorAction]
  }
}

