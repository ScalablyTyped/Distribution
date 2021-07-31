package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListFunctions` method.
  */
trait SchemaListFunctionsResponse extends StObject {
  
  /**
    * The functions that match the request.
    */
  var functions: js.UndefOr[js.Array[SchemaCloudFunction]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more functions that match the
    * request; this value should be passed in a new
    * google.cloud.functions.v1beta2.ListFunctionsRequest to get more
    * functions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFunctionsResponse {
  
  @scala.inline
  def apply(): SchemaListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFunctionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListFunctionsResponseMutableBuilder[Self <: SchemaListFunctionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: js.Array[SchemaCloudFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: SchemaCloudFunction*): Self = StObject.set(x, "functions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
