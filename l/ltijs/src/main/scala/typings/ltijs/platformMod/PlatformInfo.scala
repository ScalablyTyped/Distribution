package typings.ltijs.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformInfo extends js.Object {
  var description: String
  var family_code: String
  var name: String
  var version: String
}

object PlatformInfo {
  @scala.inline
  def apply(description: String, family_code: String, name: String, version: String): PlatformInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], family_code = family_code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
}

