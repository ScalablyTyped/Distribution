package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait levelPtsUpdatedData extends StObject {
  
  var details: LevelDetails = js.native
  
  var drift: Double = js.native
  
  var level: Double = js.native
}
object levelPtsUpdatedData {
  
  @scala.inline
  def apply(details: LevelDetails, drift: Double, level: Double): levelPtsUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], drift = drift.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelPtsUpdatedData]
  }
  
  @scala.inline
  implicit class levelPtsUpdatedDataMutableBuilder[Self <: levelPtsUpdatedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrift(value: Double): Self = StObject.set(x, "drift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
