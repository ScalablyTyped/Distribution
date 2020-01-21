package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom floodlight variable.
  */
@js.native
trait SchemaCustomFloodlightVariable extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#customFloodlightVariable&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The type of custom floodlight variable to supply a value for. These map
    * to the &quot;u[1-20]=&quot; in the tags.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value of the custom floodlight variable. The length of string must
    * not exceed 50 characters.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCustomFloodlightVariable {
  @scala.inline
  def apply(kind: String = null, `type`: String = null, value: String = null): SchemaCustomFloodlightVariable = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomFloodlightVariable]
  }
}

