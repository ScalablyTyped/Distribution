package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.buildColonafter
import typings.ionic.ionicStrings.buildColonbefore
import typings.ionic.ionicStrings.serveColonafter
import typings.ionic.ionicStrings.serveColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.BuildHookInput
  - typings.ionic.definitionsMod.ServeBeforeHookInput
  - typings.ionic.definitionsMod.ServeAfterHookInput
*/
trait HookInput extends js.Object

object HookInput {
  @scala.inline
  def BuildHookInput(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): HookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookInput]
  }
  @scala.inline
  def ServeBeforeHookInput(name: serveColonbefore, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): HookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookInput]
  }
  @scala.inline
  def ServeAfterHookInput(
    name: serveColonafter,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): HookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookInput]
  }
}

