package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Skippable Settings
  */
@js.native
trait SchemaSiteSkippableSetting extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteSkippableSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Amount of time to play videos served to this site template before
    * counting a view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Amount of time to play videos served to this site before the skip button
    * should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  /**
    * Whether the user can skip creatives served to this site. This will act as
    * default for new placements created under this site.
    */
  var skippable: js.UndefOr[Boolean] = js.native
}

object SchemaSiteSkippableSetting {
  @scala.inline
  def apply(
    kind: String = null,
    progressOffset: SchemaVideoOffset = null,
    skipOffset: SchemaVideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined
  ): SchemaSiteSkippableSetting = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset.asInstanceOf[js.Any])
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteSkippableSetting]
  }
}

