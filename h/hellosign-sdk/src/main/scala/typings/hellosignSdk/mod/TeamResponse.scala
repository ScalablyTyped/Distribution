package typings.hellosignSdk.mod

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamResponse
  extends StObject
     with BaseResponse {
  
  var team: Team
}
object TeamResponse {
  
  inline def apply(resHeaders: IncomingHttpHeaders, team: Team): TeamResponse = {
    val __obj = js.Dynamic.literal(resHeaders = resHeaders.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamResponse]
  }
  
  extension [Self <: TeamResponse](x: Self) {
    
    inline def setTeam(value: Team): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
