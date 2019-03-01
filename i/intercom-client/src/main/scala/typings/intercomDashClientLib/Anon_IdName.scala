package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdName extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
}

object Anon_IdName {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `type`: java.lang.String): Anon_IdName = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_IdName]
  }
}

