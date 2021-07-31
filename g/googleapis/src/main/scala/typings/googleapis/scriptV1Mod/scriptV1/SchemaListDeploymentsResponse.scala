package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response with the list of deployments for the specified Apps Script
  * project.
  */
trait SchemaListDeploymentsResponse extends StObject {
  
  /**
    * The list of deployments.
    */
  var deployments: js.UndefOr[js.Array[SchemaDeployment]] = js.undefined
  
  /**
    * The token that can be used in the next call to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListDeploymentsResponse {
  
  @scala.inline
  def apply(): SchemaListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeploymentsResponse]
  }
  
  @scala.inline
  implicit class SchemaListDeploymentsResponseMutableBuilder[Self <: SchemaListDeploymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: js.Array[SchemaDeployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: SchemaDeployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
