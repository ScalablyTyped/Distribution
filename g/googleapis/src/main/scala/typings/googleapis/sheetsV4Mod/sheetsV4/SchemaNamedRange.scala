package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A named range.
  */
@js.native
trait SchemaNamedRange extends js.Object {
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The range this represents.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaNamedRange {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null, range: SchemaGridRange = null): SchemaNamedRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedRange]
  }
}

