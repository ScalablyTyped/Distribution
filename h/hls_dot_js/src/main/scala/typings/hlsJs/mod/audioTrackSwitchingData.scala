package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait audioTrackSwitchingData extends StObject {
  
  var id: String = js.native
}
object audioTrackSwitchingData {
  
  @scala.inline
  def apply(id: String): audioTrackSwitchingData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTrackSwitchingData]
  }
  
  @scala.inline
  implicit class audioTrackSwitchingDataMutableBuilder[Self <: audioTrackSwitchingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
