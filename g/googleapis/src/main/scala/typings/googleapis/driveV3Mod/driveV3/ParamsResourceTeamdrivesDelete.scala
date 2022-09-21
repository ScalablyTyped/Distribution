package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTeamdrivesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the Team Drive
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTeamdrivesDelete {
  
  inline def apply(): ParamsResourceTeamdrivesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTeamdrivesDelete]
  }
  
  extension [Self <: ParamsResourceTeamdrivesDelete](x: Self) {
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
