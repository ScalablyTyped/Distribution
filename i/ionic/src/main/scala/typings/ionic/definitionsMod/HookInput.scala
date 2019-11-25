package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`build:after`
import typings.ionic.ionicStrings.`build:before`
import typings.ionic.ionicStrings.`serve:after`
import typings.ionic.ionicStrings.`serve:before`
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
    name: `build:before` | `build:after`
  ): HookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInput]
  }
  @scala.inline
  def ServeBeforeHookInput(name: `serve:before`, serve: AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions): HookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInput]
  }
  @scala.inline
  def ServeAfterHookInput(
    name: `serve:after`,
    serve: (AngularServeOptions | IonicAngularServeOptions | Ionic1ServeOptions) with ServeDetails
  ): HookInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serve = serve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookInput]
  }
}

