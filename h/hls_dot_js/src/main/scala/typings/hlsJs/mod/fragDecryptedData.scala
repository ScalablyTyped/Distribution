package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragDecryptedData extends StObject {
  
  var frag: Fragment
  
  var id: String
  
  var payload: js.Any
  
  var stats: Stats
}
object fragDecryptedData {
  
  @scala.inline
  def apply(frag: Fragment, id: String, payload: js.Any, stats: Stats): fragDecryptedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragDecryptedData]
  }
  
  @scala.inline
  implicit class fragDecryptedDataMutableBuilder[Self <: fragDecryptedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
