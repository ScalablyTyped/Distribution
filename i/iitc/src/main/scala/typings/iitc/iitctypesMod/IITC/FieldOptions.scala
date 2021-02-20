package typings.iitc.iitctypesMod.IITC

import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldOptions extends PathOptions {
  
  var data: FieldData = js.native
  
  var guid: String = js.native
  
  var team: Double = js.native
  
  var timestamp: Double = js.native
}
object FieldOptions {
  
  @scala.inline
  def apply(data: FieldData, guid: String, team: Double, timestamp: Double): FieldOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions]
  }
  
  @scala.inline
  implicit class FieldOptionsMutableBuilder[Self <: FieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
