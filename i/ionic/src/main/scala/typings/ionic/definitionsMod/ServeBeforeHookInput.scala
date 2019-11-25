package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`serve:before`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeBeforeHookInput extends HookInput {
  val name: `serve:before`
  val serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions
}

object ServeBeforeHookInput {
  @scala.inline
  def apply(name: `serve:before`, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServeBeforeHookInput]
  }
}

