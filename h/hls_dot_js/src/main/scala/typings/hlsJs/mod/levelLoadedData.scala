package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait levelLoadedData extends StObject {
  
  var details: LevelDetails = js.native
  
  var levelId: Double = js.native
  
  var stats: Stats = js.native
}
object levelLoadedData {
  
  @scala.inline
  def apply(details: LevelDetails, levelId: Double, stats: Stats): levelLoadedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], levelId = levelId.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelLoadedData]
  }
  
  @scala.inline
  implicit class levelLoadedDataMutableBuilder[Self <: levelLoadedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelId(value: Double): Self = StObject.set(x, "levelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
