package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document header.
  */
@js.native
trait SchemaHeader extends js.Object {
  /**
    * The contents of the header.  The indexes for a header&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  /**
    * The ID of the header.
    */
  var headerId: js.UndefOr[String] = js.native
}

object SchemaHeader {
  @scala.inline
  def apply(content: js.Array[SchemaStructuralElement] = null, headerId: String = null): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (headerId != null) __obj.updateDynamic("headerId")(headerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHeader]
  }
}

