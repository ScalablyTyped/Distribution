package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the issue model to query against.
    */
  var issueModel: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats {
  
  inline def apply(): ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsIssuemodelsCalculateissuemodelstats](x: Self) {
    
    inline def setIssueModel(value: String): Self = StObject.set(x, "issueModel", value.asInstanceOf[js.Any])
    
    inline def setIssueModelUndefined: Self = StObject.set(x, "issueModel", js.undefined)
  }
}
