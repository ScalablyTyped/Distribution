package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Analytics stats of a Dynamic Link for a given timeframe.
  */
trait SchemaDynamicLinkStats extends StObject {
  
  /**
    * Dynamic Link event stats.
    */
  var linkEventStats: js.UndefOr[js.Array[SchemaDynamicLinkEventStat]] = js.undefined
}
object SchemaDynamicLinkStats {
  
  inline def apply(): SchemaDynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicLinkStats]
  }
  
  extension [Self <: SchemaDynamicLinkStats](x: Self) {
    
    inline def setLinkEventStats(value: js.Array[SchemaDynamicLinkEventStat]): Self = StObject.set(x, "linkEventStats", value.asInstanceOf[js.Any])
    
    inline def setLinkEventStatsUndefined: Self = StObject.set(x, "linkEventStats", js.undefined)
    
    inline def setLinkEventStatsVarargs(value: SchemaDynamicLinkEventStat*): Self = StObject.set(x, "linkEventStats", js.Array(value :_*))
  }
}
