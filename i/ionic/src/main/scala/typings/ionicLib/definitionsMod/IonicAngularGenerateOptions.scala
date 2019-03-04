package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularGenerateOptions extends GenerateOptions {
  var constants: scala.Boolean
  var module: scala.Boolean
}

object IonicAngularGenerateOptions {
  @scala.inline
  def apply(constants: scala.Boolean, module: scala.Boolean, name: java.lang.String, `type`: java.lang.String): IonicAngularGenerateOptions = {
    val __obj = js.Dynamic.literal(constants = constants, module = module, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IonicAngularGenerateOptions]
  }
}

