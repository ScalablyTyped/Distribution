package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Analytics stats of a Dynamic Link for a given timeframe.
  */
@js.native
trait SchemaDynamicLinkStats extends StObject {
  
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
  implicit class SchemaDynamicLinkStatsMutableBuilder[Self <: SchemaDynamicLinkStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkEventStats(value: js.Array[SchemaDynamicLinkEventStat]): Self = StObject.set(x, "linkEventStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkEventStatsUndefined: Self = StObject.set(x, "linkEventStats", js.undefined)
    
    @scala.inline
    def setLinkEventStatsVarargs(value: SchemaDynamicLinkEventStat*): Self = StObject.set(x, "linkEventStats", js.Array(value :_*))
  }
}
