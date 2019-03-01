package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var left: Anon_Schema
  var right: Anon_Schema
}

object Anon_Left {
  @scala.inline
  def apply(left: Anon_Schema, right: Anon_Schema): Anon_Left = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_Left]
  }
}

