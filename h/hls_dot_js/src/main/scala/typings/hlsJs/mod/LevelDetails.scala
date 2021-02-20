package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a LevelDetails object contains level details retrieved after level playlist parsing
  */
@js.native
trait LevelDetails extends StObject {
  
  /**
    * average fragment duration
    */
  var averagetargetduration: Double = js.native
  
  /**
    * end sequence number
    */
  var endSN: Double = js.native
  
  /**
    * array of fragments info
    */
  var fragments: js.Array[Fragment] = js.native
  
  /**
    * is this level a live playlist or not?
    */
  var live: Boolean = js.native
  
  /**
    * start sequence number
    */
  var startSN: Double = js.native
  
  /**
    * level fragment target duration
    */
  var targetduration: Double = js.native
  
  /**
    * level total duration
    */
  var totalduration: Double = js.native
  
  /**
    * playlist type
    */
  var `type`: String = js.native
  
  /**
    * protocol version
    */
  var version: Double = js.native
}
object LevelDetails {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LevelDetailsMutableBuilder[Self <: LevelDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAveragetargetduration(value: Double): Self = StObject.set(x, "averagetargetduration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSN(value: Double): Self = StObject.set(x, "endSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragments(value: js.Array[Fragment]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentsVarargs(value: Fragment*): Self = StObject.set(x, "fragments", js.Array(value :_*))
    
    @scala.inline
    def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSN(value: Double): Self = StObject.set(x, "startSN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetduration(value: Double): Self = StObject.set(x, "targetduration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalduration(value: Double): Self = StObject.set(x, "totalduration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
