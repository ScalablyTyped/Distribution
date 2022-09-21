package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkloadIdentityPool extends StObject {
  
  /**
    * A description of the pool. Cannot exceed 256 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use existing tokens to access resources. If the pool is re-enabled, existing tokens grant access again.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A display name for the pool. Cannot exceed 32 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the pool.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the pool.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkloadIdentityPool {
  
  inline def apply(): SchemaWorkloadIdentityPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkloadIdentityPool]
  }
  
  extension [Self <: SchemaWorkloadIdentityPool](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
