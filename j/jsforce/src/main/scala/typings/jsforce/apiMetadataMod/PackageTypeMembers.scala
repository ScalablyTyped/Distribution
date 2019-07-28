package typings.jsforce.apiMetadataMod

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
    val __obj = js.Dynamic.literal(members = members, name = name)
  
    __obj.asInstanceOf[PackageTypeMembers]
  }
}

