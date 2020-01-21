package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Contacts representing contacts. This is the response from the
  * server to GET requests on the contacts collection.
  */
@js.native
trait SchemaContactsListResponse extends js.Object {
  /**
    * Contact list.
    */
  var items: js.UndefOr[js.Array[SchemaContact]] = js.native
  /**
    * The type of resource. This is always mirror#contacts.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaContactsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaContact] = null, kind: String = null): SchemaContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContactsListResponse]
  }
}

