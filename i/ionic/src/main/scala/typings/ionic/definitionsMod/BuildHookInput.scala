package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.buildColonafter
import typings.ionic.ionicStrings.buildColonbefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildHookInput extends HookInput {
  
  val build: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions = js.native
  
  val name: buildColonbefore | buildColonafter = js.native
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
  
  @scala.inline
  implicit class BuildHookInputOps[Self <: BuildHookInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: AngularBuildOptions | IonicAngularBuildOptions | Ionic1BuildOptions): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: buildColonbefore | buildColonafter): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
