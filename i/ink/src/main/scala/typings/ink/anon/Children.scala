package typings.ink.anon

import typings.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: ReactNodeArray
}

object Children {
  @scala.inline
  def apply(children: ReactNodeArray): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

