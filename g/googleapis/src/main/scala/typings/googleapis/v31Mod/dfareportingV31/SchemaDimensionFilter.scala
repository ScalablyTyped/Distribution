package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a dimension filter.
  */
@js.native
trait SchemaDimensionFilter extends js.Object {
  /**
    * The name of the dimension to filter.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#dimensionFilter.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The value of the dimension to filter.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaDimensionFilter {
  @scala.inline
  def apply(dimensionName: String = null, kind: String = null, value: String = null): SchemaDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimensionFilter]
  }
}

