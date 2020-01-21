package typings.iso31662.mod.SubdivisionInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partial extends js.Object {
  var name: String
  var `type`: String
}

object Partial {
  @scala.inline
  def apply(name: String, `type`: String): Partial = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partial]
  }
}

