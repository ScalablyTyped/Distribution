package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends StObject {
  
  /**
    * The policy to define whether or not RBE features can be used or how they can be used.
    */
  var featurePolicy: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy] = js.undefined
  
  /**
    * The location is a GCP region. Currently only `us-central1` is supported.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether stack driver logging is enabled for the instance.
    */
  var loggingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the `instance_id` field.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the instance.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance](x: Self) {
    
    inline def setFeaturePolicy(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy): Self = StObject.set(x, "featurePolicy", value.asInstanceOf[js.Any])
    
    inline def setFeaturePolicyUndefined: Self = StObject.set(x, "featurePolicy", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledNull: Self = StObject.set(x, "loggingEnabled", null)
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
