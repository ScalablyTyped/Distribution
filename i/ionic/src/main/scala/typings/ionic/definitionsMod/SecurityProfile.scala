package typings.ionic.definitionsMod

import typings.ionic.Anon_Android
import typings.ionic.ionicStrings.development
import typings.ionic.ionicStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfile extends js.Object {
  var created: String
  var credentials: Anon_Android
  var name: String
  var tag: String
  var `type`: development | production
}

object SecurityProfile {
  @scala.inline
  def apply(
    created: String,
    credentials: Anon_Android,
    name: String,
    tag: String,
    `type`: development | production
  ): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created, credentials = credentials, name = name, tag = tag)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
}

