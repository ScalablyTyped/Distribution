package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The projection of document&#39;s fields to return.
  */
@js.native
trait SchemaProjection extends js.Object {
  /**
    * The fields to return.  If empty, all fields are returned. To only return
    * the name of the document, use `[&#39;__name__&#39;]`.
    */
  var fields: js.UndefOr[js.Array[SchemaFieldReference]] = js.native
}

object SchemaProjection {
  @scala.inline
  def apply(fields: js.Array[SchemaFieldReference] = null): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjection]
  }
}

