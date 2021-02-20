package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightConfigurationsListResponse extends StObject {
  
  /** Floodlight configuration collection. */
  var floodlightConfigurations: js.UndefOr[js.Array[FloodlightConfiguration]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightConfigurationsListResponse". */
  var kind: js.UndefOr[String] = js.native
}
object FloodlightConfigurationsListResponse {
  
  @scala.inline
  def apply(): FloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightConfigurationsListResponse]
  }
  
  @scala.inline
  implicit class FloodlightConfigurationsListResponseMutableBuilder[Self <: FloodlightConfigurationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightConfigurations(value: js.Array[FloodlightConfiguration]): Self = StObject.set(x, "floodlightConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationsUndefined: Self = StObject.set(x, "floodlightConfigurations", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationsVarargs(value: FloodlightConfiguration*): Self = StObject.set(x, "floodlightConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
