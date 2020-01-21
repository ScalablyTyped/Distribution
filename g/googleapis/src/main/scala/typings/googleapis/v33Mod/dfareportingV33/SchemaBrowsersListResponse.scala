package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Browser List Response
  */
@js.native
trait SchemaBrowsersListResponse extends js.Object {
  /**
    * Browser collection.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBrowsersListResponse {
  @scala.inline
  def apply(browsers: js.Array[SchemaBrowser] = null, kind: String = null): SchemaBrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBrowsersListResponse]
  }
}

