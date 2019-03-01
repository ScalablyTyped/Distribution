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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("credentials")(credentials)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[SecurityProfile]
  }
}

