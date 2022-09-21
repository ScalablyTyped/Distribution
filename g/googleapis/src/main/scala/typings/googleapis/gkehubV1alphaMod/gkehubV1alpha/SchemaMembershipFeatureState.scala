package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipFeatureState extends StObject {
  
  /**
    * AnthosVM state.
    */
  var anthosvm: js.UndefOr[SchemaAnthosVMMembershipState] = js.undefined
  
  /**
    * Appdevexperience specific state.
    */
  var appdevexperience: js.UndefOr[SchemaAppDevExperienceFeatureState] = js.undefined
  
  /**
    * Config Management-specific state.
    */
  var configmanagement: js.UndefOr[SchemaConfigManagementMembershipState] = js.undefined
  
  /**
    * Identity Service-specific state.
    */
  var identityservice: js.UndefOr[SchemaIdentityServiceMembershipState] = js.undefined
  
  /**
    * Metering-specific state.
    */
  var metering: js.UndefOr[SchemaMeteringMembershipState] = js.undefined
  
  /**
    * Policycontroller-specific state.
    */
  var policycontroller: js.UndefOr[SchemaPolicyControllerMembershipState] = js.undefined
  
  /**
    * Service Mesh-specific state.
    */
  var servicemesh: js.UndefOr[SchemaServiceMeshMembershipState] = js.undefined
  
  /**
    * The high-level state of this Feature for a single membership.
    */
  var state: js.UndefOr[SchemaFeatureState] = js.undefined
}
object SchemaMembershipFeatureState {
  
  inline def apply(): SchemaMembershipFeatureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipFeatureState]
  }
  
  extension [Self <: SchemaMembershipFeatureState](x: Self) {
    
    inline def setAnthosvm(value: SchemaAnthosVMMembershipState): Self = StObject.set(x, "anthosvm", value.asInstanceOf[js.Any])
    
    inline def setAnthosvmUndefined: Self = StObject.set(x, "anthosvm", js.undefined)
    
    inline def setAppdevexperience(value: SchemaAppDevExperienceFeatureState): Self = StObject.set(x, "appdevexperience", value.asInstanceOf[js.Any])
    
    inline def setAppdevexperienceUndefined: Self = StObject.set(x, "appdevexperience", js.undefined)
    
    inline def setConfigmanagement(value: SchemaConfigManagementMembershipState): Self = StObject.set(x, "configmanagement", value.asInstanceOf[js.Any])
    
    inline def setConfigmanagementUndefined: Self = StObject.set(x, "configmanagement", js.undefined)
    
    inline def setIdentityservice(value: SchemaIdentityServiceMembershipState): Self = StObject.set(x, "identityservice", value.asInstanceOf[js.Any])
    
    inline def setIdentityserviceUndefined: Self = StObject.set(x, "identityservice", js.undefined)
    
    inline def setMetering(value: SchemaMeteringMembershipState): Self = StObject.set(x, "metering", value.asInstanceOf[js.Any])
    
    inline def setMeteringUndefined: Self = StObject.set(x, "metering", js.undefined)
    
    inline def setPolicycontroller(value: SchemaPolicyControllerMembershipState): Self = StObject.set(x, "policycontroller", value.asInstanceOf[js.Any])
    
    inline def setPolicycontrollerUndefined: Self = StObject.set(x, "policycontroller", js.undefined)
    
    inline def setServicemesh(value: SchemaServiceMeshMembershipState): Self = StObject.set(x, "servicemesh", value.asInstanceOf[js.Any])
    
    inline def setServicemeshUndefined: Self = StObject.set(x, "servicemesh", js.undefined)
    
    inline def setState(value: SchemaFeatureState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
