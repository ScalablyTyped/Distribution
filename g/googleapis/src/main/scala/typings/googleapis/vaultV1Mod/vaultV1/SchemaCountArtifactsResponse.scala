package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountArtifactsResponse extends StObject {
  
  /**
    * Count metrics for Groups.
    */
  var groupsCountResult: js.UndefOr[SchemaGroupsCountResult] = js.undefined
  
  /**
    * Count metrics for Gmail and classic Hangouts.
    */
  var mailCountResult: js.UndefOr[SchemaMailCountResult] = js.undefined
  
  /**
    * Total count of messages.
    */
  var totalCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaCountArtifactsResponse {
  
  inline def apply(): SchemaCountArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountArtifactsResponse]
  }
  
  extension [Self <: SchemaCountArtifactsResponse](x: Self) {
    
    inline def setGroupsCountResult(value: SchemaGroupsCountResult): Self = StObject.set(x, "groupsCountResult", value.asInstanceOf[js.Any])
    
    inline def setGroupsCountResultUndefined: Self = StObject.set(x, "groupsCountResult", js.undefined)
    
    inline def setMailCountResult(value: SchemaMailCountResult): Self = StObject.set(x, "mailCountResult", value.asInstanceOf[js.Any])
    
    inline def setMailCountResultUndefined: Self = StObject.set(x, "mailCountResult", js.undefined)
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
