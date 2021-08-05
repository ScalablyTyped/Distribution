package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiasettingsSetPosDataProviderResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#liasettingsSetPosDataProviderResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object LiasettingsSetPosDataProviderResponse {
  
  inline def apply(): LiasettingsSetPosDataProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsSetPosDataProviderResponse]
  }
  
  extension [Self <: LiasettingsSetPosDataProviderResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
