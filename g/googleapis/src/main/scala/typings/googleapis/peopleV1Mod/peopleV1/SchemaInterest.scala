package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of the person&#39;s interests.
  */
@js.native
trait SchemaInterest extends js.Object {
  /**
    * Metadata about the interest.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The interest; for example, `stargazing`.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaInterest {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, value: String = null): SchemaInterest = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterest]
  }
}

