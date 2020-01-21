package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A read-only brief one-line description of the person.
  */
@js.native
trait SchemaTagline extends js.Object {
  /**
    * Metadata about the tagline.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The tagline.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaTagline {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, value: String = null): SchemaTagline = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTagline]
  }
}

