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
  def apply(): SchemaRerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRerouteLineRequest]
  }
  @scala.inline
  implicit class SchemaRerouteLineRequestOps[Self <: SchemaRerouteLineRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

