package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListAcceleratorTypes.
  */
trait SchemaListAcceleratorTypesResponse extends StObject {
  
  /**
    * The listed nodes.
    */
  var acceleratorTypes: js.UndefOr[js.Array[SchemaAcceleratorType]] = js.undefined
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAcceleratorTypesResponse {
  
  inline def apply(): SchemaListAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAcceleratorTypesResponse]
  }
  
  extension [Self <: SchemaListAcceleratorTypesResponse](x: Self) {
    
    inline def setAcceleratorTypes(value: js.Array[SchemaAcceleratorType]): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: SchemaAcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
