package typings.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionFilters extends StObject {
  
  var dimensionKey: dimensionFilterKey
  
  var optionKeys: js.Array[String]
}
object DimensionFilters {
  
  inline def apply(dimensionKey: dimensionFilterKey, optionKeys: js.Array[String]): DimensionFilters = {
    val __obj = js.Dynamic.literal(dimensionKey = dimensionKey.asInstanceOf[js.Any], optionKeys = optionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilters]
  }
  
  extension [Self <: DimensionFilters](x: Self) {
    
    inline def setDimensionKey(value: dimensionFilterKey): Self = StObject.set(x, "dimensionKey", value.asInstanceOf[js.Any])
    
    inline def setOptionKeys(value: js.Array[String]): Self = StObject.set(x, "optionKeys", value.asInstanceOf[js.Any])
    
    inline def setOptionKeysVarargs(value: String*): Self = StObject.set(x, "optionKeys", js.Array(value*))
  }
}
