package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s read-only photo. A picture shown next to the person&#39;s
  * name to help others recognize the person.
  */
@js.native
trait SchemaPhoto extends js.Object {
  /**
    * True if the photo is a default photo; false if the photo is a
    * user-provided photo.
    */
  var default: js.UndefOr[Boolean] = js.native
  /**
    * Metadata about the photo.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The URL of the photo. You can change the desired size by appending a
    * query parameter `sz=`&lt;var&gt;size&lt;/var&gt; at the end of the url.
    * Example:
    * `https://lh3.googleusercontent.com/-T_wVWLlmg7w/AAAAAAAAAAI/AAAAAAAABa8/00gzXvDBYqw/s100/photo.jpg?sz=50`
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaPhoto {
  @scala.inline
  def apply(
    default: js.UndefOr[Boolean] = js.undefined,
    metadata: SchemaFieldMetadata = null,
    url: String = null
  ): SchemaPhoto = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPhoto]
  }
}

