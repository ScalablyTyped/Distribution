package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceManagedByIgmErrorInstanceActionDetails extends StObject {
  
  /** [Output Only] Action that managed instance group was executing on the instance when the error occurred. Possible values: */
  var action: js.UndefOr[String] = js.native
  
  /** [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been created. */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] Version this instance was created from, or was being created from, but the creation failed. Corresponds to one of the versions that were set on the Instance Group
    * Manager resource at the time this instance was being created.
    */
  var version: js.UndefOr[ManagedInstanceVersion] = js.native
}
object InstanceManagedByIgmErrorInstanceActionDetails {
  
  @scala.inline
  def apply(): InstanceManagedByIgmErrorInstanceActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceManagedByIgmErrorInstanceActionDetails]
  }
  
  @scala.inline
  implicit class InstanceManagedByIgmErrorInstanceActionDetailsMutableBuilder[Self <: InstanceManagedByIgmErrorInstanceActionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setVersion(value: ManagedInstanceVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
