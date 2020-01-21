package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a NamedRange referencing the given range.
  */
@js.native
trait SchemaCreateNamedRangeRequest extends js.Object {
  /**
    * The name of the NamedRange. Names do not need to be unique.  Names must
    * be at least 1 character and no more than 256 characters, measured in
    * UTF-16 code units.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The range to apply the name to.
    */
  var range: js.UndefOr[SchemaRange] = js.native
}

object SchemaCreateNamedRangeRequest {
  @scala.inline
  def apply(name: String = null, range: SchemaRange = null): SchemaCreateNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateNamedRangeRequest]
  }
}

