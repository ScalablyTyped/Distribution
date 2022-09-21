package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDrivesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Whether any items inside the shared drive should also be deleted. This option is only supported when useDomainAdminAccess is also set to true.
    */
  var allowItemDeletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the shared drive.
    */
  var driveId: js.UndefOr[String] = js.undefined
  
  /**
    * Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceDrivesDelete {
  
  inline def apply(): ParamsResourceDrivesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDrivesDelete]
  }
  
  extension [Self <: ParamsResourceDrivesDelete](x: Self) {
    
    inline def setAllowItemDeletion(value: Boolean): Self = StObject.set(x, "allowItemDeletion", value.asInstanceOf[js.Any])
    
    inline def setAllowItemDeletionUndefined: Self = StObject.set(x, "allowItemDeletion", js.undefined)
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setUseDomainAdminAccess(value: Boolean): Self = StObject.set(x, "useDomainAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseDomainAdminAccessUndefined: Self = StObject.set(x, "useDomainAdminAccess", js.undefined)
  }
}
