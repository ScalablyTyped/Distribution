package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: js.Array[java.lang.String]
  var to: js.Array[java.lang.String]
}

object Anon_From {
  @scala.inline
  def apply(from: js.Array[java.lang.String], to: js.Array[java.lang.String]): Anon_From = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_From]
  }
}

