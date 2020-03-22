package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.AnonTotalItemsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCircle extends js.Object {
  /**
    * The description of this circle.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The circle name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of the circle.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this resource as a circle. Value: &quot;plus#circle&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The people in this circle.
    */
  var people: js.UndefOr[AnonTotalItemsNumber] = js.native
  /**
    * Link to this circle resource
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaCircle {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    people: AnonTotalItemsNumber = null,
    selfLink: String = null
  ): SchemaCircle = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (people != null) __obj.updateDynamic("people")(people.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCircle]
  }
}

