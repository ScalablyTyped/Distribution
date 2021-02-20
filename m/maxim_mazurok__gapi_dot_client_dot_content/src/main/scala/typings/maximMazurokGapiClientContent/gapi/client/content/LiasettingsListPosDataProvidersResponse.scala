package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsListPosDataProvidersResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsListPosDataProvidersResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The list of POS data providers for each eligible country */
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.native
}
object LiasettingsListPosDataProvidersResponse {
  
  @scala.inline
  def apply(): LiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsListPosDataProvidersResponse]
  }
  
  @scala.inline
  implicit class LiasettingsListPosDataProvidersResponseMutableBuilder[Self <: LiasettingsListPosDataProvidersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPosDataProviders(value: js.Array[PosDataProviders]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: PosDataProviders*): Self = StObject.set(x, "posDataProviders", js.Array(value :_*))
  }
}
