package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFhirFilter extends StObject {
  
  /**
    * List of resources to include in the output. If this list is empty or not specified, all resources are included in the output.
    */
  var resources: js.UndefOr[SchemaResources] = js.undefined
}
object SchemaFhirFilter {
  
  inline def apply(): SchemaFhirFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFhirFilter]
  }
  
  extension [Self <: SchemaFhirFilter](x: Self) {
    
    inline def setResources(value: SchemaResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
