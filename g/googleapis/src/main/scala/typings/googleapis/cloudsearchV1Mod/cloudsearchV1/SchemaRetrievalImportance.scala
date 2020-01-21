package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRetrievalImportance extends js.Object {
  /**
    * Indicates the ranking importance given to property when it is matched
    * during retrieval. Once set, the token importance of a property cannot be
    * changed.
    */
  var importance: js.UndefOr[String] = js.native
}

object SchemaRetrievalImportance {
  @scala.inline
  def apply(importance: String = null): SchemaRetrievalImportance = {
    val __obj = js.Dynamic.literal()
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRetrievalImportance]
  }
}

