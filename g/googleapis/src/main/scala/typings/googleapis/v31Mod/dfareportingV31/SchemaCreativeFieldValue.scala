package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a creative field value.
  */
@js.native
trait SchemaCreativeFieldValue extends js.Object {
  /**
    * ID of this creative field value. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldValue&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Value of this creative field value. It needs to be less than 256
    * characters in length and unique per creative field.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCreativeFieldValue {
  @scala.inline
  def apply(id: String = null, kind: String = null, value: String = null): SchemaCreativeFieldValue = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeFieldValue]
  }
}

