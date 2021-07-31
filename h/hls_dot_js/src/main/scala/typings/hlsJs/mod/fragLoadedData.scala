package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragLoadedData extends StObject {
  
  var frag: Fragment
  
  var payload: js.Any
}
object fragLoadedData {
  
  @scala.inline
  def apply(frag: Fragment, payload: js.Any): fragLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadedData]
  }
  
  @scala.inline
  implicit class fragLoadedDataMutableBuilder[Self <: fragLoadedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
