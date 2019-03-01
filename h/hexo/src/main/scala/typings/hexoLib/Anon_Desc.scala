package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Desc extends js.Object {
  var desc: java.lang.String
  var name: java.lang.String
}

object Anon_Desc {
  @scala.inline
  def apply(desc: java.lang.String, name: java.lang.String): Anon_Desc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("desc")(desc)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Desc]
  }
}

