package typings.ionic.definitionsMod

import typings.ionic.anon.Android
import typings.ionic.ionicStrings.development
import typings.ionic.ionicStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfile extends js.Object {
  var created: String
  var credentials: Android
  var name: String
  var tag: String
  var `type`: development | production
}

object SecurityProfile {
  @scala.inline
  def apply(created: String, credentials: Android, name: String, tag: String, `type`: development | production): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
}

