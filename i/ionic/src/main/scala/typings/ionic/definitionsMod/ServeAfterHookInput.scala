package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.serveColonafter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeAfterHookInput extends HookInput {
  val name: serveColonafter
  val serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
}

object ServeAfterHookInput {
  @scala.inline
  def apply(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): ServeAfterHookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeAfterHookInput]
  }
}

