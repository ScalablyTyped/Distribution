package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object GenerateOptions {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): GenerateOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GenerateOptions]
  }
}

