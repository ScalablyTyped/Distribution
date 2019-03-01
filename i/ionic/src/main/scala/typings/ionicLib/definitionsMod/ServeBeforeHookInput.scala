package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeBeforeHookInput extends HookInput {
  val name: ionicLib.ionicLibStrings.`serve:before`
  val serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions
}

object ServeBeforeHookInput {
  @scala.inline
  def apply(
    name: ionicLib.ionicLibStrings.`serve:before`,
    serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions
  ): ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("serve")(serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeBeforeHookInput]
  }
}

