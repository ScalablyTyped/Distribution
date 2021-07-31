package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragLoadEmergencyAbortedData extends StObject {
  
  var frag: Fragment
}
object fragLoadEmergencyAbortedData {
  
  @scala.inline
  def apply(frag: Fragment): fragLoadEmergencyAbortedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadEmergencyAbortedData]
  }
  
  @scala.inline
  implicit class fragLoadEmergencyAbortedDataMutableBuilder[Self <: fragLoadEmergencyAbortedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
  }
}
