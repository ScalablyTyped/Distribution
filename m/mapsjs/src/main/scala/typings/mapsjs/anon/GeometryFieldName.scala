package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryFieldName extends StObject {
  
  var bleedRatio: js.UndefOr[Double] = js.undefined
  
  var geometryFieldName: String
  
  var valueFieldNames: js.Array[String]
}
object GeometryFieldName {
  
  inline def apply(geometryFieldName: String, valueFieldNames: js.Array[String]): GeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName.asInstanceOf[js.Any], valueFieldNames = valueFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryFieldName]
  }
  
  extension [Self <: GeometryFieldName](x: Self) {
    
    inline def setBleedRatio(value: Double): Self = StObject.set(x, "bleedRatio", value.asInstanceOf[js.Any])
    
    inline def setBleedRatioUndefined: Self = StObject.set(x, "bleedRatio", js.undefined)
    
    inline def setGeometryFieldName(value: String): Self = StObject.set(x, "geometryFieldName", value.asInstanceOf[js.Any])
    
    inline def setValueFieldNames(value: js.Array[String]): Self = StObject.set(x, "valueFieldNames", value.asInstanceOf[js.Any])
    
    inline def setValueFieldNamesVarargs(value: String*): Self = StObject.set(x, "valueFieldNames", js.Array(value :_*))
  }
}
