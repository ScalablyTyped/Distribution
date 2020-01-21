package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of functions. No duplicates are permitted.
  */
@js.native
trait SchemaGoogleAppsScriptTypeFunctionSet extends js.Object {
  /**
    * A list of functions composing the set.
    */
  var values: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeFunction]] = js.native
}

object SchemaGoogleAppsScriptTypeFunctionSet {
  @scala.inline
  def apply(values: js.Array[SchemaGoogleAppsScriptTypeFunction] = null): SchemaGoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunctionSet]
  }
}

