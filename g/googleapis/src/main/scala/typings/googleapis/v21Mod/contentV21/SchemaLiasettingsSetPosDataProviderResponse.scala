package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsSetPosDataProviderResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsSetPosDataProviderResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaLiasettingsSetPosDataProviderResponse {
  
  inline def apply(): SchemaLiasettingsSetPosDataProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsSetPosDataProviderResponse]
  }
  
  extension [Self <: SchemaLiasettingsSetPosDataProviderResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
