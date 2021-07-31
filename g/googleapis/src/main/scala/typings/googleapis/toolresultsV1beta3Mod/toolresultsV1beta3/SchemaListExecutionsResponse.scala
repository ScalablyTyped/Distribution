package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListExecutionsResponse extends StObject {
  
  /**
    * Executions.  Always set.
    */
  var executions: js.UndefOr[js.Array[SchemaExecution]] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListExecutionsResponse {
  
  @scala.inline
  def apply(): SchemaListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExecutionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListExecutionsResponseMutableBuilder[Self <: SchemaListExecutionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutions(value: js.Array[SchemaExecution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    @scala.inline
    def setExecutionsVarargs(value: SchemaExecution*): Self = StObject.set(x, "executions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
