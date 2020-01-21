package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event definition resource.
  */
@js.native
trait SchemaEventDefinition extends js.Object {
  /**
    * A list of events that are a child of this event.
    */
  var childEvents: js.UndefOr[js.Array[SchemaEventChild]] = js.native
  /**
    * Description of what this event represents.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name to display for the event.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The ID of the event.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The base URL for the image that represents the event.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isDefaultImageUrl: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventDefinition.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The visibility of event being tracked in this definition. Possible values
    * are:   - &quot;REVEALED&quot;: This event should be visible to all users.
    * - &quot;HIDDEN&quot;: This event should only be shown to users that have
    * recorded this event at least once.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaEventDefinition {
  @scala.inline
  def apply(
    childEvents: js.Array[SchemaEventChild] = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    imageUrl: String = null,
    isDefaultImageUrl: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    visibility: String = null
  ): SchemaEventDefinition = {
    val __obj = js.Dynamic.literal()
    if (childEvents != null) __obj.updateDynamic("childEvents")(childEvents.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultImageUrl)) __obj.updateDynamic("isDefaultImageUrl")(isDefaultImageUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventDefinition]
  }
}

