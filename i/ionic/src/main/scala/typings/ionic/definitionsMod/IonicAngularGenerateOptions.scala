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
    val __obj = js.Dynamic.literal(constants = constants, module = module, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IonicAngularGenerateOptions]
  }
}

