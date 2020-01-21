package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Analytics stats of a Dynamic Link for a given timeframe.
  */
@js.native
trait SchemaDynamicLinkStats extends js.Object {
  /**
    * Dynamic Link event stats.
    */
  var linkEventStats: js.UndefOr[js.Array[SchemaDynamicLinkEventStat]] = js.native
}

object SchemaDynamicLinkStats {
  @scala.inline
  def apply(linkEventStats: js.Array[SchemaDynamicLinkEventStat] = null): SchemaDynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    if (linkEventStats != null) __obj.updateDynamic("linkEventStats")(linkEventStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDynamicLinkStats]
  }
}

