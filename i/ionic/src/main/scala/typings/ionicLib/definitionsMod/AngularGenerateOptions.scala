package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularGenerateOptions
  extends GenerateOptions
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object AngularGenerateOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AngularGenerateOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AngularGenerateOptions]
  }
}

