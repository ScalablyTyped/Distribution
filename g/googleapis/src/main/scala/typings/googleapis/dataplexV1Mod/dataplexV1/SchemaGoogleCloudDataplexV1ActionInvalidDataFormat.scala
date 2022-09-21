package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ActionInvalidDataFormat extends StObject {
  
  /**
    * The expected data format of the entity.
    */
  var expectedFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new unexpected data format within the entity.
    */
  var newFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of data locations sampled and used for format/schema inference.
    */
  var sampledDataLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ActionInvalidDataFormat {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ActionInvalidDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ActionInvalidDataFormat]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ActionInvalidDataFormat](x: Self) {
    
    inline def setExpectedFormat(value: String): Self = StObject.set(x, "expectedFormat", value.asInstanceOf[js.Any])
    
    inline def setExpectedFormatNull: Self = StObject.set(x, "expectedFormat", null)
    
    inline def setExpectedFormatUndefined: Self = StObject.set(x, "expectedFormat", js.undefined)
    
    inline def setNewFormat(value: String): Self = StObject.set(x, "newFormat", value.asInstanceOf[js.Any])
    
    inline def setNewFormatNull: Self = StObject.set(x, "newFormat", null)
    
    inline def setNewFormatUndefined: Self = StObject.set(x, "newFormat", js.undefined)
    
    inline def setSampledDataLocations(value: js.Array[String]): Self = StObject.set(x, "sampledDataLocations", value.asInstanceOf[js.Any])
    
    inline def setSampledDataLocationsNull: Self = StObject.set(x, "sampledDataLocations", null)
    
    inline def setSampledDataLocationsUndefined: Self = StObject.set(x, "sampledDataLocations", js.undefined)
    
    inline def setSampledDataLocationsVarargs(value: String*): Self = StObject.set(x, "sampledDataLocations", js.Array(value*))
  }
}
