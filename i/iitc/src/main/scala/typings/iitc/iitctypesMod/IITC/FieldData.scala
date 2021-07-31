package typings.iitc.iitctypesMod.IITC

import typings.iitc.anon.LatE6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldData extends StObject {
  
  var points: js.Array[LatE6]
  
  var team: String
}
object FieldData {
  
  @scala.inline
  def apply(points: js.Array[LatE6], team: String): FieldData = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
  
  @scala.inline
  implicit class FieldDataMutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoints(value: js.Array[LatE6]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: LatE6*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
