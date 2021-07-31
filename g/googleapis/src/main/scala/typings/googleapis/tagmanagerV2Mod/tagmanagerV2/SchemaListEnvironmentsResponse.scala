package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Environments Response.
  */
trait SchemaListEnvironmentsResponse extends StObject {
  
  /**
    * All Environments of a GTM Container.
    */
  var environment: js.UndefOr[js.Array[SchemaEnvironment]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListEnvironmentsResponse {
  
  @scala.inline
  def apply(): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class SchemaListEnvironmentsResponseMutableBuilder[Self <: SchemaListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: js.Array[SchemaEnvironment]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setEnvironmentVarargs(value: SchemaEnvironment*): Self = StObject.set(x, "environment", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
