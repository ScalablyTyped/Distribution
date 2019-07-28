package typings.jsonpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: Double
  var `type`: String
}

object Anon_Index {
  @scala.inline
  def apply(index: Double, `type`: String): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Index]
  }
}

