package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a function in a script project.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunction extends js.Object {
  /**
    * The function name in the script project.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleAppsScriptTypeFunction {
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunction]
  }
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeFunctionOps[Self <: SchemaGoogleAppsScriptTypeFunction] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

