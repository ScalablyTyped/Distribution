package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s nickname.
  */
@js.native
trait SchemaNickname extends js.Object {
  /**
    * Metadata about the nickname.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The type of the nickname.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The nickname.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaNickname {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, `type`: String = null, value: String = null): SchemaNickname = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNickname]
  }
}

