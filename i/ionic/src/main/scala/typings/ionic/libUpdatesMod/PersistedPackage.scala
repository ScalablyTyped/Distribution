package typings.ionic.libUpdatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistedPackage extends js.Object {
  var name: String
  var version: String
}

object PersistedPackage {
  @scala.inline
  def apply(name: String, version: String): PersistedPackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistedPackage]
  }
}

