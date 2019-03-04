package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeAfterHookInput extends HookInput {
  val name: ionicLib.ionicLibStrings.`serve:after`
  val serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
}

object ServeAfterHookInput {
  @scala.inline
  def apply(
    name: ionicLib.ionicLibStrings.`serve:after`,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = name, serve = serve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServeAfterHookInput]
  }
}

