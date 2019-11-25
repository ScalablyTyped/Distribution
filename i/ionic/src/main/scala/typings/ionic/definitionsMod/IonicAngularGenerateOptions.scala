package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularGenerateOptions extends GenerateOptions {
  var constants: Boolean
  var module: Boolean
}

object IonicAngularGenerateOptions {
  @scala.inline
  def apply(constants: Boolean, module: Boolean, name: String, `type`: String): IonicAngularGenerateOptions = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicAngularGenerateOptions]
  }
}

