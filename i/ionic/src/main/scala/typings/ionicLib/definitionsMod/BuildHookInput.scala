package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildHookInput extends HookInput {
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions
  val name: ionicLib.ionicLibStrings.`build:before` | ionicLib.ionicLibStrings.`build:after`
}

object BuildHookInput {
  @scala.inline
  def apply(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: ionicLib.ionicLibStrings.`build:before` | ionicLib.ionicLibStrings.`build:after`
  ): BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildHookInput]
  }
}

