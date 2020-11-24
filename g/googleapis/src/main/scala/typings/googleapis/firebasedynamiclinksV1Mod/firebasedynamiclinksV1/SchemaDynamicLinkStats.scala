package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaDynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkStats]
  }
  
  @scala.inline
  implicit class SchemaDynamicLinkStatsOps[Self <: SchemaDynamicLinkStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLinkEventStatsVarargs(value: SchemaDynamicLinkEventStat*): Self = this.set("linkEventStats", js.Array(value :_*))
    
    @scala.inline
    def setLinkEventStats(value: js.Array[SchemaDynamicLinkEventStat]): Self = this.set("linkEventStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkEventStats: Self = this.set("linkEventStats", js.undefined)
  }
}
