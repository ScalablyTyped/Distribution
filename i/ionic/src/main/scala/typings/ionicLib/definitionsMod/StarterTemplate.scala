package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterTemplate extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var name: java.lang.String
  var `type`: ProjectType
}

object StarterTemplate {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    `type`: ProjectType,
    description: java.lang.String = null
  ): StarterTemplate = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[StarterTemplate]
  }
}

