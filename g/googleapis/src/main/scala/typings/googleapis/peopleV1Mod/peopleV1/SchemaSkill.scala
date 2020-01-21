package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A skill that the person has.
  */
@js.native
trait SchemaSkill extends js.Object {
  /**
    * Metadata about the skill.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The skill; for example, `underwater basket weaving`.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaSkill {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, value: String = null): SchemaSkill = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSkill]
  }
}

