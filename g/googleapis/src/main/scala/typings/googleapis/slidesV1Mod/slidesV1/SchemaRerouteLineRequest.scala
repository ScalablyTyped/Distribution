package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reroutes a line such that it&#39;s connected at the two closest connection
  * sites on the connected page elements.
  */
@js.native
trait SchemaRerouteLineRequest extends js.Object {
  /**
    * The object ID of the line to reroute.  Only a line with a category
    * indicating it is a &quot;connector&quot; can be rerouted. The start and
    * end connections of the line must be on different page elements.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaRerouteLineRequest {
  @scala.inline
  def apply(objectId: String = null): SchemaRerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRerouteLineRequest]
  }
}

