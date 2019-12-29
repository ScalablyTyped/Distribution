package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.buildColonafter
import typings.ionic.ionicStrings.buildColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildHookInput extends HookInput {
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions
  val name: buildColonbefore | buildColonafter
}

object BuildHookInput {
  @scala.inline
  def apply(
    build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions,
    name: buildColonbefore | buildColonafter
  ): BuildHookInput = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildHookInput]
  }
}

