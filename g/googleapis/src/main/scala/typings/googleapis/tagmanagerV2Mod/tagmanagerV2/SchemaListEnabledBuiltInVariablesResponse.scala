package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of enabled built-in variables.
  */
@js.native
trait SchemaListEnabledBuiltInVariablesResponse extends js.Object {
  /**
    * All GTM BuiltInVariables of a GTM container.
    */
  var builtInVariable: js.UndefOr[js.Array[SchemaBuiltInVariable]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListEnabledBuiltInVariablesResponse {
  @scala.inline
  def apply(builtInVariable: js.Array[SchemaBuiltInVariable] = null, nextPageToken: String = null): SchemaListEnabledBuiltInVariablesResponse = {
    val __obj = js.Dynamic.literal()
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListEnabledBuiltInVariablesResponse]
  }
}

