package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s short biography.
  */
@js.native
trait SchemaBiography extends js.Object {
  /**
    * The content type of the biography.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Metadata about the biography.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The short biography.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaBiography {
  @scala.inline
  def apply(contentType: String = null, metadata: SchemaFieldMetadata = null, value: String = null): SchemaBiography = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBiography]
  }
}

