package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only cover photo. A large image shown on the
  * person&#39;s profile page that represents who they are or what they care
  * about.
  */
@js.native
trait SchemaCoverPhoto extends js.Object {
  /**
    * True if the cover photo is the default cover photo; false if the cover
    * photo is a user-provided cover photo.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the cover photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The URL of the cover photo.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaCoverPhoto {
  @scala.inline
  def apply(
    default: js.UndefOr[Boolean] = js.undefined,
    metadata: SchemaFieldMetadata = null,
    url: String = null
  ): SchemaCoverPhoto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCoverPhoto]
  }
}

