package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularGenerateOptions
  extends GenerateOptions
     with /* key */ StringDictionary[js.Any]

object AngularGenerateOptions {
  @scala.inline
  def apply(name: String, `type`: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AngularGenerateOptions = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AngularGenerateOptions]
  }
}

