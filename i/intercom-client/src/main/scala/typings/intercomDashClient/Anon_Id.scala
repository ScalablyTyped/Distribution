package typings.intercomDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var name: String
  var `type`: String
}

object Anon_Id {
  @scala.inline
  def apply(id: String, name: String, `type`: String): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Id]
  }
}

