package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsIssuemodelsIssuesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the issue.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsIssuemodelsIssuesList {
  
  inline def apply(): ParamsResourceProjectsLocationsIssuemodelsIssuesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsIssuemodelsIssuesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsIssuemodelsIssuesList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
