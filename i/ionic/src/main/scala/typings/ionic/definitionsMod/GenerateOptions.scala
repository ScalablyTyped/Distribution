package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var name: String
  var `type`: String
}

object GenerateOptions {
  @scala.inline
  def apply(name: String, `type`: String): GenerateOptions = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GenerateOptions]
  }
}

