package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckInResponse extends StObject {
  
  /**
    * The deadline by which the worker must request an extension. The backend will allow for network transmission time and other delays, but the worker must attempt to transmit the extension request no later than the deadline.
    */
  var deadline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Feature configuration for the operation.
    */
  var features: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The metadata that describes the operation assigned to the worker.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaCheckInResponse {
  
  inline def apply(): SchemaCheckInResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInResponse]
  }
  
  extension [Self <: SchemaCheckInResponse](x: Self) {
    
    inline def setDeadline(value: String): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDeadlineNull: Self = StObject.set(x, "deadline", null)
    
    inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    
    inline def setFeatures(value: StringDictionary[Any]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
