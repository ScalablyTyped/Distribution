package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTeamdrivesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the Team Drive
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
  
  /**
    * Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTeamdrivesGet {
  
  inline def apply(): ParamsResourceTeamdrivesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTeamdrivesGet]
  }
  
  extension [Self <: ParamsResourceTeamdrivesGet](x: Self) {
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
    
    inline def setUseDomainAdminAccess(value: Boolean): Self = StObject.set(x, "useDomainAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseDomainAdminAccessUndefined: Self = StObject.set(x, "useDomainAdminAccess", js.undefined)
  }
}
