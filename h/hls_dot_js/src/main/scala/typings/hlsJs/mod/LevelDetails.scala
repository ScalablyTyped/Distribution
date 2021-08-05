package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a LevelDetails object contains level details retrieved after level playlist parsing
  */
trait LevelDetails extends StObject {
  
  /**
    * average fragment duration
    */
  var averagetargetduration: Double
  
  /**
    * end sequence number
    */
  var endSN: Double
  
  /**
    * array of fragments info
    */
  var fragments: js.Array[Fragment]
  
  /**
    * is this level a live playlist or not?
    */
  var live: Boolean
  
  /**
    * start sequence number
    */
  var startSN: Double
  
  /**
    * level fragment target duration
    */
  var targetduration: Double
  
  /**
    * level total duration
    */
  var totalduration: Double
  
  /**
    * playlist type
    */
  var `type`: String
  
  /**
    * protocol version
    */
  var version: Double
}
object LevelDetails {
  
  inline def apply(
    averagetargetduration: Double,
    endSN: Double,
    fragments: js.Array[Fragment],
    live: Boolean,
    startSN: Double,
    targetduration: Double,
    totalduration: Double,
    `type`: String,
    version: Double
  ): LevelDetails = {
    val __obj = js.Dynamic.literal(averagetargetduration = averagetargetduration.asInstanceOf[js.Any], endSN = endSN.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], startSN = startSN.asInstanceOf[js.Any], targetduration = targetduration.asInstanceOf[js.Any], totalduration = totalduration.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDetails]
  }
  
  extension [Self <: LevelDetails](x: Self) {
    
    inline def setAveragetargetduration(value: Double): Self = StObject.set(x, "averagetargetduration", value.asInstanceOf[js.Any])
    
    inline def setEndSN(value: Double): Self = StObject.set(x, "endSN", value.asInstanceOf[js.Any])
    
    inline def setFragments(value: js.Array[Fragment]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsVarargs(value: Fragment*): Self = StObject.set(x, "fragments", js.Array(value :_*))
    
    inline def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    inline def setStartSN(value: Double): Self = StObject.set(x, "startSN", value.asInstanceOf[js.Any])
    
    inline def setTargetduration(value: Double): Self = StObject.set(x, "targetduration", value.asInstanceOf[js.Any])
    
    inline def setTotalduration(value: Double): Self = StObject.set(x, "totalduration", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
