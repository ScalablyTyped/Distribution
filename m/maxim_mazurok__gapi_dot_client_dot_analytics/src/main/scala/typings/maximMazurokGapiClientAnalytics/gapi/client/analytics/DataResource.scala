package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataResource extends StObject {
  
  var ga: GaResource = js.native
  
  var mcf: McfResource = js.native
  
  var realtime: RealtimeResource = js.native
}
object DataResource {
  
  @scala.inline
  def apply(ga: GaResource, mcf: McfResource, realtime: RealtimeResource): DataResource = {
    val __obj = js.Dynamic.literal(ga = ga.asInstanceOf[js.Any], mcf = mcf.asInstanceOf[js.Any], realtime = realtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResource]
  }
  
  @scala.inline
  implicit class DataResourceMutableBuilder[Self <: DataResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGa(value: GaResource): Self = StObject.set(x, "ga", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMcf(value: McfResource): Self = StObject.set(x, "mcf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtime(value: RealtimeResource): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
  }
}
