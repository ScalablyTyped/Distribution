package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a dimension.
  */
@js.native
trait SchemaDimension extends js.Object {
  /**
    * The kind of resource this is, in this case dfareporting#dimension.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The dimension name, e.g. dfa:advertiser
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaDimension {
  @scala.inline
  def apply(kind: String = null, name: String = null): SchemaDimension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDimension]
  }
}

