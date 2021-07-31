package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regionScoreboardMod {
  
  object global {
    
    @JSGlobal("HistoryChart_")
    @js.native
    class HistoryChart () extends StObject {
      
      def create(_regionScore: RegionScoreboard_, logscale: Boolean): Unit = js.native
    }
    
    @JSGlobal("RegionScoreboard")
    @js.native
    def RegionScoreboard: RegionScoreboard_ = js.native
    
    @JSGlobal("RegionScoreboard_")
    @js.native
    class RegionScoreboard_ () extends StObject {
      
      var HistoryChart: typings.iitc.regionScoreboardMod.global.HistoryChart = js.native
      
      def setup(): Unit = js.native
      
      def shwoDialog(): Unit = js.native
    }
    
    @scala.inline
    def RegionScoreboard_=(x: RegionScoreboard_): Unit = js.Dynamic.global.updateDynamic("RegionScoreboard")(x.asInstanceOf[js.Any])
  }
}
