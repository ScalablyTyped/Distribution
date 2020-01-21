package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a dynamic targeting key. Dynamic targeting keys are
  * unique, user-friendly labels, created at the advertiser level in DCM, that
  * can be assigned to ads, creatives, and placements and used for targeting
  * with Studio dynamic creatives. Use these labels instead of numeric Campaign
  * Manager IDs (such as placement IDs) to save time and avoid errors in your
  * dynamic feeds.
  */
@js.native
trait SchemaDynamicTargetingKey extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#dynamicTargetingKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this dynamic targeting key. This is a required field. Must be
    * less than 256 characters long and cannot contain commas. All characters
    * are converted to lowercase.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * ID of the object of this dynamic targeting key. This is a required field.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * Type of the object of this dynamic targeting key. This is a required
    * field.
    */
  var objectType: js.UndefOr[String] = js.native
}

object SchemaDynamicTargetingKey {
  @scala.inline
  def apply(kind: String = null, name: String = null, objectId: String = null, objectType: String = null): SchemaDynamicTargetingKey = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDynamicTargetingKey]
  }
}

