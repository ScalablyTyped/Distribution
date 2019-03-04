package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfile extends js.Object {
  var created: java.lang.String
  var credentials: ionicLib.Anon_Android
  var name: java.lang.String
  var tag: java.lang.String
  var `type`: ionicLib.ionicLibStrings.development | ionicLib.ionicLibStrings.production
}

object SecurityProfile {
  @scala.inline
  def apply(
    created: java.lang.String,
    credentials: ionicLib.Anon_Android,
    name: java.lang.String,
    tag: java.lang.String,
    `type`: ionicLib.ionicLibStrings.development | ionicLib.ionicLibStrings.production
  ): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created, credentials = credentials, name = name, tag = tag)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
}

