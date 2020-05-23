package typings.jimpCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var `class`: js.Any
}

object Class {
  @scala.inline
  def apply(`class`: js.Any): Class = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

