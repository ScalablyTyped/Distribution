package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsListPosDataProvidersResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#liasettingsListPosDataProvidersResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of POS data providers for each eligible country
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.undefined
}
object SchemaLiasettingsListPosDataProvidersResponse {
  
  inline def apply(): SchemaLiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsListPosDataProvidersResponse]
  }
  
  extension [Self <: SchemaLiasettingsListPosDataProvidersResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPosDataProviders(value: js.Array[SchemaPosDataProviders]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    inline def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    inline def setPosDataProvidersVarargs(value: SchemaPosDataProviders*): Self = StObject.set(x, "posDataProviders", js.Array(value*))
  }
}
