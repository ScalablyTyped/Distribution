package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`build:after`
import typings.ionic.ionicStrings.`build:before`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildHookInput extends HookInput {
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions
  val name: `build:before` | `build:after`
}

object BuildHookInput {
  @scala.inline
  def apply(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: `build:before` | `build:after`
  ): BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildHookInput]
  }
}

