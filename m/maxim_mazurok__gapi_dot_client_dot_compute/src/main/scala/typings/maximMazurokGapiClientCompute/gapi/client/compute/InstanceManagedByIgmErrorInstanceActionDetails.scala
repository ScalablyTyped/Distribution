package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceManagedByIgmErrorInstanceActionDetails extends StObject {
  
  /** [Output Only] Action that managed instance group was executing on the instance when the error occurred. Possible values: */
  var action: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been created. */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Version this instance was created from, or was being created from, but the creation failed. Corresponds to one of the versions that were set on the Instance Group
    * Manager resource at the time this instance was being created.
    */
  var version: js.UndefOr[ManagedInstanceVersion] = js.undefined
}
object InstanceManagedByIgmErrorInstanceActionDetails {
  
  inline def apply(): InstanceManagedByIgmErrorInstanceActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceManagedByIgmErrorInstanceActionDetails]
  }
  
  extension [Self <: InstanceManagedByIgmErrorInstanceActionDetails](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setVersion(value: ManagedInstanceVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
