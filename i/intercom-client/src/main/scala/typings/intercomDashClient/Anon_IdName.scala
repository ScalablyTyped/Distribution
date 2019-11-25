package typings.intercomDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdName extends js.Object {
  var id: String
  var name: String
  var `type`: String
}

object Anon_IdName {
  @scala.inline
  def apply(id: String, name: String, `type`: String): Anon_IdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdName]
  }
}

