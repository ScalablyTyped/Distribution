package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.AnonIdUrl
import typings.googleapis.AnonObjectType
import typings.googleapis.AnonTotalItemsNumber
import typings.googleapis.AnonVerification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaComment extends js.Object {
  /**
    * The person who posted this comment.
    */
  var actor: js.UndefOr[AnonVerification] = js.native
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID of this comment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The activity this comment replied to.
    */
  var inReplyTo: js.UndefOr[js.Array[AnonIdUrl]] = js.native
  /**
    * Identifies this resource as a comment. Value: &quot;plus#comment&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The object of this comment.
    */
  var `object`: js.UndefOr[AnonObjectType] = js.native
  /**
    * People who +1&#39;d this comment.
    */
  var plusoners: js.UndefOr[AnonTotalItemsNumber] = js.native
  /**
    * The time at which this comment was initially published. Formatted as an
    * RFC 3339 timestamp.
    */
  var published: js.UndefOr[String] = js.native
  /**
    * Link to this comment resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The time at which this comment was last updated. Formatted as an RFC 3339
    * timestamp.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * This comment&#39;s verb, indicating what action was performed. Possible
    * values are:   - &quot;post&quot; - Publish content to the stream.
    */
  var verb: js.UndefOr[String] = js.native
}

object SchemaComment {
  @scala.inline
  def apply(
    actor: AnonVerification = null,
    etag: String = null,
    id: String = null,
    inReplyTo: js.Array[AnonIdUrl] = null,
    kind: String = null,
    `object`: AnonObjectType = null,
    plusoners: AnonTotalItemsNumber = null,
    published: String = null,
    selfLink: String = null,
    updated: String = null,
    verb: String = null
  ): SchemaComment = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaComment]
  }
}

