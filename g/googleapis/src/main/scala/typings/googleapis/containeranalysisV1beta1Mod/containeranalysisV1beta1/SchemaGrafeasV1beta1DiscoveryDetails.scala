package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a discovery occurrence.
  */
trait SchemaGrafeasV1beta1DiscoveryDetails extends StObject {
  
  /**
    * Required. Analysis status for the discovered resource.
    */
  var discovered: js.UndefOr[SchemaDiscovered] = js.undefined
}
object SchemaGrafeasV1beta1DiscoveryDetails {
  
  inline def apply(): SchemaGrafeasV1beta1DiscoveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1DiscoveryDetails]
  }
  
  extension [Self <: SchemaGrafeasV1beta1DiscoveryDetails](x: Self) {
    
    inline def setDiscovered(value: SchemaDiscovered): Self = StObject.set(x, "discovered", value.asInstanceOf[js.Any])
    
    inline def setDiscoveredUndefined: Self = StObject.set(x, "discovered", js.undefined)
  }
}
