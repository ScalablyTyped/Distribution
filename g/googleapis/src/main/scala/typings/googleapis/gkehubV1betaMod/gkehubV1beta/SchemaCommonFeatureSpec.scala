package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommonFeatureSpec extends StObject {
  
  /**
    * Anthos Observability spec
    */
  var anthosobservability: js.UndefOr[SchemaAnthosObservabilityFeatureSpec] = js.undefined
  
  /**
    * Appdevexperience specific spec.
    */
  var appdevexperience: js.UndefOr[SchemaAppDevExperienceFeatureSpec] = js.undefined
  
  /**
    * Multicluster Ingress-specific spec.
    */
  var multiclusteringress: js.UndefOr[SchemaMultiClusterIngressFeatureSpec] = js.undefined
}
object SchemaCommonFeatureSpec {
  
  inline def apply(): SchemaCommonFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommonFeatureSpec]
  }
  
  extension [Self <: SchemaCommonFeatureSpec](x: Self) {
    
    inline def setAnthosobservability(value: SchemaAnthosObservabilityFeatureSpec): Self = StObject.set(x, "anthosobservability", value.asInstanceOf[js.Any])
    
    inline def setAnthosobservabilityUndefined: Self = StObject.set(x, "anthosobservability", js.undefined)
    
    inline def setAppdevexperience(value: SchemaAppDevExperienceFeatureSpec): Self = StObject.set(x, "appdevexperience", value.asInstanceOf[js.Any])
    
    inline def setAppdevexperienceUndefined: Self = StObject.set(x, "appdevexperience", js.undefined)
    
    inline def setMulticlusteringress(value: SchemaMultiClusterIngressFeatureSpec): Self = StObject.set(x, "multiclusteringress", value.asInstanceOf[js.Any])
    
    inline def setMulticlusteringressUndefined: Self = StObject.set(x, "multiclusteringress", js.undefined)
  }
}
