package typings.ink

import typings.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: ReactNodeArray
}

object AnonChildren {
  @scala.inline
  def apply(children: ReactNodeArray): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

