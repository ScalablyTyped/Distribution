package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response with the list of Process resources.
  */
@js.native
trait SchemaListScriptProcessesResponse extends StObject {
  
  /**
    * Token for the next page of results. If empty, there are no more pages
    * remaining.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of processes matching request parameters.
    */
  var processes: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeProcess]] = js.native
}
object SchemaListScriptProcessesResponse {
  
  @scala.inline
  def apply(): SchemaListScriptProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScriptProcessesResponse]
  }
  
  @scala.inline
  implicit class SchemaListScriptProcessesResponseMutableBuilder[Self <: SchemaListScriptProcessesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProcesses(value: js.Array[SchemaGoogleAppsScriptTypeProcess]): Self = StObject.set(x, "processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessesUndefined: Self = StObject.set(x, "processes", js.undefined)
    
    @scala.inline
    def setProcessesVarargs(value: SchemaGoogleAppsScriptTypeProcess*): Self = StObject.set(x, "processes", js.Array(value :_*))
  }
}
