package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageTypeMembers extends js.Object {
  var members: js.Array[String]
  var name: String
}

object PackageTypeMembers {
  @scala.inline
  def apply(members: js.Array[String], name: String): PackageTypeMembers = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageTypeMembers]
  }
}

