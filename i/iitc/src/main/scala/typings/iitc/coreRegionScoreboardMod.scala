package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRegionScoreboardMod {
  
  object global {
    
    @JSGlobal("HistoryChart_")
    @js.native
    open class HistoryChart () extends StObject {
      
      def create(_regionScore: RegionScoreboard_, logscale: Boolean): Unit = js.native
    }
    
    @JSGlobal("RegionScoreboard")
    @js.native
    def RegionScoreboard: RegionScoreboard_ = js.native
    
    @JSGlobal("RegionScoreboard_")
    @js.native
    open class RegionScoreboard_ () extends StObject {
      
      var HistoryChart: typings.iitc.coreRegionScoreboardMod.global.HistoryChart = js.native
      
      def setup(): Unit = js.native
      
      def shwoDialog(): Unit = js.native
    }
    
    inline def RegionScoreboard_=(x: RegionScoreboard_): Unit = js.Dynamic.global.updateDynamic("RegionScoreboard")(x.asInstanceOf[js.Any])
  }
}
