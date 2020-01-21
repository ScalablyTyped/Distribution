package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s bragging rights.
  */
@js.native
trait SchemaBraggingRights extends js.Object {
  /**
    * Metadata about the bragging rights.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The bragging rights; for example, `climbed mount everest`.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaBraggingRights {
  @scala.inline
  def apply(metadata: SchemaFieldMetadata = null, value: String = null): SchemaBraggingRights = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBraggingRights]
  }
}

