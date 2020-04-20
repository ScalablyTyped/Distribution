package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.serveColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeBeforeHookInput extends HookInput {
  val name: serveColonbefore
  val serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions
}

object ServeBeforeHookInput {
  @scala.inline
  def apply(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): ServeBeforeHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeBeforeHookInput]
  }
}

