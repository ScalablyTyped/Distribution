package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Skippable Settings
  */
@js.native
trait SchemaSkippableSetting extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#skippableSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Amount of time to play videos served to this placement before counting a
    * view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Amount of time to play videos served to this placement before the skip
    * button should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Whether the user can skip creatives served to this placement.
    */
  var skippable: js.UndefOr[Boolean] = js.native
}

object SchemaSkippableSetting {
  @scala.inline
  def apply(
    kind: String = null,
    progressOffset: SchemaVideoOffset = null,
    skipOffset: SchemaVideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined
  ): SchemaSkippableSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset.asInstanceOf[js.Any])
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSkippableSetting]
  }
}

