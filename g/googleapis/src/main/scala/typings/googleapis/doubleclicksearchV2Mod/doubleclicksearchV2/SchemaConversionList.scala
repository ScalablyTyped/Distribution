package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConversionList extends StObject {
  
  /**
    * The conversions being requested.
    */
  var conversion: js.UndefOr[js.Array[SchemaConversion]] = js.undefined
  
  /**
    * Identifies this as a ConversionList resource. Value: the fixed string doubleclicksearch#conversionList.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaConversionList {
  
  inline def apply(): SchemaConversionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionList]
  }
  
  extension [Self <: SchemaConversionList](x: Self) {
    
    inline def setConversion(value: js.Array[SchemaConversion]): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    inline def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    inline def setConversionVarargs(value: SchemaConversion*): Self = StObject.set(x, "conversion", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
