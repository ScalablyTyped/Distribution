package typings
package jsonpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: scala.Double
  var `type`: java.lang.String
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Double, `type`: java.lang.String): Anon_Index = {
    val __obj = js.Dynamic.literal(index = index)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Index]
  }
}

