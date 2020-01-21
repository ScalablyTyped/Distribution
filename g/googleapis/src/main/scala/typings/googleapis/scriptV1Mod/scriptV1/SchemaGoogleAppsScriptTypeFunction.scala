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
  def apply(name: String = null): SchemaGoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunction]
  }
}

