package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectValues extends StObject {
  
  var values: js.UndefOr[js.Array[StructuredDataObject]] = js.undefined
}
object ObjectValues {
  
  inline def apply(): ObjectValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectValues]
  }
  
  extension [Self <: ObjectValues](x: Self) {
    
    inline def setValues(value: js.Array[StructuredDataObject]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: StructuredDataObject*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
