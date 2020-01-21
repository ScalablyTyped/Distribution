package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.AnonActor
import typings.googleapis.AnonClientSpecificActorInfo
import typings.googleapis.AnonTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaActivity extends js.Object {
  /**
    * Identifies who has access to see this activity.
    */
  var access: js.UndefOr[SchemaAcl] = js.native
  /**
    * The person who performed this activity.
    */
  var actor: js.UndefOr[AnonClientSpecificActorInfo] = js.native
  /**
    * Street address where this activity occurred.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Additional content added by the person who shared this activity,
    * applicable only when resharing an activity.
    */
  var annotation: js.UndefOr[String] = js.native
  /**
    * If this activity is a crosspost from another system, this property
    * specifies the ID of the original activity.
    */
  var crosspostSource: js.UndefOr[String] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Latitude and longitude where this activity occurred. Format is latitude
    * followed by longitude, space separated.
    */
  var geocode: js.UndefOr[String] = js.native
  /**
    * The ID of this activity.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this resource as an activity. Value:
    * &quot;plus#activity&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The location where this activity occurred.
    */
  var location: js.UndefOr[SchemaPlace] = js.native
  /**
    * The object of this activity.
    */
  var `object`: js.UndefOr[AnonActor] = js.native
  /**
    * ID of the place where this activity occurred.
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * Name of the place where this activity occurred.
    */
  var placeName: js.UndefOr[String] = js.native
  /**
    * The service provider that initially published this activity.
    */
  var provider: js.UndefOr[AnonTitle] = js.native
  /**
    * The time at which this activity was initially published. Formatted as an
    * RFC 3339 timestamp.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * Radius, in meters, of the region where this activity occurred, centered
    * at the latitude and longitude identified in geocode.
    */
  var radius: js.UndefOr[String] = js.native
  /**
    * Title of this activity.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time at which this activity was last updated. Formatted as an RFC
    * 3339 timestamp.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The link to this activity.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * This activity&#39;s verb, which indicates the action that was performed.
    * Possible values include, but are not limited to, the following values: -
    * &quot;post&quot; - Publish content to the stream.  - &quot;share&quot; -
    * Reshare an activity.
    */
  var verb: js.UndefOr[String] = js.native
}

object SchemaActivity {
  @scala.inline
  def apply(
    access: SchemaAcl = null,
    actor: AnonClientSpecificActorInfo = null,
    address: String = null,
    annotation: String = null,
    crosspostSource: String = null,
    etag: String = null,
    geocode: String = null,
    id: String = null,
    kind: String = null,
    location: SchemaPlace = null,
    `object`: AnonActor = null,
    placeId: String = null,
    placeName: String = null,
    provider: AnonTitle = null,
    published: String = null,
    radius: String = null,
    title: String = null,
    updated: String = null,
    url: String = null,
    verb: String = null
  ): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (crosspostSource != null) __obj.updateDynamic("crosspostSource")(crosspostSource.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (geocode != null) __obj.updateDynamic("geocode")(geocode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    if (placeName != null) __obj.updateDynamic("placeName")(placeName.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivity]
  }
}

