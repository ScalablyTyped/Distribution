package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails extends StObject {
  
  /**
    * A list of discovery configuration parameters in effect. The keys are the field paths within DiscoverySpec. Eg. includePatterns, excludePatterns, csvOptions.disableTypeInference, etc.
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails {
  
  inline def apply(): SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1DiscoveryEventConfigDetails](x: Self) {
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
