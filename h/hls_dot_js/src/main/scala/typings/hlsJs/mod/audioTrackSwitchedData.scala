package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait audioTrackSwitchedData extends StObject {
  
  var id: String = js.native
}
object audioTrackSwitchedData {
  
  @scala.inline
  def apply(id: String): audioTrackSwitchedData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTrackSwitchedData]
  }
  
  @scala.inline
  implicit class audioTrackSwitchedDataMutableBuilder[Self <: audioTrackSwitchedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
